package dsa.stringproblem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.IntStream;

import org.junit.Assert;
import org.junit.Test;

public class Anagram_242 {


	/*
	https://leetcode.com/problems/valid-anagram/submissions/
	242. Valid Anagram

Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.



Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false

	 */

	// Brute Force Algorithm !! 

	@Test
	public void example1() {
		String s1 = "listen";
		String s2 = "silent";
		Assert.assertEquals(true, isAnagramArrayHasMap(s1, s2));
		Assert.assertEquals(true, isAnagramAsciiArray(s1, s2));

	}

	@Test
	public void example2() {
		String s1 = "anagram";
		String s2 = "nagaram";
		Assert.assertEquals(true, isAnagramArrayHasMap(s1, s2));
		//Assert.assertEquals(true, isAnagramAsciiArray(s1, s2));

	}

	@Test
	public void example3() {
		String s1 = "ABCD";
		String s2 = "CBA";
		Assert.assertEquals(false, isAnagramArrayHasMap(s1, s2));
		//Assert.assertEquals(false, isAnagramAsciiArray(s1, s2));

	}

	@Test
	public void example4() {
		String s1 = "AABB";
		String s2 = "AAAB";
		Assert.assertEquals(false, isAnagramArrayHasMap(s1, s2));
		//Assert.assertEquals(false, isAnagramAsciiArray(s1, s2));

	}

	/*
	 * Psuedocode
	 * 0) If length not same, return false
	 * 1) Take the string input and covert to characters []
	 * 2) Push the characters into a list
	 * 3) Compare both
	 * 
	 */

	private boolean isAnagramList(String s1, String s2) {

		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();

		if(s1.length() != s2.length()) // this is good 
			return false;

		List<Character> l1 = new ArrayList<>(); // Mandatory 
		List<Character> l2 = new ArrayList<>();

		for (int i = 0; i < s2.length(); i++) {
			l1.add(s1.charAt(i));
			l2.add(s2.charAt(i));
		}

		Collections.sort(l1); // O[logN]
		Collections.sort(l2);

		// List -> String
		// Compare String

		if(l1.equals(l2))
			return true;
		else
			return false;		

	}

	private boolean isAnagramArrayHasMap(String s1, String s2) {
		if(s1.length()!=s2.length())return false;
		HashMap<Character,Integer> sMap= new HashMap<>();
		HashMap<Character,Integer> tMap= new HashMap<>();
		for (int i = 0; i < s1.length(); i++) {
			/* Explain for getDefault
			if(sMap.containsKey(s1.charAt(i))) {
				int occurance=sMap.get(s1.charAt(i));
				sMap.put(s1.charAt(i), occurance+1);
			}else sMap.put(s1.charAt(i), 1);
             */
			sMap.put(s1.charAt(i), sMap.getOrDefault(s1.charAt(i), 0)+1);
			tMap.put(s2.charAt(i), tMap.getOrDefault(s2.charAt(i), 0)+1);

		} 	
         return sMap.equals(tMap);
	}

	private boolean isAnagramAsciiArray(String s1, String s2) {

		if(s1.length()!=s2.length())return false;

		int[] arr =new int[26];
		for (int i = 0; i < s1.length(); i++) {
			
		  arr[s1.charAt(i)-'a']++;
		  arr[s2.charAt(i)-'a']--;

		} 	
         return IntStream.of(arr).allMatch(n -> n ==0);
	}

}