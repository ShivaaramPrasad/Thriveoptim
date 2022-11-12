package dsa.week4.day10;

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
		int output= 1476
;
       Assert.assertEquals(output, romanToInt2(s));
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
       -- Time - O(n)
       -- Space - o(n)
	 
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
	
	

    /**
     * - create a hashmap with romanNum and its equivalent number as key value pair.
     * - initialize 2 int variables : result = 0; and previous = 1.
     * - start iterating given String from length -1 to 0.
     * - check if charAt currIndex >= previous
     *      if yes, add map.get(charAt(currIndx)) to result.
     *      else, remove map.get(charAt(currIndx)) from result.
     *  - assign charAt currIndx to previous to continue loop.
     *  - finally return result.
     */

 //MCMXCIV
    private int romanToInt2(String roman){
        HashMap<Character, Integer> map = new HashMap<Character, Integer>(){
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
        int result = 0;
        int prev = 1;
        for(int i = roman.length()-1; i >= 0; i--){
            if(map.get(roman.charAt(i)) >= prev) result += map.get(roman.charAt(i)); //5 104 1094 1894
            else result -= map.get(roman.charAt(i));   // 4  94  994 894
            prev = map.get(roman.charAt(i)); // 5 104 94 1094 994 894
        }
        return result;
    }

}
