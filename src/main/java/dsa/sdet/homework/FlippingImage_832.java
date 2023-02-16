package dsa.sdet.homework;

import org.junit.Assert;
import org.junit.Test;

public class FlippingImage_832 {
	/*
     - iterate through each image(int []) in given images(int[][]).
     - reverse each array.
     - start 2 pointers : start =0; end = image.length.
     - swap elts at start and end.
     - now, flip 0 to 1 and 1 to 0.
     */
	@Test
    public void test(){
      int[][] images = {{1,1,0},{1,0,1},{0,0,0}};
        Assert.assertArrayEquals(new int[][]  {{1,0,0},{0,1,0},{1,1,1}},flipInvertImage(images));
    }
	
	private int[][] flipInvertImage(int[][] images){
		for (int[] eachImage : images) {
			reversArray(eachImage);
			for (int i = 0; i < eachImage.length; i++) {
				if(eachImage[i]==0) eachImage[i]=1;
				else if(eachImage[i]==1) eachImage[i]=0;
			}
		}
		return images;
	}

	public void reversArray(int[] nums) {
		int start=0;
		int end =nums.length-1;
		while(start<end) {
			int temp =nums[start];
			nums[start++]=nums[end];
			nums[end--]=temp;
			
		}

	}
}
