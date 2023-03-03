
package fivehrplane.dsa;

import org.junit.Test;

import org.junit.Assert;

public class NumberofGoodPairs_1512 {


	@Test
	public void test1() {
		int [] nums = {1,2,3,1,1,3};
		Assert.assertEquals(4,numIdenticalPairs(nums));

	}


    public int numIdenticalPairs(int[] nums) {
        
        int count=0;
        for(int i=0; i<nums.length-1; i++)
         for(int j=i+1; j<nums.length; j++){
            if(nums[i]==nums[j])
            count++;
        }
        return count;
    }

}