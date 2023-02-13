package dsa.interview.sdet;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class FizzBus {
	
	@Test
	public void test1() {
		int n= 3;
		String [] output = {"1","2","Fizz"};
		System.out.println(fizzbuz(n));
	}
	
	@Test
	public void test2() {
		int n= 3;
		String [] output = {"1","2","Fizz"};
		System.out.println(fizzbuz(n));
	}
	
	@Test
	public void test3() {
		int n= 30;
		String [] output = {"1","2","Fizz"};
		System.out.println(fizzbuz(n));
	}
	
	/*
	Declare list of string 
	itrate the input number till the end
	if number divisible by 3 and 5 print FizzBus
		else number divisible by 3  Fizz
	else  number divisible by 5 print Bus
      else print num
	 */

	private List<String> fizzbuz(int n) {
		 List<String> result = new ArrayList<String>();
	        for(int i = 1; i <= n; i++) {
	            if(i % 3 == 0 && i % 5 == 0) {
	                result.add("FizzBuzz");
	            } else if (i % 5 == 0) {
	                result.add("Buzz");
	            } else if (i % 3 == 0) {
	                result.add("Fizz");
	            } else {
	                result.add(String.valueOf(i));
	            }
	        }
	        return result;
	    }

}
