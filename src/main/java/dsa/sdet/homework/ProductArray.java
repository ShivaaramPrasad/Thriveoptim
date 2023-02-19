package dsa.sdet.homework;

import org.junit.Assert;
import org.junit.Test;

public class ProductArray {
	@Test
	public void test1() {
		int[] num = {1,2,3,4};
		int[] output = {24,12,8,6};
		Assert.assertArrayEquals(output, prodsolu(num));
		
	}
	@Test
	public void test2() {
		int[] num = {2};
		int[] output = {2};
		Assert.assertArrayEquals(output, prodsolu(num));
		
	}
	@Test
	public void test3() {
		int[] num = {-3, 2,-1};
		int[] output = {-2, 3,-6};
		Assert.assertArrayEquals(output, prodsolu(num));
		
	}
	
	public void test4() {
		int[] num = {2,1,2};
		int[] output = {2,4,2};
		Assert.assertArrayEquals(output, prodsolu(num));
		
	}
	
/*
 * Create a new array of n   out
 * first for loop need to be itrated 
 * if num[0]!=1 
 * intilize the prod value 1
 * itrate the next for loop 
 * if i!=j 
 * mutiple the prod with nums of j 
 * add in the 
 * store it in out array 
 * and retuen out 
 *
 */

	private int[] prodsolu(int[] nums) {
    int [] out =new int[nums.length];
    
    for (int i = 0; i < nums.length; i++) {
		int prod=1;
		for (int j = 0; j < out.length; j++) {
			if(i!=j) {
				prod=prod*nums[j];
			}
			
		}
		out[i]=prod;
	}

		return out;
	}
}
