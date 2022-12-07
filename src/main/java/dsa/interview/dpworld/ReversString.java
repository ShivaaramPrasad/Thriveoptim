package dsa.interview.dpworld;

import org.junit.Assert;
import org.junit.Test;

public class ReversString {

	/*String s="today is a beautiful day";
	day beautiful a is today*/
	
	/*
	 Approach
	 - Split the string in to array of strings
	 - Iterate the the string form left to right 
	 - Swap the splited words 
	 - COnvert the array in to string 
	 */
	@Test
	public void test() {
		String s="today is a beautiful day";
		String out= "day beautiful a is today";
		/*
		 *  Today is day
		 *  yad si yadoT
		 *  day is Today
		 */
	    Assert.assertEquals(out, reversWords(s));
		System.out.println(reversWords(s));
	}
	
	public String reversWords(String s) {
		String[] ch = s.split(" ");
		int left =0, right=ch.length-1;
		while(left<right) {
			String temp = ch[right];
			ch[right--]=ch[left];
			ch[left++]=temp;
		}
		  return String.join(" ", ch);
		
	}
	
}
