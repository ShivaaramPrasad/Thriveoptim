package dsa.hackathon.day2;

import org.junit.Test;

public class MaximumAverageSubarrayI_643 {

	@Test//
	public void test1(){
		int[] nums = {1,12,-5,-6,50,3};
		int k=4; double output=12.75;
		System.out.println(findMaxAverageOpti(nums,k));
	}
	@Test//
	public void test2(){
		int[] nums = {5};
		int k=1; double output=5.0;
		System.out.println(findMaxAverageOpti(nums,k));
	}

	public double findMaxAverageOpti(int[] nums, int k) {

		double max=0; double sum=0;
		for(int i=0; i<k;i++){
			sum+=nums[i];
		}
		max=sum;
		for(int i=k;i<nums.length;i++){
			sum=sum + nums[i] - nums[i-k];
			max=Math.max(max,sum);
		}
		return max/k;
	}


}
