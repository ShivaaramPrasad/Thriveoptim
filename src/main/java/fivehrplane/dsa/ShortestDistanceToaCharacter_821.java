package fivehrplane.dsa;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class ShortestDistanceToaCharacter_821 {
	
	
	@Test
	public void test() {
		String inputStr = "lowercase";
		char c = 'e';
		int[] expectedDistancesFromChar = {3,2,1,0, 1,2,2,1,0};
		//getDistances(inputStr, c);
		Assert.assertEquals(expectedDistancesFromChar,shortestDist(inputStr, c));
	}

	/**
	 * 2pointer approach //String = loveleetcode c= e
	 * 
	 * - create an outputArray with length of string.
	 * 
	 * - initialise pointer p = length.
	 * 
	 * - loop over String  from i = 0
	 * 
	 * - check if char at index i is matching char c
	 *  
	 *  - if yes ->  set p with 0 add update outputArray with p=0
	 *  
	 *  - else add p++ to outputArray 
	 *  
	 *  - after above loop, set p = length.
	 *  
	 *  - loop over string from i = length till 0.
	 *  
	 *  - check if char at index i is matching char c
	 *  
	 *  - if yes -> set p with 0 add update outputArray with p=0
	 *  
	 *  - if not - > take min value btw value at i and p++
	 *  
	 *  - finally return outputArray
	 */
	
	private int[] shortestDist(String s, char c) {
		
		int[] output = new int[s.length()];
		
		int distance = s.length();
		
		for(int start = 0;start < s.length(); start++) {
			if(s.charAt(start) == c) {
				distance = 0;
			}
			output[start] = distance++;
		}
		
		 distance = s.length();
		 for(int last = s.length()-1; last >= 0; last--) {
			 if(s.charAt(last) == c) {
					distance = 0;
				}
			 output[last] = Math.min(output[last],  distance++);
		 }
		 
		 return output;
		
	}
	
	
}

