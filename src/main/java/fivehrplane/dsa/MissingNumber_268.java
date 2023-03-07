package fivehrplane.dsa;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class MissingNumber_268 {



	@Test//Positve 
	public void example1(){
		int[] numb = {9,6,4,2,3,5,7,0,1};
		//8

		Assert.assertEquals(missingNumberBruteForce(numb),8);
		Assert.assertEquals(missingNumberOptimized(numb),8);

	}

	@Test//Positve 
	public void example2(){
		int[] numb = {3,0,1};
		Assert.assertEquals(missingNumberBruteForce(numb),2);
		Assert.assertEquals(missingNumberOptimized(numb),2);

	}

	@Test//Edge Case 
	public void example3(){
		int[] numb = {0,1};
		Assert.assertEquals(missingNumberBruteForce(numb),2);
		Assert.assertEquals(missingNumberOptimized(numb),2);
	}

	public int missingNumberBruteForce(int[] nums) {
		int count =0;
		Arrays.sort(nums);
		if(nums.length<=2){
			return nums.length;
		}
		for(int i=0; i<nums.length; i++){
			if(nums[i]!=count){
				count++;
			}
		} 
		return count; 
	}


	public int missingNumberOptimized(int[] nums) {
		int sum=0;
		int n=nums.length;
		for(int i=0;i<nums.length;i++){
			sum+=nums[i];
		}
		return  n*(n+1)/2 - sum ;
	}
}


