package dsa.hackathon.day1;

import java.util.Arrays;

import org.junit.Test;

public class IntersectionofTwoArraysII_350 {
	
	@Test
	public void example1() {
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2,2};
		//[2]
		int[] intersect = intersectionOfTwoArrays(nums1, nums2);
		System.out.println(Arrays.toString(intersect));

	}

	@Test
	public void example2() {
		int[] nums1 = {4,5,9};
		int[] nums2 = {9,4,9,8,4};
		//9,4
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

	/* pseudo code - 2Pointer
	 * 
	 * - first = 0 second = 0  
	 * 
	 * - initialse hashset.  //space -> o[n]
	 * 
	 * - sort the arrays. // o[nlogn]  
	 * 
	 * - iterate through arrays until first < array1.length &&  second < array2.length  //o[ n*m ]
	 * 
	 * - check if value at first of array 1 and second of array2 matches.
	 *    if yes, add to set.
	 * 
	 *   if no, check if value at first < value at second -> increment first.
	 *   
	 *   		 check if value at first > value at second -> increment second.
	 *   
	 * 
	 *  - finally return the set.
	 *  
	 *  time-->  o[nlogn] + o[ n*m ] => o[ n*m ]
	 *  
	 *  space --> o[n]
	 *
	 */

	public int[] intersectionOfTwoArrays(int[] nums1, int[] nums2) {
		    Arrays.sort(nums1);
			Arrays.sort(nums2);
			int first=0 , second= 0 ; int k=0;
	        int[] ans= new int[nums1.length+nums1.length];
			while(first<nums1.length && second<nums2.length ){
				if(nums1[first]<nums2[second]) first++;
	            else if(nums1[first]>nums2[second]) second++;
	            else{
	                ans[k++]=nums1[first++];
	                second++;
			}
		}
			return Arrays.copyOfRange(ans, 0, k);
	    }
	}

