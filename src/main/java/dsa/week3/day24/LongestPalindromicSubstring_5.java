package dsa.week3.day24;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class LongestPalindromicSubstring_5 {

	/*
5 Longest Palindromic Substring
https://leetcode.com/problems/longest-palindromic-substring/

Given a string s, return the longest palindromic substring in s.

Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"


	 */


	@Test
	public void test(){ 
		String s = "babad"; String output="bab";
		Assert.assertEquals(output,longestPalindrome(s));}

	@Test
	public void test2(){ 
		
		String s = "cbbd"; String output="bb";
		Assert.assertEquals(output,longestPalindrome(s));}


	/*

	 */

	private String longestPalindrome(String s) {
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
				if(temp.equals( rev.toString()) && op.length()<rev.length() ) {
					op=temp;
				}

			} 


		}


		return op.length()< 1 ? s.charAt(0)+"": op;


	}
}
