package dsa.week1;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class SumofThreeElementsInArray {
	
	
	@Test//Positve 
	public void example2(){
		int[] nums = {1,2,3,4,5}; 

		Assert.assertArrayEquals(sumofTwoElementsInArray(nums),new int[] {3,5,7,9});
        System.out.println(Arrays.toString(sumofTwoElementsInArray(nums)));

	}
	
	
	public int[] sumofTwoElementsInArray(int[] nums) {
	    int ind=0;
		int [] addtwonums = new int[nums.length-1];

		for(int i=0;i<nums.length-1;i++){ 
	    { 
	    	addtwonums[ind++] = nums[i] +nums[i+1] ;  
	    }

	    }
		return addtwonums; 
}
}