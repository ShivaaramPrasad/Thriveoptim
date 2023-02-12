package dsa.interview.sdet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class ContainsDuplicate_219 {

	@Test
	public void example1() {
		int[] nums = {1,2,3,1};
		int k=3;

		Assert.assertEquals(true ,containsDuplicate(nums, k));

	}

	private boolean containsDuplicate(int[] nums, int k) {

	        Set<Integer> set = new HashSet<>();
	        for (int i = 0; i < nums.length; i++) {
	            if (set.contains(nums[i]))
	                return true;
	            if (i >= k)
	            	set.remove(nums[i - k]);
	            set.add(nums[i]);
	        }
	        return false;
	    }
	
public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        Map<Integer,Integer> map = new HashMap<>();
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
