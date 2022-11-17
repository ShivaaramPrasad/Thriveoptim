package dsa.week4.day13;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;

public class PermutationinString_567 {

	/*
	 * 1935. Maximum Number of Words You Can Type
	 * https://leetcode.com/problems/permutation-in-string/ Given two strings s1 and
	 * s2, return true if s2 contains a permutation of s1, or false otherwise.
	 * 
	 * In other words, return true if one of s1's permutations is the substring of
	 * s2.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: s1 = "ab", s2 = "eidbaooo" Output: true Explanation: s2 contains one
	 * permutation of s1 ("ba"). Example 2:
	 * 
	 * Input: s1 = "ab", s2 = "eidboaoo" Output: false
	 * 
	 */

	@Test
	public void test1() {
		String s1 = "ab";
		String s2 = "eidbaooo";

		Assert.assertEquals(true, checkInclusionON(s1, s2));

	}

	@Test
	public void test2() {
		String s1 = "ab";
		String s2 = "eidboaoo";
		;
		Assert.assertEquals(false, checkInclusionON(s1, s2));

	}

	private boolean checkInclusion(String s1, String s2) {
		Map<Character, Integer> hmap1 = new HashMap<Character, Integer>();
		Map<Character, Integer> hmap2 = new HashMap<Character, Integer>();

		for (int i = 0; i < s1.length(); i++) {
			hmap1.put(s1.charAt(i), hmap1.getOrDefault(s1.charAt(i), 0) + 1);
		}
		for (int i = 0; i <= s2.length() - s1.length(); i++) {
			for (int j = i; j < s1.length() + i; j++) {
				hmap2.put(s2.charAt(j), hmap2.getOrDefault(s2.charAt(j), 0) + 1);

			}
			if (hmap1.equals(hmap2))
				return true;

			else {
				hmap2.clear();
			}
		}

		return false;
	}

	private boolean checkInclusionON(String s1, String s2) {
		Map<Character, Integer> hmap1 = new HashMap<Character, Integer>();
		Map<Character, Integer> hmap2 = new HashMap<Character, Integer>();
		for (int i = 0; i < s1.length(); i++) {
			hmap1.put(s1.charAt(i), hmap1.getOrDefault(s1.charAt(i), 0) + 1);
		}
		int start = 0;
		int end = 0;
		while (end < s2.length()) {
			hmap2.put(s2.charAt(end), hmap2.getOrDefault(s2.charAt(end), 0) + 1);
			end++;
			if (s1.length() == end - start) {
				if (hmap2.equals(hmap1))
					return true;
				if (hmap2.get(s2.charAt(start)) > 1)
					hmap2.put(s2.charAt(start), hmap2.getOrDefault(s2.charAt(start), 0) - 1);
				else
					hmap2.remove(s2.charAt(start));
				start++;
			}
		}
		return false;
	}
	
	
	private boolean checkInclusionON2(String s1, String s2) {
		
		
		HashMap<Character,Integer> sMap= new HashMap<Character,Integer>();
		HashMap<Character,Integer> pMap= new HashMap<Character,Integer>();
		
		for (int i = 0; i < s1.length(); i++) {
			pMap.put(s1.charAt(i), pMap.getOrDefault(s1.charAt(i), 0)+1);

		}
        int start = 0, end = s1.length();
        while(start<s2.length())
        {
            sMap.put(s2.charAt(start), sMap.getOrDefault(s2.charAt(start),0)+1);

        	if(sMap.equals(pMap))

			  return true;


            if(sMap.get(s2.charAt(start)) > 1) 
	             sMap.remove(s2.charAt(start));

            else 
	             sMap.put(s2.charAt(start), sMap.get(s2.charAt(start)) - 1);
	             start++;
	             end++;
        }


			return false;
    	
	
	}
}