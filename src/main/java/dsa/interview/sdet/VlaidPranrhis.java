package dsa.interview.sdet;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;


import org.junit.Assert;
import org.junit.Test;

public class VlaidPranrhis {

	/*
	Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

	An input string is valid if:

	Open brackets must be closed by the same type of brackets.
	Open brackets must be closed in the correct order.
	Every close bracket has a corresponding open bracket of the same type.
	Example 1:

	Input: s = "()"
	Output: true
	Example 2:

	Input: s = "()[]{}"
	Output: true
	Example 3:

	Input: s = "(]"
	Output: false
	 */
	@Test
	public void test4(){
		String s ="()";
		Assert.assertEquals(true, validPranthasis(s));
	}

	@Test
	public void test2(){
		String s ="()[]{}";
		Assert.assertEquals(true, validPranthasis(s));
	}


	@Test
	public void test3(){
		String s ="(]";
		Assert.assertEquals(false, validPranthasis(s));
	}
	
	@Test
	public void test5(){
		String s ="({[";
		Assert.assertEquals(false, validPranthasis(s));
	}

	@Test
	public void test1(){
		String s ="})]";
		Assert.assertEquals(false, validPranthasis(s));
	}

	//Time complexity O(N) Space complexity=O(N);
	public boolean validPranthasis( String s){
		char[] brackets= s.toCharArray();
		Stack<Character> stack = new Stack<>();
		for( char c : brackets){
			if(c =='('){
				stack.push(')');
			}
			else if(c=='['){
				stack.push(']');
			}
			else if(c=='<'){
				stack.push('>');
			}
			else if(c=='{'){
				stack.push('}');
			} else if(stack.isEmpty() || c!=stack.pop()) return false;
		}
		return stack.isEmpty();
	}
}

