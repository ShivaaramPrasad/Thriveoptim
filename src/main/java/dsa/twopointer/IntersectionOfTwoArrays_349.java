package dsa.twopointer;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class IntersectionOfTwoArrays_349 {

	/*
349. Intersection of Two Arrays

 https://leetcode.com/problems/intersection-of-two-arrays/
	 
	 Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.



Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.


	 1) Did I understand the problem? Yes
	        If No, Ask the person to provide more detail with example(s)
	        If yes, go to next step !!
	What is the input(s)? 2 Strings  int[], int

	Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
question: 
	What is the expected output? int.
	Do I have constraints to solve the problem?
	Do I have all informations to go to next step!!
	How big is your test data set will be?
	2) Test data set
	 Minimum of 3 data set ! ! Positive, Edge, Negative
	 Validate with the interviewer if the data set is fine by his/her assumptions

	3)Do I know how to solve it?
	    Yes — great, is there an alternate?
	     No — Can I break down the problem into sub problems?


	4) Ask for hint (If you do not know how to solve)
	5) DO I know alternate solutions as well?
	      Yes — What are those?
	       No — That is still fine, proceed to solve by what you know !!

	 */     



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