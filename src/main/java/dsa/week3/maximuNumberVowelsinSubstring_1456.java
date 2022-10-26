package dsa.week3;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class maximuNumberVowelsinSubstring_1456 {

	/*
	1456. Maximum Number of Vowels in a Substring of Given Length
    https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/
    
	Given a string s and a number k, find the maximum number of vowels in substring of size k.
	String: "workaattech"
	k: 3
	 */ 
	
	@Test 
	public void example1(){
		String s = "workaattech";
		int k =3;
		int Output= 2;  

		Assert.assertEquals(maximuNumberVowelsinSubstring(s,k ),Output);

	}	
	
	@Test 
	public void example2(){
		String s = "abciiidef";
		int k =3;
		int Output= 3;  

		Assert.assertEquals(maximuNumberVowelsinSubstring(s,k ),Output);

	}	
	
	@Test 
	public void example3(){
		String s = "aeiou";
		int k =2;
		int Output= 2;  

		Assert.assertEquals(maximuNumberVowelsinSubstring(s,k ),Output);

	}	
	

	//Brute Force 
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
 * Approch one 
 * declare a list of an Array list with vowel
 * initialse the count 0
 * itrate 0 to K 
 * if string matches the vowel increment the count
 *Store it in the maxvowels
 * itrate k to lenght
 * if string matches the vowel increment the count for i
 * if string not matches the vowel decrement the count for i-k
 * return the max vowel count
 */
	private int maximuNumberVowelsinSubstring(String s, int k){

		List<Character> isVowel=Arrays.asList('a','e','i','o','u');
		int count =0;;
		for (int i = 0; i < k; i++) {
			if(isVowel.contains(s.charAt(i))) count++;

		}			int maxVowels=count;

		for (int i = k; i < s.length(); i++) {
			if(isVowel.contains(s.charAt(i))) count++;
			if(isVowel.contains(s.charAt(i-k))) count--;
			maxVowels=Math.max(maxVowels, count);
		}
		return maxVowels;
	}
	/*
	 * Approch two 
	 * declare a method character vowels 
	 * initialse the count 0
	 * itrate 0 to K 
	 * if string matches the vowel increment the count
	 *Store it in the maxvowels
	 * itrate k to lenght
	 * if string matches the vowel increment the count for i
	 * if string not matches the vowel decrement the count for i-k
	 * return the max vowel count
	 */
	
	public int maxVowels(String s, int k) {
		int count = 0;
		for(int i =0; i< k; i++)
			if(isVowel(s.charAt(i))) count++;
		int max = count;
		for(int i = k; i < s.length(); i++){
			if(isVowel(s.charAt(i))) count++;
			if(isVowel(s.charAt(i-k))) count--;
			max = Math.max(max, count);
		}
		return max;
	}
	private boolean isVowel(char c){
		if((c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) return true;
		return false;
	}

	
}