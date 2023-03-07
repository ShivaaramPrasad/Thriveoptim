package fivehrplane.dsa;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class RotateArray {
	
	@Test
	public void test1() {
		int [] nums = {1,2,3,4,5,6,7};
		int k = 3;
		int [] out = {5,6,7,1,2,3,4};

		assertArrayEquals(out, rotate(nums, k));
	}
	
	@Test
	public void test2() {
		int [] nums = {-1,-100,3,99};
		int k = 2;
		int [] out = {3,99,-1,-100};

		assertArrayEquals(out, rotate(nums, k));
	}
/*
 * Approach 
 * consider temp and rev
 * Iterate the nums 
 * where assign last value to rev
 * Iterate inner for loop 
 * and do the swap with rev
 */
	private int[] rotate(int[] nums, int k) {
         int temp , rev;
         for (int i = 0; i < k; i++) {
        	 rev=nums[nums.length-1];
        	 for (int j = 0; j < nums.length; j++) {
        		 temp=nums[j];
        		 nums[j]=rev;
        		 rev=temp;
			}
		}
		return nums;
	}

}
