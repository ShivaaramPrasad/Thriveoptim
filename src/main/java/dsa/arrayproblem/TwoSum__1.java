package dsa.arrayproblem;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class TwoSum__1 {

	/*
	 *https://leetcode.com/problems/two-sum/
1. Two Sum
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]



	1) Did I understand the problem? Yes or NO ! !
	        If No, Ask the person to provide more detail with example(s)
	        If yes, go to next step !!
	What is the input(s)? 2 Strings
	What is the expected output? int.
	Do I have constraints to solve the problem?
	Do I have all informations to go to next step!!
	How big is your test data set will be?
	2) Test data set
	 Minimum of 3 data set ! ! Positive, Edge, Negative
	 Validate with the interviewer if the data set is fine by his/her assumptions

	3)Do I know how to solve it?
	    Yes — great, is there an alternate?
	     No — Can I break down the problem into sub problems?


	4) Ask for hint (If you do not know how to solve)
	5) DO I know alternate solutions as well?
	      Yes — What are those?
	       No — That is still fine, proceed to solve by what you know !!
	6) If you know alternate solutions -> find out the the 0 Notations (Performance)
           Then, explain either both are the best (depends on the time)
           Approach 1: Start with worst -> improve (Optimize) -> End up with the best 
	       Approach 2: Write down the options and benefits and code the best

     7) Start always with Pseudo code

     8) Implement them in the code (editor)

     9)Test against the different data set

     10) If it fails, debug them to solve it !!

	 */
	@Test//
	public void example1(){
		int[] numb = {2,4,5,8,3,6,7};
		int k=15;
		//{{3,6}}

		Assert.assertArrayEquals(twosum(numb,k),new int[] {3,6});
		System.out.println(Arrays.toString((twosum(numb,k))));

	}

	@Test//Positive
	public void example2(){
		int[] numb = {2,8,5,5};
		int k=10;
		//{{0,1},{2,3}}

		Assert.assertArrayEquals(twosum(numb,k),new int[] {2,3});
		System.out.println(Arrays.toString((twosum(numb,k))));

	}

	@Test//
	public void example3(){
		int[] numb = {2,3,8,7,1};
		int k=10;
		//{{0,2},{1,3}}

		Assert.assertArrayEquals(twosum(numb,k),new int[] {1,3});
		System.out.println(Arrays.toString((twosum(numb,k))));
	}

	@Test//
	public void example4(){
		int[] numb = {};
		int k=10;
		//{}
		Assert.assertArrayEquals(twosum(numb,k),new int[] {});
		System.out.println(Arrays.toString((twosum(numb,k))));

	}


	@Test//
	public void example5(){
		int[] numb = {1};
		int k=10;
		//{}
		Assert.assertArrayEquals(twosum(numb,k),new int[] {});
		System.out.println(Arrays.toString((twosum(numb,k))));

	}

	@Test//
	public void example6(){
		int[] numb = {2,3,9,6,11};
		int k=10;
		//{}
		Assert.assertArrayEquals(twosum(numb,k),new int[] {0, 0});
		System.out.println(Arrays.toString((twosum(numb,k))));

	}
	/*
	 * Psuedocode:
	 * 
	 * 0) validation: check array size.. if it is less than 2, return empty array 
	 * 1) traverse through array from 0 to n-1 index
	 * 2) add the indice values and 
	 * 3) compare against the target
	 * 4) If it matches, store the start + end index
	 * 5) Else, continue 
	 * 6) Finally, return the last matching index !!
	 * 7) If there are no matches --> then return empty array !!
	 * 
	 */



	private int[]  twosum(int[] numb, int  k)
	{
		int[] indices = new int[2];

		if(numb.length<2) { return new int[] {};}
		for (int i = 0; i < numb.length; i++) {
			for (int j = i+1; j < numb.length; j++) {
				int sum = numb[i]+numb[j];
				if(sum == k){
					indices[0] = i;
					indices[1] = j;
				}
				}
			}
		return indices;
	}
}