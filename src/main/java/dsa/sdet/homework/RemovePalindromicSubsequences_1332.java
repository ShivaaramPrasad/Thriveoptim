package dsa.sdet.homework;

import org.junit.Test;

import org.junit.Assert;

public class RemovePalindromicSubsequences_1332 {
	
	@Test
	public void test1(){
		String s = "ababa";
		Assert.assertEquals(1, removePalindromeSub(s));
	}
	
	@Test
	public void test2(){
		String s = "abb";
		Assert.assertEquals(2, removePalindromeSub(s));
	}

	@Test
	public void test3(){
		String s = "abb";
		Assert.assertEquals(2, removePalindromeSub(s));
	}
	
	
	private int removePalindromeSub(String s) {
		   int left=0,right=s.length()-1;
	        while(left <= right)
	        {
	             if(s.charAt(left)!= s.charAt(right))
	                 return 2;
	            left++;
	            right--;
	        }
	     return 1;   
	}

}
