package dsa.week4.day5;

import org.junit.Test;

import org.junit.Assert;

public class NumberofEquivalentDominoPairs_1128 {
	
/*
	 
	 Given a list of dominoes, dominoes[i] = [a, b] is equivalent to dominoes[j] = [c, d] if and only if either (a == c and b == d), or (a == d and b == c) - that is, one domino can be rotated to be equal to another domino.

Return the number of pairs (i, j) for which 0 <= i < j < dominoes.length, and dominoes[i] is equivalent to dominoes[j].

Example 1:

Input: dominoes = [[1,2],[2,1],[3,4],[5,6]]
Output: 1
Example 2:

Input: dominoes = [[1,2],[1,2],[1,1],[1,2],[2,2]]
Output: 3

	 */
  @Test
  public void test1() {
	   int[][] dominoes = {{1,2},{2,1},{3,4},{5,6}};
	   int output=1;
	   Assert.assertEquals(output, numEquivDominoPairs(dominoes));

  }
  
  @Test
  public void test2() {
	   int[][] dominoes = {{1,2},{2,1},{3,4},{5,6}};
	   int output=3;
	   Assert.assertEquals(output, numEquivDominoPairs(dominoes));
  }
  
  
  

private int numEquivDominoPairs(int[][] dominoes) {

	
	
	
	return null;
}
  

}
