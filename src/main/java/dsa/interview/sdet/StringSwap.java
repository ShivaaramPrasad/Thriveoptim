package dsa.interview.sdet;

import org.junit.Test;

import junit.framework.Assert;

public class StringSwap {
	/*
	 * String s1="good" String s2="day"
swap string without a third variable

	 */
	@Test
	public void test1() {
		String s1 = "good";
		String s2 = "day";
		
   System.out.println(swapString(s1,s2));		
	}
	
	@Test
	public void test3() {
		String s1 = "good";
		String s2 = "";
		
   System.out.println(swapString(s1,s2));		
	}
	
	@Test
	public void test2() {
		String s1 = "";
		String s2 = "day";
		
   System.out.println(swapString(s1,s2));		
	}
	
	@Test
	public void test4() {
		String s1 = "";
		String s2 = "";
		
   System.out.println(swapString(s1,s2));		
	}
	
	@Test
	public void test5() {
		String s1 = "day";
		String s2 = "bay";
		
   System.out.println(swapString(s1,s2));		
	}
	
	/*
	 * Approch
	 * get the lenght of two string 
	 * Concatenate two string s1
	 * using string function get the substring suprat the string to s2
	 */

	private String swapString(String s1, String s2) {
         int sl2 = s2.length();
         int sl1 = s1.length();
         s1= s1+s2;
         s2=s2.substring(0,sl1-sl2);
         s1 = s2.substring(sl2);

		return null;
	}

}
