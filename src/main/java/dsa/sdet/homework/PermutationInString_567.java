package dsa.sdet.homework;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class PermutationInString_567 {
	
	@Test
	public void test1() {
		String s1 = "ab";
		String s2 = "eidbaooo";

		Assert.assertEquals(true, checkInclusion(s1, s2));

	}
	@Test
	public void test2() {
		String s1 = "ab";
		String s2 = "eidboaoo";
		;
		Assert.assertEquals(false, checkInclusion(s1, s2));
	}
	/*
	 Approch 
	 Iterate the s1 and add it in Hashmap hmap1
	 Iterate the s2 and add it in Hashmap  hmap2 the length should s2 -s1
	 if hmap1 equals hmap2 retuen true 
	 else clear the hashmap 
	 return false 

	 */
	private boolean checkInclusion(String s1, String s2) {
		Map<Character, Integer> hmap1 = new HashMap<Character, Integer>();
		Map<Character, Integer> hmap2 = new HashMap<Character, Integer>();

		for (int i = 0; i < s1.length(); i++) {
			hmap1.put(s1.charAt(i), hmap1.getOrDefault(s1.charAt(i), 0) + 1);
		}
		for (int i = 0; i <= s2.length() - s1.length(); i++) {
			for (int j = i; j < s1.length() + i; j++) {
				hmap2.put(s2.charAt(j), hmap2.getOrDefault(s2.charAt(j), 0) + 1);
			}
			if (hmap1.equals(hmap2))
				return true;
			else {
				hmap2.clear();
			}
		}
		return false;
	}
	
	private boolean checkInclusiont(String s1, String s2) {

	HashMap<Character,Integer> map1 = new HashMap<Character,Integer>();
	HashMap<Character,Integer> map2 = new HashMap<Character,Integer>();
	
	  for(int i=0;i<s1.length();i++){
		  map2.put(s1.charAt(i), map2.getOrDefault(s1.charAt(i), 0)+1);
	  }
	  for(int i=0;i<s2.length();i++){
		  map1.put(s2.charAt(i), map1.getOrDefault(s2.charAt(i), 0)+1);
		  if(i>=s1.length()){
              int temp = i-s1.length();
			  char ch = s2.charAt(temp);
			  
			  if((map1.get(ch) ==1)){
				  map1.remove(ch);
			  }else{
				  map1.put(ch, map1.get(ch)-1);
			  }
			  if(map2.equals(map1)){
				  return true;
			  }
		  }
		  if(map2.equals(map1)){
				  return true; 
			  }
	  }
	  return false;
}
}
