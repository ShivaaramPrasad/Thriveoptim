package dsa.interview.dpworld;

import org.junit.Test;

import junit.framework.Assert;

public class FindSecondMax {
	
	/*[5,3,2,4,1,8]
	 Find Second Max */
	@Test
	public void test1() {
		int[] a= {5,3,2,4,1,8};
		System.out.println(findsecondMax(a));
		Assert.assertEquals(5, findsecondMax(a));
	}
   public int findsecondMax(int[] a) {
		int firstMax = Math.max(a[0], a[1]);
		int secondMax = Math.min(a[0], a[1]);
		for(int i=2; i<a.length; i++) {
			if(firstMax<a[i]) {
			  secondMax=firstMax;
			  firstMax= a[i];
			}else if(secondMax<a[i]&&firstMax>a[i]) {
				secondMax=a[i];
			}
		}
		return secondMax;
	}

}
