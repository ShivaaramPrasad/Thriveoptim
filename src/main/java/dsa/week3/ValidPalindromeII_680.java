package dsa.week3;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class ValidPalindromeII_680 {

	/*
	https://leetcode.com/problems/valid-palindrome-ii/
	 */ 
	/*
	 * Approch one 
	 * 
	 * return the count
	 * 
	 * 
	 */
	@Test 
	public void example1(){
		String s = "RADAR";
		String output="RADAR";
		assertEquals(palindrom(s), output);
	}	
	private boolean palindrom(String s){

		int left = 0; int right = s.length()-1;
		while (left < right) { // O(n/2) => o(n)
			// swap
			if (s.charAt(right)==s.charAt(left)) {
				left++;
				right--;
				return true;

			}else {
				return false;

			}
		}
		return true;
	}

	/*
	 * Approch two 
	 * 
	 * 
	 * 
	 */
	private boolean palindromExpandfromCenter(String s){
		int n=s.length();
		int m=n/2;   int left = n/2 - n%2;
		int right = n/2 + n%2;
		if(left==right) left--;
		while(left>0) {
			if(s.charAt(left--)!=s.charAt(right++)) return false;
		}
		return true;
	}
}