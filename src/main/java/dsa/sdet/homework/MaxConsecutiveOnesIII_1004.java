package dsa.sdet.homework;

import org.junit.Assert;
import org.junit.Test;

public class MaxConsecutiveOnesIII_1004 {
	
	@Test
    public void example1() {

        int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0};
        int k = 0;
        int output = 3;
        Assert.assertEquals(output, longestOnes(nums, k));
    }

    @Test
    public void example2() {

        int[] nums = {1,1,1,1,1,1,1,1,1};
        int k = 3;
        int output = 9;
        Assert.assertEquals(output, longestOnes(nums, k));
    }

    @Test
    public void example3() {

        int[] nums = {1,1,1,1,1};
        int k = 2;
        int output = 5;
        Assert.assertEquals(output, longestOnes(nums, k));
    }

    public void example4() {

        int[] nums = {0,0,0,0};
        int k = 2;
        int output = 2;
        Assert.assertEquals(output, longestOnes(nums, k));
    }
    public int longestOnes(int[] nums, int k) {
        int  start = 0, end = 0, count= 0;
           for(end = 0 ; end < nums.length ; end++){
               if(nums[end] == 0) count++;
               if(k < count){
                   if(nums[start] == 0)count--;
                   start++;
               }
           }
           return end - start;
       }

}
