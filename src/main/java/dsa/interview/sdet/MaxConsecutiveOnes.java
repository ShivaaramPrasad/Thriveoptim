package dsa.interview.sdet;

import org.junit.Test;

import org.junit.Assert;

public class MaxConsecutiveOnes {
	
	/*
	Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.

	 */
	
	@Test
	public void test1() {
		int [] nums = {1,1,1,0,0,0,1,1,1,1,0};
		int k = 2;
  Assert.assertEquals(6, longestOnes(nums, k));
  
	}
	
	@Test
	public void test2() {
		int [] nums = {1,1,1,0,0,0,1,1,1,1,0};
		int k = 3;
  Assert.assertEquals(10, longestOnes(nums, k));
  
	}
	
	/*
	 intilize start, end and count;
	 itrate the array if nums is equal to 0 count has to increment 
	 if (K< count)
	 if nums start =0   count has to decrement 
	start has to increment 
	 end - start 
	 */

	private int  longestOnes(int[] nums, int k) {
       
		int start=0, end =0, count =0;
		
		for(end =0; end<nums.length; end++ )
		{
			if(nums[end]==0) count++;
			if(k<count)
			{
				if(nums[start]==0) count--;
				 start++;
			}
		}
		
		return end- start ;
	}

}
