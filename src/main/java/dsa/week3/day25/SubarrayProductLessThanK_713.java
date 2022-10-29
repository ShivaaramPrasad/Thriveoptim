package dsa.week3.day25;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class SubarrayProductLessThanK_713 {

	/*
	 713. Subarray Product Less Than K

https://leetcode.com/problems/subarray-product-less-than-k/
Given an array of integers nums and an integer k, return the number of contiguous subarrays where the product of all the elements in the subarray is strictly less than k.

Example 1:

Input: nums = [10,5,2,6], k = 100
Output: 8
Explanation: The 8 subarrays that have product less than 100 are:
[10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]
Note that [10, 5, 2] is not included as the product of 100 is not strictly less than k.
Example 2:

Input: nums = [1,2,3], k = 0
Output: 0

	 */


	@Test
	public void test(){ int[] nums = {10,5,2,6}; int k  = 100; int output = 8;
     Assert.assertEquals(output,subarrayProductLessThanK(nums, k));}

	@Test
	public void test2(){ int[] nums = {1,2,3}; int k  = 0; int output = 0;
	Assert.assertEquals(output,subarrayProductLessThanK(nums, k));}

	@Test public void test3(){int[] nums = {1,7}; int k  = 7; int output = 1;
	Assert.assertEquals(output,subarrayProductLessThanK(nums, k));  }
	
	@Test
	public void test4(){ int[] nums = {}; int k  = 6; int output = 0;
     Assert.assertEquals(output,subarrayProductLessThanK(nums, k));}
/*
	@Test public void test5(){ int[] nums = {3}; int k = 3; int output = 1;

	Assert.assertEquals(output,subarrayProductLessThanK(nums, k)); }

	@Test public void test6(){ int[] nums = {-1,-6}; int k = 6; int output = 1;

	Assert.assertEquals(output,subarrayProductLessThanK(nums, k)); }

	@Test public void test7(){ int[] nums = {2,2,1,4}; int k = 4; int output = 2;

	Assert.assertEquals(output,subarrayProductLessThanK(nums, k)); }

	@Test public void test8(){ int[] nums = {0,0,0,}; int k = 4; int output = 0;

	Assert.assertEquals(output,subarrayProductLessThanK(nums, k)); }

	@Test public void test9(){ int[] nums = {-1,-6,-1}; int k = 6; int output = 2;

	Assert.assertEquals(output,subarrayProductLessThanK(nums, k)); }
*/
	/*
- Initialze int count for holding number of itration 
- int Product for multiply the nums in a given array 
- Itrate the first for loop i start with 0 till array length
- Itrate the second for loop j=i+1 till array length
- multiple nums[i]*nums[j] and assign to product
- if product is less than k 
-    Multiple nums still the product is greater than k  break the loop
- Count need to be updated 
- return count 
	 */

	private int subarrayProductLessThanK(int[] nums, int k) {
		int count = 0; 

		for (int i = 0; i < nums.length; i++) {
			int product = 1;
			product *= nums[i]; 
			if(product < k) count++;	
			for (int j = i+1; j < nums.length; j++) {				
				product *= nums [j] ; 
				if(product < k ) count++; 
				if(product >= k) break;
			}
		}
		return count;


	}
}