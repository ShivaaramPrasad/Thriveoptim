package dsa.sdet.homework;

import org.junit.Test;

import org.junit.Assert;

public class PowerofThree_326 {
	
	@Test
	public void test1() {
		int n=27;
		Assert.assertEquals(true, isPowerOfThree(n));
		
	}
	
	@Test
	public void test2() {
		int n=0;
		Assert.assertEquals(false, isPowerOfThree(n));
		
	}
	
	@Test
	public void test3() {
		int n=-1;
		Assert.assertEquals(false, isPowerOfThree(n));
		
	}
	/*
	 Approach
	 if less 1 false 
	 condtion when n%3== 0
	 n=n/3;
    if n becomes 1 return true else false
	 */

	 public boolean isPowerOfThree(int n) {
	        if(n<=0) return false;
	        while(n%3==0){
	            n=n/3;
	        }
	        if(n==1) return true;
	        return false;
	    }
}
