package dsa.slidingWindow;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class MinimumDifferenceBetweenHighestandLowestofKScores_1984 {
	
	
	/*
	 1984. Minimum Difference Between Highest and Lowest of K Scores
https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/

You are given a 0-indexed integer array nums, where nums[i] represents the score of the ith student. You are also given an integer k.

Pick the scores of any k students from the array so that the difference between the highest and the lowest of the k scores is minimized.

Return the minimum possible difference.

 

Example 1:

Input: nums = [90], k = 1
Output: 0
Explanation: There is one way to pick score(s) of one student:
- [90]. The difference between the highest and lowest score is 90 - 90 = 0.
The minimum possible difference is 0.
Example 2:

Input: nums = [9,4,1,7], k = 2
Output: 2
Explanation: There are six ways to pick score(s) of two students:
- [9,4,1,7]. The difference between the highest and lowest score is 9 - 4 = 5.
- [9,4,1,7]. The difference between the highest and lowest score is 9 - 1 = 8.
- [9,4,1,7]. The difference between the highest and lowest score is 9 - 7 = 2.
- [9,4,1,7]. The difference between the highest and lowest score is 4 - 1 = 3.
- [9,4,1,7]. The difference between the highest and lowest score is 7 - 4 = 3.
- [9,4,1,7]. The difference between the highest and lowest score is 7 - 1 = 6.
The minimum possible difference is 2.

	 */
	/**
    *
    *  approach : sliding_window
    *
    *  - sort the given array.
    *
    *  - initialise 1 pointers : start = 0
    *
    *  - initialise finaliseDiff = integer.MAX_Value
    *
    *  - loop starts from start till k
    *
    *  - find diff btw nums[start]  and nums[start+k]
    *
    *  - finaldiff = math.min(diff, finaldiff)
    *
    *  - return finaldiff
    *
    */
	
	@Test
    public void test(){
        int[] nums = {9,4,1,7};
        int k  = 2;
        int expectedScoreDiff = 2;
        
        Assert.assertEquals(getLeastScoreDiffBtwkStudents(nums, k),expectedScoreDiff);
        
        
    }
	
	@Test
    public void test2(){
        int[] nums = {90};
        int k  = 1;
        int expectedScoreDiff = 0;
        
        Assert.assertEquals(getLeastScoreDiffBtwkStudents(nums, k),expectedScoreDiff);
        
        
    }
   private int getLeastScoreDiffBtwkStudents(int[] nums, int k) {
           Arrays.sort(nums);
           int start = 0;
           int minDiff = Integer.MAX_VALUE;
/*
 [1,4,7,9], k = 2
 num[0]-num[0+2-1]==> num[0]-num[1]==> 1-4= 3
 num[1]-num[1+2-1]==> num[1]-num[2]==> 4-7= 3
 num[2]-num[2+2-1]==> num[2]-num[3]==> 7-9= 2
nums.length-k+1
 4-2+1==> 3
 */
           for(; start < nums.length-k+1 ;start++){
               //int diff = Math.abs(nums[start] - nums[start+k-1]);
        	   int diff = Math.abs(nums[start+k-1]-nums[start]);
               minDiff = Math.min(diff,minDiff);

           }

           return minDiff;


   }
}