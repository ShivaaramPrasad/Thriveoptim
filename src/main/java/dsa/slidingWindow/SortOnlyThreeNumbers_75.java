package dsa.slidingWindow;

import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;

public class SortOnlyThreeNumbers_75 {

	/* Given an array which Contains only 0,1,2 and sort in an non decreasing order 
	 * int[] arr ={1,2,0,1,2};
	 */


	@Test
	public void test1(){
		int[] nums = {1,2,0,1,2}; int[] output = {0,1,1,2,2};
		int val1=0; int val2=1;
		//System.out.println(Arrays.toString(sortThreeNumbersbruteforce(nums)));
		// Assert.assertArrayEquals(output,sortThreeNumbersbruteforce(nums));
		System.out.println(Arrays.toString(DutchFlag(nums, val1,val2)));
		Assert.assertArrayEquals(output,DutchFlag(nums,val1,val2));
	}
	@Test
	public void test2(){
		int[] nums = {5,6,5,7,6}; int[] output = {5,5,6,6,7};
		int val1=5; int val2=6;
		System.out.println(Arrays.toString(DutchFlag(nums, val1,val2)));
		Assert.assertArrayEquals(output,DutchFlag(nums,val1,val2));
	}
   // array.sort nlog(n)  // This is N

	private int[]  DutchFlag(int[] nums, int val1, int val2) {
		int low =0, middle=0, high =nums.length-1;
		int temp=0;
		while(middle<=high)
		{
			if(nums[middle]==val1) {
				temp=nums[middle];
				nums[middle]=nums[low];
				nums[low]=temp;
				middle++;
				low++;
			}else if(nums[middle] ==val2) middle++;
			else {
			     temp=nums[middle];
				nums[middle]=nums[high];
				nums[high]=temp;
				high--;
			}
		}
		return nums;
	}

	private int[]  DutchFlagSwith(int[] nums) {
		int low =0, middle=0, high =nums.length-1;
		int temp=0;

		while(middle<=high)
		{

			switch(nums[middle]){

			case 0 :
				temp = nums[middle];
				nums[middle]= nums[low];
				nums[low]= temp;
				low++;
				middle++;
				break;

			case 1 :
				middle++;
				break;
			case 2 :
				temp = nums[middle];
				nums[middle] = nums[high];
				nums[high]= temp;
				high--;
				break;

			}
		}
		return nums;
	}
	
	
	private int[]  sortThreeNumbersbruteforce(int[] nums) {
		int[] output =new int[nums.length];
		int index=0;
		for (int i: new int[] {0,1,2}) {
			for (int j = 0; j < output.length; j++) {
				if(nums[j] == i) 
					output[index++] = i;

			}

		}
		return output;
	}
}


