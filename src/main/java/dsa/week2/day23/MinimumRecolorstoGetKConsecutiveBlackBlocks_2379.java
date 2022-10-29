package dsa.week2.day23;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class MinimumRecolorstoGetKConsecutiveBlackBlocks_2379 {


	/*
	You are given a 0-indexed string blocks of length n, where blocks[i] is either 'W' or 'B', representing the color of the ith block. The characters 'W' and 'B' denote the colors white and black, respectively.

You are also given an integer k, which is the desired number of consecutive black blocks.

In one operation, you can recolor a white block such that it becomes a black block.

Return the minimum number of operations needed such that there is at least one occurrence of k consecutive black blocks.

 
Example 1:


Input: blocks = "WBBWWBBWBW", k = 7
Output: 3
Explanation:
One way to achieve 7 consecutive black blocks is to recolor the 0th, 3rd, and 4th blocks
so that blocks = "BBBBBBBWBW". 
It can be shown that there is no way to achieve 7 consecutive black blocks in less than 3 operations.
Therefore, we return 3.

Example 2:

Input: blocks = "WBWBBBW", k = 2
Output: 0
Explanation:
No changes need to be made, since 2 consecutive black blocks already exist.
Therefore, we return 0.


	 */
	/**
	 *
	 *  approach : 
	 *
	
	 *
	 */

	@Test
	public void test(){
		String blocks  = "WBBWWBBWBW";
		int k  = 7;
		int Output = 3;

		Assert.assertEquals(Output, miniumReColor(blocks,k));

	}

	@Test
	public void test2(){
		String blocks  = "WBWBBBW";
		int k  = 2;
		int Output = 0;
		
		Assert.assertEquals(Output, miniumReColor(blocks,k));


	}
	private int miniumReColor(String blocks, int k) {
		
		int mini= Integer.MAX_VALUE;
		for (int i = 0; i < blocks.length()-k; i++) {
			int count=0;
			for (int j = i; j < i+k; j++) {
				if(blocks.charAt(j) == 'W')
					{
					count++;
					}
				
			}
			mini=Math.min(mini,count);
		}

		return mini;


	}
}