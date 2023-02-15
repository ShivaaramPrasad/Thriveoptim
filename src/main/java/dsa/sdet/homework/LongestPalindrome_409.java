package dsa.sdet.homework;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class LongestPalindrome_409 {
	
	 @Test
	    public void example1() {
	        String s ="abccccdd";
	        int output = 7;
	        Assert.assertEquals(longestPalindrome(s), output);
	    }

	    @Test
	    public void example2() {
	        String s ="m";
	        int output = 1;
	        Assert.assertEquals(longestPalindrome(s), output);
	    }

	    @Test
	    public void example3() {
	        String s ="AaBb";
	        int output = 1;
	        Assert.assertEquals(longestPalindrome(s), output);
	    }
	public int longestPalindrome(String s) {
	    if (s == null || s.length() < 1) return 0;
	    Set<Character> set = new HashSet<>();
	    for (int i = 0; i < s.length(); i++) {
	        if (set.contains(s.charAt(i))) set.remove(s.charAt(i));
	        else set.add(s.charAt(i));
	    }
	    if (set.size() <= 1) return s.length();
	    return s.length() - set.size() + 1;
	    
	}


}
