package dsa.twopointer;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class ArraysSquareAndSort_977 {


	
		@Test
		public void example1(){
			int[] numbers = {-4,-1,0,3,10};
			assertEquals(true,Arrays.equals(squareAndSort(numbers),new int[] {0,1,9,16,100}));
		}

		@Test 
		public void example2(){
			int[] numbers = {3,3,3,5,7};
			assertEquals(true,Arrays.equals(squareAndSort(numbers),new int[] {9,9,9,25,49}));
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