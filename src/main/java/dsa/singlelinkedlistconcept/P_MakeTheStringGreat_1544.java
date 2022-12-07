package dsa.singlelinkedlistconcept;

import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;

public class P_MakeTheStringGreat_1544 {
    @Test
	public void test1() {
		String s="leEeetcode";
		String Output= "leetcode";
		Assert.assertEquals(Output, makeGood(s));

	}
    @Test
	public void test2() {
		String s="abBAcC";
		String Output= "";
		Assert.assertEquals(Output, makeGood(s));

	}

	private String makeGood(String s) {
		Stack<Character> stack = new Stack<>();
        StringBuilder output= new StringBuilder();

		for (char currChar : s.toCharArray()) {
			if(!stack.isEmpty()&& Character.isUpperCase(currChar)&& Character.toUpperCase(currChar)==stack.peek()|| !stack.isEmpty()&& Character.isLowerCase(currChar)&& Character.toUpperCase(currChar)==stack.peek())
			{
				stack.pop();
			}
			stack.push(currChar);
		}
        for (char currChar : stack) 
        	output.append(currChar);
        return output.toString();
	}
}
