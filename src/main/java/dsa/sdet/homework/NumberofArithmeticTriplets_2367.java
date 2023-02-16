package dsa.sdet.homework;

import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;

public class NumberofArithmeticTriplets_2367 {

	/*
	 2367. Number of Arithmetic Triplets
https://leetcode.com/problems/number-of-arithmetic-triplets/

	 */

	@Test
	public void test1() {
		int[] nums= {0,1,4,6,7,10}; int diff=3, Output =2;
		Assert.assertEquals(Output, arithmeticTriplets(nums,diff));
	}

	@Test
	public void test2() {
		int[] nums= {4,5,6,7,8,9}; int diff=2, Output =2;
		Assert.assertEquals(Output, arithmeticTriplets(nums,diff));
	}

	 public int arithmeticTriplets(int[] nums, int diff) {
	      int count = 0;
	      HashSet<Integer> set = new HashSet<>();
	       for(int num : nums) {
	         if(set.contains(num - diff) && set.contains(num - diff * 2))
	           count ++;
	         
	         set.add(num);
	       }
	      return count;
	    }
	}

