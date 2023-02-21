package dsa.important;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class LongestSubstringWithoutRepeatingCharacters_3 {
	
	@Test
	public void test1() {
		String s = "abcabcbb";
		Assert.assertEquals(3, lengthOfLongestSubstring1(s));
		Assert.assertEquals(3, lengthOfLongestSubstring2(s));

	}
	
	@Test
	public void test2() {
		String s = "bbbbb";
		Assert.assertEquals(1, lengthOfLongestSubstring1(s));
		Assert.assertEquals(1, lengthOfLongestSubstring2(s));

	}

	@Test
	public void test3() {
		String s = "pwwkew";
		Assert.assertEquals(3, lengthOfLongestSubstring1(s));
		Assert.assertEquals(3, lengthOfLongestSubstring2(s));

	}
	/*
	 Take length of string n
	 declare a hash set
	  initilize int output
	 */
	private int lengthOfLongestSubstring1(String s) {
	        int n = s.length();
	        Set<Character> set = new HashSet<>();
	        int output = 0, i = 0, j = 0;
	        while (i < n && j < n) {
	            // try to extend the range [i, j]
	            if (!set.contains(s.charAt(j))){
	                set.add(s.charAt(j++));
	                output = Math.max(output, j - i);
	            }
	            else {
	                set.remove(s.charAt(i++));
	            }
	        }
	        return output;
	    }
	
	public int lengthOfLongestSubstring3(String s) {
		Map<Character, Integer> chars = new HashMap();

        int left = 0;  int right = 0;
        int res = 0;
        while (right < s.length()) {
            char r = s.charAt(right);
            chars.put(r, chars.getOrDefault(r,0) + 1);
            while (chars.get(r) > 1) {
                char l = s.charAt(left);
                chars.put(l, chars.get(l) - 1);
                left++;
            }
            res = Math.max(res, right - left + 1);
            right++;
        }
        return res;
    }
	
	
	public int lengthOfLongestSubstring2(String s) {
		  if(s == null || s.length() == 0) return 0;
	        Set<Character> uniqueSet = new HashSet<>();
	        int maxLength = 0;
	        for(int idx = 0; idx < s.length(); idx++){
	            System.out.println("idx: "+idx);
	            while(!uniqueSet.isEmpty() && uniqueSet.contains(s.charAt(idx))){
	                uniqueSet.remove(s.charAt(idx-uniqueSet.size()));
	            }
	            uniqueSet.add(s.charAt(idx));
	            maxLength = Math.max(uniqueSet.size(), maxLength);

	        }
	        return maxLength;
	    }
}
