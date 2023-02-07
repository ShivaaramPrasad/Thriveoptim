package dsa.arrayproblem;

import org.junit.Assert;
import org.junit.Test;

public class GasStation_134 {

	@Test
	public void test1() {
		int [] gas  = {1,2,3,4,5};
		int [] cost   = {3,4,5,1,2};
		Assert.assertEquals(3, canCompleteCircuit(gas,  cost));
	}

	@Test
	public void test2() {
		int [] gas  = {2,3,4};
		int [] cost   = {3,4,3};
		Assert.assertEquals(-1, canCompleteCircuit(gas,  cost));
	
	}
    // O(N) for Time complexity 
    // O(1) for Time complexity 

	private int canCompleteCircuit(int[] gas, int[] cost) {
		int postion =0, sum =0 , total =0;
		for (int i = 0; i < gas.length; i++) {
		//	sum of the value gas - cost
			sum  = sum+ gas[i]- cost[i];
			// if sum is lesser than 0
			if(sum<0) {
				
				total+=sum;
				//reset the sum and push the position 
				sum=0;
				postion=i+1;
			}
		}
		//add sum to total 
		total= total+sum;	
		// total is greater the return  position  -1;
		return total>=0?postion:-1;
	}


}
