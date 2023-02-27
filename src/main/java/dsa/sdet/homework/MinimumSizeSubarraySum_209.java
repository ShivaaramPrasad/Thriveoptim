package dsa.sdet.homework;

import org.junit.Assert;
import org.junit.Test;

public class MinimumSizeSubarraySum_209 {
	
	
	@Test
    public void test1(){
        int[] nums = {2,3,1,2,4,3};
        int  target = 7;
        int output = 2;
        
        Assert.assertEquals(minSubArrayLen(nums, target),output);
        
	}
	
	@Test
    public void test2(){
        int[] nums = {1,4,4};
        int  target = 4;
        int output = 1;
        
        Assert.assertEquals(minSubArrayLen(nums, target),output);
        
	}
	
	@Test
    public void test3(){
        int[] nums = {1,1,1,1,1};
        int  target = 11;
        int output = 0;
        
        Assert.assertEquals(minSubArrayLen(nums, target),output);
        
	}
        
        
        public int minSubArrayLen( int[] nums, int target) {
        	
        	int start =0; int minlength= Integer.MAX_VALUE;
        	int sum=0; int index=0; int curlength=Integer.MAX_VALUE;
        	for (; start < nums.length; start++) {
				sum+=nums[start];
				while(sum>=target) {
					curlength= start-index+1;
					sum-=nums[index++];
					
				}
				minlength=Math.min(curlength, minlength);
			}
        	return minlength==Integer.MAX_VALUE ? 0:minlength;
    }

}
