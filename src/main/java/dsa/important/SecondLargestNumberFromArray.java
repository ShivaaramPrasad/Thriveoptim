package dsa.important;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class SecondLargestNumberFromArray {

	
	@Test
	public void test1(){
		int [] nums = {1,2,4,9,8};
		Assert.assertEquals(8,secondLargestNumber2(nums));
	}

	@Test
	public void test2(){
		int [] nums = {1,9,4,8,5};
		Assert.assertEquals(8,secondLargestNumber3(nums));
	}
	
	@Test
	public void test3(){
		int [] nums = {8,9,8,8,8};
		Assert.assertEquals(8,secondLargestNumber3(nums));
	}

	private int  secondLargestNumber(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length-2];
	}
	
	private int  secondLargestNumber2(int[] nums) {
		for (int i = 0; i < nums.length; i++){  
			for (int j = i + 1; j < nums.length; j++){  
				int tmp = 0;  
				if (nums[i] > nums[j]){  
					tmp = nums[i];  
					nums[i] = nums[j];  
					nums[j] = tmp;  
				}  
			}  		
		}
        return nums[nums.length-2];
	}
	
	private int  secondLargestNumber3(int[] nums) {
        int first = Integer.MIN_VALUE,second = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            /* If current element is greater than
            first then update both first and second */
            if (nums[i] > first) {
                second = first;
                first = nums[i];
            }

	}
        return nums[nums.length-2];
}
}
