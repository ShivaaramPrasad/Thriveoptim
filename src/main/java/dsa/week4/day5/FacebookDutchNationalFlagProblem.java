package dsa.week4.day5;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class FacebookDutchNationalFlagProblem {
	
	/*
	 * 
	 * https://leetcode.com/discuss/interview-question/124623/Sort-the-numbers-based-on-categories-low-mid-and-high/240442
	 You have an unsorted array of integers and a function
string getCategory(integer), which deterministically returns 1 of three possible strings: "low", "medium", or "high", depending on the input integer. 
You need to output an array with all the "low" numbers at the bottom, all the "medium" numbers in the middle, and all the "high" numbers at the top. This is basically a partial sort. Within each category, 
the order of the numbers does not matter.

For example, you might be give the array [5,7,2,9,1,14,12,10,5,3].
For input integers 1 - 3, getCategory(integer) returns "low", for 4 - 10 it returns "medium," and for 11 - 15 it returns "high".

You could output an array (or modify the given array) that looks like this: [3,1,2,5,5,9,7,10,14,12]


	 */

	@Test
	public void test1() {
		int nums[] = {5,7,2,9,1,14,12,10,5,3};
		int output[]= {1,2,3,5,5,9,10,12,14};
		int  val1=3; int val2=11;
		Assert.assertArrayEquals(output, solution(nums,val1,val2));
	}

	private int[]  solution(int[] nums, int val1, int val2) {
		int low =0, middle=0, high =nums.length-1;
		int temp=0;
		while(middle<=high)
		{
			if(nums[middle]==val1) {
				temp=nums[middle];
				nums[middle]=nums[low];
				nums[low]=temp;
				middle++;
				low++;
			}else if(nums[middle] ==val2) middle++;
			else {
			     temp=nums[middle];
				nums[middle]=nums[high];
				nums[high]=temp;
				high--;
			}
		}
		return nums;
	}
	
	
}