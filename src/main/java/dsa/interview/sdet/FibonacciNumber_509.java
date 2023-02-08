package dsa.interview.sdet;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciNumber_509 {

	@Test
	public void  test1() {
		int n= 2;
		Assert.assertEquals(1, fib(n)  );
		System.out.println(fib(n));
	}
	
	@Test
	public void  test2() {
		int n= 3;
		Assert.assertEquals(2, fib(n)  );
		System.out.println(fib(n));
	}
	
	@Test
	public void  test3() {
		int n= 4;
		Assert.assertEquals(3, fib(n)  );
		System.out.println(fib(n));
	}

	private int  fib(int n) {
		if(n<=1) return n;
		return fib(n-1) +fib(n-2);
	}
	
}
