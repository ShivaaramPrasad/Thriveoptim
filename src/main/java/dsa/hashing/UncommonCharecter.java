package dsa.hashing;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Assert;

public class UncommonCharecter {

	@Test
	public void test1() {
		String s1 = "pinapple", s2 = "apple";
	    Assert.assertEquals("pin", uncommonCharecter( s1,  s2));
	}
	
	
	@Test
	public void test2() {
		String s1 = "malayam", s2 = "tamil";
	    Assert.assertEquals("maaly", uncommonCharecter( s1,  s2));
	}
	
	@Test
	public void test3() {
		String s1 = "malayam", s2 = "";
	    Assert.assertEquals("malayam", uncommonCharecter( s1,  s2));
	}
	/*
	 Approach 1
	 
	   - Concatenate given two string s1 and s2
	   - Convert String in to an array by regx using split " "
	   - Create a map with String Integer as key value to hold each words and its occurence 
	     in both the sentence 
	   - Keep adding each word and its occurrence into map 
	   - create List <string> output 
	   - Iterate through entrySet map to add key into output where value matches 1
	   - return output as list to array.
	   
	 */
	
	private String uncommonCharecter(String s1, String s2) {

		HashMap<Character, Integer> map = new HashMap<>();

		for(int i=0; i<s2.length(); i++) {
			if(map.containsKey(s2.charAt(i)) {
				map.put(s2.charAt(i), map.getOrDefault(s2.charAt(i), 0) +1);
			}
			else
				map.put(s2.charAt(i), 1);
		}

		for(int i=0; i<s1.length(); i++) {

			if(map.containsKey(s1.charAt(i) && map.get(s1.charAt(i)) >= 1) {
				map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) -1);
			}
			else	
			System.out.print(s1.charAt(i));
		}


}
	
}
