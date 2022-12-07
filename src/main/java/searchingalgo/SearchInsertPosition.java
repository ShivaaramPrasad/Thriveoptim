package searchingalgo;

import org.junit.Test;

import java.util.Arrays;

import org.junit.Assert;

public class SearchInsertPosition {

	/*
	 35. Search Insert Position
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

	 */
	
	@Test
	public void test2() {
		int[] nums = {1,3,5,6};
		int target = 2;
		Assert.assertEquals(1, searchInsert(nums,  target)); 
	}

	@Test
	public void test3() {
		int[] nums = {1,3,5,6};
		int target = 7;
		Assert.assertEquals(4, searchInsert(nums,  target)); 
	}
	
	@Test
	public void test1() {
		int[] nums = {1,3,5,6};
		int target = 5;
		Assert.assertEquals(2, searchInsert(nums,  target)); 
	}

	public int searchInsert(int[] nums, int k) {

		int left = 0, right = nums.length-1;
		while(left <= right) {
			int mid = (left + right)/2;
			if(nums[mid] == k) return mid;
			else if(nums[mid] < k) left = mid+1;
			else right = mid -1;
		}
		return left;
	}


	public int searchInsertinBuild(int[] nums, int k) {

		int index =Arrays.binarySearch(nums, k);
		if(index<0) {
			return -1*index-1;
		}
		return index;
	}

	public int searchInsertinBuildSagar(int[] nums, int target) {

		int left = 0, right=nums.length-1, mid;
        while(left<=right){
            mid = (left+right)/2;
            if(nums[mid]<target){
                if(mid!=nums.length-1 && nums[mid+1]>target) return mid+1;
                else if(mid==nums.length-1 && nums[mid]<target) return mid+1;
                else left=mid+1;
            } else if (nums[mid]>target) {
                if(mid!=0 && nums[mid-1]<target) return mid;
                else if(mid==0 && nums[mid]>target) return 0;
                else right=mid-1;
            } else if(nums[mid]==target) return mid;
        }
        return -1;
	}

}
