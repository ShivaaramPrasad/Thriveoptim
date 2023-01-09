package dsa.hackathon.day2;

import org.junit.Test;

import java.util.HashMap;

import org.junit.Assert;

public class ContainsDuplicate_II_219{
	
	@Test
	public void test1() {
		int[] nums  = {1,2,3,1};
		int	k= 3;
		Assert.assertEquals(true, containsNearbyDuplicate(nums, k));
	}
	
	@Test
	public void test2() {
		int[] nums  = {1,0,1,1};
		int	k= 1;
		Assert.assertEquals(true, containsNearbyDuplicate(nums, k));
	}
	
	@Test
	public void test3() {
		int[] nums  = {1,2,3,1,2,3};
		int	k= 2;
		Assert.assertEquals(false, containsNearbyDuplicate(nums, k));
	}

	
	
	/*
	 
	  
	 */
	
	private boolean containsNearbyDuplicate(int[] nums, int k) {
		int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
         for (int i = 0; i < nums.length; i++) {
			int current =nums[i];
			if(map.containsKey(current)&& i-map.get(current)<=k) {
				return true;
			}else {
				map.put(current,i);
			}
		}
		return false;    
         
	}

}
