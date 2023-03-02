
package fivehrplane.dsa;

import org.junit.Test;

import org.junit.Assert;

public class MoveZeros {


	@Test
	public void test1() {
		int [] nums= {0,1,0,3,12};
		Assert.assertArrayEquals(new int[] {1,3,12,0,0},moveZeroes2(nums));

	}



	public int[] moveZeroes2(int[] nums) {
		int cur = 0;
		for (int i = 0; i < nums.length; ++i) {
			if (nums[i] != 0) {
				int temp = nums[cur];
				nums[cur++] = nums[i];
				nums[i] = temp;
			}
		}
		return nums;
	}

	public void moveZeroes(int[] nums) {

		// Shift non-zero values as far forward as possible
		// Fill remaining space with zeros
		if (nums == null || nums.length == 0) return;        
		int pos = 0;
		for (int num: nums) {
			if (num != 0) nums[pos++] = num;
		}        
		while (pos < nums.length) {
			nums[pos++] = 0;
		}
	}

}