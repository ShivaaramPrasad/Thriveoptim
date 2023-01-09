package dsa.hackathon.day1;

import org.junit.Assert;
import org.junit.Test;

public class ReverseWordsInAString_151 {
	@Test
	public void test1() {
		String s = "the sky is blue";
		String o= "blue is sky the";
		Assert.assertEquals(o, reverseWords(s));
	}

	@Test
	public void test2() {
		String s = " hello world  ";
		String o= "world hello";
		Assert.assertEquals(o, reverseWords(s));
	}

	

	@Test
	public void test3() {
		String s = "a good   example";
		String o= "example good a";
		Assert.assertEquals(o, reverseWords(s));
	}
	/*
	 Approch 
	 Split the string in to arry by regex(" +")
	 declare String builder 
	 do reveres string operation 
	 append the string builder by words and space 
	 retrun stringbuilder by toString and use trim function 
	 */
	private String reverseWords(String s) {
		String[] words=s.split(" +");
		StringBuilder sb=new StringBuilder();
		for (int i = words.length-1; i >=0 ; i--) {
			sb.append(words[i]);
			sb.append(" ");
		}
		System.out.println(sb);
		return sb.toString().trim();
	}
}
