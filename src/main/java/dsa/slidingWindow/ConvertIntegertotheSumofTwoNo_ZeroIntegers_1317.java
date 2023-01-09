package dsa.slidingWindow;

import org.junit.Assert;
import org.junit.Test;

public class ConvertIntegertotheSumofTwoNo_ZeroIntegers_1317 {

	/*
	 * 
	 * 1317. Convert Integer to the Sum of Two No-Zero Integers
No-Zero integer is a positive integer that does not contain any 0 in its decimal representation.

Given an integer n, return a list of two integers [A, B] where:

A and B are No-Zero integers.
A + B = n
The test cases are generated so that there is at least one valid solution. If there are many valid solutions you can return any of them.


Example 1:

Input: n = 2
Output: [1,1]
Explanation: A = 1, B = 1. A + B = n and both A and B do not contain any 0 in their decimal representation.
Example 2:

Input: n = 11
Output: [2,9]
	 */

	@Test
	public void test2(){ 
		int n  = 2;
		int[] output={1,1};
		Assert.assertEquals(output,getNoZeroIntegers(n));
	}
	@Test
	public void test1(){ 
		int n  = 11;
		int[] output={2,9};
		Assert.assertEquals(output,getNoZeroIntegers(n));
	}

	/*
    Get the input n  
    declare a temp varibale to check n= temp
    itrate the forloop till i<=n 
    Itrate next loop  j ;
    if the condtion satifiy i+j=n and not equal to 0 
    return the i and J as array
	 */ 
	public int[] getNoZeroIntegers(int n) {
		int[] indices = new int[2];
		for(int i=1; i<=n; i++)
			for(int j=i+1; j<=n;j++){
				int temp = i+ j;
				if(temp==n && i!=0 && j!=0 ){
					i++;
					indices[0] = i;
					indices[1] = j;
				}
			}
		return indices;
	}
}