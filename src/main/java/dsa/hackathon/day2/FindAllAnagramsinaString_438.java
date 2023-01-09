package dsa.hackathon.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;



public class FindAllAnagramsinaString_438 {

	/*
	438. Find All Anagrams in a String
	https://leetcode.com/problems/find-all-anagrams-in-a-string/
   Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:

Input: s = "cbaebabacd", p = "abc"
Output: [0,6]
Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".
Example 2:

Input: s = "abab", p = "ab"
Output: [0,1,2]
Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".
	 */

	@Test
	public void test2() {
		String s = "abab";
		String p = "ab";
		anagramUsingSW(s,p);

		//Assert.assertEquals(Arrays.asList(0,1,2),anagramUsingSW(s, p));
	}
	
	@Test
	public void test1() {
		String s = "cbaebabacd";
		String p = "abc";
		//System.out.println(anagramUsingSlidingWindow(s, p));
		Assert.assertEquals(Arrays.asList(0,6), anagramUsingSW(s, p));
	}

	public List<Integer> anagramUsingSW(String s, String p) {

		HashMap<Character, Integer> Hmap1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> Hmap2 = new HashMap<Character, Integer>();
		List<Integer> out= new ArrayList<Integer>();

		for (int i = 0; i < p.length(); i++) {
			Hmap1.put(p.charAt(i), Hmap1.getOrDefault(p.charAt(i), 0)+1);
		}
		for (int i = 0; i < s.length(); i++) {
			Hmap2.clear();
			for (int j = i; j < s.length(); j++) {
				Hmap2.put(s.charAt(j), Hmap2.getOrDefault(s.charAt(j), 0)+1);
				if(Hmap1.size()==Hmap2.size()) {
					if(Hmap1.equals(Hmap2)) {
						//System.out.println(i);
						//Add List 
						out.add(i);
						break;
					}
				}

			}

		}
		
		return out;
	}
	
	/*
	 Approch 2
	 -Create two separate hash maps to store their respective characters and values
	 - Storing the characters in each map upto p.length()
	 - initializing left = 0, to store the index to the arraylist
	  - right should be less than s.length()
	  -comparing each maps if they match add the index value to the list
	   -Adding the right character
	   -removing the left side character in the window
	 */
	
	public List<Integer> anagramUsingSlidingWindow(String s, String p) {
		
		if(s.length()<p.length()) return new ArrayList<>();
		
		HashMap<Character,Integer> sMap= new HashMap<Character,Integer>();
		HashMap<Character,Integer> pMap= new HashMap<Character,Integer>();
		
		for (int i = 0; i < p.length(); i++) {
			pMap.put(p.charAt(i), pMap.getOrDefault(p.charAt(i), 0)+1);
		}
        int start = 0, end = p.length();
        ArrayList<Integer> an = new ArrayList<Integer>();
        while(start<s.length())
        {
        	if(sMap.equals(pMap))
        		an.add(end);
	             sMap.put(s.charAt(start), sMap.getOrDefault(s.charAt(start),0)+1);

            if(sMap.get(s.charAt(start)) > 1) 
	             sMap.remove(s.charAt(start));

            else 
	             sMap.put(s.charAt(start), sMap.get(s.charAt(start)) - 1);
	             start++;
	             end++;
        }
	        if(sMap.equals(pMap))
	        	an.add(start);


		return an;
    	
	
	}
}
