package dsa.sdet.homework;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class MaxiumumNumberStream {
	@Test
	public void test1() {
		int [] nums= {3,5,1,13,11,8};
		Assert.assertEquals(13, maxnum(nums));
	}

	private int  maxnum(int[] nums) {

		int max1 = Arrays.stream(nums).max().getAsInt();

		return max1;
	}

	private int  maxnum2(int[] nums) {
		List<Integer> numbers= Arrays.asList(3,5,1,13,11,8);
		Integer max1= numbers.stream().max(Integer::compare).get();
		return max1;
	}
	
	private int  maxnum3(int[] nums) {
		int max=Arrays.stream(nums).reduce((a,b) -> (a > b ? a:b));
	//.ifPresent(max -> System.out.println(max));
	return max;
	}
	
}
