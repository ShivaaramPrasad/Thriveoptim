package dsa.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import org.junit.Assert;

public class GroupAnagrams49 {

	/*
	 * 49. Group Anagrams
Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
Example 2:

Input: strs = [""]
Output: [[""]]
Example 3:

Input: strs = ["a"]
Output: [["a"]]

 /* If String[] is empty, return empty. 
	 * Create a HashMap out with HashMap<Character,Integer> as key and List<String> as value.
	 * Iterate the input
	 *   Create a Hashmap and add each item to hashmap.
	 *   Check if its already in hashmap, if yes get the value of the hashmap and append the current item to the list.
	 *   else add to HashMap out
	 * return values of the HashMap
	 * 
     Map<Map<Character, Integer>, List<String>> outMap = new HashMap<>();
	 */


	@Test
	public void test1() {

		String [] word = {"eat","tea","tan","ate","nat","bat"};
		List<String> wordList = Arrays.asList("eat","tea","tan","ate","nat","bat");
		System.out.println(groupAnagrams(word));
	}

	public List<List<String>> groupAnagrams(String[] words) {
		if(words.length==0) return new ArrayList();
		Map<Map<Character, Integer>, List<String>> outMap = new HashMap<>();
		for (int i = 0; i < words.length; i++) {
			HashMap<Character,Integer> lmap = new HashMap<Character,Integer>();
			for (char c : words[i].toCharArray()) {
				lmap.put(c, lmap.getOrDefault(c,0)+1);
			}
			if(outMap.containsKey(lmap)){
				List<String> matchWord=outMap.get(lmap);
				matchWord.add(words[i]);
			}else {
				List<String> tList= new ArrayList<String> (Arrays.asList(words[i]));
				outMap.put(lmap,tList);
			}
		}

		List<List<String>> outList =new ArrayList<>();
		outList.addAll(outMap.values());
		return outList;
	}
	
}
