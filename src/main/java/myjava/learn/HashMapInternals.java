package myjava.learn;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class HashMapInternals {

	@Test
	public void internals() {

		String text = "Krishna";
		String text1 = "Shivaaram";

		// Get the hashcode -> int 
		System.out.println(text.hashCode());
		int hashCode = text.hashCode();

		int n = 16; // 2^4

		// Get the index
		int index = hashCode & (n-1);
		System.out.println(index);

		// Get the hashcode -> int 
		System.out.println(text1.hashCode());
		int hashCode1 = text1.hashCode();

		// Get the index
		int index1 = hashCode1 & (n-1);
		System.out.println(index1);

		// Terminology - Bucket, LinkedList (Node), Collision, 
		// Initial and Max Capacity, Default Load Factor

		Map<String, Integer> map = new HashMap<String, Integer>(250,0.8f);
		map.put("Thanveer", 26);
		map.put("Krishan", 29);
		map.put("Sagar", 30);

		int age = map.get("Sagar");
		System.out.println(age);
		
		// it will store in Linked list
		
		//Hash Collision
	/*	
      get the key 
      o(1) - best / Avg
      o(log) */
	}


}