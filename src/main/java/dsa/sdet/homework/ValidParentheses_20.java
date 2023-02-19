package dsa.sdet.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;

public class ValidParentheses_20 {

	
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
