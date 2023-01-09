package dsa.hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class RemoveDuplicate {
	
	@Test()
	public void test1()
	{
		int [] nums= {1,2,3,4,1,2,3,2,1};
		int []out= {4};
		//Assert.assertEquals(out,removeDuplicate(nums));
		removeDuplicate(nums);
		}

	private void removeDuplicate(int[] nums) {
        HashSet<Integer> ans = new HashSet<Integer>();
        List<Integer> check= new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if(!check.contains(nums[i])&& !ans.contains(nums[i]) )
			{
				check.add(nums[i]);
				ans.add(nums[i]);
			}
			else {
				ans.remove(nums[i]);

			}
		}
		System.out.println(ans);
	}
	}


