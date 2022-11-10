package dsa.week4.day9;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Assert;

public class UncommonWordsfromTwoSentences_884 {
	/*
	 884. Uncommon Words from Two Sentences
	 https://leetcode.com/problems/uncommon-words-from-two-sentences/
A sentence is a string of single-space separated words where each word consists only of lowercase letters.

A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.

Given two sentences s1 and s2, return a list of all the uncommon words. You may return the answer in any order.

 

Example 1:

Input: s1 = "this apple is sweet", s2 = "this apple is sour"
Output: ["sweet","sour"]
Example 2:

Input: s1 = "apple apple", s2 = "banana"
Output: ["banana"]

	 */
	@Test
	public void test1() {
		String s1 = "this apple is sweet", s2 = "this apple is sour";
	    String [] output= {"sweet","sour"};
	    Assert.assertEquals(output, uncommonFromSentences( s1,  s2));
	}
	
	
	@Test
	public void test2() {
		String s1 = "apple apple", s2 = "banana";
	    String [] output= {"banana"};
	    Assert.assertEquals(output, uncommonFromSentences( s1,  s2));
	}
	
	/*
	 Approach 1
	 
	   - Concatenate given two string s1 and s2
	   - Convert String in to an array by regx using split " "
	   - Create a map with String Integer as key value to hold each words and its occurence 
	     in both the sentence 
	   - Keep adding each word and its occurrence into map 
	   - create List <string> output 
	   - Iterate through entrySet map to add key into output where value matches 1
	   - return output as list to array.
	   
	 */
	
	private String[] uncommonFromSentences(String s1, String s2) {

		s1=s1+" "+s2;
		String[] words = s1.split(" ");
		HashMap<String, Integer> map= new HashMap<String, Integer>();
		
		for (String word : words) {
			map.put(word, map.getOrDefault(word, 0)+1);
		}
		
		List<String> output= new ArrayList<String>();
		
		for(Map.Entry<String, Integer> entries: map.entrySet()) {
		if(entries.getValue()==1) 
			output.add(entries.getKey());
		}
		return output.toArray(new String[output.size()] );
	}


}
