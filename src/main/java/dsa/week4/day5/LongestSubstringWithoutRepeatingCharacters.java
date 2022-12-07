package dsa.week4.day5;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class LongestSubstringWithoutRepeatingCharacters {

	/* Important

	 3. Longest Substring Without Repeating Characters
Given a string s, find the length of the longest 
substring
 without repeating characters.

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

	 */
	/*
		Longest Substring with out Repeating Character
		Longest Substring with Repeating Character
		Longest Substring with k values
		Output Format
		Substring length
		first Substring 
		last Substring

Initialize i=0,j=0,max —Integer .MIN_VALUE, current Length=0
iterate from to length
Initialize HeshSet
check char in hasset then add in hasset
if duplicates then find the currentlengt
and break the loop
incremented i by 1
return max
	 */
	@Test
	public void test1()
	{
		String s = "abcabcbb";
		int output=3;
		Assert.assertEquals(output, lengthOfLongestSubstring(s));
	}



	@Test
	public void test2()
	{
		String s = "bbbbb";
		int output=1;
		Assert.assertEquals(output, lengthOfLongestSubstring(s));

	}

	@Test
	public void test3()
	{
		String s = "pwwkew";
		int output=3;
		Assert.assertEquals(output, lengthOfLongestSubstring(s));

	}

	private int lengthOfLongestSubstring(String s) {

		int start = 0, end = 0, currentMax = 0, max = 0;
		Set<Character> hset = new HashSet<Character>();

		while (end < s.length()) {

			if (hset.contains(s.charAt(end))) {
				currentMax = end - start;
				hset.remove(s.charAt(start));
				start++;

			} else {
				hset.add(s.charAt(end));// a //ab //abc
				currentMax = hset.size();
				end++;
			}
			max = Math.max(max, currentMax);

		}
		return max;
	}
}