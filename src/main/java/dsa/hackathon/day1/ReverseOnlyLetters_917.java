package dsa.hackathon.day1;

import org.junit.Test;

import org.junit.Assert;

public class ReverseOnlyLetters_917 {


	@Test
	public void test1() {
		String s = "ab-cd";
		String o= "dc-ba";
		Assert.assertEquals(o, reverseLetters(s));
	}

	@Test
	public void test2() {
		String s = "a-bC-dEf-ghIj";
		String o= "j-Ih-gfE-dCba";
		Assert.assertEquals(o, reverseLetters(s));
	}

	@Test
	public void test3() {
		String s = "Test1ng-Leet=code-Q!";
		String o= "Qedo1ct-eeLg=ntse-T!";
		Assert.assertEquals(o, reverseLetters(s));
	}
	/*
	 Approach - Two pointer 
	 Convert  String to Char Array
	 Initialize start equal to 0 and end equal to length -1
	 if when character is letter start and last swap
	 if not character is not letter start++
	 else last--;

	 */

	private String reverseLetters(String s) {
		char[] chars = s.toCharArray();
		int start=0; int end=s.length()-1;
		while(start<end) {
			if(Character.isLetter(chars[start]) && Character.isLetter(chars[end])){
				char q=chars[end];
				chars[end--]=chars[start];
				chars[start++]=q;
			}
			else if(!Character.isLetter(chars[start])) {
				start++;
			}
			else {
				end--;
			}
		}
		return s=new String(chars);
	}
}
