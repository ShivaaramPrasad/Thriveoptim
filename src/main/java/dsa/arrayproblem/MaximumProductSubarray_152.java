package dsa.arrayproblem;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class MaximumProductSubarray_152 {
	@Test
	public void test1(){
		int[] nums = {2,3,-2,4};
		int output=6;
		Assert.assertEquals(output,maxProduct(nums));
	}

	@Test
	public void test2(){
		int[] nums = {1};
		int output=1;
		Assert.assertEquals(output,maxProduct(nums));
	}
	
	@Test
	public void test3(){
		int[] nums = {-2,0,-1};
		int output=0;
		Assert.assertEquals(output,maxProduct(nums));
	}
	
	/*
	 initize array of ist element in result 
	 in 1st iteration the array initilze the product 
	 in second iteration product of number is done
	 the result is fetched based on max value of result and product
	 */
	
	//Time Complexity=O(N2) 
		//Time Complexity=O(N)
	
	public int maxProduct(int[] nums) {
     int result = nums[0];
		 for (int i = 0; i < nums.length; i++) {
			int product=1;
			for (int j = i; j < nums.length; j++) {
				product*=nums[j];
				result = Math.max(result, product);
			}
		}
		return result;
	}
}
