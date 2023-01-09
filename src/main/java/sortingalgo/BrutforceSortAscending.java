package sortingalgo;

import org.junit.Assert;
import org.junit.Test;

public class BrutforceSortAscending {

	/*
	Sort the array using brutforce = [12,0,9,5,3]
	 */
	@Test
	public void test1() {
		int [] nums= {3,9,0,5,12,-1};
		int [] out= {-1,0,3,5,9,12};

		Assert.assertArrayEquals(out, brutforceSortAscending( nums));

	}

	@Test
	public void test2() {
		int [] nums= {12,0,9,5,3};
		int [] out= {0,3,5,9,12};

		Assert.assertArrayEquals(out, brutforceSortAscending( nums));

	}

	public int[] brutforceSortAscending(int nums[]) {
		for (int i = 0; i < nums.length; i++){  
			for (int j = i + 1; j < nums.length; j++){  
				int tmp = 0;  
				if (nums[i] > nums[j])   
				{  
					tmp = nums[i];  
					nums[i] = nums[j];  
					nums[j] = tmp;  
				}  
			}  		
		}
		return nums;
	}
	// Time 
	public int[] brutforceSortDecending(int nums[]) {
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