package sortingalgo;

import org.junit.Assert;
import org.junit.Test;

public class BubleSortAscending {

	/*
	Sort the array using BubleSort = [12,0,9,5,3]
	 */
	@Test
	public void test1() {
		int [] nums= {3,9,0,5,12,-1};
		int [] out= {-1,0,3,5,9,12};
		Assert.assertArrayEquals(out, bubleSort(nums));
	}

	@Test
	public void test2() {
		int [] nums= {12,0,9,5,3};
		int [] out= {0,3,5,9,12};
		Assert.assertArrayEquals(out, bubleSort( nums));
	}

	public int[] bubleSort(int nums[]) {
		//int n = nums.length;
		for (int i = 0; i < nums.length; i++)
			for (int j = 0; j < nums.length - i - 1; j++)
				if (nums[j] > nums[j + 1]) {
					// swap nums[j+1] and nums[j]
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
		return nums;
	}
}
