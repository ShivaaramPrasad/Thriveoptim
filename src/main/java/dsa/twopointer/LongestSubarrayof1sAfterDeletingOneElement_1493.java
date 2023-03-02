package dsa.twopointer;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class LongestSubarrayof1sAfterDeletingOneElement_1493 {

	/*
1493. Longest Subarray of 1's After Deleting One Element
https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/

Given a binary array nums, you should delete one element from it.

Return the size of the longest non-empty subarray containing only 1's in the resulting array. Return 0 if there is no such subarray.


	 */


	@Test
	public void test1(){ 
		int[] nums = {1,1,0,1}; int output = 3;
		Assert.assertEquals(output,longestSubarray(nums));

	}

	@Test
	public void test2(){ 
		int[] nums = {0,1,1,1,0,1,1,0,1}; int output = 5;
		Assert.assertEquals(output,longestSubarray(nums));

	}

	@Test
	public void test3(){ 
		int[] nums = {1,1,1}; int output = 2;
		Assert.assertEquals(output,longestSubarray(nums));

	}

	/*	Approach 
	 * initlize  i=0, j=0, k=1 and n=nums.length 
    Iterate the for loop till nums of lenght 
    check as we get any zero k--
    the k <0 and we move the window by implementing j++ =0 and k++
	return i-j-1
	 */

	private int longestSubarray(int[] nums) {

		int n = nums.length;
		int i=0,j=0,k=1;
		for(i=0;i<n;i++)
		{
			// check as we get any zero
			if(nums[i]==0)k--;
			// the k <0 and we move the window by implementing j++
			if(k<0 && nums[j++]==0)
			{
				k++;
			}

		}
		//return j-i-1;
		return i-j-1;                              

	}}