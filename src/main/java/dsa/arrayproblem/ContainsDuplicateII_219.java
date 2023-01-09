package dsa.arrayproblem;

import java.util.HashMap;
import java.util.HashSet;

import org.junit.Test;

import org.junit.*;

public class ContainsDuplicateII_219 {

	/*
	 219. Contains Duplicate II
Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:

Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:

Input: nums = [1,2,3,1,2,3], k = 2
Output: false

	 */
	@Test
	public void test1() {
		int [] nums = {1,2,3,1};
		int k = 3;
		Assert.assertEquals(true, containsNearbyDuplicate(nums, k));
	}

	@Test
	public void test2() {

		int [] nums = {1,0,1,1};
		int k = 1;
		Assert.assertEquals(true, containsNearbyDuplicate(nums, k));
	}

	@Test
	public void test3() {

		int [] nums = {1,2,3,1,2,3};
		int k = 2;
		Assert.assertEquals(false, containsNearbyDuplicate(nums, k));
	}

	private boolean containsNearbyDuplicate(int[] nums, int k) {

		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i< nums.length; i++){
			int temp = nums[i];
			if(map.containsKey(temp)){
				if(i - map.get(temp) <= k) return true;
			}
			map.put(temp, i);
		}
		return false;

	}
}
