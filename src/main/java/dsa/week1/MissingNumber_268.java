package dsa.week1;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class MissingNumber_268 {
	
	
/*

 268. Missing Number
 https://leetcode.com/problems/missing-number/
 
Given an array nums containing n distinct numbers in the range [0, n], 
return the only number in the range that is missing from the array.

Example 1:
Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 
2 is the missing number in the range since it does not appear in nums.

Example 2:
Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 
2 is the missing number in the range since it does not appear in nums.

Example 3:
Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 
8 is the missing number in the range since it does not appear in nums.


1) Did I understand the problem? Yes ! !
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
Approch
* Initalize the int count 
* Sort the the array  
* iF We 
*/
	
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
		//2

		Assert.assertEquals(missingNumberBruteForce(numb),2);
		Assert.assertEquals(missingNumberOptimized(numb),2);

	}
	
	@Test//Edge Case 
	public void example3(){
		int[] numb = {0,1};
		//2

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


