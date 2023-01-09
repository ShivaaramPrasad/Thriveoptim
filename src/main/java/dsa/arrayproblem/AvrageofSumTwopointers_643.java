package dsa.arrayproblem;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class AvrageofSumTwopointers_643 {

/*
 
643. Maximum Average Subarray I
https://leetcode.com/problems/maximum-average-subarray-i/

	1) Did I understand the problem? Yes or NO ! !
	        If No, Ask the person to provide more detail with example(s)
	        If yes, go to next step !!
	What is the input(s)? 2 Strings
	What is the expected output? int.
	Do I have constraints to solve the problem?
	Do I have all informations to go to next step!!
	How big is your test data set will be?
	2) Test data set
	 Minimum of 3 data set ! ! Positive, Edge, Negative
	 Validate with the interviewer if the data set is fine by his/her assumptions

	3)Do I know how to solve it?
	    Yes — great, is there an alternate?
	     No — Can I break down the problem into sub problems?


	4) Ask for hint (If you do not know how to solve)
	5) DO I know alternate solutions as well?
	      Yes — What are those?
	       No — That is still fine, proceed to solve by what you know !!
	6) If you know alternate solutions -> find out the the 0 Notations (Performance)
           Then, explain either both are the best (depends on the time)
           Approach 1: Start with worst -> improve (Optimize) -> End up with the best 
	       Approach 2: Write down the options and benefits and code the best

     7) Start always with Pseudo code

     8) Implement them in the code (editor)

     9)Test against the different data set

     10) If it fails, debug them to solve it !!

*/
	

	@Test//
	public void example1(){
		int[] nums = {1,12,-5,-6,50,3};
		int k=4; double output=12.75;
    System.out.println(findMaxAverageOpti(nums,k));


	}

	public double findMaxAverage(int[] nums, int k) {
  		
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
	
	public double findMaxAverageOpti(int[] nums, int k) {
	      
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