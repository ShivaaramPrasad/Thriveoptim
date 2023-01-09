package dsa.hackathon.day2;

import org.junit.Test;

public class MaxConsecutiveOnesIII {
	
	@Test
	public void example1() {
		int[] nums = {1,1,1,0,0,0,1,1,1,0};
		int k = 2;
		longestOnesFor(nums,k);
	}
	
	
	@Test
	public void example2() {
		int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
		int k = 3;
		longestOnesFor(nums,k);
	}
	/*
	 * Psuedocode
	 * 
	 * Algorithm : Sliding Window // Slow + Fast Pointer // Equi directional
	 * 
	 * 1) Create 2 pointers: left   right 0
	 * 2) Traverse the right (for loop)
	 * 3) When the value of the right == 0, then deduct the k
	 * 4) When k < 0 
	 * 		a) Move the left 
	 * 		b) increment the k (when the left value == 0)
	 * 5) Find the length right - left 
	 */
	
	private int longestOnesFor(int[] nums, int k) {
		int left = 0, right =0, max=0; // slow pointer
		for (right = 0; right < nums.length; right++) {
			if(nums[right] == 0) {
				k--; // decrement k --> flip zeros to ones !!
			}
			if(k < 0) {
				if(nums[left] == 0) { // move the left and reset the k
					k++;
				}
				left++;
			}
			max = Math.max(max, right-left+1);
		}
		System.out.println(max);
		return max;
	}
	
	private int longestOnes(int[] nums, int k) {
		int i=0,j=0;
		while(i<nums.length) {
			if(nums[i]==0) k--;
			if(k<0) {
				if(nums[i]==0) {
					k++;
				}
				j++;
			}
			i++;
		}
		return i-j;
	}
	

}
