package dsa.week2.day19;

import java.util.Arrays;

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
		int[] nums1 = {1,2,3,0,0,0};int m=3;
		int[] nums2 = {2,5,6}; int n=3; 
		Assert.assertArrayEquals(mergeSortedArray(nums1,m,nums2,n), new int[] {1,2,2,3,5,6});
		System.out.println(Arrays.toString(mergeSortedArray(nums1,m,nums2,n)));
	}

	@Test
	public void test2() {
		int[] nums1 = {1};int m=1;
		int[] nums2 = {}; int n=0; 
		Assert.assertArrayEquals(mergeSortedArray(nums1,m,nums2,n), new int[] {1});
	}

	/*
	 * Initlize the K pointer =0
	 * iterate for loop  from i =m and i less than m+n 
	 * nums2 values will be sorted form num1 of m k++
	 * then sort the array
	 */

	private int[] mergeSortedArray(int[] nums1,int m, int[] nums2, int n) {
		 int k=0;
			for(int i=m;i<(m+n);i++)
			{
				nums1[i]=nums2[k];
				k++;
			}
			for (int i = 0; i < nums1.length; i++) {
				for (int j = i + 1; j < nums1.length; j++) {
					int temp = 0;
					if (nums1[i] > nums1[j]) {
						temp = nums1[i];
						nums1[i] = nums1[j];
						nums1[j] = temp;
					}
				}
			}
			return nums1;  
		}

	}
