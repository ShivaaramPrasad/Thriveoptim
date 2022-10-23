package dsa.week1;


import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class FindtheDuplicateNumber_287{
	/*
	287. Find the Duplicate Number
	https://leetcode.com/problems/find-the-duplicate-number/
	Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

	There is only one repeated number in nums, return this repeated number.

	You must solve the problem without modifying the array nums and uses only constant extra space.
	
	   Example 1:

		Input: nums = [1,3,4,2,2]
		Output: 2
		Example 2:

		Input: nums = [3,1,3,4,2]
		Output: 3
*/
	/*
	 * 1) Did I understand the problem? Yes or No !!
	 * 
	 * If No, Ask the person to provide more detail with examples
	 * If yes, go to next step ||
	 * 
	 * What is the input (S)?
	 * What is the expected output 
	 * Do i have all the information to go to next step
	 *  How big is your test data set will be 
	 * 2) Test Data set 
	 * Minimum of 3 data set !! Positive Edge, Negative
	 * validate with the interviewer if data set is fine by him/her assumptions
	 * 
	 * 3) DO I know to solve it?
	 * 
	 * Yes -great is there an alternate?
	 * 
	 * No Can I break down the problem into sub problem?
	 * 
	 * 4) Ask for hint(If do not know how to solve)
	 * 
	 * 5) DO I know alternate solution as well?
	 * 
	 * Yes -What are those?
	 * 
	 * No - That is still fine proceed to solve by what you know !!
	 * 
	 * 6) If You Know alternate solution --> find out the O Notation (Performance))
	 * 
	 * Then Explain either both or the best (depends on the time)
	 * 
	 * Approach 1: Start with worst --> Improve (Optimize) ->find up with the best
	 *  
	 * 	 * Approach 2: Write down the options and benefits and code the best 

	 * 7) start always with Pseudo code 
	 * 
	 * 8) Implement them in the code (editor)
	 * 
	 * 9) Test against the different data set
	 * 
	 * 10) If it fails debug them to solve it
	 Brute Force 
	 Please Sort the Array 
	 if num array  length is <= 1 return num[0];
	 itrate the nums by length -1 
	  if first value is equal to second value return nums[0]
	
	*/
	
	
	
	// 
	
		@Test//Positive
		public void example1(){
			int[] nums = {1,3,4,2,2};
		    int output=2;
			Assert.assertEquals(findtheDuplicateNumber(nums),output);
		}

		@Test //Edge
		public void example2(){
			int[] nums = {3,1,3,4,2};
		    int output=3;
			Assert.assertEquals(findtheDuplicateNumber(nums),output);

		}
		
	
		private int  findtheDuplicateNumber(int[] nums){
			
			Arrays.sort(nums);

			if(nums.length==1) return nums[0]; 

			for (int i = 0; i < nums.length-1; i++) {
				if(nums[i]==nums[i+1])
				{
					return nums[i];

				}
			}
			return 0;
		}
		
	}