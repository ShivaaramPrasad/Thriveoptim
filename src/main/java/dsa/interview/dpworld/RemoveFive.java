package dsa.interview.dpworld;

import org.junit.Assert;
import org.junit.Test;

public class RemoveFive {

	/*
 int number=15958; n=5, remove one 5 to get max number
1958
1598

Approach 
Convert int to String
iterate the String 
if char to 5
consider the substring from 0 to i  and i+1
convert the string to num
Assign the num to max 
return max 
	 */
	@Test()
	public void Test1(){
		int n=15958;
		int k=5;
		removeDigit(n,k);
		Assert.assertEquals(1958,removeDigit(n,k));
	}
	public int removeDigit(int n, int k) {
		int max=0;
		String s=Integer.toString(n);
		for(int i=0; i<s.length(); i++ ) {
			if(s.charAt(i)=='5') {
				String temp = s.substring(0,i)+s.substring(i+1);
				int newNum = Integer.parseInt(temp);
				max = Math.max(max, newNum);
			}
		}
		return max;
	}

}
