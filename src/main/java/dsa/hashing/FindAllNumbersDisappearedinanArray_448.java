package dsa.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class FindAllNumbersDisappearedinanArray_448 {

	/*
	 * 448. Find All Numbers Disappeared in an Array
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:

Input: nums = [1,1]
Output: [2]

	 */

	/*
	 *Approch 1
	 *Get the size of array
	 *Initialize list of numbers 
	 *Start the iteration  1 to size of an array
	 *check for the each element of array is present matching with i
	 *if its not matching add to list and return
	 */


	@Test
	public void test1() {

		int[] nums= {4,3,2,7,8,2,3,1};
		int [] output= {5,6};
		Assert.assertEquals(Arrays.asList(5,6),findDisappearedNumbers(nums));

	}

	@Test
	public void test2() {

		int[] nums= {1,2};
		int [] output= {};
		Assert.assertEquals(Arrays.asList(),findDisappearedNumbers(nums));

	}
	
	@Test
	public void test4() {

		int[] nums= {1,1};
		int [] output= {2};
		System.out.println(findDisappearedNumbers(nums));
		Assert.assertEquals(Arrays.asList(2),findDisappearedNumbers(nums));

	}

	@Test
	public void test3() {

		int[] nums= {1};
		int [] output= {};
		Assert.assertEquals(Arrays.asList(),findDisappearedNumbers(nums));
	}

	private List<Integer> findDisappearedNumbers(int[] nums) {
		if(nums.length==0) return new ArrayList<>();
	       HashSet<Integer>numset=new HashSet<Integer>();
			List<Integer> ans =new ArrayList<>();

	       for (int i = 0; i < nums.length; i++) {
	    	   numset.add(nums[i]);
		}
		for (int i = 1; i <= nums.length; i++) {
			if(!numset.contains(i)) {
				ans.add(i);
				
			}
		}
		
		return ans;
	}



}
