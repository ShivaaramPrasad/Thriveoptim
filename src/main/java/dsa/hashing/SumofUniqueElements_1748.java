package dsa.hashing;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Assert;

public class SumofUniqueElements_1748 {
	/*
	 https://leetcode.com/problems/sum-of-unique-elements/
	 You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.

Return the sum of all the unique elements of nums.


Example 1:

Input: nums = [1,2,3,2]
Output: 4
Explanation: The unique elements are [1,3], and the sum is 4.
Example 2:

Input: nums = [1,1,1,1,1]
Output: 0
Explanation: There are no unique elements, and the sum is 0.
Example 3:

Input: nums = [1,2,3,4,5]
Output: 15
Explanation: The unique elements are [1,2,3,4,5], and the sum is 15.


	 */
	@Test
	public void test1() {
		int[] nums = {1,2,3,2};
		int output= 4;
		System.out.println(sumOfUnique(nums));
		Assert.assertEquals(output, sumOfUnique(nums));
	}


	@Test
	public void test2() {
		int[] nums = {1,1,1,1,1};
		int output= 0;
		System.out.println(sumOfUnique(nums));
		Assert.assertEquals(output, sumOfUnique(nums));
	}




	/*
	 Approach 1

	   - Create a map with Integer Integer as key value to hold each nums and its occurrence 
	     of an array
	   - Keep adding each num and its occurrence into map 
	   - create output for adding 
	   - Iterate through entrySet map to add key into output where value matches 1
	   -  getkey of entries and add one by one with output 
	   - return output.

	 */

	private int sumOfUnique(int[] nums) {

		HashMap<Integer, Integer> map= new HashMap<Integer, Integer>();
		for ( int num : nums) {
			map.put( num, map.getOrDefault(num, 0) +1 );

		}
		int output=0; 

		for( Map.Entry<Integer, Integer> entries: map.entrySet() ) {
			if( entries.getValue() == 1) 
				output+= entries.getKey();
		}

		return output;
	}



}
