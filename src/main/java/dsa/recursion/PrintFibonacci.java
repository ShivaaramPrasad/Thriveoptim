package dsa.recursion;

import org.junit.Assert;
import org.junit.Test;

public class PrintFibonacci {
/*
	@Test
	public void test(){
		int n = 4;
		printFib(n);
		//Assert.assertEquals(3, recFib(n));
	}

	@Test
	public void test1(){
		int n = 5;
		printFib(n);
		//Assert.assertEquals(5, recFib(n));
	}
*/
	@Test
	public void test3(){ //0 1 1 2 3 5 8 13
		int n = 8;//0 1 1 2 3 5 8 13
		printFib(n);
		//Assert.assertEquals(21, recFib(n));
	}

	private void printFib(int n) {

		for(int i = 0; i < n; i++){
			System.out.println(recFib(i)+" ");
		}
	}

	private int recFib(int n) {
		if(n == 0) return 0;
		if( n == 1 || n == 2) return 1;
		return recFib(n-1)+ recFib(n-2);
	}
}