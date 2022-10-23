package dsa.week1;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class ReverseString_344 {


	/*
	 
	344. Reverse String
Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.



	1) Did I understand the problem? Yes or NO ! !
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
	    Yes � great, is there an alternate?
	     No � Can I break down the problem into sub problems?


	4) Ask for hint (If you do not know how to solve)
	5) DO I know alternate solutions as well?
	      Yes � What are those?
	       No � That is still fine, proceed to solve by what you know !!

	 */
	
	

	@Test
	public void example1() {
		String s = "hello";
		reverseUsing2Pointer(s);
	}
	
	
	private void reverseString(String s) {
		char[] ch = s.toCharArray();  	// mem copy		
		for (int i = ch.length-1; i >=0; i--) { // O[n]
			System.out.print(ch[i]);
		}
		
	}
	
	private void reverseUsing2Pointer(String s) {
		char[] ch = s.toCharArray();  			
		int left = 0, right = ch.length-1;
		while (left < right) { // O(n/2) => o(n)
			// swap
			char temp = ch[right];
			ch[right--] = ch[left];
			ch[left++] = temp;
		}
		System.out.println(new String(ch));
	}
	
	
	 public void reverseString(char[] s) {
	        
		   int left = 0; int right = s.length-1;
				while (left < right) { // O(n/2) => o(n)
					// swap
					char temp = s[right];
					s[right--] = s[left];
					s[left++] = temp;
				}
		        
		       }
	
}
