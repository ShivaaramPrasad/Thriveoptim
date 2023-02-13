package dsa.interview.sdet;

import java.util.Arrays;

import org.junit.Test;

import org.junit.Assert;

public class ArrayPartition_561 {
	
	@Test
	public void test1(){
		int[] nums= {1,4,3,2};
		int out = 4;
		
Assert.assertEquals(4, arrayPairSum( nums));
	}
	
	public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length-1;i=i+2){
            sum+=nums[i];
        }
        return sum;
    }
}
