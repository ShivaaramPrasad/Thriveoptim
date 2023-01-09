package dsa.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class SecondLeast {

	/*Find the second least repeating character in a given string
	Example:
	Input: "tesla-service" Output: s 
	t => 1 (Min)
	e => 3 (Max)
	s => 2 (Second Max | Second Min)
	l => 1 (Min)
	a => 1 (Min)
	r => 1 (Min)
	v => 1 (Min)
	i => 1 (Min)
	c => 1 (Min)
	Solve using Map*/

	/*
	 * 1) Did I understand the problem? Yes
	 * 		-> If No, Ask the person to provide more detail with example(s)
	 * 
	 *    What is the input(s)? String
	 *    What is the expected output? Character 
	 *    	What if there is no second least? ->  print no second min 
	 *    		Example: "abcd" -> 
	 *      What if i have multiple second least? first 
	 *      	Example: "aabbcd" -> c or d 
	 *      Is it case sensitive? Yes
	 *      	
	 *    Do I have constraints to solve the problem? Use Map
	 *    Do I have all informations to go to next step!! Yes
	 *    How big is your test data set will be? Small
	 *    
	 *  2) Test data set
	 *  	
	 *  	Minimum of 3 data set !! Positive, Edge, Negative 
	 *      Validate with the interviewer if the data set is fine by his/her assumptions
	 * 
	 * 3) Do I know how to solve it?
	 * 		
	 * 		Yes - great, is there an alternate?
	 * 		No - Can I break down the problem into sub problems?
	 * 
	 * 4) Ask for hint (If you do not know how to solve)
	 * 
	 * 5) Do I know alternate solutions as well?
	 * 
	 * 		Yes - What are those?
	 * 		No - That is still fine, proceed to solve by what you know !!
	 * 
	 * 6) If you know alternate solutions -> find out the O Notations (Performance)
	 * 
	 * 		Then, explain either both or the best (depends on the time)
	 * 
	 * 		Approach 1: Start with worst -> Improve (Optimize) -> End up with the best
	 * 		Approach 2: Write down the options and benefits and code the best 
	 * 
	 * 7) Start always with Psuedo code 
	 * 
	 * 8) Implement them in the code (editor)
	 * 
	 * 9) Test against the different data set 
	 * 
	 * 10) If it fails, debug them to solve it !!
	 * 
	 */

	// Brute Force Algorithm !! 

	@Test // Positive
	public void example1() {
		String s1 = "Testleaf";
		char c = 'T';
		getLeastOccurance(s1);
	}

	@Test // Edge
	public void example2() {
		String s1 = "tesla-service";
		char[] output = {'a','u','#'};
		char c = 's';

	}

	@Test // Negative
	public void example3() {
		String s1 = "aaaa";
		char c = ' ';
	}

	@Test // Negative
	public void example4() {
		String s1 = "aabbcd";
		char c = 'c';
	}

	/*
	 * PsuedoCode:
	 * 
	 * 1) Convert the String to character array
	 * 2) Add the character array to Map [Initialize]
	 * 3) Traverse through the map and find the min value !!
	 * 4) Based on Min value, find the character.
	 * 
	 * Constraint : Use only Map !!
	 * 
	 */

	private void getLeastOccurance(String s1) {

		char[] c1 = s1.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < c1.length; i++)
			map.put(c1[i], map.getOrDefault(c1[i], 0)+1);
		
		System.out.println(map);
		int minValue = Integer.MAX_VALUE;
		char c = ' ';
		for (Entry<Character, Integer> entry : map.entrySet()) {
			Integer currValue = entry.getValue();
			minValue = Math.min(minValue, currValue);
			if(minValue == currValue) {
				c = entry.getKey();
			}
		}
		System.out.println(minValue);
		System.out.println(c);
		
		// 1) Find the Min for the first occurance
		// 2) Find the Second Min 
		
	}





}
