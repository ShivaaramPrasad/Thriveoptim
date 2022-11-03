package dsa.week4.day1;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.junit.Test;

public class FindCommonCharacters_1002 {

	/*
	 1002. Find Common Characters
		https://leetcode.com/problems/find-common-characters/

	Given a string array words, return an array of all characters that show up in all strings within the words (including duplicates). You may return the answer in any order.

Example 1:

Input: words = ["bella","label","roller"]
Output: ["e","l","l"]
Example 2:

Input: words = ["cool","lock","cook"]
Output: ["c","o"]

	 */
	@Test
	public void test1()
	{
		String [] words = {"bella","label","roller"};
		String [] Output= {"e","l","l"};
		System.out.println(commonChars(words));
	}

	@Test
	public void test2()
	{
		String [] words = {"cool","lock","cook"};
		String [] Output= {"c","o"};
	}

	/*

	 */

	public List<String> commonChars(String[] words) {

		HashMap<Character,Integer> map=new HashMap();

		for (int i = 0; i < words.length; i++) {
			char[] cha =words[i].toCharArray();
			for (int j = 0; j < cha.length; j++) {
				map.put(cha[j],map.getOrDefault(cha[j], 0)+1);
			}
		}
		int maxocur = Integer.MAX_VALUE;
		for (Entry<Character, Integer> charecters : map.entrySet()) {
			//System.out.println(eachEmployment.getKey());
			//System.out.println(eachEmployment.getValue());
			Integer occurence = charecters.getValue();
			maxocur = Math.min(maxocur, occurence);
		}
		System.out.println(maxocur);
        return null;

	}
}

