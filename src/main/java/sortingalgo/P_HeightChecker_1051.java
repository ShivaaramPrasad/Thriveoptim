package sortingalgo;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class P_HeightChecker_1051 {
	/*
 A school is trying to take an annual photo of all the students. The students are asked to stand in a single file line in non-decreasing order by height. Let this ordering be represented by the integer array expected where expected[i] is the expected height of the ith student in line.

You are given an integer array heights representing the current order that the students are standing in. Each heights[i] is the height of the ith student in line (0-indexed).

Return the number of indices where heights[i] != expected[i].



Example 1:

Input: heights = [1,1,4,2,1,3]
Output: 3
Explanation: 
heights:  [1,1,4,2,1,3]
expected: [1,1,1,2,3,4]
Indices 2, 4, and 5 do not match.
Example 2:

Input: heights = [5,1,2,3,4]
Output: 5
Explanation:
heights:  [5,1,2,3,4]
expected: [1,2,3,4,5]
All indices do not match.
Example 3:

Input: heights = [1,2,3,4,5]
Output: 0
Explanation:
heights:  [1,2,3,4,5]
expected: [1,2,3,4,5]
All indices match.

	 */
   @Test
	public void test1() {
		int [] heights= {1,1,4,2,1,3};
		int out=3;
		Assert.assertEquals(out, heightChecker(heights));
	}
   @Test
	public void test2() {
		int [] heights= {5,1,2,3,4};
		int out=5;
		Assert.assertEquals(out, heightChecker(heights));

	}
   @Test
	public void test3() {
		int [] heights= {1,2,3,4,5};
		int out=0;
		Assert.assertEquals(out, heightChecker(heights));

	}
  // O(n2). The bubble sort has a space complexity of O(1).
	private int heightChecker(int[] heights) {
		int [] nums=heights.clone();  
		int count=0;
		for(int i = 0; i < nums.length; i++){
			for(int j = i+1; j < nums.length; j++){
				if(nums[i] > nums[j]){
					int temp = nums[j];
					nums[j] = nums[i];
					nums[i] = temp;
				}
			}
		}
		
		for(int i = 0; i < nums.length; i++){
			if(heights[i] != nums[i]) count++;
		}
		return count;    
	}		
	//Space complexity - O(n)
	//Time complexity - O(n log n) for internal sort + O(n) for traversing two arrays once.

	 public int heightChecker2(int[] heights) {
	        int count = 0;
	        int[] heights2 = new int[heights.length];
	        heights2 = Arrays.copyOf(heights, heights.length); //make a copy
	        Arrays.sort(heights2);  //sort
			//compare misplaced students
	        for(int i = 0; i < heights.length; i++){
	            if(heights[i] != heights2[i]) count++;
	        }
	        return count;
	    }
	}

