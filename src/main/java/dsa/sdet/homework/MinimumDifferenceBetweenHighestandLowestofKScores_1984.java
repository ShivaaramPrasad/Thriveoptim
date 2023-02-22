package dsa.sdet.homework;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class MinimumDifferenceBetweenHighestandLowestofKScores_1984 {

    @Test
    public void example1() {

        int[] input = {9, 4, 1, 7};
        int k = 2;
        int output = 2;
        Assert.assertEquals(output, minimumDifference(input, k));
    }

  
    
    public int minimumDifference(int[] nums, int k) {
        
        Arrays.sort(nums);
               int start = 0;
               int minDiff = Integer.MAX_VALUE;
    /*
     [1,4,7,9], k = 2
     num[0]-num[0+2-1]==> num[0]-num[1]==> 1-4= 3
     num[1]-num[1+2-1]==> num[1]-num[2]==> 4-7= 3
     num[2]-num[2+2-1]==> num[2]-num[3]==> 7-9= 2

     */
               for(; start < nums.length-k+1 ;start++){
    			//int diff = Math.abs(nums[start] - nums[start+k-1]);
    			int diff = nums[start+k-1]-nums[start];               
                   minDiff = Math.min(diff,minDiff);
               }
               return minDiff;
       }

}
