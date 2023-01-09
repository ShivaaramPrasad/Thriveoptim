package dsa.hackathon.day1;

import org.junit.Test;

import org.junit.Assert;

public class ValidPalindrome_125 {

	@Test
	public void test1() {
		String s = "race a car";
		//Assert.assertEquals(false, isPalindrome(s));
	}
	
	@Test
	public void test2() {
		String s = "A man, a plan, a canal: Panama";
		Assert.assertEquals(true, isPalindrome(s));
	}

	/*
	 Approach 
	  - Convert the string in to lower case 
	  - Remove special characters from the String 
	  - Reveres the String and compare the given string if its equal return true
	 */
	private boolean isPalindrome(String s) {
		s = s.toLowerCase().replaceAll("[^a-z0-9]", "");  
		String reversed="";
        for(int i=s.length()-1;i>=0;i--){
            reversed+=s.charAt(i);
        }
        if(s.equals(reversed)) {
        	return true;
        }
		return false;
	}
}
