package dsa.week2;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class Assment {
	
	/*
	Given a string s and a number k, find the maximum number of vowels in substring of size k.
	String: "workaattech"
	k: 3
*/ 
/*
 * Approch one 
 * declare a list of an Arraya list with vowel
 * covert String to an array
 * initialse the count 0
 * itrate the given sting
 * When string of arry macthis the vowel increment the count
 * return the count
 * 
 * 
 */
	@Test 
	public void example1(){
		String s = "workaattech";
		int Output= 4;  

		Assert.assertEquals(maximuNumberVowelsinSubstring(s),Output);

	}	
private int maximuNumberVowelsinSubstring(String s){
		
		char[] ch =s.toCharArray();
		List<Character> vowels=Arrays.asList('a','e','i','o','u');
          int count=0;

		 for(int i=0; i< ch.length-1; i++)
	        {
	            if(vowels.contains(ch[i]))
	            {
	             count++;
	            }
	        }
		return count;
	    }

/*
 * Approch two 
 * 
 * 
 * 
 */
private int maximuNumberVowelsinSubstring2pointer(String s, int k){
	
	char[] ch =s.toCharArray();
	List<Character> vowels=Arrays.asList('a','e','i','o','u');
	 int start = 0;
     int minDiff = Integer.MAX_VALUE;
	for (int i = 0; i < ch.length; i++) {
		
	}
	
for (int i = k; i < ch.length; i++) {
		
	}
return minDiff;
}
}