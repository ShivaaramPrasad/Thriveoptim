package dsa.hashing;

import java.util.HashMap;
import java.util.*;

import org.junit.Assert;
import org.junit.Test;

public class DestinationCity_1436 {

	/*
	 1436. Destination City
	 https://leetcode.com/problems/destination-city/
You are given the array paths, where paths[i] = [cityAi, cityBi] means there exists a direct path going from cityAi to cityBi. Return the destination city, that is, the city without any path outgoing to another city.

It is guaranteed that the graph of paths forms a line without any loop, therefore, there will be exactly one destination city.



Example 1:

Input: paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
Output: "Sao Paulo" 
Explanation: Starting at "London" city you will reach "Sao Paulo" city which is the destination city. Your trip consist of: "London" -> "New York" -> "Lima" -> "Sao Paulo".
Example 2:

Input: paths = [["B","C"],["D","B"],["C","A"]]
Output: "A"
Explanation: All possible trips are: 
"D" -> "B" -> "C" -> "A". 
"B" -> "C" -> "A". 
"C" -> "A". 
"A". 
Clearly the destination city is "A".
Example 3:

Input: paths = [["A","Z"]]
Output: "Z"

	 */
	@Test
	public void test1() {
		
		List<List<String>> paths = Arrays.asList(Arrays.asList("London","New York"),Arrays.asList("New York","Lima"),Arrays.asList("Lima","Sao Paulo"));
		String s = destCity(paths);
		Assert.assertEquals(s, "Sao Paulo");
	}
	
	@Test
	public void test2() {

		List<List<String>> paths = Arrays.asList(Arrays.asList("B","C"),Arrays.asList("D","B"),Arrays.asList("C","A"));
		String s = destCity(paths);
		Assert.assertEquals(s, "A");
	}
	
	@Test
	public void test3() {
		
		List<List<String>> paths = Arrays.asList(Arrays.asList("A","Z"));
		String s = destCity(paths);
		Assert.assertEquals(s, "Z");

	}
	
	/*
    - Initialize a hashMap <String, String>.
    - Iterate the path from start index until and index. 
    - at every index , get the list of strings, add then to hashMap.
       first value as key second value as value.
	- Iterate the path and return the city that dosn't present in map key
	 */
	
	
	 public String destCity(List<List<String>> paths) {
		 
		 
		 HashMap<String,String> map= new  HashMap<String,String>();
		 
		for (int i = 0; i < paths.size(); i++) {
			//map<Key Value>
			map.put(paths.get(i).get(0),paths.get(i).get(1));
		}
		for (int i = 0; i < paths.size(); i++) {
			if(!map.containsKey(paths.get(i).get(0))) return paths.get(i).get(0);
			else if(!map.containsKey(paths.get(i).get(1))) return paths.get(i).get(1);
		}
		return "";
	        
	        
	    }
	}
