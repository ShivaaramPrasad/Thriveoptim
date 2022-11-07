package dsa.week4.day3;

import java.util.HashMap;
import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;

import org.junit.Test;

public class UniqueMorseCodeWords_804 {
	/*
	 804. Unique Morse Code Words
https://leetcode.com/problems/unique-morse-code-words/description/

International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows:

'a' maps to ".-",
'b' maps to "-...",
'c' maps to "-.-.", and so on.
For convenience, the full table for the 26 letters of the English alphabet is given below:

[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
Given an array of strings words where each word can be written as a concatenation of the Morse code of each letter.

For example, "cab" can be written as "-.-..--...", which is the concatenation of "-.-.", ".-", and "-...". We will call such a concatenation the transformation of a word.
Return the number of different transformations among all words we have.

 

Example 1:

Input: words = ["gin","zen","gig","msg"]
Output: 2
Explanation: The transformation of each word is:
"gin" -> "--...-."
"zen" -> "--...-."
"gig" -> "--...--."
"msg" -> "--...--."
There are 2 different transformations: "--...-." and "--...--.".
Example 2:

Input: words = ["a"]
Output: 1

	 */

	@Test
	public void test1() {
		String [] words = {"gin","zen","gig","msg"};
		int output=2;
		Assert.assertEquals(output, uniqueMorseRepresentations(words) );
	}

	private int uniqueMorseRepresentations(String[] words) {
		String[] alpha = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-.."
                ,"--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		HashSet<String> uiquecode = new HashSet<>();
        
        for (String word : words) {
        	
            StringBuilder newWord = new StringBuilder();
            
            for (char character : word.toCharArray()) 
                newWord.append(alpha[character - 'a']);
            
            uiquecode.add(newWord.toString());
        }
        return uiquecode.size();
    }

	

}
