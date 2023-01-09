package dsa.hackathon.day1;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class FindtheDuplicateNumber_287 {

	@Test
	public void example1(){
		int[] nums = {1,3,4,2,2};
	    int output=2;
		Assert.assertEquals(findtheDuplicateNumber2(nums),output);
	}

	@Test
	public void example2(){
		int[] nums = {3,1,3,4,2};
	    int output=3;
		Assert.assertEquals(findtheDuplicateNumber2(nums),output);

	}

	/*
	 Approach
	 if nums length is equal to 1 return nums[0]
	 Sort the  nums 
	 Iterate the nums if nums[i] equals nums[i+1]  
	 return nums[i];
	 
	 */
	private int findtheDuplicateNumber(int[] nums) {
		if(nums.length==1) return nums[0]; 
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]==nums[i+1]) {
				return nums[i];
			}
		}
		return 0;
	}
	
	private int findtheDuplicateNumber2(int[] nums) {
		/*
		1. while 
		2. nums[0] != nums[nums[0]] 
		3. swap !
		*/
		
		int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct] )
            swap(nums,i,correct);
            else i++;
        }
       return nums[nums.length-1];
	}

    static void swap(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }

}
