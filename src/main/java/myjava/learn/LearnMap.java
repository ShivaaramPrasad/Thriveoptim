package myjava.learn;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LearnMap {

	public static void main(String[] args) {
		// Map -> Dynamic Array [Two Dimension -> Key : Value]
		// Map -> Can grow or shrink by size
		// Map -> Can't allow duplicate values in Key
		// Map -> Key [Unique] | Value [Can have duplicates, Null]
		// Map -> Interface -> 3 Implementation Classes
		// HashMap (Hashing Algo -> Fastest)
		// TreeMap (Ascii Order -> Slowest)
		// LinkedHashMap (Retains the order of insertion)
		Map<String, Integer> employment = new HashMap<>();
		employment.put("Syntel", 3); // Entry -> Key + Value
		employment.put("HCL", 1);
		employment.put("Mercury", 2);
		employment.put("HP", 7);
		employment.put("TestLeaf", 5);
		
		int minTenure = Integer.MAX_VALUE;
		for (Entry<String, Integer> eachEmployment : employment.entrySet()) {
			//System.out.println(eachEmployment.getKey());
			//System.out.println(eachEmployment.getValue());
			Integer tenure = eachEmployment.getValue();
			minTenure = Math.min(tenure, minTenure);
		}
		System.out.println("Exp"+minTenure);
		
		int a=10; int b=3; int c=88; 
		
		HashMap<String,Integer> happy =new HashMap<>();
		happy.put("a", 10);
		happy.put("b", 3);
		happy.put("c", 88);

       System.out.println(happy);
       System.out.println(happy.get("c"));

		HashMap<String,String> credentials  =new HashMap<>();
		credentials.put("Kirshan", "Test@123");
		credentials.put("Shivaaram", "Test@321");
		credentials.put("Sagar", "Tech@321");
		credentials.put("pranathi", "Tech@123");
		credentials.put("Natraj", "Tech@123");

        System.out.println(credentials);
        //credentials.remove("pranathi");
        //System.out.println(credentials);
        System.out.println(credentials.containsKey("Shivaaram"));
        System.out.println(credentials.containsValue("Test@321"));
        System.out.println(credentials.size());
       // System.out.println(credentials.replace("Kirshan", "Hash@123"));
        System.out.println(credentials.values());
        System.out.println(credentials.keySet());
        System.out.println(credentials.isEmpty());
      System.out.println(credentials.putIfAbsent("Natraja", "Admin@123"));
        System.out.println(credentials.values());

		Character[] words = {'a','b','v','y','r','p',' ','a','v'};

		HashMap<Character,Integer> map=new HashMap<Character,Integer> ();
 
		for (int i = 0; i < words.length; i++) {

				map.put(words[i],map.getOrDefault(words[i], 0)+1);
			}
	        System.out.println(map);
	
	
	for (Map.Entry<String, String> entry :credentials.entrySet())
    {
		String key = (String)entry.getKey();
        String value = entry.getValue();

        System.out.println(key + "=" + value);
    }
}
	
	 //map.get(snew).add(s);
	
}