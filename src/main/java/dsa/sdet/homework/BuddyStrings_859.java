package dsa.sdet.homework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class BuddyStrings_859 {

	/*
	 * Given two strings s and goal, return true if you can swap two letters in s so the result is equal to goal, otherwise, return false.

Swapping letters is defined as taking two indices i and j (0-indexed) such that i != j and swapping the characters at s[i] and s[j].

For example, swapping at indices 0 and 2 in "abcd" results in "cbad".
Example 1:

Input: s = "ab", goal = "ba"
Output: true
Explanation: You can swap s[0] = 'a' and s[1] = 'b' to get "ba", which is equal to goal.
Example 2:

Input: s = "ab", goal = "ab"
Output: false
Explanation: The only letters you can swap are s[0] = 'a' and s[1] = 'b', which results in "ba" != goal.
Example 3:

Input: s = "aa", goal = "aa"
Output: true
Explanation: You can swap s[0] = 'a' and s[1] = 'a' to get "aa", which is equal to goal.

	 */

	@Test
	public void test1() {
		String s = "ab"; String goal = "ba";
		Assert.assertEquals(true, buddyStrings(s,goal));
	}



	@Test
	public void test2() {
		String s = "ab"; String goal = "ab";
		Assert.assertEquals(false, buddyStrings(s,goal));
	}

	@Test
	public void test3() {
		String s = "aa"; String goal = "aa";
		Assert.assertEquals(true, buddyStrings(s,goal));
	}
	/*
	 Approch1 
	 - 
	 */
	private boolean buddyStrings(String s, String p) {
		if (s.length() != p. length())  return false;
		if (s.equals(p)) {
			HashSet<Character> unique_chars = new HashSet();

			for (char c : s.toCharArray()) {
				unique_chars. add(c) ;
			}
			if (unique_chars.size()< s.length()) {
				return true;
			} else {
				return false;
			}
		}
		List <Integer> diff = new ArrayList();
		for (int i=0;i<s.length(); i++) {
			if (s.charAt(i)!= p.charAt(i)) {
				diff.add(i);
			}}

		if (diff.size()==2 && s.charAt(diff.get(0)) == p.charAt(diff.get(1)) &&
				              p.charAt(diff.get(0)) == s.charAt(diff.get(1))){
			return true;
			} 
		     else {
		    	 return false;
		     }
		}
	}

