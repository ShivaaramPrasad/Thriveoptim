package dsa.interview.sdet;

import java.util.HashMap;
import java.util.Map.Entry;

public class ReArrangeString {
	/*
 Given a string s, rearrange the characters of s so that any two adjacent characters are not the same.
Return any possible rearrangement of s or return "" if not possible.
Example 1:
Input: s = "aab"
Output: "aba" 
Example 2:
Input: s = "aaab"
Output: ""
aabb 
	 */

	public String adjacentChar(String s) {
		String output;
		HashMap<Character,Integer> mapChar= new HashMap<Character,Integer>();
		char[] cha=s.toCharArray();
		for(int i=0; i<s.length();i++) {
			mapChar.put(cha[i],mapChar.getOrDefault(cha[i], 0)+1);
		}
		Integer maxOccur=Integer.MAX_VALUE;
		for(Entry<Character,Integer> charecters:mapChar.entrySet()) {
			Integer occurence=charecters.getValue();
			maxOccur=Math.max(maxOccur, occurence);
		}
		if(maxOccur<=s.length()/2) {
			return output;

		}else 
	}
}