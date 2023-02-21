package dsa.sdet.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class ThreeSum_15 {

	@Test
	public void example1() { //{{-1,-1,2}, {-1,0,1}}
		int[] nums = {-1,0,1,2,-1,-4};
		System.out.println(threeSum(nums));
	}

	@Test
	public void example2() { //{{-5,0,5}}
		int[] nums = {-5,0,5};
		System.out.println(threeSum(nums));
	}

	@Test
	public void example3() { //{{}}
		int[] nums = {-5,0,-5};
		System.out.println(threeSum(nums));
	}

	@Test
	public void example4() { //{{-1,-1,2}}
		int[] nums = {-1,-1,-1,-1,2};
		System.out.println(threeSum(nums));
	}
	/*
     Approch 

declare a list of list output 
itrate the nums from left to end by three for loop 
add 3 elements which is equal to 0
when its equal to 0 move the list 

	 */

	private List<List<Integer>>  threeSum(int[] nums) {
		Set<List<Integer>> output = new HashSet();
		for(int i=0; i<nums.length-2;i++){
			for(int j=i+1; j<nums.length-1;j++){
				for(int k=j+1; k<nums.length;k++){
					if(nums[i]+nums[j]+nums[k]==0){
						List<Integer> numlist = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k]));
						Collections.sort(numlist);
						output.add(numlist);
					}

				}  }
			}
        return new ArrayList<>(output);
	}

}
