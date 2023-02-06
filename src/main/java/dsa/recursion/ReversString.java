package dsa.recursion;

import org.junit.Test;

import org.junit.Assert;

public class ReversString {
	String output;
	@Test
	public void test1() {
		String s="Hello";
		
		Assert.assertEquals("olleH", recursiontest(s));
	}

	private String recursion(String s) {

		if(s.length()==0) return s;
		 output = output+s.charAt(s.length()-1);
		recursion(s.substring(0,s.length()-1));
		return output;
	}
	
	private String recursiontest(String s) {

		if(s.length()==0) return s;
		return s.charAt(s.length()-1)+recursiontest(s.substring(0, s.length()-1));
	}
	
}
