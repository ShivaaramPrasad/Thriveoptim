package myjava.learn;

import java.util.Arrays;

import org.apache.poi.ss.formula.functions.Even;

public class  LearnArrays {

	public static void main(String[] args) {
		
		String mentor1 = "Natraj";
		String mentor2 = "Satish";
		String mentor3 = "Kirishan";
		String mentor4 = "Shivaaram";

		// Array -> Can store similar data under one variable
		String[] mentors = {"Natraj", "Satish","Kirishan","Shivaaram"};
		System.out.println("Lenght of an array mentors: "+mentors.length);
		// How to print an Array using for loop 
		/*for (int i = 0; i < mentors.length; i++) {
			System.out.println(mentors[i]);
		}*/
		
		// How to print an Array using foreach
		for (String eachMentor : mentors) {
			System.out.println(eachMentor);
		}
		
		
		// Array work by the index -> starts at 0    and size is length-1
		//System.out.println(mentors[2]);
		
		// Limitation: You should declare the size upfront!!
		// You cannot increase or decrease the size of array later
		String[] courses = new String[14]; 
		courses[0] = "Selenium"; // Assigned value for the first index
		courses[1] = "Rest API Automation";
		courses[2] = "Microservices Automation";
		// Other index -> default value as null
		//System.out.println(courses[4]);
		
		// Covert array in to String 
		Arrays.toString(courses);
		//Print to String Array
		System.out.println(Arrays.toString(courses));
		
		// to Sort and Array
		int [] nums= {1,6,7,9,2};
		Arrays.sort(nums);
		for (int eachNum : nums) {
			System.out.println(eachNum);
		}
		
		
        int arr[] = { 12, 13, 14, 15, 16, 17, 18 };

        int[] copyArr = Arrays.copyOfRange(arr, 4, arr.length + 3);
        
        for (int copyElemdArr : copyArr) {
			System.out.println("copy Arrary"+copyElemdArr);
		}

	}

}



