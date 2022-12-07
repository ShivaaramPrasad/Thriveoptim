package dsa.interview.dpworld;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;;

public class MissingNumber {

	/*[1,2,5,3,5]
	 - No negative number 
	 - missing number will be replced by duplicate number 
	 - 
	 Approch 1
	  - Sort the Array
	   - Iterate the array if array of elemnet is not equal count
	   return the number*/
	@Test
	public void test1() {
		int[] nums= {1,2,5,3,0};
		Assert.assertEquals(4, missingNumberSecon(nums));
	}
	//O(Nlogn)+O(N);
	public int missingNumber (int[] nums) {
		Arrays.sort(nums);
		int count=1;
		for(int i=0; i<nums.length; i++) {
			if(nums[i]==count) count++;
			else return count;
		}
		return -1;
	}
	
	public int missingNumberSecon (int[] nums) {
		int sum=0;
		int n=nums.length;
		for(int i=0; i<nums.length; i++) {
            sum+=nums[i];
		}
		return (n*(n+1)/2)-sum;
	}
}

