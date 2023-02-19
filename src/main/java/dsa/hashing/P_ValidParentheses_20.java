package dsa.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;

public class P_ValidParentheses_20 {
/*
 20. Valid Parentheses
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
	public void example1() {
		String str = "()";
		Assert.assertEquals(true, isValid(str));
	}

	@Test
	public void example2() {
		String str = "()[]{}";
		Assert.assertEquals(true, isValid(str));
	}
	
	@Test
	public void example3() {
		String str = "(]";
		Assert.assertEquals(false, isValid(str));
	}
	
	private boolean isValid(String str) {
		char[] brackets = str.toCharArray();
		Stack<Character> stack = new Stack<>();
		for (char c : brackets) {
			if(c == '['){
				stack.push(']');
			}
			else if(c == '{'){
				stack.push('}');
			}
			else if(c == '('){
				stack.push(')');
			} else if(stack.isEmpty() || c!=stack.pop()) return false;
		}
		return stack.isEmpty();
	}
	
	
	
}
