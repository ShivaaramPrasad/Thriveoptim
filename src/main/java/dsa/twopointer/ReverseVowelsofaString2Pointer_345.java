package dsa.twopointer;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class ReverseVowelsofaString2Pointer_345 {

	/*
	 345. Reverse Vowels of a String

	 Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

Example 1:

Input: s = "hello"
Output: "holle"

Example 2:

Input: s = "leetcode"
Output: "leotcede"

	 */

	@Test  //Positive
	public void example1(){
		String s = "leetcode";
		String output = "leotcede";
		reverseVowels2Pointer(s);
		Assert.assertEquals(reverseVowels2Pointer(s),output);

	}

	@Test //Negative
	public void example2(){
		String s = "hello";
		String output ="holle";
		Assert.assertEquals(reverseVowels2Pointer(s),output);

	}

	@Test //Edge
	public void example3(){
		String s = "AeIoU";
		String output ="UoIeA";
		Assert.assertEquals(reverseVowels2Pointer(s),output);
	}


	/*
	    Pseudocode Two ponter  Algorithm -
	    1. declare list add vowes  
	    2. select start =0 
	    3. select end =length-1
	    4. if the charter matches the vowes list using contains 
	      a) Swap the element
	    5. increment the start if vowes are found 
	    6. decrement the end if vowes are found 
	    7. if the charter not matches the vowes list using contains 
	    8. increment the start if vowes are found 
	    9. decrement the end if vowes are found 
	
	 */
	private String reverseVowels2Pointer(String s){
		
		char[] ch =s.toCharArray();
		List<Character> vowels=Arrays.asList('a','e','i','o','u','A','E','I','O','U');
		int start =0; int end =s.length()-1;
		while (start < end) 
		
		{

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


