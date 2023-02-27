package dsa.sdet.homework;



import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class ReverseVowelsofaString_345 {

	@Test
	public void test1() {
		String s = "hello";
		Assert.assertEquals("holle", reverseVowels(s));
	}

	@Test
	public void test2() {
		String s = "leetcode";
		Assert.assertEquals("leotcede", reverseVowels(s));
	}

	private String reverseVowels(String s) {
		char[] ch =s.toCharArray();
		List<Character> vowels=Arrays.asList('a','e','i','o','u','A','E','I','O','U');
		int start =0; int end =s.length()-1;
		while (start < end){
			if(vowels.contains(ch[start]) && vowels.contains(ch[end]) ) {
				char temp = ch[start];
				ch[start++] = ch[end];
				ch[end--] = temp;
			} else if(!vowels.contains(ch[start])) {
				start++;
			} else {
				end--;
			}
		}
		s = new String(ch);
		return s;
	}
	
	
	}
	

