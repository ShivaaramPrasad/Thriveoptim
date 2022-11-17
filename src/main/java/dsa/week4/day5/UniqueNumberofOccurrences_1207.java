package dsa.week4.day5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class UniqueNumberofOccurrences_1207 {

	/*
	 1207. Unique Number of Occurrences
Given an array of integers arr, return true if the number of occurrences of each value in the array is unique, or false otherwise.


	 */
	@Test
	public void test1()
	{
		int [] arr = {1,2,2,1,1,3};
		Assert.assertEquals(true, uniqueOccurrences(arr));

	}
	
	@Test
	public void test2()
	{
		int [] arr = {1,2};
		Assert.assertEquals(true, uniqueOccurrences(arr));

	}
	@Test
	public void test3()
	{
		int [] arr = {-3,0,1,-3,1,1,1,-3,10,0};
		Assert.assertEquals(true, uniqueOccurrences(arr));

	}
	@Test
	public void test4()
	{
		int [] arr = {-3,0,-3,0};
		Assert.assertEquals(false, uniqueOccurrences(arr));

	}
	
	
	 public boolean uniqueOccurrences(int[] arr) {

	   		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
			for (int i = 0; i < arr.length; i++) {
				if (map.containsKey(arr[i]))
					map.put(arr[i], map.get(arr[i]) + 1);
				//map.get(snew).add(s);
				else
					map.put(arr[i], 1);
			}
			Set<Integer> set = new HashSet<Integer>(map.keySet());
			/*
			 * for (Entry<Integer, Integer> entry : map.entrySet()) {
			 * 		set.add(entry.getValue()); 
			 * }
			 */
			return set.size() == map.size();
		}
	 
	 public boolean uniqueOccurrences2(int[] arr) {

	   		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
			for (int i = 0; i < arr.length; i++) {
				map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
			}
			for( Map.Entry<Integer, Integer> entries: map.entrySet() ) {
				if( entries.getValue() == 1) 
					return true;
			}

			return false;
		}
	 
	 
	}


