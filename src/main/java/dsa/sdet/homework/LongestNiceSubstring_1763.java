package dsa.sdet.homework;

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
	
	/*
    - Create a hashset
    - Add all elements in set
    - Traverse each element until element has both lower and uppercase in set
    - if yes then skip
    - else do recursive cal with the substring of 0 to i index. store that in sub1
    - Do another recursive cal with begin index as i+1
    - if the sub1 string  length >= sub 2 length return sub1 else return sub2
    - return s by default
    */
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
	            if(sub1.length()>=sub2.length())
	                return sub1;
	            else return sub2;
	        }
	        return s;
	    }
}
