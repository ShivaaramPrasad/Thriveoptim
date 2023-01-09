package dsa.important;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumNumberFromAnArray {

	
	@Test
	public void test1(){
		int [] nums = {1,2,4,9,5};
		Assert.assertEquals(9,maximumNumber2(nums));
	}

	@Test
	public void test2(){
		int [] nums = {1,9,4,9,5};
		Assert.assertEquals(9,maximumNumber2(nums));
	}
	
	@Test
	public void test3(){
		int [] nums = {8,8,8,8,8};
		Assert.assertEquals(8,maximumNumber2(nums));
	}
	
	private int  maximumNumber(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length - 1];
	}
	
	private int  maximumNumber2(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++)
            if (nums[i] > max)
                max = nums[i];
        return max;
	}
}
