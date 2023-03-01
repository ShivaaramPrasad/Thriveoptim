package dsa.twopointer;

import static org.testng.Assert.assertEquals;

import java.util.Stack;

import org.junit.Test;

import org.junit.Assert;

public class ValidPalindrome_125 {

	
	@Test 
	public void test1(){
		String s = "A man, a plan, a canal: Panama";
		String explanation="amanaplanacanalpanama";
		Assert.assertEquals(true, isPalindromeStack(s));
	}	
	
	
	@Test 
	public void test2(){
		String s = "race a car";
		String explanation="raceacar";
		Assert.assertEquals(false, isPalindromeStack(s));
	}
	
	@Test 
	public void test3(){
		String s = " ";
		String explanation="raceacar";

		Assert.assertEquals(true, isPalindromeStack(s));
	}


	public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");  
		String reversed="";
        for(int i=s.length()-1;i>=0;i--){
            reversed+=s.charAt(i);
        }
        if(s.equals(reversed)) {
        	return true;
        }
		return false;
	}
	
	 public boolean isPalindromeStringBuffer(String s) {
	        String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
	        String rev = new StringBuffer(actual).reverse().toString();
	        return actual.equals(rev);
	    }
	
	 public boolean isPalindromeStack(String s) {      
	        char[] inp = s.toLowerCase().toCharArray();
	        Stack<Character> stack = new Stack<Character>();
	        for(char c : inp){
	            if(Character.isLetterOrDigit(c)){
	                stack.push(c);
	            }
	        }
	        for(char c : inp){
	           if(Character.isLetterOrDigit(c)){
	               if(c != stack.pop()){
	                   return false;
	               }
	        }  
	    }
	    return true;
	    }
}
