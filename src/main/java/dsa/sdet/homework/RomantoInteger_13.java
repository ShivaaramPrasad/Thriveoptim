package dsa.sdet.homework;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;



public class RomantoInteger_13 {
	/*
	 13. Roman to Integer
      https://leetcode.com/problems/roman-to-integer/
      Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
*/

/*
       IV = IIII
       IX = VIIII
       XL = XXXX
       XC = LXXXX
       CM = DCCCC
       
 */
	
	
	
	@Test
	public void test1() {
		String s = "III";
		int output= 3;
       Assert.assertEquals(output, romanToInt(s));
       System.out.println(romanToInt(s));
		
	}
	
	@Test
	public void test2() {
		
		String s = "LVIII";
		int output= 58;
       Assert.assertEquals(output, romanToInt(s));
       System.out.println(romanToInt(s));	
	}
	
	@Test
	public void test3() {
		
		String s = "MCMXCIV";
		int output= 1994;
       Assert.assertEquals(output, romanToInt(s));
       System.out.println(romanToInt(s));	
	}
	
	@Test
	public void test4() {
		
		String s = "MCDLXXVI";
		int output= 1476;
       Assert.assertEquals(output, romanToInt(s));
       System.out.println(romanToInt(s));	
	}
	
	/*
	  Approach 1
	   - Please replace the string  which Roman combination of 4, 9, 90, 900 for with help of other Roman character 
	   - Create a map with Character Integer as key value to add each roman character  and its value 
	   - Initialize result for adding the value 
	   - Fetch each Character by to charArray 
	   - get the value of each character and with the result 
	   - return the result	 
	 */
	private int romanToInt(String s) {
      
	
		 String replace = s.replace("IV","IIII").replace("IX","VIIII").replace("XL","XXXX")
				          .replace("XC","LXXXX").replace("CM", "DCCCC").replace("CD", "CCCC");
		HashMap<Character, Integer> romanmap= new HashMap<Character, Integer>(){ 
			{
				put('I',1);
				put('V',5);
				put('X',10);
				put('L',50);
				put('C',100);
				put('D',500);
				put('M',1000);
			}
		};
		
		int result=0;
		for (char ch : replace.toCharArray()) {
			result+=romanmap.get(ch);
		}
		return result;
	}
}
