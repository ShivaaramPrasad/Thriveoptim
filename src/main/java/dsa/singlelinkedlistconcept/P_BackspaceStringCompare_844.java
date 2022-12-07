package dsa.singlelinkedlistconcept;

import java.util.LinkedList;
import java.util.Stack;

import org.junit.Test;

import junit.framework.Assert;

public class P_BackspaceStringCompare_844 {

	@Test
	public void test1() {

		String s="ab#c";
		String t="ad#c";
		Assert.assertEquals(true, backspaceCompare(s, t));
	}

	@Test
	public void test2() {

		String s="ab##";
		String t="c#d#";
		Assert.assertEquals(true, backspaceCompare( s, t));
	}
	@Test
	public void test3() {

		String s="a#c";
		String t="b";
		Assert.assertEquals(false, backspaceCompare( s, t));
	}
	/*
     Approch 1

     - Assign a LinkedList 
     - if character not matches #  add values in  list 
     - else if list is not empty remove character;
     - compare both LinkedList and if same return true else false

     Time Complexity - O[N]
     Space Complexity - O[N]
	 */
	public boolean backspaceCompare(String s, String t) {
		backspaceList(s);
		backspaceList(t);

		return backspaceList(s).equals(backspaceList(t));

	}
	private LinkedList<Character> backspaceList(String input) {
		LinkedList<Character> list =new LinkedList<Character>();
		for (Character cha: input.toCharArray()) {
			if (cha != '#')
				list.add(cha);
			else if (!list.isEmpty())
				list.removeLast();
		}	
		return list;
	}

	
	
	
	public boolean backspaceCompare2(String S, String T) {
		return build(S).equals(build(T));
	}
	public String build(String S) {
		Stack<Character> ans = new Stack();
		for (char c: S.toCharArray()) {
			if (c != '#')
				ans.push(c);
			else if (!ans.empty())
				ans.pop();
		}
		return String.valueOf(ans);
	}
}