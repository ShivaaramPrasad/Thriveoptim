package dsa.week1;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class SortArrayByParityII {
	
/*
 
 922. Sort Array By Parity II

Given an array of integers nums, half of the integers in nums are odd, and the other half are even.

Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.

Return any answer array that satisfies this condition.

Example 1:

Input: nums = [4,2,5,7]
Output: [4,5,2,7]
Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.

Example 2:

Input: nums = [2,3]
Output: [2,3]

 /* Psuedocode:
	  * Create an temp array pair
	  * validation: check array size.. if array is equals to 1  return nums
	  * if array equal to 1 return nums 
      * run a for loop and check nums for even condtion
      * If its satisfed store the value in Even index array memory and increment even array memory
      * If its satisfed store the value in odd index array memory and increment odd array memory
      * return the pair
 */
		
	@Test//Positve 
	public void example1(){
		int[] nums = {4,2,5,7}; 
		int [] Output= {4,5,2,7};

		assertEquals(true,Arrays.equals(sortArrayByParityII(nums),new int[] {4,5,2,7}));

	}
	
	@Test//Negative 
	public void example2(){
		int[] nums = {2,3};
		int [] Output= {2,3};

	assertEquals(true,Arrays.equals(sortArrayByParityII(nums),new int[] {2,3}));


	}
		
	  public int[] sortArrayByParityII(int[] nums) {
		   
	    int [] pair = new int[nums.length];
	        int evenindex=0;
	        int oddindex=1;

	        if(nums.length == 1) return nums;
	        
	        for(int i= 0; i < nums.length; i++){
	            if(nums[i] % 2 == 0)
	            {
	                pair[evenindex++]=nums[i];
	                evenindex=evenindex+1;
	            }
	        }
	        for(int i= 0; i < nums.length; i++){

	         if(nums[i] % 2 == 1)
	            {
	                pair[oddindex++]=nums[i];
	                oddindex=oddindex+1;
	            }
	         
	    }
	return pair;
	    }
	}
