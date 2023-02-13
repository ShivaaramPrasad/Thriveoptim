package dsa.sdet.homework;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

public class RansomNote_383 {


	@Test
	public void example1() {
		String ransomNote = "a";
		String magazine = "b";
		Assert.assertEquals(false, canConstruct(ransomNote, magazine));
	}

	@Test
	public void example2() {
		String ransomNote = "aa";
		String magazine = "ab";
		Assert.assertEquals(false, canConstruct(ransomNote, magazine));
	}

	@Test
	public void example3() {
		String ransomNote = "aa";
		String magazine = "aab";
		Assert.assertEquals(true, canConstruct(ransomNote, magazine));
	}

	/*
    1. Add magazine to map with occurance
    2. Traverse each element  from 0 till ransomNote length
    3. check if it is in map. if not return false
    4. else reduce the frequency
	 */
	public boolean canConstruct(String ransomNote, String magazine) {

		 HashMap<Character, Integer> map = new HashMap<>();
	        for(char ch : magazine.toCharArray()){
	            map.put(ch, map.getOrDefault(ch, 0) + 1);
	        }
	        for(char ch : ransomNote.toCharArray()){
	            if(!map.containsKey(ch) || map.get(ch) == 0){
	                return false;
	            }
                map.put(ch, map.getOrDefault(ch, 0) - 1);
	        }
	        return true;
	    }
}