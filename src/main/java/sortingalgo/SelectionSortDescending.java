package sortingalgo;

import org.junit.Assert;
import org.junit.Test;

public class SelectionSortDescending {

	@Test
	public void test1() {
		int [] nums= {3,9,0,5,12,-1};
		int [] outDes= {12,9,5,3,0,-1};
		Assert.assertArrayEquals(outDes, selectionSortB(nums));
	}

	@Test
	public void test2() {
		int [] nums= {3,9,0,5,12,-1};
		int [] outDes= {12,9,5,3,0,-1};
		Assert.assertArrayEquals(outDes, selectionSortB(nums));
	}

	public int[] selectionSort(int nums[]) {
		 for(int i = 0; i < nums.length-1; i++){
	            int highIndex = i;
	            for(int j = i+1; j < nums.length; j++){
	                if(nums[j] > nums[highIndex]) highIndex = j;
	            }
	            if(i != highIndex) {
	                int temp = nums[highIndex];
	                nums[highIndex] = nums[i];
	                nums[i] = temp;
	            }
	        }
	        return nums;
	    }
	
	public int [] selectionSortB(int nums[]) {
		for (int i = 0; i < nums.length; i++) {
			int max=i;
			for (int j = i+1; j < nums.length; j++) {
				if(nums[max]<nums[j])  max =j;
			}
			int temp=nums[max];
			nums[max]=nums[i];
			nums[i]=temp;
		}
		return nums;
	}
}
