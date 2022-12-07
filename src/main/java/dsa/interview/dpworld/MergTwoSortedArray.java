package dsa.interview.dpworld;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class MergTwoSortedArray {
	/*
	 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
	 */

	/* 
	 * Approch 1
	 * Initialize a two array list 
	 * if array of elements int equal to 0 add it inarray list 
	 * add the second array list to first 
	 */
	
	@Test()
	public void test1() {
		int[] nums = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};

		System.out.println(Arrays.toString(mergeArray(nums, nums2)));
	}

	public Integer[] mergeArray(int[] nums, int[] nums2) {

		List<Integer> numList= new ArrayList<Integer>();
		List<Integer> num2List= new ArrayList<Integer>();
		for(int i=0; i<nums2.length; i++) {
			if(nums[i]!=0)
				num2List.add(nums2[i]);
		}
		for(int i=0; i<nums.length; i++) {
			if(nums[i]!=0) numList.add(nums[i]);	
		}
		numList.addAll(num2List);
		Collections.sort(numList);
		
		return	numList.toArray(new Integer [numList.size()]);
		 
	}
	
	private int[] mergeArraysOptimized(int[] nums1, int nums2[], int m, int n){

        int index=m+n-1;
        m--; n--;
        while (m>=0 && n>=0){
            if(nums1[m]>nums2[n]) nums1[index--]=nums1[m--];
            else nums1[index--]=nums2[n--];
        }
        while (m>=0){
            nums1[index--]=nums1[m--];
        }
        while (n>=0){
            nums1[index--]=nums2[n--];
        }
        return nums1;
    }


}
