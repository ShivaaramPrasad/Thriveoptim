package sortingalgo;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class P_FindTargetIndicesAfterSortingArray_2089 {
	
	/*
	 You are given a 0-indexed integer array nums and a target element target.

A target index is an index i such that nums[i] == target.

Return a list of the target indices of nums after sorting nums in non-decreasing order. If there are no target indices, return an empty list. The returned list must be sorted in increasing order.


Example 1:

Input: nums = [1,2,5,2,3], target = 2
Output: [1,2]
Explanation: After sorting, nums is [1,2,2,3,5].
The indices where nums[i] == 2 are 1 and 2.

Example 2:

Input: nums = [1,2,5,2,3], target = 3
Output: [3]
Explanation: After sorting, nums is [1,2,2,3,5].
The index where nums[i] == 3 is 3.

Example 3:

Input: nums = [1,2,5,2,3], target = 5
Output: [4]
Explanation: After sorting, nums is [1,2,2,3,5].
The index where nums[i] == 5 is 4.

	 */

	  @Test
		public void test1() {
			int [] nums= {1,2,5,2,3};
			int target =2;
			int [] out= {1,2};
			Assert.assertEquals(out, targetIndices(nums,target));
		}
	  
	  @Test
		public void test2() {
			int [] nums= {1,2,5,2,3};
			int target =3;
			int [] out= {3};
			Assert.assertEquals(out, targetIndices(nums,target));
		}
	  
	  @Test
		public void test3() {
			int [] nums= {1,2,5,2,3};
			int target =5;
			int [] out= {4};
			Assert.assertEquals(out, targetIndices(nums,target));
		}

	private List<Integer> targetIndices(int[] nums, int target) {

		return null;
	}
	  
	  
	  
}
