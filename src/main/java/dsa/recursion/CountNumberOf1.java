package dsa.recursion;

import org.junit.Test;

import org.junit.Assert;

public class CountNumberOf1 {
	
	@Test
	public void Test1() {
		int nums=1011001111;
    Assert.assertEquals(7, recursion2(nums));
	}
	
	@Test
	public void Test2() {
		int nums=00;
    Assert.assertEquals(0, recursion(nums));
	}

	public int recursion(int nums) {
		if (nums == 0)
			return 0;
		return (nums % 10) + recursion(nums / 10);		
	}

	public int recursion2(int nums) {
		if (nums == 0)
			return 0;
		System.out.println(recursion(nums / 10));
		return (nums % 10) + recursion(nums / 10);		
	}
}
