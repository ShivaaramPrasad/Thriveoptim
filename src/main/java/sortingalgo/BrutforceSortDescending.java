package sortingalgo;

import org.junit.Assert;
import org.junit.Test;

public class BrutforceSortDescending  {

	/*
	Sort the array using brutforce = [12,0,9,5,3]
	 */
	@Test
	public void test1() {
		int [] nums= {-1,0,3,5,9,12};
		int [] outDec= {12,9,5,3,0,-1};

		Assert.assertArrayEquals(outDec, brutforceSortDescending( nums));

	}

	@Test
	public void test2() {
		int [] nums= {12,0,9,5,3};
		int [] outDec= {12,9,5,3,0};

		Assert.assertArrayEquals(outDec, brutforceSortDescending( nums));

	}
	
	public int[] brutforceSortDescending(int nums[]) {
		for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] < nums[j]){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        return nums;
    }
}