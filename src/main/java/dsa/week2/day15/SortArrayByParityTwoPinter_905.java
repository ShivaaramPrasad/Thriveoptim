package dsa.week2.day15;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class SortArrayByParityTwoPinter_905 {

	/*
	905. Sort Array By Parity
https://leetcode.com/problems/sort-array-by-parity/
Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

Return any array that satisfies this condition.



Example 1:

Input: nums = [3,1,2,4]
Output: [2,4,3,1]
Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
Example 2:

Input: nums = [0]
Output: [0]

	 */

	/*
    ask doubt 1) no need to sort 
          2) can have duplicate
	 * Psuedocode:
	 * 0) Create an temp array pair
	 * 1) validation: check array size.. if it is less than 
	 * 2) if array equal to 1 return nums 
	 * 3) run a for loop and check nums the even condtion and odd condition 
	 * 4) Add in temp array return pair;
	 */

	@Test//Positve 
	public void example1(){
		int[] nums = {3,1,2,4}; 
		//{2,4,3,1}

		//assertEquals(true,Arrays.equals(sortArrayByParityTwoPinter(nums),new int[] {4,1,2,3}));
		System.out.println(Arrays.toString(sortArrayByParityTwoPinter(nums)));

	}   



	@Test//Negative 
	public void example2(){
		int[] nums = {0};


		//assertEquals(true,Arrays.equals(sortArrayByParityTwoPinter(nums),new int[] {0}));


	}

	@Test//Negative 
	public void example3(){
		int[] nums = {1};


		//assertEquals(true,Arrays.equals(sortArrayByParityTwoPinter(nums),new int[] {1}));


	}

	public int[] sortArrayByParityTwoPinter(int[] nums) {
		if (nums.length==1)   return new int[] {};
		int start=0,  end = nums.length-1,  temp;
		while(start < end){

			if(nums[start]%2==0)start++;
			else if (nums[end]%2!=0)end--;
			if(nums[start]%2!=0 && nums[end]%2==0)
			{
				temp = nums[start];
				nums[start++]=nums[end];
				nums[end--]=temp;
			}

		}

		return nums;

	}
}
