package dsa.interview.sdet;

import org.junit.Assert;
import org.junit.Test;

public class LongestPalindromicSubstring {

	/*	
Find substrings of length 3 which are palindrome
Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.


input string - aBBBcdMOMkajleDAD
output - BBB MOM DAD

input = aBbBcdMOmkajleDaD
output - BbB MOm DaD

input = acdkajle
output - null

input = abbbcdmomkajledad
output - bbb mom dad


	 */

	@Test
	public void test() {
		String s = "aBBBcdMOMkajleDAD";
		String op = "BBB MOM DAD";
		System.out.println(longestPalindrome(s));
		Assert.assertEquals(longestPalindrome(s),op);
	}

	@Test
	public void test2() {
		String s = "aBbBcdMOmkajleDaD";
		String op = "BbB MOm DaD";
		System.out.println(longestPalindrome(s));
		Assert.assertEquals(longestPalindrome(s),op);

	}
	@Test
	public void test3() {
		String s = "abbbcdmomkajledad";
		String op = "";
		System.out.println(longestPalindrome(s));
		Assert.assertEquals(longestPalindrome(s),op);

	}
	
	@Test
	public void test4() {
		String s = "acdkajle";
		String op = "";
		System.out.println(longestPalindrome(s));
		Assert.assertEquals(longestPalindrome(s),op);

	}
	
	/*
	 Approch1:
-
- check if string is empty or single element 
- Create a empty string op
- convert s string to char array
- for loop from 0 to s,length
- Create a String temp and add each array  of character i
- for loop from i+1 to ch.length
- append  character of J with temp
- convert the temp to rev string using String Buffer
- reverse the string 
-if temp is equal to rev and op.length< rev.length a
- assign op=temp and return op
-if op length less than 1 return s.charAt(0)+"": op;
	 */
	
	public String longestPalindrome(String s) {

		if(s.length()==1) return s;
		String op ="";
		char[] ch = s.toCharArray(); 
		for (int i = 0; i < s.length(); i++) {
			String temp="";
			temp = temp+ ch[i];
			for (int j = i+1; j < ch.length; j++) {
				temp=temp+ ch[j];
				StringBuffer rev = new StringBuffer(temp);
		          rev.reverse();
				if(temp.equalsIgnoreCase( rev.toString()) && op.length()<rev.length() ) {
					op=temp;
				}

			} 

			
		}
		return op.length()< 1 ? s.charAt(0)+"": op;


	}
}


