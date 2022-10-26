package dsa.week1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.management.RuntimeErrorException;

import org.junit.Test;

import org.junit.Assert;
import org.junit.Test;

public class MoveZeroes_283 {

	/*
	 1.	283. Move Zeroes
Link: https://leetcode.com/problems/move-zeroes/
Problem Statement:
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:
Input: nums = [0]
Output: [0]
	 */
	@Test
	public void example1() {
		int[] nums = {4,0,2,0,0,1};
		Assert.assertArrayEquals(moveZeroesleft(nums),new int[] {0,0,0,4,2,1});
	}

	@Test
	public void example2() {
		int[] nums = {0,0,0,1,1,1};
		//Assert.assertEquals(true,Arrays.equals(moveZeroesleft(nums),new int[] {0,0,0,1,1,1}));
		Assert.assertArrayEquals(moveZeroesRight2pointer(nums), new int[] {1,1,1,0,0,0});
	}

	@Test
	public void example3() {
		int[] nums = {1,2,3,4,5};
		//System.out.println(moveZeroesleft(nums));
		Assert.assertArrayEquals(moveZeroesleft(nums),new int[] {1,2,3,4,5});

	}

	/* 
	 * Brute force !!
	 * Psuedo code here:
	 * 
	 * 1) Sort the given input  // 1,2,2
	 * 2) Compare the next element 
	 * 		a) If it is same, move your index to the next element + 1
	 * 		b) If it is different, return that element
	 * 		c) If it is the last element, return that element
	 * 
	 */


	private int[] moveZeroesleft(int[] nums) {
		List<Integer> numbers = new ArrayList<Integer>();
		List<Integer> zero = new ArrayList<Integer>();

		for (int i = 0; i < nums.length; i++) { 
			if(nums[i] != 0) 
			{
				numbers.add(nums[i]);
			}
			else
			{
				zero.add(nums[i]);
			}

		}

		zero.addAll(numbers);
		for(int i = 0; i< zero.size(); i++){
			nums[i] = zero.get(i);
		}  
		System.out.println(Arrays.toString(nums));		
		return nums;
	} 
	/* Two Pointer
	 * Psuedo code here:
	 * 
	 * 1) Sort the given input  // 1,2,2
	 * 2) Compare the next element 
	 * 		a) If it is same, move your index to the next element + 1
	 * 		b) If it is different, return that element
	 * 		c) If it is the last element, return that element
	 */

	private int[] moveZeroesRight2pointer(int[] nums) {
		int left = 0, right = 0;
		while(right < nums.length) {
			if(nums[right] != 0 ) {
				int temp = nums[right];
				nums[right] = nums[left];
				nums[left++] = temp;
			}
			right++;
		}
		System.out.println(Arrays.toString(nums));	
		return nums;
	}

}

