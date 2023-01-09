package dsa.hackathon.day1;

import org.junit.Test;

import org.junit.Assert;

public class ContainerWithMostWater_11 {
	
	@Test
	public void test1() {
		int[] height = {1,8,6,2,5,4,8,3,7};
		int	out= 49;
		Assert.assertEquals(out, maxArea(height));
	}
	
	@Test
	public void test2() {
		int[] height = {1,1};
		int	out= 1;
		Assert.assertEquals(out, maxArea(height));
	}

	/*
	  Initialize the max area 
	  consider the twopointer approach  start =0 and end = height
	  find the shortest hight 
	  calculate the Maxim area with shortest height mutiply by end - start
	  if start height is less than end  height  start++
	  else end-- 
	  
	 */
	private int maxArea(int[] height) {
		
		int maxArea=Integer.MIN_VALUE;
		int start=0;
		int end =height.length-1;
		while(start<end) {
			int shortestHight=Math.min(height[start],height[end]);
			maxArea=Math.max(maxArea,shortestHight*(end - start));
			if(height[start]<height[end]) {
				start++;
			}else {
				end--;
			}
		}
		return maxArea;
	}

}
