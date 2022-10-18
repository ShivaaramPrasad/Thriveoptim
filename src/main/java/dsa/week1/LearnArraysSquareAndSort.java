package dsa.week1;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class LearnArraysSquareAndSort {

	/*
	 * 1) Did I understand the problem? Yes or No !!
	 * 
	 * If No, Ask the person to provide more detail with examples
	 * If yes, go to next step ||
	 * 
	 * What is the input (S)?
	 * What is the expected output 
	 * Do i have all the information to go to next step
	 *  How big is your test data set will be 
	 * 2) Test Data set 
	 * Minimum of 3 data set !! Positive Edge, Negative
	 * validate with the interviewer if data set is fine by him/her assumptions
	 * 
	 * 3) DO I know to solve it?
	 * 
	 * Yes -great is there an alternate?
	 * 
	 * No Can I break down the problem into sub problem?
	 * 
	 * 4) Ask for hint(If do not know how to solve)
	 * 
	 * 5) DO I know alternate solution as well?
	 * 
	 * Yes -What are those?
	 * 
	 * No - That is still fine proceed to solve by what you know !!
	 * 
	 * 6) If You Know alternate solution --> find out the O Notation (Performance))
	 * 
	 * Then Explain either both or the best (depends on the time)
	 * 
	 * Approach 1: Start with worst --> Improve (Optimize) ->find up with the best
	 *  
	 * 	 * Approach 2: Write down the options and benefits and code the best 

	 * 7) start always with Pseudo code 
	 * 
	 * 8) Implement them in the code (editor)
	 * 
	 * 9) Test against the different data set
	 * 
	 * 10) If it fails debug them to solve it
	
	*/
	
	//Brute Force Algorithm !!
	// 
	
		@Test//Positive
		public void example1(){
			int[] numbers = {-4,-1,0,3,10};
			assertEquals(true,Arrays.equals(squareAndSort(numbers),new int[] {0,1,9,16,100}));
		}

		@Test //Edge
		public void example2(){
			int[] numbers = {3,3,3,5,7};
			assertEquals(true,Arrays.equals(squareAndSort(numbers),new int[] {9,9,9,25,49}));
		}
		
		@Test //Negative
		public void example3(){
			int[] numbers = {};
			assertEquals(true,Arrays.equals(squareAndSort(numbers),new int[] {}));
		}
		
		private int[]  squareAndSort(int[] numbers){
			
			if(numbers.length==0) return numbers;

			for (int i = 0; i < numbers.length; i++) {
				numbers[i] = numbers[i] * numbers[i];
			}
			Arrays.sort(numbers);
			System.out.println(Arrays.toString(numbers));
			return numbers;
		}
		
		
	}