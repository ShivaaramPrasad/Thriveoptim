package dsa.interview.sdet;

import org.junit.Assert;
import org.junit.Test;

public class FindNumberOfOnes {

	/*n=1010,  find number of ones 
	 * 
	Approach 
	Convert the Number in the String 
	 Itrate the  string when Char of string is equal to char of 1 Increment the count 
	 *
	 */

	@Test
	public void  test1() {
		int n= 1010;
		Assert.assertEquals(2, findNumberOne(n) );
		System.out.println(findNumberThree(n));
	}
	/*	
	@Test
	public void  test2() {
		int n= 000;
		//Assert.assertEquals(0, findNumberOne(n) );
		//System.out.println(findNumberAscii(n));
	}

	@Test
	public void  test3() {
		int n= 111;
		//Assert.assertEquals(3, findNumberOne(n) );
		//System.out.println(findNumberAscii(n));
	}

	@Test
	public void  test4() {
		int n= -111;
		Assert.assertEquals(3, findNumberOne(n) );
		//System.out.println(findNumberAscii(n));
	}
	 */
	private int  findNumberOne(int n) {
		String ntext = String.valueOf(n);
		int count=0;
		for (int i = 0; i < ntext.length(); i++) {
			if(ntext.charAt(i)=='1') {
				count++;
			}
		}
		return count;
	}

	private int  findNumberAscii(int n) {
		String ntext = String.valueOf(n);
		int count= 0;
		for (int i = 0; i < ntext.length(); i++) {
			if(ntext.charAt(i)-'1'== 0) {
				count++;
			}
		}
		return count;
	}

	private int  findNumberThree(int n) {
		int count= 0;
		int remin=0;
		int ques=0;
		while(n>0){
			remin = n%10;
			n=n/10;
			if(remin==1) {
				count++;  
			}
		}
		return count;
	}
}
