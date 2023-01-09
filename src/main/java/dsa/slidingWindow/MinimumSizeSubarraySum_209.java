package dsa.slidingWindow;

import org.junit.Assert;
import org.junit.Test;

public class MinimumSizeSubarraySum_209 {
	
	/*
	 209. Minimum Size Subarray Sum
	 
Given an array of positive integers nums and a positive integer target, return the minimal length of a contiguous subarray [numsl, numsl+1, ..., numsr-1, numsr] of which the sum is greater than or equal to target.
 If there is no such subarray, return 0 instead.

 

Example 1:

Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
Example 2:

Input: target = 4, nums = [1,4,4]
Output: 1
Example 3:

Input: target = 11, nums = [1,1,1,1,1,1,1,1]
Output: 0
	 */
	@Test
    public void test1(){
        int[] nums = {2,3,1,2,4,3};
        int  target = 7;
        int output = 2;
        
        Assert.assertEquals(minSubArrayLen(nums, target),output);
        
	}
	
	@Test
    public void test2(){
        int[] nums = {1,4,4};
        int  target = 4;
        int output = 1;
        
        Assert.assertEquals(minSubArrayLen(nums, target),output);
        
	}
	
	@Test
    public void test3(){
        int[] nums = {1,1,1,1,1};
        int  target = 11;
        int output = 0;
        
        Assert.assertEquals(minSubArrayLen(nums, target),output);
        
	}
        
        
        public int minSubArrayLen( int[] nums, int target) {
        	
        	int start =0; int minlength= Integer.MAX_VALUE;
        	int sum=0; int index=0; int curlength=Integer.MAX_VALUE;
        	for (; start < nums.length; start++) {
				sum+=nums[start];
				while(sum>=target) {
					curlength= start-index+1;
					sum-=nums[index++];
					
				}
				minlength=Math.min(curlength, minlength);
			}
        	return minlength==Integer.MAX_VALUE ? 0:minlength;
    }

}
