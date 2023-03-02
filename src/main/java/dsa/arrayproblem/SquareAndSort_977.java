package dsa.arrayproblem;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import org.junit.*;

public class SquareAndSort_977 {


	
		@Test
		public void example1(){
			int[] numbers = {-4,-1,0,3,10};
			Assert.assertArrayEquals(new int[] {0,1,9,16,100},squareAndSort(numbers));
		}

		@Test
		public void example2(){
			int[] numbers = {3,3,3,5,7};
			Assert.assertArrayEquals(new int[] {9,9,9,25,49},numbers);
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