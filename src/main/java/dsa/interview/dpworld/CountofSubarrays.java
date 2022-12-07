package dsa.interview.dpworld;

import java.util.HashMap;

import org.junit.Test;

public class CountofSubarrays {

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

	public int countofSubarraysPrefixSum(int[] nums, int k ){
		int sum=0, count=0; 

		HashMap<Integer,Integer> map =new HashMap<Integer, Integer>();
		map.put(0,1);
		for(int num: nums) {
			sum+=num;
			map.put(sum, map.getOrDefault(sum, 0)+1);
			if(map.containsKey(sum-k)) {
				count+=map.get(sum-k);			
			}
		}
		return count; 
	}
	
	@Test
	public void test1() {
		int[] nums = {1,1,1};
		int k=2;
		System.out.println(countofSubarraysPrefixSum(nums,k));
	}
}
