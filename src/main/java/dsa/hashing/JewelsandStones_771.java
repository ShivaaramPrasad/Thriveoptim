package dsa.hashing;

import java.util.HashMap;

import org.junit.Test;

import junit.framework.Assert;

public class JewelsandStones_771 {
	
	/*
	 771. Jewels and Stones
   https://leetcode.com/problems/jewels-and-stones/
   You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so "a" is considered a different type of stone from "A".

Example 1:

Input: jewels = "aA", stones = "aAAbbbb"
Output: 3
Example 2:

Input: jewels = "z", stones = "ZZ"
Output: 0

	 */
	
	@Test
	public void test1()
	{
		String jewels ="aA",  stones="aAAbbbb";
		int output=3;
		System.out.println(numJewelsInStones(jewels, stones));
		//Assert.assertEquals(output, numJewelsInStones(jewels,stones));
		
	}
	
	@Test
	public void test2()
	{
		String jewels ="z",  stones="ZZ";
		int output=0;
		System.out.println(numJewelsInStones(jewels, stones));
		//Assert.assertEquals(output, numJewelsInStones(jewels,stones));
		
	}

	public int numJewelsInStones(String jewels, String stones) {
		int jcount=0;
		for (int i = 0; i < stones.length(); i++) {
			if(jewels.indexOf(stones.charAt(i))>-1) {
				jcount++;
			}
		}
		return jcount;
	}
	
	 public int numJewelsInStonesMap(String jewels, String stones) {
	        
	       int jcount=0;
			HashMap<Character,Integer> jweleMap =new HashMap<>();
			for (int i = 0; i < jewels.length(); i++) {
				jweleMap.put(jewels.charAt(i), jweleMap.getOrDefault(jewels.charAt(i),0)+1);
			}
			for (int i = 0; i < stones.length(); i++) {
				if (jweleMap.containsKey(stones.charAt(i))) {
					jcount++;
				}

			}
			return jcount;

		}

}
