package java8.stream;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MaPValues {
	
	public static void main(String[] args) {
		
		Map<String, Integer> mentors= new HashMap<>();
		mentors.put("Babu",45);
		mentors.put("Hari",42);
		mentors.put("SSP",32);
		mentors.put("Shivaaram",28);
		mentors.put("Krishna",27);
		mentors.put("Sagar",32);
		
		// I want to find the mentors above 40 year old
		
		Set<Entry<String, Integer>> mentorsEntries = mentors.entrySet();
		for (Entry<String, Integer> entry : mentorsEntries) {
			if(entry.getValue()>40)
			System.out.println(entry.getKey());
		}
		
		// Java 8
		
		mentors.entrySet().stream().filter(entry -> entry.getValue() > 40)
		.forEach(entry-> System.out.println(entry.getKey()));
	}

}
