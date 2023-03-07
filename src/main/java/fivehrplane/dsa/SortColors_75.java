
package fivehrplane.dsa;

import org.junit.Test;

import java.util.HashSet;

import org.junit.Assert;

public class SortColors_75 {


	@Test
	public void test1() {
		int [] nums   = {2,0,2,1,1,0};
		int [] output   = {0,0,1,1,2,2};
		Assert.assertArrayEquals(output,sortColors(nums));
	}


public int[]  sortColors(int[] nums) {
        
        int low =0, middle=0, high =nums.length-1;
        int temp=0;
		while(middle<=high){
			if(nums[middle]==0) {
				temp = nums[middle];
				nums[middle] = nums[low];
				nums[low] = temp;
				middle++;
				low++;
			}else if(nums[middle] ==1) middle++;
			else {
				temp = nums[middle];
				nums[middle] = nums[high];
				nums[high] = temp;
				high--;
			}
		}
		return nums;
	}

}