package dsa.slidingWindow;

import org.junit.Assert;
import org.junit.Test;

public class LongestPalindromicSubstring_5 {

	/*	1) Did I understand the problem? Yes or NO ! !
	        If No, Ask the person to provide more detail with example(s)
	        If yes, go to next step !!
	What is the input(s)? 2 Strings
	What is the expected output? int.
	Do I have constraints to solve the problem?
	Do I have all informations to go to next step!!
	How big is your test data set will be?
	2) Test data set
	 Minimum of 3 data set ! ! Positive, Edge, Negative
	 Validate with the interviewer if the data set is fine by his/her assumptions

	3)Do I know how to solve it?
	    Yes — great, is there an alternate?
	     No — Can I break down the problem into sub problems?


	4) Ask for hint (If you do not know how to solve)
	5) DO I know alternate solutions as well?
	      Yes — What are those?
	       No — That is still fine, proceed to solve by what you know !!
	6) If you know alternate solutions -> find out the the 0 Notations (Performance)
           Then, explain either both are the best (depends on the time)
           Approach 1: Start with worst -> improve (Optimize) -> End up with the best 
	       Approach 2: Write down the options and benefits and code the best

     7) Start always with Pseudo code

     8) Implement them in the code (editor)

     9)Test against the different data set

     10) If it fails, debug them to solve it !!

     5. Longest Palindromic Substring


5 Given a string s, return the longest palindromic substring in s.


A string is called a palindrome string if the reverse of that string is the same as the original string.


Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.


Input: s = "cbbd"
Output: "bb"




	 */

	@Test
	public void test() {
		String s = "babad";
		String op = "bab";
		System.out.println(longestPalindrome(s));
		Assert.assertEquals(longestPalindrome(s),op);
	}

	@Test
	public void test2() {
		String s = "cbbd";
		String op = "bb";
		System.out.println(longestPalindrome(s));
		Assert.assertEquals(longestPalindrome(s),op);

	}
	@Test
	public void test3() {
		String s = "abc";
		String op = "a";
		System.out.println(longestPalindrome(s));
		Assert.assertEquals(longestPalindrome(s),op);

	}
	
	/*
	 Approch1:
-
- check if string is empty or single element 
- Create a empty string op
- convert s string to char array
- for loop from 0 to s,length
- Create a String temp and add each array  of character i
- for loop from i+1 to ch.length
- append  character of J with temp
- convert the temp to rev string using String Buffer
- reverse the string 
-if temp is equal to rev and op.length< rev.length a
- assign op=temp and return op
-if op length less than 1 return s.charAt(0)+"": op;
	 */
	
	public String longestPalindrome(String s) {

		if(s.length()==1) return s;
		String op ="";
		char[] ch = s.toCharArray(); 
		for (int i = 0; i < s.length(); i++) {
			String temp="";
			temp = temp+ ch[i];
			for (int j = i+1; j < ch.length; j++) {
				temp=temp+ ch[j];
				StringBuffer rev = new StringBuffer(temp);
		          rev.reverse();
				if(temp.equals( rev.toString()) && op.length()<rev.length() ) {
					op=temp;
				}

			} 

			
		}
		return op.length()< 1 ? s.charAt(0)+"": op;


	}
}


