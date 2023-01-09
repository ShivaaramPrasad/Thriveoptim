package dsa.stringproblem;

import org.junit.Assert;
import org.junit.Test;

import org.junit.Test;


public class FirstUniqueCharacterString_387 {

	/*
	 * 387. First Unique Character in a String Given a string s, find the first
	 * non-repeating character in it and return its index. If it does not exist,
	 * return -1.
	 * 
	 * Example 1:
	 * 
	 * Input: s = "leetcode" Output: 0
	 * 
	 * Example 2:
	 * 
	 * Input: s = "loveleetcode" Output: 2 Example 3:
	 * 
	 * Input: s = "aabb" Output: -1
	 * 
	 */

	/*
	 * 1) Did I understand the problem? Yes If No, Ask the person to provide more
	 * detail with example(s) If yes, go to next step !! What is the input(s)? 2
	 * Strings What is the expected output? int. Do I have constraints to solve the
	 * problem? Do I have all informations to go to next step!! How big is your test
	 * data set will be? 2) Test data set Minimum of 3 data set ! ! Positive, Edge,
	 * Negative Validate with the interviewer if the data set is fine by his/her
	 * assumptions
	 * 
	 * 3)Do I know how to solve it? Yes — great, is there an alternate? No — Can I
	 * break down the problem into sub problems?
	 * 
	 * 
	 * 4) Ask for hint (If you do not know how to solve) 5) DO I know alternate
	 * solutions as well? Yes — What are those? No — That is still fine, proceed to
	 * solve by what you know !! 6) If you know alternate solutions -> find out the
	 * the 0 Notations (Performance) Then, explain either both are the best (depends
	 * on the time) Approach 1: Start with worst -> improve (Optimize) -> End up
	 * with the best Approach 2: Write down the options and benefits and code the
	 * best
	 * 
	 * 7) Start always with Pseudo code
	 * 
	 * 8) Implement them in the code (editor)
	 * 
	 * 9)Test against the different data set
	 * 
	 * 10) If it fails, debug them to solve it !!
	 */

	/*
	 * Approch 1 Decalar an Charecterarry which converts the string itrate the array
	 * from first to last find the match is found return the index if match is not
	 * found return -1
	 */
	@Test
	public void test1() {
		String s = "leetcode";
		int output = 0;
		System.out.println(firstUniqueCharacter(s));
		Assert.assertEquals(output, firstUniqueCharacter2nd(s));
	}

	@Test
	public void test2() {
		String s = "loveleetcode";
		int output = 2;
		Assert.assertEquals(output, firstUniqueCharacter2nd(s));
	}

	@Test
	public void test3() {
		String s = "aabb";
		int output = -1;
		Assert.assertEquals(output, firstUniqueCharacter2nd(s));
	}

	private int firstUniqueCharacter(String s) {        
		for (int i = 0; i < s.length(); i++) {
			boolean unique=false;
			for (int j = 0; j < s.length(); j++) {

				if (s.charAt(i) == s.charAt(j) && i!=j ) {
					unique=true;
					break;
				} 

			}
			if(!unique) return i;
		} 

		return -1;
	}


	private int firstUniqueCharacter2nd(String s) {        
		for (int i = 0; i < s.length(); i++) {
			char temp= s.charAt(i);
			if(s.indexOf(temp)==s.lastIndexOf(temp))
				return i;
		} 

		return -1;
	}
}
