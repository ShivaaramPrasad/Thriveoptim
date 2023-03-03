package fivehrplane.dsa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.IntStream;

import org.junit.Assert;
import org.junit.Test;

public class Anagram_242 {




	@Test
	public void example1() {
		String s1 = "listen";
		String s2 = "silent";
		Assert.assertEquals(true, isAnagramArrayHasMap(s1, s2));

	}

	@Test
	public void example2() {
		String s1 = "anagram";
		String s2 = "nagaram";
		Assert.assertEquals(true, isAnagramArrayHasMap(s1, s2));

	}

	@Test
	public void example3() {
		String s1 = "ABCD";
		String s2 = "CBA";
		Assert.assertEquals(false, isAnagramArrayHasMap(s1, s2));

	}

	@Test
	public void example4() {
		String s1 = "AABB";
		String s2 = "AAAB";
		Assert.assertEquals(false, isAnagramArrayHasMap(s1, s2));
		//Assert.assertEquals(false, isAnagramAsciiArray(s1, s2));

	}


	private boolean isAnagramArrayHasMap(String s1, String s2) {
		if(s1.length()!=s2.length())return false;
		HashMap<Character,Integer> sMap= new HashMap<>();
		HashMap<Character,Integer> tMap= new HashMap<>();
		for (int i = 0; i < s1.length(); i++) {
			sMap.put(s1.charAt(i), sMap.getOrDefault(s1.charAt(i), 0)+1);
			tMap.put(s2.charAt(i), tMap.getOrDefault(s2.charAt(i), 0)+1);

		} 	
         return sMap.equals(tMap);
	}

	
}