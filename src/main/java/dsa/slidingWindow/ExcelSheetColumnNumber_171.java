package dsa.slidingWindow;

import org.junit.Test;

import org.junit.Assert;

public class ExcelSheetColumnNumber_171 {

	@Test
	public void test1() {

		String columnTitle = "A";
		Assert.assertEquals(1, titleToNumber(columnTitle));
	}

	@Test
	public void test2() {

		String columnTitle = "AB";
		Assert.assertEquals(28, titleToNumber(columnTitle));
	}

	@Test
	public void test3() {

		String columnTitle = "ZY";
		Assert.assertEquals(701, titleToNumber(columnTitle));
	}

	/*
    consider int output =0;
    find the lenght of the column
    intiate the for loop
   output = output * 26 + the charecter of i - and minze Ascii value 'A' + 1

    Time Complexity = O(N);
     Space Complexity=O(N);
	 */

	private int  titleToNumber(String s) {
		int output=0;
		for(int i=0; i<= s.length()-1; i++){
			output=  output*26+ (s.charAt(i)-'A'+1);
		}
		return output;
	}

}
