package dsa.week4.day2;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Test;

import junit.framework.Assert;

public class ContainsDuplicate_217 {
	
	/*
217. Contains Duplicate

Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.


Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true


*/
	@Test
	public void test1() {
		int [] nums = {1,2,3,1};
		Assert.assertEquals(true, ContainsDuplicateSet(nums));
	}
	
	@Test
	public void test2() {
		
		int [] nums = {1,2,3,4};
		Assert.assertEquals(false, ContainsDuplicateSet(nums));
	}
	
	@Test
	public void test3() {
		
		int [] nums = {1,1,1,3,3,4,3,2,4,2};
		Assert.assertEquals(true, ContainsDuplicateSet(nums));
	}
	
	private boolean ContainsDuplicateSet(int[] nums) {

		HashSet<Integer> numset= new HashSet<>();
		
		for (int i = 0; i < nums.length; i++) {
			if(numset.contains(nums[i])) return true;
			numset.add(nums[i]);
		}
		return false;
	}

	private boolean ContainsDuplicate(int[] nums) {

          Arrays.sort(nums);		
		for (int i = 0; i < nums.length-1; i++) {
			if(nums[i]== nums[i+1])return true;
		}
		return false;
	}
}
