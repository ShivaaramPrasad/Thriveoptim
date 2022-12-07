package dsa.twopointer;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.management.RuntimeErrorException;

import org.junit.Assert;
import org.junit.Test;

public class MoveZeroesLeft_283 {

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
		Integer[] output = {0,0,0,4,2,1};
		int[] out = {0,0,0,4,2,1};

		//Assert.assertEquals(output ,moveZeroesleft(nums));
		Assert.assertEquals(output ,moveZeroesRight2pointer(nums));

	}

	@Test
	public void example2() {
		int[] nums = {0,0,0,1,1,1};
		Integer[] output = {0,0,0,1,1,1};
		int[] out = {0,0,0,1,1,1};
		//Assert.assertEquals(output, moveZeroesleft(nums));
		Assert.assertEquals(output ,moveZeroesRight2pointer(nums));

	}

	@Test
	public void example3() {
		int[] nums = {1,2,3,4,5};
		Integer[] output = {1,2,3,4,5};
		int[] out = {1,2,3,4,5};
		Assert.assertEquals(out ,moveZeroesRight2pointer(nums));

		//System.out.println(moveZeroesleft(nums));
		//Assert.assertEquals(output, moveZeroesleft(nums));

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
	 */
	private Integer[] moveZeroesleft(int[] nums) {
		List<Integer> numbers = new ArrayList<Integer>();
		List<Integer> zero = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) { 
			if(nums[i] != 0) {
				numbers.add(nums[i]);
			}
			else{
				zero.add(nums[i]);
			}
		}
		zero.addAll(numbers);
		/*
		for(int i = 0; i< zero.size(); i++){
			nums[i] = zero.get(i);
		}  
		System.out.println(Arrays.toString(nums));	*/	
		return zero.toArray(new Integer[zero.size()]);
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

