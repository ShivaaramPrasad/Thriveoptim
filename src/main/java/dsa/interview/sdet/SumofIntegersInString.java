package dsa.interview.sdet;

import org.junit.Test;
import org.testng.Assert;

public class SumofIntegersInString {
	/*
	Given a String find the sum of all the integers in the string
	Eg: String str ="254abc568def7282";
	Output = 254+568+7282=8104
	*/
	
	@Test()
	public void test1(){
		String s="254abc568def7282";
		 int output=8104;
     Assert.assertEquals(output, sumofIntegersInString(s));
}
	
	
	@Test()
	public void test2(){
		String s="2w";
		 int output=2;
     Assert.assertEquals(output, sumofIntegersInString(s));
}
	
	@Test()
	public void test3(){
		String s="A";
		 int output=0;
     Assert.assertEquals(output, sumofIntegersInString(s));
}
	
/*Approch
 * Split using string using regx or //D 
 * convert int array num
 * add the number in the array and return as int 
 * 
 */
	private int sumofIntegersInString(String s) {
		int sum = 0;

		for(int i = 0; i < s.length(); i++) {
		    if(Character.isDigit(s.charAt(i))) {
		        sum = sum + Integer.parseInt(s.charAt(i) + "");
		    } 
		}

		System.out.println(sum);
		return sum;
	}
}
