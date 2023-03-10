package dsa.test;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearch {

	/*
	https://leetcode.com/problems/binary-search/
	Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
Input: nums = [-1,0,3,5,9,12], target = 9
	 */

	@Test
	public void test1() {
		int [] nums= {-1,0,3,5,9,12};
		int k= 12;
		System.out.println(returnIndex(nums,k));
		Assert.assertEquals(5, returnIndex( nums,k));
	}

	@Test
	public void test2() {
		int [] nums= {-1,0,3,5,9,12};
		int k= 9;
		System.out.println(returnIndex(nums,k));
		Assert.assertEquals(4, returnIndex( nums,k));
	}

	@Test
	public void test3() {
		int [] nums= {-1,0,3,5,9,12};
		int k= -1;
		System.out.println(returnIndex(nums,k));
		Assert.assertEquals(0, returnIndex( nums,k));
	}

	@Test
	public void test4() {
		int [] nums= {-1,0,3,5,9,12};
		int k= 15;
		System.out.println(returnIndex(nums,k));
		Assert.assertEquals(-1, returnIndex( nums,k));
	}
	
	@Test
	public void test5() {
		int [] nums= {5,5,5,5,5,5};
		int k= 5;
		System.out.println(returnIndex(nums,k));
		
	}

	//Time Complexity O[log(N)]
	//Space Complexity O[1]
	public int returnIndex(int nums[],int k) {
		int low = 0, high = nums.length -1, mid;
		while(low <= high){
			mid = (low + high)/2;
			if (nums[mid] == k)
				return mid;
			if(nums[mid]>k ){
				high = mid-1;
			}else
				low = mid+1;
		}
		return -1;
	}

	public int returnIndexFor(int nums[],int k) {
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]==k) {
				return i;
			}
		}
		return -1;
	}
	public int nbi(int nums[],int k) {
		int low = 0, high = nums.length -1, mid;
		while(low <= high){
			mid = (low + high)/2;
			if (nums[mid] == k)
				return mid;
			if(nums[mid]>k ){
				high = mid-1;
			}else
				low = mid+1;
		}
		return -1;
	}
}
