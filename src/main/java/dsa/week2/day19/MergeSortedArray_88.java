package dsa.week2.day19;

import org.junit.Assert;
import org.junit.Test;

public class MergeSortedArray_88 {
/*
 * 88. Merge Sorted Array
https://leetcode.com/problems/merge-sorted-array/

You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
Example 2:

Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].


*/


	@Test
	public void test1() {
		int[] nums1 = {1,2,3,0,0,0};
		//int m=3,n=3;
		int[] nums2 = {2,5,6};
		Assert.assertArrayEquals(mergeSortedArray(nums1,nums2), new int[] {1,2,2,3,5,6});
	}



	private int[] mergeSortedArray(int[] nums1, int[] nums2) {
		int[] op = new int[nums1.length];
		int start =0;
		for (int i = 0; i < nums1.length+nums2.length; i++) {
			if(i<nums1.length){
				op[start++]=nums1[i];

			}
			if(i<nums2.length){
				op[start++]=nums2[i];
						}
		}

		return op;
	}
}
