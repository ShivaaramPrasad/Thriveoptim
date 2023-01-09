package dsa.slidingWindow;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class twosumiiinputarrayissorted_167 {

	/*
Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

The tests are generated such that there is exactly one solution. You may not use the same element twice.

Your solution must use only constant extra space.



	 */


	@Test
	public void test1(){ 
		int[] nums = {2,7,11,15}; int target  = 9;
		int[] output={1,2};
		Assert.assertEquals(output,twosumiii(nums, target));

	}

	

	@Test
	public void test2(){ 
		int[] nums = {-1,0}; int target  = -1;
		int[] output={1,2};

		Assert.assertEquals(output,twosumiii(nums, target));
		Assert.assertEquals(output,twosumiii2pointer(nums, target));

	}

	
	
	/*
	 * Psuedocode:
	 * 
	 * 1) traverse through array from 0 to n-1 index
	 * 2) add the indice values and 
	 * 3) compare against the target
	 * 4) If it matches, store the start + end index
	 * 5) Else, continue 
	 * 6) Finally, return the last matching index !!
	 * 7) If there are no matches --> then return empty array !!
	 * 
	 */
	
	private int[] twosumiii(int[] nums, int target) {
		{
			int[] indices = new int[2];

			if(nums.length<2) { return new int[] {};}
			for (int i = 0; i < nums.length; i++) {
				for (int j = i+1; j < nums.length; j++) {
					int sum = nums[i]+nums[j];
					if(sum == target)
					{
						indices[0] = i;
						indices[1] = j;

					}}}
			return indices;
		}
	}
	
	/*	Approach 
	 * validation: check array size.. if it is less than 2, return empty array 
	 * traverse through array from 0 to n-1 index
	 * add the indice values and 
	 * compare against the target
	 * If it matches, store the start + end index
	 *  Else, continue 
	 * Finally, return the last matching index !!
	 * If there are no matches --> then return empty array !!
	 */
        
	private int[] twosumiii2pointer(int[] nums, int target) {

        if(nums.length<1) return new int[] {0,0};
        int start=1; 
        int end = nums.length-1;
        while(start<end){
            if(nums[start]+nums[end]==target){
                start++;
                return new int[]{start, end};
            }
        else if(nums[start]+nums[end]<target )
            end--;
        else start++;
    }
    return new int[] {start,end};
	}
}