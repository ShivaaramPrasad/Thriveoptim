package sortingalgo;

import org.junit.Assert;
import org.junit.Test;

public class InsertionSort {


	
	
	@Test
	public void test1() {
		int [] nums= {3,9,0,5,12,-1};
		int [] out= {-1,0,3,5,9,12};
		Assert.assertArrayEquals(out, insertionSort(nums));
	}

	@Test
	public void test2() {
		int [] nums= {12,0,9,5,3};
		int [] out= {0,3,5,9,12};
		Assert.assertArrayEquals(out, insertionSort( nums));
	}

	/**
	 * combination for both bubble and select sort
	 * compare adj values.
	 * if(value at i < j)
	 * then swap values at i and j
	 * and find correct postion for value at j in left subArray.
	 */
	private int[] insertionSort(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) { //o[n]
			if (nums[i] > nums[i + 1]) {
				int temp = nums[i + 1];
				nums[i + 1] = nums[i];
				nums[i] = temp;
				for (int j = 0; j < i; j++) { //o[m]
						if (nums[j] > nums[i]) {
							temp = nums[i];
							nums[i] = nums[j];
							nums[j] = temp;
						}
				}
			}

		}
		return nums;
	}


}
