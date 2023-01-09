package dsa.interview.sdet;

import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;

public class FindFirstDuplicate {

	/* int=[1,2,3,4,4,5,6,6]
	 */

	/*
	  Approch 1
	  - Declare a set 
	  - itrate the array if first value is matched with other values 
	  - add in the set and return the first value 
	  - if there is no duplicates 
	 */

	@Test()
	public void test1() {
		int [] nums = {1,2,3,4,4,5,6,6};
		Assert.assertEquals(4, findFirstDuplicate2(nums));
	}
	
	@Test()
	public void test2() {
		int [] nums = {1,2,3,4,5,6};
		Assert.assertEquals(-1, findFirstDuplicate2(nums));
	}
	@Test()
	public void test3() {
		int [] nums = {1,1,2,2,3,3,4,4,5,5};
		Assert.assertEquals(-1, findFirstDuplicate2(nums));
	}
	private int findFirstDuplicate(int[] nums) {
		HashSet set = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			boolean match = set.add(nums[i]);
			if(match==false) {
				return nums[i];
			} 
		} 
		return -1;
	}
	
	private int findFirstDuplicate2(int[] nums) {
		HashSet set = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			if(!set.add(nums[i])) {
				return nums[i];
			} 
		} 
		return -1;
	}
}
