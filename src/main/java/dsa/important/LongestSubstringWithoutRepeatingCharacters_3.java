package dsa.important;

import java.util.HashSet;
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
        int n = s.length();
        int[] freq = new int[128];
        int ans = 0, i = 0, j = 0;
        while (j < n) {
            if (freq[s.charAt(j)] == 0) {
                freq[s.charAt(j++)]++;
                ans = Math.max(ans, j - i);
            } else {
                freq[s.charAt(i++)]--;
            }
        }
        return ans;
    }
	
	public int lengthOfLongestSubstring2(String s) {

        if(s.length()==0)
			return 0;
		
		int maxLen=-1;
		Set<Character> set=new HashSet<>();
		
		for (int start = 0; start < s.length(); start++) {
			for (int end = start; end < s.length(); end++) {
				if(!set.add(s.charAt(end))) {
					maxLen=Math.max(maxLen, end-start);
					break;
				}
			}
			set.clear();
		}
		return maxLen;	
	}

}
