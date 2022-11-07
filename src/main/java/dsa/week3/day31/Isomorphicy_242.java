package dsa.week3.day31;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class Isomorphicy_242 {


	/*
https://leetcode.com/problems/isomorphic-strings/
	205. Isomorphic Strings


Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.



Example 1:

Input: s = "egg", t = "add"
Output: true
Example 2:

Input: s = "foo", t = "bar"
Output: false
Example 3:

Input: s = "paper", t = "title"
Output: true
	 */

	// Brute Force Algorithm !! 
	/*
	 * Psuedocode
	  - check the length of the two input string if its not matched return false 
      - Create two maps iterate for loop still the s.length 
      - Add Characters and it occurrence of s and t in sMap and tMap
      - sMap value and tMap values add to set1 and set2 
	  - Check set1 equals to set2 return true or false
	 */

	@Test
	public void test1() { String s = "egg"; String t = "add"; Assert.assertEquals(true, isIsomorphic(s, t));}
	@Test
	public void test2() { String s = "foo"; String t = "bar"; Assert.assertEquals(false, isIsomorphic(s, t));}
	@Test
	public void test4() { String s ="bbbaaaba"; String t ="aaabbbba"; Assert.assertEquals(false, isIsomorphic(s, t));}
	@Test
	public void test3() { String s = "paper"; String t = "title"; Assert.assertEquals(true, isIsomorphic(s, t));}

	private boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> smap= new HashMap();
        HashMap<Character, Character> tmap= new HashMap();

        if(s.length()!= t.length()) return false;

        for(int i=0;i<s.length();i++){
            smap.put(s.charAt(i),t.charAt(i));
            tmap.put(t.charAt(i),s.charAt(i));
        }

        for(int i=0;i<s.length();i++){
            if(!(smap.get(s.charAt(i))==t.charAt(i) && tmap.get(t.charAt(i))==s.charAt(i)))
                return false;

        }
        return true;
    }
	
	private boolean IsomorphicyHasMapHapSet1stApproch(String s, String t) {

		if(s.length()!=t.length())return false;

		HashMap<Character,Integer> sMap= new HashMap<>();
		HashMap<Character,Integer> tMap= new HashMap<>();
		for (int i = 0; i < s.length(); i++) {

			sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0)+1);
			tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0)+1);
		} 	
		HashSet<Integer> set1 = new HashSet<>(sMap.values());
		HashSet<Integer> set2 = new HashSet<>(tMap.values());
		if(set1.equals(set2))
			return true;
		else return false;
	}

}