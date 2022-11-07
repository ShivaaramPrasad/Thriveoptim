package myjava.learn;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LearnSet {

	public static void main(String[] args) {
		// Set -> Dynamic Array [Single Dimensional]
		// Set -> Can grow or shrink by size
		// Set -> Do not allow duplicate values
		// Set -> HashSet (Hashing Algorithm), TreeSet (ASCII Value), LinkedHashSet (Maintains the insertion order)
		
		Set<String> companies = new HashSet<>();
		companies.add("Disney");
		companies.add("Atlassian");
		companies.add("Cisco");
		companies.add("Dunzo");
		companies.add("Salseforce");
		companies.add("Freshworks");
		companies.add("Zoho");
		boolean add = companies.add("Thoghtworks");
		System.out.println("First "+add);
		companies.add("Dunzo");
		boolean add2 = companies.add("HP");
		System.out.println("Second "+add2);
		companies.add("TestLeaf");
		
		for (String eachCompany : companies) {
			System.out.println(eachCompany);
		}

		
	}

}
