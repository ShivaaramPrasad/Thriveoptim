package dsa.week4.day8;

import java.util.ArrayList;
import java.util.HashMap;
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
		Assert.assertEquals(false, buddyStrings(s,goal));
	}
	/*
	 Approch1 
	 - when s and goal is not equal to return false  
	 - if both strings length are same swappable the charecters 
	 - 
	 */
	private boolean buddyStrings(String s, String goal) {
	    // If the lengths of the strings are not equal, they cannot be buddy strings.
	    if (s.length() != goal.length()) {
	        return false;
	    }
	    
	    // If the two strings are equal, check if there are any repeated characters to swap.
	    if (s.equals(goal)) {
	        Map<Character, Integer> charCount = new HashMap<>();
	        for (char c : s.toCharArray()) {
	            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
	        }
	        return charCount.values().stream().anyMatch(count -> count > 1);
	    }
	    
	    // Find the indices of the mismatched characters in the two strings.
	    List<Integer> indices = new ArrayList<>();
	    for (int i = 0; i < s.length(); i++) {
	        if (s.charAt(i) != goal.charAt(i)) {
	            indices.add(i);
	        }
	    }
	    
	    // If there are more than two mismatched characters, the strings cannot be buddy strings.
	    if (indices.size() != 2) {
	        return false;
	    }
	    
	    // Check if swapping the mismatched characters results in the two strings being equal.
	    char[] sArr = s.toCharArray();
	    char tmp = sArr[indices.get(0)];
	    sArr[indices.get(0)] = sArr[indices.get(1)];
	    sArr[indices.get(1)] = tmp;
	    return new String(sArr).equals(goal);
	}

}
