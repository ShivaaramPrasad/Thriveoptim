package dsa.sdet.homework;

import org.junit.Assert;
import org.junit.Test;

public class rotateImage_48 {

	
	@Test()
	public void test1() {
		int [] [] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		int [] [] output = {{7,4,1},{8,5,2},{9,6,3}};

		Assert.assertArrayEquals(output, rotate(matrix));
	}
	@Test()
	public void test2() {
		int [] [] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
		int [] [] output = {{15,13,2,5},{14,3,4,1},{12,6,8,9},{16,7,10,11}};

		Assert.assertArrayEquals(output, rotate(matrix));
	}
	/*
	 * Approch 
	 * First transpose the matrix
	 * Second Filp it symmetrically 
	 */
	   public int[][] rotate(int[][] matrix) {
		   int len = matrix.length;
	        for(int i=0; i<len; i++){
	            for(int j=i; j<matrix[i].length; j++){
	                int temp = matrix[i][j];
	                matrix[i][j] = matrix[j][i];
	                matrix[j][i] = temp;
	            }
	        }

	        for(int i=0;i<matrix.length;i++) {
	            for(int j=0;j<matrix.length/2;j++) {
	                int temp = matrix[i][j];
	                matrix[i][j] = matrix[i][matrix.length-j-1];
	                matrix[i][matrix.length-j-1] = temp;
	            }
	        }
			return matrix;
	    }
	}