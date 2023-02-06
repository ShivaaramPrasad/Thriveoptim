package dsa.slidingWindow;

import org.junit.Test;

import org.junit.Assert;

public class Valid_Palindrome_ii_680 {
	
	@Test
	public void test1() {
		String s="aba";
		Assert.assertEquals(true, validPalindrome(s));		
	}
	
	@Test
	public void test2() {
		String s="abca";
		Assert.assertEquals(false, validPalindrome(s));		
	}

	@Test
	public void test3() {
		String s="abc";
		Assert.assertEquals(false, validPalindrome(s));		
	}
	

	public boolean validPalindrome(String s)
	{
		String filtered = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
		
		return new StringBuilder(filtered).reverse().toString().equals(filtered);
		
	}
}
