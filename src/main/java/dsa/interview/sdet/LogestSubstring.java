package dsa.interview.sdet;

import org.junit.Assert;
import org.junit.Test;

public class LogestSubstring {

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
		String s = "aaabb";
		int  k=3;
		Assert.assertEquals(true,logestSubstring(s, k));
	}

	public boolean logestSubstring(String s,int k){
		int count=0;
		for(int i=0; i<=s.length(); i++){
			char a=s.charAt(i);
			for (int j=i ; j<=s.length(); j++){
				if(a == s.charAt(j)) count++;
				else count =0;
			}
			if(k == count) return true;
		}
		return false;
	}
}

