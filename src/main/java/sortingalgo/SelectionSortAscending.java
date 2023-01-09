package sortingalgo;

import org.junit.Assert;
import org.junit.Test;

public class SelectionSortAscending {

	@Test
	public void test1() {
		int [] nums= {3,9,0,5,12,-1};
		int [] out= {-1,0,3,5,9,12};
		Assert.assertArrayEquals(out, selectionSortB(nums));
	}

	@Test
	public void test2() {
		int [] nums= {12,0,9,5,3};
		int [] out= {0,3,5,9,12};
		Assert.assertArrayEquals(out, selectionSortB(nums));
	}

	public int[] selectionSort(int nums[]) {
		for (int i = 0; i < nums.length - 1; i++) {
			int lowIndex = i;
			for (int j = i+1; j < nums.length; j++) {
				if(nums[j] < nums[lowIndex]) lowIndex = j;
			}
			if(i != lowIndex) {
				int temp = nums[lowIndex];
				nums[lowIndex] = nums[i];
				nums[i] = temp;
			}
		}
		return nums;
	}
	
	public int [] selectionSortB(int nums[]) {
		for (int i = 0; i < nums.length; i++) {
			int min=i;
			for (int j = i+1; j < nums.length; j++) {
				if(nums[min]>nums[j])  min =j;
			}
			int temp=nums[min];
			nums[min]=nums[i];
			nums[i]=temp;
		}
		return nums;
	}
}
