package dsa.arrayproblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import org.junit.Assert;

public class DuplicateZeros1089 {
	
	/*
	 * 1089. Duplicate Zeros
	 * https://leetcode.com/problems/duplicate-zeros/description/
	 * 
	 * Given a fixed-length integer array arr, duplicate each occurrence of zero,
	 * shifting the remaining elements to the right.
	 * 
	 * Note that elements beyond the length of the original array are not written.
	 * Do the above modifications to the input array in place and do not return
	 * anything.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: arr = [1,0,2,3,0,4,5,0] Output: [1,0,0,2,3,0,0,4] Explanation: After
	 * calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
	 * Example 2:
	 * 
	 * Input: arr = [1,2,3] Output: [1,2,3] Explanation: After calling your
	 * function, the input array is modified to: [1,2,3]
	 * 
	 */

	@Test
	public void test1() {

		int[] arr = { 1, 0, 2, 3, 0, 4, 5, 0 };
		int[] output = { 1, 0, 0, 2, 3, 0, 0, 4 };

		// Assert.assertEquals(output, duplicateZeros(arr));
		System.out.println(Arrays.toString(duplicateZeros(arr)));
	}

	/*
	 * Approch 1 Iterate the for loop if num[i]== 0 in next for loop add zero in
	 * next element else move the pointer to next element return the output
	 * 
	 */

	private int[] duplicateZeros(int[] arr) {
         int size=arr.length;
		for (int i = 0; i < size- 1; i++) {
			if (arr[i] == 0) {
				for (int j = size -2; j >= i; j--) {
				   arr[j+1]=arr[j];
				} i++;
			} 
		}
		return arr;

	}

	}


