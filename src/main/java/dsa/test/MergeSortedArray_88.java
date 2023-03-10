package dsa.test;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class MergeSortedArray_88 {

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
			for(int i=m;i<(m+n);i++){
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
