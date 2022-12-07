package dsa.interview.dpworld;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.tools.ant.types.resources.comparators.Reverse;
import org.junit.Assert;
import org.junit.Test;

public class ConvertNumToArray {

	/*

	 convert number into array n=85, output[8,5] 
	     n=-45 [-4,-5] or [-4, 5] or [4,-5]

		1 [85] = [8,5]

		2 [-45]= [-4, 5]

		3 [0]= [0,0]

	  - Contarain 1 : Negative number are allowed 
		Approach 1 
		- Create a temp value
		- check the n value if its equal to 0 = return new array of [0] 
		- if greater or lesser than 0 
		- Divide the n value by 10 
		- Assign the reminder to temp value 
		- return the value to an array

	 */
	@Test
	public void test1() {
		int n=85;  int[] nums = {8,5};
		System.out.println(Arrays.toString(numstoArray2(n)));
		Assert.assertEquals(nums, numstoArray2(n));

	}
	@Test
	public void test2() {
		int n=-45;  int [] nums = {-4,5};
		System.out.println(Arrays.toString(numstoArray2(n)));
		Assert.assertEquals(nums, numstoArray2(n));

	}
	@Test
	public void test4() {
		int n=0; int [] nums = {0};
		System.out.println(Arrays.toString(numstoArray2(n)));
		Assert.assertEquals(nums, numstoArray2(n));

	}

	private Integer[] numstoArray(int n) {
		int temp=0;
		int size=Integer.toString(n).length();
		boolean negaitve= false;

		List<Integer> listnum= new ArrayList<Integer>();
		if(n<0) {
			negaitve= true;
			n=n*-1;
		}
		for(int i=0; i<size;i++)
		{
			temp= n%10;
			n/=10;
			listnum.add(temp);
		}
		return listnum.toArray(new Integer[listnum.size()]);
	}

	private int[] numstoArray2(int n) {
		int temp=0; boolean negaitve= false;
		if(n<0) {
			n=n*-1;
			negaitve= true;
		}
		int size=Integer.toString(n).length();
		int[] output = new int[size];
		for(int i=0; i<size;i++)
		{ 
			temp= n%10;
			n/=10;
			output[size-i-1]= temp;
			if( negaitve== true) {
				output[0]=output[0]*-1;
			}
		}  
		//return Arrays.toString(output);
		return output;

	}


}