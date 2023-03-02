package fivehrplane.dsa;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class IntersectionOfTwoArrays_349 {

	

	@Test
	public void example1() {
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2,2};
		int[] intersect = intersectionOfTwoArrays(nums1, nums2);
		System.out.println(Arrays.toString(intersect));

	}

	@Test
	public void example2() {
		int[] nums1 = {4,5,9};
		int[] nums2 = {9,4,9,8,4};
		int[] intersect = intersectionOfTwoArrays(nums1, nums2);
		System.out.println(Arrays.toString(intersect));
	}

	@Test
	public void example3() {
		int[] nums1 = {4,5,9,9};
		int[] nums2 = {4,5,9,9};
		int[] intersect = intersectionOfTwoArrays(nums1, nums2);
		System.out.println(Arrays.toString(intersect));

	}

	@Test
	public void example4() {
		int[] nums1 = {4,5,9,9};
		int[] nums2 = {1,2,3};
		int[] intersect = intersectionOfTwoArrays(nums1, nums2);
		System.out.println(Arrays.toString(intersect));
	}

	@Test
	public void example5() {
		int[] nums1 = {4,5,9,9};
		int[] nums2 = {};
		int[] intersect = intersectionOfTwoArrays(nums1, nums2);
		System.out.println(Arrays.toString(intersect));
	}

	
	public int[] intersectionOfTwoArrays(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int first=0 , second= 0  ;
		Set<Integer> set= new HashSet<Integer>();
		while(first<nums1.length && second<nums2.length ){
			if(nums1[first]<nums2[second])
				first++;
            else if(nums1[first]>nums2[second])
            	second++;  
            else{
               set.add(nums1[first]);
                first++;
                second++;

		}
	}
		  int[] ins=new int[set.size()];
		  first=0;
	        for(int ele: set)
	        	ins[first++]=ele;
	        return ins;
}
}