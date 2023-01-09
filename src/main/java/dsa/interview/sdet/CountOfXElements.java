package dsa.interview.sdet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.junit.Test;

import org.junit.Assert;

public class CountOfXElements {
	/*
	 Given an integer array arr, count how many elements x there are,
    such that x + 1 is also in arr. If there are duplicates in arr, 
    count them separately.
arr = {1, 2, 3}; out 2
arr= ={ 1,3,2,};out =2
arr= {1,3,2,1}; out =3
arr= {1,1,1}; out=0
arr= {1,5,7,10}; out=0
	 */

	/*
	 *  First sort the array
	 *  Initilize count =0, firstElement and i+1 next elemment 
	 *  when first element is matching with second element  increment the count 
	 *  if is not matching 
	 *  return 0 
	 */

	@Test
	public void test2() {
		int [] nums= {1, 2, 3};
		int count =2; 
		Assert.assertEquals(count, findCountOfElementsOptimized(nums));

	}

	@Test
	public void test1() {
		int [] nums= {1, 3, 2};
		int count =2;
		Assert.assertEquals(count, findCountOfElementsOptimized(nums));
	}

	@Test
	public void test3() {
		int [] nums= {5, 7, 9};
		int count =0; 
		Assert.assertEquals(count, findCountOfElementsOptimized(nums));

	}
	@Test
	public void test4() {
		int [] nums= {1, 1, 1};
		int count = 0; 
		Assert.assertEquals(count, findCountOfElementsOptimized(nums));

	}

	public int findCountOfElements(int[] nums) {
		int count =0;
		for(int i =0; i<nums.length; i++) {
			int x=nums[i]+1;
			for (int j = 0; j < nums.length; j++) {
				int xPlusOne=nums[j];
				if(x == xPlusOne) {
					count++;
				}
			}  
		}
		return count; 
	}

	public int findCountOfElementsOptimized(int[] nums) {
	    int size = nums.length;    
	    int count = 0; 
	    Map<Integer, Boolean> mapNums = new HashMap<>();
	    for(int i = 0; i < size; ++i){
	    	mapNums.put((nums[i]), true);
	    }
	    for(int i = 0; i < size; ++i){
	       if (mapNums.containsKey(nums[i]+1) == true){
	    	   count++;
	       }
	    }
	    return count;
	}
}
