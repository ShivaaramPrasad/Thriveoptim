package sortingalgo;

import org.junit.Assert;
import org.junit.Test;

public class BubleSortDescending {

	/*
	Sort the array using BubleSort = [12,0,9,5,3]
	 */
	@Test
	public void test1() {
		int [] nums= {3,9,0,5,12,-1};
		int [] outDes= {12,9,5,3,0,-1};
		Assert.assertArrayEquals(outDes, bubleSortDes(nums));
	}

	@Test
	public void test2() {
		int [] nums= {12,0,9,5,3};
		int [] outDes= {12,9,5,3,0};
		Assert.assertArrayEquals(outDes, bubleSortDes(nums));
	}
	
	public int[] bubleSortDes(int nums[]) {
		int n = nums.length;
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (nums[j] < nums[j + 1]) {
				//swap nums[j+1] and nums[j]
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
		return nums;
	}
}
