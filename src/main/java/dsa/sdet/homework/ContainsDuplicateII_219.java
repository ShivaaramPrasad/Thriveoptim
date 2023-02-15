package dsa.sdet.homework;

import java.util.HashMap;
import java.util.HashSet;

import org.junit.Test;

import org.junit.*;

public class ContainsDuplicateII_219 {

	@Test
	public void test1() {
		int [] nums = {1,2,3,1};
		int k = 3;
		Assert.assertEquals(true, containsNearbyDuplicate(nums, k));
	}

	@Test
	public void test2() {

		int [] nums = {1,0,1,1};
		int k = 1;
		Assert.assertEquals(true, containsNearbyDuplicate(nums, k));
	}

	@Test
	public void test3() {

		int [] nums = {1,2,3,1,2,3};
		int k = 2;
		Assert.assertEquals(false, containsNearbyDuplicate(nums, k));
	}

	private boolean containsNearbyDuplicate(int[] nums, int k) {

		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i< nums.length; i++){
			int temp = nums[i];
			if(map.containsKey(temp)){
				if(i - map.get(temp) <= k) return true;
			}
			map.put(temp, i);
		}
		return false;
	}
}
