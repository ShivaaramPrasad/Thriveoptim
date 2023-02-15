package dsa.arrayproblem;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class AvrageofSum_643 {

	/*
Approch 

Get the some of values based on the window size k 
the current sum has to be calculated 
find the maxium sum of the array and fine the average value 
	 */


	@Test
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

	
	public double findMaxAverage2(int[] nums, int k) {
	       if(nums.length == 1) return nums[0];
			int currentSum = 0;
			for(int i=0; i < k;i++){
				currentSum +=nums[i]; 
			}
			double maxSum = currentSum;
			for(int i=1; i <= nums.length-k;i++){
				currentSum += nums[i+k-1]-nums[i-1];
				maxSum = Math.max(currentSum,maxSum);
			}
			System.out.println(maxSum/k);
			return maxSum/k;
		}
}