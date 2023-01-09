package dsa.hackathon.day1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicate_26 {

	@Test
	public void test1()
	{
		int [] nums = {1,1,2};

		Assert.assertEquals(2, removeDuplicateSlove2(nums));
	}

	@Test
	public void test2()
	{
		int [] nums = {1,1,2};

		removeDuplicateSlove2(nums);	
		}
	/*
	 Approach
	 Initialize the count =1;
	 iterate the nums  by i =1 
	 Storing the unique element at count of nums and incrementing the count by 1
	 */

	private int removeDuplicateSlove(int[] nums) {
		int count = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i - 1] != nums[i]){
				nums[count] = nums[i];
				count++;
			}
		}
		return count;

	}

	private int removeDuplicateSlove2(int[] nums) {
		HashSet<Integer> numSet = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			numSet.add(nums[i]);
		}
		int count=numSet.size();
	  return count;
	}
}
