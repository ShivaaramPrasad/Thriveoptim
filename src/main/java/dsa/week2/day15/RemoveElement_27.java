package dsa.week2.day15;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class RemoveElement_27 {
	
	
/*

 27. Remove Element
 https://leetcode.com/problems/remove-element/
 
Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The relative order of the elements may be changed.

Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.

Return k after placing the final result in the first k slots of nums.

Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

Example 1:

Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores).

Example 2:

Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,4,0,3,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
Note that the five elements can be returned in any order.
It does not matter what you leave beyond the returned k (hence they are underscores).



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
     
Approach

Initialize the count 
Iterate the for loop with length of array 
check the condition  if array element is not equal to the value 
move the position of the element using count 
and increment the count 
array element is equal to the value return count
*/

	@Test//Positve 
	public void example1(){
		int[] nums = {3,2,2,3}; int val = 3;
		int Output= 2;  //nums = [2,2,_,_]

		Assert.assertEquals(removeElement(nums,val),2);

	}
	
	@Test//Positve 
	public void example2(){
		int[] nums = {0,1,2,2,3,0,4,2}; int val = 2;
		int Output = 5; //nums = [0,1,4,0,3,_,_,_]

		Assert.assertEquals(removeElement(nums,val),5);


	}
	
	@Test//negative 
	public void example3(){
		int[] nums = {1,2,4,3}; int val = 3;
		int Output= 3;  //nums = [2,2,_,_]

		Assert.assertEquals(removeElement(nums,val),3);

	}
	
	@Test//negative
	public void example4(){
		int[] nums = {1,2,4,3}; int val = 5;
		int Output= 4;  //nums = [2,2,_,_]
		int removeElemente = removeElement(nums,val);
		Assert.assertEquals(removeElement(nums,val),4);
		Assert.assertTrue(removeElement(nums,5)==4);
	}
	
public int removeElement(int[] nums, int val) {
        

        int count=0; 
		//if(nums.length==1) return nums[0];

        for(int i=0; i< nums.length; i++)
        {
            if(nums[i]!=val)
            {
             nums[count]=nums[i];
             count++;
            }
        }
        return count;
    }
}


