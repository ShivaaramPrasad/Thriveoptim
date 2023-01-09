package dsa.hackathon.day2;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import org.junit.Assert;

public class LongestNiceSubstring_1763 {
	
	@Test
	public void test1() {
		String  s = "YazaAay";
		String	o= "aAa";
		Assert.assertEquals(o, longestNiceSubstring(s));
	}
	public String longestNiceSubstring(String s) {
	       if (s.length() < 2) return "";
	        char[] chars = s.toCharArray();
	        Set<Character> set = new HashSet<Character>();
	        for (char c: chars)
	            set.add(c);
	        for (int i = 0; i < chars.length; i++) {
	            if (set.contains(Character.toUpperCase(chars[i])) && set.contains(Character.toLowerCase(chars[i]))) continue;
	            String sub1 = longestNiceSubstring(s.substring(0, i));
	            String sub2 = longestNiceSubstring(s.substring(i+1));
	            return sub1.length() >= sub2.length() ? sub1 : sub2;
	        }
	        return s; 
	    }
}
