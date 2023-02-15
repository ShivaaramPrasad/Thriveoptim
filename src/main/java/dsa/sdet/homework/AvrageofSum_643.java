package dsa.sdet.homework;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class AvrageofSum_643 {


	@Test//
	public void example1(){
		int[] nums = {1,12,-5,-6,50,3};
		int k=4; double output=12.75;
    System.out.println(findMaxAverage(nums,k));
	}
	
	public double findMaxAverage(int[] nums, int k) {  
		double sum=0; double max=0;
		for(int i=0; i<k;i++){
			sum+=nums[i];
		}
		for(int i=k;i<nums.length;i++){
			sum+=nums[i]-nums[i-k];
			max=Math.max(max,sum);
		}
		return max/k;
	}

  
}