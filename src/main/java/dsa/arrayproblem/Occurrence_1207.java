package dsa.arrayproblem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class Occurrence_1207 {
	

	/*
	 https://leetcode.com/problems/unique-number-of-occurrences/
	 1207
	Given an array of integers arr, write a function that returns true if and only if the number of occurrences of each value in the array is unique.
	Example 1:
	Input: arr = [1,2,2,1,1,3]
	[1,1,2,3,3]
	[1,2,3]
	Output: true

	Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
	Input: nums = [3,0,1]
	Output: 2

	1. Step will Validating the arrarylenght =1 retrun the same array
	2. Sort the array 
	3.find the lenght of an aray find the n or size of an array
	4. ittating the forloop arr[i]=i 
	5 not can transfer to next element 
	6) if not matching the element then print i 
	7) move next element i++
	*/	
	
	@Test
	public void test1(){
		int []arr = {1,2,2,1,1,3};
		Assert.assertEquals(true, uniqueOccurrencesOpt(arr));
	}
	
	@Test
	public void test2(){
		int []arr = {1,2,};
		Assert.assertEquals(false, uniqueOccurrencesOpt(arr));
	}
	public boolean uniqueOccurrences(int[] arr) {

   		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i]))
				map.put(arr[i], map.get(arr[i]) + 1);
			else
				map.put(arr[i], 1);
		}
		Set<Integer> set = new HashSet<Integer>(map.values());
		/*
		 * for (Entry<Integer, Integer> entry : map.entrySet()) {
		 * 		set.add(entry.getValue()); 
		 * }
		 */
		return set.size() == map.size();
	}
	
	 public boolean uniqueOccurrencesOpt(int[] arr) {
	        // Store the frequency of elements in the unordered map.
	        Map<Integer, Integer> freq = new HashMap<>();
	        for (int num : arr) {
	            freq.put(num, freq.getOrDefault(num, 0) + 1);
	        }
	        
	        // Store the frequency count of elements in the unordered set.
	        Set<Integer> freqSet = new HashSet<>(freq.values());
	        
	        // If the set size is equal to the map size, 
	        // It implies frequency counts are unique.
	        return freq.size() == freqSet.size();
	    }
}