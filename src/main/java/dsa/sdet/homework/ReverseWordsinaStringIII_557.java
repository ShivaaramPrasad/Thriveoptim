package dsa.sdet.homework;

import org.junit.Assert;
import org.junit.Test;

public class ReverseWordsinaStringIII_557 {
	/*	
	Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.



	Example 1:

	Input: s = "Let's take LeetCode contest"
	Output: "s'teL ekat edoCteeL tsetnoc"
	Example 2:

	Input: s = "God Ding"
	Output: "doG gniD"

	 */

	@Test
	public void testCase1() {
		String s="Let's take LeetCode contest";
		Assert.assertEquals("s'teL ekat edoCteeL tsetnoc",reverseWords2(s));
	}


	@Test
	public void testCase2() {
		String s="God Ding";
		Assert.assertEquals("doG gniD",reverseWords2(s));
	}


	 // Approach:
    // Split the string into String array 'words'.
    // Then use a StringBuilder to reverse each words within the 'words' array.
    // Note: This approach uses more time and memory than the two pointers, due to the use of StringBuilder.

    public String reverseWords(String s) {
        // Split the String 's' using regex " ".
        String[] words = s.split(" ");

        // Reverse each word in the 'words' array.
        for (int i = 0; i < words.length; i++) {
            words[i] = new StringBuilder(words[i]).reverse().toString();
        }
        // Build a new String using the " " delimiter and return result.
        return String.join(" ", words);
    }
    
    public String reverseWords2(String s) {
        int start =0;
        char[] arr=s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
			if(arr[i]== ' ') {
				reserve(start,i-1,arr);
				start=i+1;
			}
			else if(i==arr.length-1) 
				reserve(start,i,arr);
		}
		return new String(arr);
    }


	private void reserve(int start, int end, char[] arr) {

		while(start<end) {
			char temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
}	