package dsa.week4.day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import org.junit.Assert;

public class Problem2 {

	/*
	1[1,0,2,5,0,6,10,0]

	 Output ={0,0,0,1,2,5,6,10}

	 2. [1,3,4,5] output =[1,3,4,5]
	 3. {0,0,0,0,1,2,3} = {0,0,0,0,1,2,3}
	 3. {0,0,0,0} ={0,0,0,0}

	 Approch1 
	 Initialize two Array list  nums and zero 
	 if the array of element is !0 i will put in numb Array list 
	 else i will put in zero arraylist 
	 merge the list by addAll
	 I will counter into array
	 */

	@Test

	public void test1()
	{
		int [] nums= {1,0,2,5,0,6,10,0};

		int [] output= {0,0,0,1,2,5,6,10};

		//Assert.assertArrayEquals(output, moveZeros(nums));
		System.out.println(Arrays.toString(moveZeros2poniterleft(nums)));
	}
	//Time complexity = (O)2n
	// Space Complexity =(O)2n
	private int[] moveZeros(int[] nums) {

		List<Integer> numbres= new ArrayList<Integer>();
		List<Integer> zero= new ArrayList<Integer>();

		for (int i = 0; i < nums.length; i++) {
			if(nums[i]!=0) {
				numbres.add(nums[i]);
			}else {
				zero.add(nums[i]);
			}
		}
		zero.addAll(numbres);
		for(int i=0; i<zero.size();i++) {
			nums[i]=zero.get(i);
		}
		return nums;
	}
   /*
      Consider two pointers left and right 
      For swapping the value initialize temp;
      if we find numbs move the index to next element
      Once the element moves to last return the array
    */
	private int[] moveZeros2poniter(int[] nums) {
		int left=0; int right=0;
		
		while(right<nums.length)
		{
			if(nums[right]!=0)
			{
				int temp= nums[right];
				nums[right]=nums[left];
				nums[left++]=temp;
			}
			right++;
		}
		
		return nums;
	}

	private int[] moveZeros2poniterleft(int[] nums) {
		int left=0; int right=0;
		
		while(right<nums.length)
		{
			if(nums[right]==0)
			{
				int temp= nums[right];
				nums[right++]=nums[left];
				nums[left++]=temp;
			}else {
				right++;
			}
		}
		return nums;
	}


}
