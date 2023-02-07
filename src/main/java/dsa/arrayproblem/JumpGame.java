package dsa.arrayproblem;

import org.junit.Assert;
import org.junit.Test;

public class JumpGame {
	
	@Test
	public void test1() {
		int [] nums   = {2,3,1,1,4};
		Assert.assertEquals(true, canJump(nums));
	}

	@Test
	public void test2() {
		int [] nums  = {3,2,1,0,4};
		Assert.assertEquals(false, canJump(nums));
	
	}

	private boolean canJump(int[] nums) {
		int reach=0;
		
		for(int i=0; i<nums.length;i++)
		{
			if(reach<i)
				return false;
			reach= Math.max(reach,i+nums[i]);
		}
		return true;
	}

}
