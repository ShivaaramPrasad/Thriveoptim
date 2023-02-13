package dsa.sdet.homework;

import org.junit.Test;

public class FindPivotSum_724 {

	@Test
	public void test1() {
		int [] nums = {1,7,3,6,5,6};
		System.out.println(pivotIndex(nums));

	}

	@Test
	public void test2() {
		int [] nums = {1,2,3};
		System.out.println(pivotIndex(nums));

	}

	@Test
	public void test3() {
		int [] nums = {2,1,-1};
		System.out.println(pivotIndex(nums));

	}
	/*
	 * Approch
	 * Calculate the total sum of array
	 * intilize  leftsum
	 * iterate the loop if left sum = total sum - left Sum -num[i];
	 * leftsum should be added with Nums[i];
	 */
	private int pivotIndex(int[] nums) {
		int toatlSum=0;
		for (int i = 0; i < nums.length; i++) {
			toatlSum+=nums[i];
		}
		int leftSum=0;
		for (int i = 0; i < nums.length; i++) {
			if(leftSum==toatlSum-leftSum-nums[i]) {
				return i;
			}
			leftSum+=nums[i];
		}
		return -1;
	}
}
