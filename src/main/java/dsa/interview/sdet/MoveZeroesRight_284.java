package dsa.interview.sdet;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.management.RuntimeErrorException;

import org.junit.Assert;
import org.junit.Test;

public class MoveZeroesRight_284 {

	@Test
	public void example1() {
		int[] nums = {4,0,2,0,0,1};
		int[] out = {4,2,1,0,0,0};
		Assert.assertArrayEquals(out ,moveZeroesRight2pointer(nums));
	}


	private int[] moveZeroesRight2pointer(int[] nums) {
		int left = 0, right = 0;
		while(right < nums.length) {
			if(nums[right] != 0 ) {
				int temp = nums[right];
				nums[right] = nums[left];
				nums[left++] = temp;
			}
			right++;
		}
		System.out.println(Arrays.toString(nums));	
		return nums;
	}
}

