package dsa.week3.day26;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class MaxConsecutiveOnesIII_1004 {

	/*
	 713. Subarray Product Less Than K

Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.


Example 1:

Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.

Example 2:

Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
Output: 10
Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined

	 */


	@Test
	public void test1(){ 
		int[] nums = {1,1,1,0,0,0,1,1,1,1,0}; int k  = 2; int output = 6;
	     Assert.assertEquals(output,maxConsecutiveOnes(nums, k));
	     
	}
/*
	@Test
	public void test2(){ 
		int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}; int k  = 3; int output = 10;
	     Assert.assertEquals(output,maxConsecutiveOnes(nums, k));
	     
	}

/*	
	-Create 2 pointers: start, end and count equals 0   
	itrate the (for loop) towards end 
	if  the value of the nums[end] is == 0, count++
	if count is greaterthan  k 
	   if nums[strat] is equals to 0 count -- and start ++
	find the lenght end - start
*/

	private int maxConsecutiveOnes(int[] nums, int k) {
	    
	    int  start = 0, end = 0, count= 0;
	        for(end = 0 ; end < nums.length ; end++){
	            if(nums[end] == 0) count++;
	            if(count > k){
	                if(nums[start] == 0)count--;
	                start++;
	            }
	        }
	        return end - start;
	    }
	
	}