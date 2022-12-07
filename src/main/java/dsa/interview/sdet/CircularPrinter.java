package dsa.interview.sdet;

import org.junit.Test;

import org.junit.Assert;

public class CircularPrinter {

	/*
	https://leetcode.com/discuss/interview-question/1263982/thomson-reuters-oa-circular-printer
	 */
	@Test()
	public void test1() {
		String s="BZA";
		int out=4;
		System.out.println(findDistance(s));

		Assert.assertEquals(out, findDistance(s));
	}

	@Test()
	public void test2() {
		String s="AZGB";
		int out=13;
		System.out.println(findDistance(s));
		Assert.assertEquals(out, findDistance(s));
	}
//GAB
	public int findDistance(String s) {
		int sum=0;
		for(int i=0; i<s.length()-1; i++) {
			if(i==0){
				//forwardValue  and reversValue calculating
				sum+=Math.min(s.charAt(0)-'A', 26-(s.charAt(0)-'A')); 
			}
			int diff= Math.abs(s.charAt(i)-s.charAt(i+1));
			sum+= Math.min(diff, 26-diff);
		}
		return sum;
	}

}
