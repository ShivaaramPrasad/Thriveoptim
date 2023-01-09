package dsa.stringproblem;

import org.junit.Test;

import org.junit.Assert;

public class MaximumNumberofWordsYouCanType_1935 {

	/*
	 1935. Maximum Number of Words You Can Type
https://leetcode.com/problems/maximum-number-of-words-you-can-type/

There is a malfunctioning keyboard where some letter keys do not work. All other keys on the keyboard work properly.

Given a string text of words separated by a single space (no leading or trailing spaces) and a string brokenLetters of all distinct letter keys that are broken, return the number of words in text you can fully type using this keyboard.

Example 1:

Input: text = "hello world", brokenLetters = "ad"
Output: 1
Explanation: We cannot type "world" because the 'd' key is broken.
Example 2:

Input: text = "leet code", brokenLetters = "lt"
Output: 1
Explanation: We cannot type "leet" because the 'l' and 't' keys are broken.
Example 3:

Input: text = "leet code", brokenLetters = "e"
Output: 0
Explanation: We cannot type either word because the 'e' key is broken.

	 */

	@Test
	public void test1() {
		String text="hello world";
		String brokenLetters="ad";
		int output=1;
		Assert.assertEquals(output, canBeTypedWords( text, brokenLetters));
	}

	@Test
	public void test2() {
		String text="leet code";
		String brokenLetters="lt";
		int output=1;
		Assert.assertEquals(output, canBeTypedWords( text, brokenLetters));
	}
	@Test
	public void test3() {
		String text="leet code";
		String brokenLetters="e";
		int output=0;
		Assert.assertEquals(output, canBeTypedWords( text, brokenLetters));
	}


	private int canBeTypedWords(String text, String brokenLetters) {

		String[] words=text.split(" ");
		int n =words.length;
		int count=0;
		for (String word : words) {
			
			for(char broken: brokenLetters.toCharArray()) {

				if(word.contains(broken + "")) {
					n=n-1;
					break;
				}
			}
		}
		return n;
	}


}
