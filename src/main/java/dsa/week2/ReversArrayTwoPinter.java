package dsa.week2;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class ReversArrayTwoPinter {


	@Test//Positve 
	public void example1(){
		int[] nums = {3,1,2,4}; 
		//{2,4,3,1}

		assertEquals(true,Arrays.equals(reversArrayTwoPinter(nums),new int[] {4,2,1,3}));
		System.out.println(Arrays.toString(reversArrayTwoPinter(nums)));

	}   

	@Test//Negative 
	public void example2(){
		int[] nums = {0};


		assertEquals(true,Arrays.equals(reversArrayTwoPinter(nums),new int[] {0}));
		System.out.println(Arrays.toString(reversArrayTwoPinter(nums)));


	}

	@Test//Negative 
	public void example3(){
		int[] nums = {1,2,3,4};


		assertEquals(true,Arrays.equals(reversArrayTwoPinter(nums),new int[] {4,3,2,1}));
		System.out.println(Arrays.toString(reversArrayTwoPinter(nums)));


	}

	public int[] reversArrayTwoPinter(int[] nums) {
		int start=0,  end = nums.length-1;
		while(start<end){
			int temp = nums[start];
			nums[start++]=nums[end];
			nums[end--]=temp;

			System.out.println(Arrays.toString(nums));
		}
		return nums;

	}

}