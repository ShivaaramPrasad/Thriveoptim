package dsa.sdet.homework;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class LongestSubstringwithAtLeastKRepeatingCharacters_395 {

	@Test
	public void test1(){
		String s = "aaabb"; int k=3; 
		Assert.assertEquals(3, longestSubstring(s, k));
	}

	@Test
	public void test2(){
		String s = "ababbc"; int k=2; 
		Assert.assertEquals(5, longestSubstring(s, k));
	}

	private int  longestSubstring(String s, int k) {
		
	    Map<Character, Integer> count = new HashMap<>();
	    for (char c : s.toCharArray()) {
	        count.put(c, count.getOrDefault(c, 0) + 1);
	    }
	    int maxLen = 0;
	    int start = 0;
	    for (int i = 0; i < s.length(); i++) {
	        if (count.get(s.charAt(i)) < k) {
	            maxLen = Math.max(maxLen, longestSubstring(s.substring(start, i), k));
	            start = i + 1;
	        }
	    }
	    maxLen = Math.max(maxLen, longestSubstring(s.substring(start), k));
	    return maxLen;
}
}