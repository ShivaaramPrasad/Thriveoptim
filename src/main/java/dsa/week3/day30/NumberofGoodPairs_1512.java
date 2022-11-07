package dsa.week3.day30;

import java.util.HashMap;
import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;

import junit.*;

public class NumberofGoodPairs_1512 {

	/*
	 1512. Number of Good Pairs
Given an array of integers nums, return the number of good pairs.

A pair (i, j) is called good if nums[i] == nums[j] and i < j.



Example 1:

Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
Example 2:

Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array are good.
Example 3:

Input: nums = [1,2,3]
Output: 0
	 */

	@Test
	public void test1() {
		int [] nums = {1,2,3,1,1,3};
		int output=4;

		//Assert.assertEquals(output, numIdenticalPairs( nums));
		//Assert.assertEquals(output, numIdenticalPairsHashMap( nums));
		Assert.assertEquals(output, numIdenticalPairsHashMap(nums));

	}

	@Test
	public void test2() {
		int [] nums = {1,1,1,1};
		int output=6;

		//Assert.assertEquals(output, numIdenticalPairs(nums));
		//Assert.assertEquals(output, numIdenticalPairsHashMap(nums));
		Assert.assertEquals(output, numIdenticalPairsHashMap(nums));

	}

	@Test
	public void test3() {
		int [] nums = {1,2,3};
		int output=0;

		//Assert.assertEquals(output, numIdenticalPairs(nums));
		//Assert.assertEquals(output, numIdenticalPairsHashMap(nums));
		Assert.assertEquals(output, numIdenticalPairsHashMap(nums));

	}

	private int numIdenticalPairs(int[] nums) {

		//Time Complexity - O(N*N)
		//Space Complexity - O(1) // Constant


		int count=0;

		for(int i=0; i<nums.length-1; i++)
			for(int j=i+1; j<nums.length; j++)

			{
				if(nums[i]==nums[j])
					count++;
			}
		return count;
	}
	/**
	 * approach : HashMap
	 *
	 * - check if nums.length == 1. if yes return 0
	 *
	 * - iterate through nums starting from i = 0 to nums.length
	 *
	 * - before adding elt into set, check if elt already exists, if yes, cont++
	 *
	 * finally return count
	 *
	 *
	 */
	private int numIdenticalPairsHashMap(int[] nums) {
		if(nums.length == 1) return 0;
		int count = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < nums.length; i++){
			if(map.containsKey(nums[i])) 
				count += map.get(nums[i]);
			map.put(nums[i], map.getOrDefault(nums[i],0)+1);
		}
		return count;
	}
	
}

