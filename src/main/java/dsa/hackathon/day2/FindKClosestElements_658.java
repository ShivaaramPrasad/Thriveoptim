package dsa.hackathon.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class FindKClosestElements_658 {
	
	@Test
	public void test1() {
		int [] nums = {1,2,3,4,5}; int k = 4; int x = 3;
		Integer []	output = {1,2,3,4};
		List<Integer> asList=Arrays.asList(output);
		Assert.assertEquals(asList, findClosestElements(nums, k, x));

	}
	
	@Test
	public void test2() {
		int [] nums = {1,2,3,4,5}; int k = 4; int x = -1;
		Integer []	output = {1,2,3,4};
		List<Integer> asList=Arrays.asList(output);
		Assert.assertEquals(asList, findClosestElements(nums, k, x));
	}

	private List<Integer> findClosestElements(int[] nums, int k, int x) {
		int start=0; int end =nums.length-k;
		
		while(start<start) {
			int mid = (start+end)/2;
			if(x-nums[mid]>nums[mid+k]-x) {
				end=mid+1;
			}else {
				end=mid;
			}
		}
		List<Integer> result = new ArrayList<Integer>();
		for (int i = start; i < start+k; i++) {
			result.add(nums[i]);
		}
		return result;
	}
}
