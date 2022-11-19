package dsa.week4.day16;

import org.junit.Test;

public class Problem3 {

	/*
	nums={1,1,1} k=2, count the number of subarrays whose sum is k
	1 1  =k 
	1 1  =k
	1
	1
	1
	nums={1,1,1,4,-1} k=3 
	 1 1 1 
	 4 -1

	 Approch1 
	 * Initilize start and end equal to 0
	 * Iterate the loop two for loop  
	 * where num[i]+num[j]==k
	 * When condition is satisfied the count has to be incremented 
	 * return  number of sub arrays


	 */
	@Test
	public void test1() {
		int[] nums = {1,1,1};
		int k=2;
		System.out.println(countofSubarrays(nums,k));
	}

	public int countofSubarrays(int[] nums, int k ){
		int count=0;
		for(int i= 0; i<nums.length;i++){
			int sum=0;
			for(int j=i; j<nums.length;j++){
				sum+=nums[j];  
				if( sum==k ) count++;
			}
		}
		return count; 
	}
}
