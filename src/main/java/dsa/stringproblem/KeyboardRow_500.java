package dsa.stringproblem;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

public class KeyboardRow_500 {

	/*
	 500. Keyboard Row
Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below.

In the American keyboard:

the first row consists of the characters "qwertyuiop",
the second row consists of the characters "asdfghjkl", and
the third row consists of the characters "zxcvbnm".
Example 1:

Input: words = ["Hello","Alaska","Dad","Peace"]
Output: ["Alaska","Dad"]
Example 2:

Input: words = ["omk"]
Output: []
Example 3:

Input: words = ["adsdf","sfd"]
Output: ["adsdf","sfd"]

	 */

	@Test
	public void Test1() {

		String[] words= {"Hello","Alaska","Dad","Peace"};
		String [] output= {"Alaska","Dad"};
		Assert.assertEquals(output, findWords(words));
	}

	@Test
	public void Test2() {

		String[] words= {"omk"};
		String [] output= {};
		Assert.assertEquals(output, findWords(words));
	}


	@Test
	public void Test3() {

		String[] words= {"adsdf","sfd"};
		String [] output= {"adsdf","sfd"};
		Assert.assertEquals(output, findWords(words));
	}

	/*
	 * Approch 1 
	 * Declare the patterns of American keyboard using patter1 =qwertyuiop , patter2 =asdfghjkl , patter3= zxcvbnm
	 * Declare an output String of Arry List 
	 * Iterate words  in which each word has to be converted in to charArray
	 * Declare count for the pattern 
	 * if Pattern contains the Charecter increment the count 
	 * Condition eachword length has to match the pattern 
	 * add into output and convert to an array 
	 * 
	 */

	private String[] findWords(String[] words) {

        String patter1 = "qwertyuiop", patter2 = "asdfghjkl", patter3 = "zxcvbnm";

        List<String> output = new ArrayList<>();
        for (String eachWord : words) {
            char[] charArray = eachWord.toLowerCase().toCharArray();
            int patter1Count = 0;
            int patter2Count = 0;
            int patter3Count = 0;
            for (char c : charArray) {
                if(patter1.contains(c+"")) patter1Count++;
                if(patter2.contains(c+"")) patter2Count++;
                if(patter3.contains(c+"")) patter3Count++;

            }
            if(eachWord.length() == patter1Count || eachWord.length() == patter2Count || eachWord.length() == patter3Count)
                output.add(eachWord);
        }


        return output.toArray(new String[output.size()]);
    }
}
