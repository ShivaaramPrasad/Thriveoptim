package dsa.week1;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class SortArrayBruteForce {
	
	/*
	905. Sort Array By BruteForce  the array will be unsorted


 * Psuedocode:
 * 1) validation: check array size.. if it is less than 
 * 2) if array equal to 1 return nums 
 * 3) run two for loop and check nums[i] is less than nums [i+j] condition
 * 4)   Assing the temp varibile
 * 5) Create a temp variable and swap the value 
 * 6) num[j] has to be assgined to num[i]
 * 7)temp has to be assgined to a[j]
 * 
*/
    
	@Test//Positve 
	public void example1(){
		int[] nums = {3,1,2,4}; 
		//{2,4,3,1}

		assertEquals(true,Arrays.equals(sortArrayByBruteForce(nums),new int[] {1,2,3,4}));
		System.out.println(Arrays.toString(sortArrayByBruteForce(nums)));

	}   

	@Test//Negative 
	public void example2(){
		int[] nums = {0};
		

	assertEquals(true,Arrays.equals(sortArrayByBruteForce(nums),new int[] {0}));
	System.out.println(Arrays.toString(sortArrayByBruteForce(nums)));


	}
	
	@Test//Negative 
	public void example3(){
		int[] nums = {1,2,4,7,4,5,1};
		

	assertEquals(true,Arrays.equals(sortArrayByBruteForce(nums),new int[] {1,1,2,4,4,5}));
	System.out.println(Arrays.toString(sortArrayByBruteForce(nums)));


	}
	
	public int[] sortArrayByBruteForce(int[] nums) {
		
		 for (int i = 0; i < nums.length; i++) {
		        for (int j = i + 1; j < nums.length; j++) {
		            int temp = 0;
		            if (nums[i] > nums[j]) {
		                temp = nums[i];
		                nums[i] = nums[j];
		                nums[j] = temp;
		            }
		        }
		    }
   return nums;  }

}
