package dsa.week3.day29;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class MaximumSubarray_53 {
	/*
	 * https://leetcode.com/problems/maximum-subarray/         ------KadaneAlgorithm
53 	Given an integer array nums, find the subarray which has the largest sum and return its sum.
  Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Example 2:

Input: nums = [1]
Output: 1
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23

	 */   @Test
	 public void test1(){
		 int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		 int output=6;
		 Assert.assertEquals(output,maxSumSubArray(nums));

	 }

	 @Test
	 public void test2(){
		 int[] nums = {1};
		 int output=1;
	
		 Assert.assertEquals(output,maxSumSubArray(nums));

	 }

	 @Test
	 public void test3(){
		 int[] nums = {2,3,6,-5,10,1,1};
		 int output=2;
		 //{}
		 Assert.assertEquals(output,maxSumSubArray(nums));

	 }

	 private int  maxSumSubArray(int[] nums) {
		 if(nums.length==1)return nums[0];
		 int sum = 0, maxSum = 0;

		 for (int i = 0; i < nums.length; i++) {
			 sum+=nums[i];	
		 
		 if(sum<0)
		 {
			 maxSum=Math.max(sum, maxSum);
			 sum=0;
		 } else
			 maxSum=Math.max(sum, maxSum);
	 }
		 return maxSum;
	 }
}
