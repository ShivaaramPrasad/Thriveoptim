package dsa.hashing;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumHasSet {

	/*
	 * https://leetcode.com/problems/two-sum/
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
		int[] nums = {2,4,5,8,3,6,7};
		int k=15;


		Assert.assertArrayEquals(twosumHasSet(nums,k),new int[] {8,7});
		System.out.println(Arrays.toString((twosumHasSet(nums,k))));

	}



	@Test//
	public void example5(){
		int[] nums = {1};
		int k=10;
		//{}
		Assert.assertArrayEquals(twosumHasSet(nums,k),new int[] {0,0});
		System.out.println(Arrays.toString((twosumHasSet(nums,k))));

	}

	@Test//
	public void example6(){
		int[] nums = {2,3,9,6,11};
		int k=10;
		//{}
		Assert.assertArrayEquals(twosumHasSet(nums,k),new int[] {0, 0});
		System.out.println(Arrays.toString((twosumHasSet(nums,k))));

	}
	/*
	 * Psuedocode:
	 * 

	 * 6) 
	 * 7)
	 * 
	 */


	public int[] twosumHasSet(int nums[],int target){
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			if(set.contains(target-nums[i])) {
				return new int[] {target-nums[i],nums[i]};
			}else 
				set.add(nums[i]);
		}
		return new int[] {0,0};
	}


}