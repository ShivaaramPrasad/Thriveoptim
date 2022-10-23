package dsa.week3;

import org.junit.Assert;
import org.junit.Test;

public class MinimumRecolorstoGetKConsecutiveBlackBlocks_2379 {


	/*
	 * 
	 * 2379. Minimum Recolors to Get K Consecutive Black Blocks
	 * 
	 * 1  Conver to string to toCharArray
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
	@Test
    public void test(){
        String s = "WBBWWBBWBW";
        int k = 7;
        int expected = 3;
        Assert.assertEquals(expected, minimumRecolors(s,k));
    }
	
	/*@Test
    public void test2(){
        String s = "WBWBBBW";
        int k =  2;
        int expected = 0;
        Assert.assertEquals(expected, minimumRecolors(s,k));
    }
*/

	public int minimumRecolors(String blocks, int k) {
		int count = 0,index=0;
		int	finalCount = Integer.MAX_VALUE;
		 if(k ==  blocks.length()) return count;

		 for(index = 0; index < k; index++){
	            if(blocks.charAt(index) =='W') count++;
	        }
		 
	        finalCount=Math.min(finalCount,count);  

		for (index=k; index < blocks.length(); index++) {
			 if(blocks.charAt(index- k) =='W') count--;
	            if(blocks.charAt(index) =='W') count++;
	            finalCount=Math.min(finalCount,count); 

		}

		return finalCount;

	}
	
}