package dsa.interview.sdet;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class LongestSubstringWithoutRepeatingCharacters {

	/*
	Input: s = "aaabb", k = 3
			Output: 3
			Explanation: The longest substring is "aaa", as 'a' is repeated 3 times.

			Approch:
			Initilize a count varible 
			First the word has to to be splited into charAt
			Assign the the chaAt to A char varible 
			itrate the the string when the window of charter should match the next charecter 
			if its yes count has to be incremeted 
			else the count has to be reset 
			The count has to macth the target
	 */

	@ Test
	public void Test1(){
		String s = "abcabcbb";
		int  k=3;
		Assert.assertEquals(k,logestSubstring(s));
	}
	
	@ Test
	public void Test2(){
		String s = "bbbbb";
		int  k=1;
		Assert.assertEquals(k,logestSubstring(s));
	}
	
	@ Test
	public void Test3(){
		String s = "pwwkew";
		int  k=3;
		Assert.assertEquals(k,logestSubstring(s));
	}

	public int logestSubstring(String s){
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



