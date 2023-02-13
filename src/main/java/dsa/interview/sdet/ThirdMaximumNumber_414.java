package dsa.interview.sdet;

import org.junit.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import org.junit.Assert;

public class ThirdMaximumNumber_414 {
	
	@Test
	public void test1() {
		int [] nums = {3,2,1};
		int output=1;
		Assert.assertEquals(output, thirdMax(nums));

	}
	
	@Test
	public void test2() {
		int [] nums = {2,3,2,1};
		int output=1;
		Assert.assertEquals(output, thirdMax(nums));

	}

	public int thirdMax(int[] nums) {
		 Set<Integer> hashSet = new HashSet<>();
	        for (int num : nums) {
	            hashSet.add(num);
	        }
	        if (hashSet.size() >= 3) {
	            hashSet.remove(Collections.max(hashSet));
	            hashSet.remove(Collections.max(hashSet));
	        }
	        return Collections.max(hashSet);
	    }
}
