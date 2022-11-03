package dsa.week3.day27;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class MaximumProductSubarray_152 {

	/*
152. https://leetcode.com/problems/maximum-product-subarray/

Given an integer array nums, find a contiguous non-empty subarray within the array that has the largest product, and return the product.

The test cases are generated so that the answer will fit in a 32-bit integer.

A subarray is a contiguous subsequence of the array.


	 */


	@Test
	public void test1(){ 
		int[] nums = {2,3,-2,4}; int output = 6;
		Assert.assertEquals(output,maxProductUSingMaxmin(nums));
		Assert.assertEquals(output,maxProductUSingSwapMaxmin(nums));

	}

	@Test
	public void test2(){ 
		int[] nums = {-2,3,-4}; int output = 24;
		Assert.assertEquals(output,maxProductUSingMaxmin(nums));
		Assert.assertEquals(output,maxProductUSingSwapMaxmin(nums));

	}



	/*	
	 * 
	 */

	private int maxProductUSingMaxmin(int[] nums) {

		int max = nums[0] , curMax = nums[0] ,curMin = nums[0] , temp,i;
		for(i=1;i<nums.length;i++){
			temp =curMax;
			curMax = Math.max(nums[i] , Math.max(nums[i]*curMax , nums[i]*curMin));
			curMin = Math.min(nums[i] , Math.min(nums[i]*temp , nums[i]*curMin));
			max = Math.max(max , curMax);
		}
		return max;
	}


	private int maxProductUSingSwapMaxmin(int[] nums) {
		if (nums == null || nums.length == 0)return 0;

		int max = nums[0];
		int min = nums[0];
		int ans = nums[0];
		int result = nums[0];

		for(int i = 1; i < nums.length; i++){
			if(nums[i] < 0){
				int temp = max;
				max = min;
				min = temp;
			}
			max = Math.max(nums[i] , nums[i] * max);
			min = Math.min(nums[i] , nums[i] * min);
			ans = Math.max(max,min);
			//if(result < ans)result = ans;
			result=Math.max(result, ans);

		}
		return result;
	}
}
