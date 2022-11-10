package dsa.week4.day8;

import org.junit.Test;

import org.junit.Assert;

public class BuddyStrings_859{
	
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
		Assert.assertEquals(false, buddyStrings(s,goal));
	}
	/*
	 Approch1 
	 - when s and goal is not equal to return false  
	 - if both strings length are same swappable the charecters 
	 - 
	 */
	private String buddyStrings(String s, String goal) {
		// TODO Auto-generated method stub
		return null;
	}
}
