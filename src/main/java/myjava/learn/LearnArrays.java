package myjava.learn;

import java.util.Arrays;
import java.util.List;

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
		
		// Arrays.toString() Covert array in to String    
		//Returns a string representation of the contents of the specified array
		Arrays.toString(courses);
		//Print to String Array
		System.out.println("courses arry to string"+Arrays.toString(courses));
		// to Sort and Array
		int [] nums= {1,6,7,9,12,8,3,2};
		
		//The sorting algorithm is a Dual-Pivot Quicksort

		Arrays.sort(nums);
	
		System.out.println("Normal sort"+Arrays.toString(nums));
		
        int arr[] = { 12, 13, 14, 15, 16, 17, 18 };
        
        //Arrays.copyOfRange(arr, val1, val2) Copies the specified range of the specified array into a new array.
        int[] copyArr = Arrays.copyOfRange(arr, 4, arr.length + 3);
        
        for (int copyElemdArr : copyArr) {
			System.out.println("copy Of Range "+copyElemdArr);
		}
        
        //Arrays.copyOfRange(arr, val1, val2)
        //Copies the specified array, truncating or padding with null characters (if necessary)
        //so the copy has the specified length
        int[] copyArrOf = Arrays.copyOf(arr, 10);;
        copyArrOf[3] = 11;
        copyArrOf[4] = 55;
        System.out.println("copy Of"+Arrays.toString(copyArrOf));
        Integer a[] = new Integer[] { 10, 20, 30, 40 };
        
        // Arrays.asList() --> Returns a fixed-size list backed by the specified array
        List<Integer> list = Arrays.asList(a);
        System.out.println("The list is: " + list);

       
       // deepToString(Object[] arr)
       //Returns a string representation of the "deep contents" of the specified array.
        
              int[][] images = {{1,1,0},{1,0,1},{0,0,0}};
       System.out.println(Arrays.deepToString(images));   
       System.out.println(Arrays.deepToString(images));       
       int []  arr1 = {10, 20, 30, 40};
       //System.out.println(Arrays.deepToString(arr1));
         
       //Searches the specified array of ints for the specified value using the
       // binary search algorithm . 
        int binarySearch = Arrays.binarySearch(arr1, 30);
        System.out.println(binarySearch);
        
        
        int ar[] = {2, 2, 1, 8, 3, 2, 2, 4, 2};
        
        // To fill complete array with a particular
        // value
        Arrays.fill(ar, 10);
        System.out.println("Array completely filled" +
                " with 10\n" + Arrays.toString(ar));

        Arrays.fill(ar, 1, 5, 10);
        
        System.out.println(Arrays.toString(ar));
        //[2, 10, 10, 10, 10, 2, 2, 2, 2]

       
	}

}



