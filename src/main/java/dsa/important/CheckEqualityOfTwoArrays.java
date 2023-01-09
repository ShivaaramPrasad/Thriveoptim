package dsa.important;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class CheckEqualityOfTwoArrays {

	/*
	 #1. Java Program To Check Equality Of Two Arrays

	 */
	
/*	@Test
	public void test1() {
		int [] nums1 = {1, 2, 5, 4, 0};
		int [] nums2 = {2, 4, 5, 0, 1};
		Assert.assertEquals(true, checkEquality2(nums1,nums2));
	}
	
	@Test
	public void test2() {
		int [] nums1 = {1, 1 ,2, 5, 4, 0};
		int [] nums2 = {2, 4, 5, 0, 1};
		Assert.assertEquals(false, checkEquality2(nums1,nums2));
	}
	*/
	@Test
	public void test3() {
		int [] nums1 = {1, 2, 5, 5, 0};
		int [] nums2 = {2, 4, 5, 0, 1};
		Assert.assertEquals(false, checkEquality2(nums1,nums2));
	}
	
	@Test
	public void test4() {
		int [] nums1 = {5, 5, 5, 5, 5};
		int [] nums2 = {2, 4, 5, 0, 1};
		Assert.assertEquals(false, checkEquality2(nums1,nums2));
	}
	
//Time Complexity: O(N*log(N)) 
//Space Complexity: O(1)
	
	private Boolean checkEquality(int[] nums1, int[] nums2) {
		if(nums1.length!=nums2.length) return false;
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		for (int i = 0; i < nums2.length; i++) {
			if(nums1[i]==nums2[i]) return true;
		}
		return false;
	}

	private Boolean checkEquality2(int[] nums1, int[] nums2) {
		if(nums1.length!=nums2.length) return false;
        Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums2.length; i++) {
        	map2.put(nums2[i], map2.getOrDefault(nums2[i],0)+1);
		}
        for (int j = 0; j < nums1.length; j++) {

        if(map2.containsKey(nums1[j])); {
        	return true;
        }
	}
		return false;	
	}
}
