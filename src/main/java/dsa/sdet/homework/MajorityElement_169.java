package dsa.sdet.homework;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;


public class MajorityElement_169 {
	
	@Test
	public void test1() {
		int[] nums = {3,2,3};
		int output=3;
		Assert.assertEquals(majorityElement(nums), output);
	}

	@Test
	public void test2() {
		int[] nums = {2,2,1,1,1,2,2};
		int output=2;
		Assert.assertEquals(majorityElement(nums), output);

	}

	private int majorityElement2(int[] nums) {
		int count = 0;
		int majele = nums[0];
		for(int i=0;i<nums.length;i++){
			if(count == 0) 
				majele = nums[i];
			if(majele == nums[i]) 
				count++;
			else count--;
		}
		return majele;
	}
	/*
    - Sort the array
    - find the middle index by (left+right)/2;
    - return middle value in the array
    */
   public int majorityElement(int[] nums) {

       Arrays.sort(nums);
       int left =0, right = nums.length-1;

       int middle = (left+right)/2;

       return nums[middle];

   }
}