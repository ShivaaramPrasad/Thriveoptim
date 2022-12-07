package dsa.interview.dpworld;

import java.util.HashMap;

import org.junit.Test;

public class SubarraysWhoseSumIsDivisible {

	/*	int[] nums={4,5,0,-2,-3,1};
    int k=5;
count number of sub arrays whose sum is divisible by k

	 */   @Test
	 public void test() {
		 int [] nums= {4,5,0,-2,-3,1};
		 int k=5;
		 //System.out.println(divisible(nums,k));
		 System.out.println(divisibleReminder(nums,k));
	 }


	 public int divisible(int[]nums, int k) {
		 int count=0;
		 for (int i=0; i<nums.length; i++) {
			 int sum=0;
			 for(int j=i; j<nums.length;j++) {
				 sum+=nums[j];
				 if(((sum%k)+k)%k==0) count++;	
			 }
		 }
		 return count;
	 }

	 public int divisibleReminder(int[] nums, int k) {
		 int sum=0, count=0;
		 HashMap <Integer,Integer> map = new HashMap<Integer, Integer>();
		 map.put(0,1);
		 for(int num: nums) {
			 sum+=num;
			 int remin= ((sum%k)+k)%k;
			 if(map.containsKey(remin)) {
				 count+=map.get(remin);
			 }
			 map.put(remin,map.getOrDefault(remin, 0)+1);
		 } 
		 return count;
	 }
}
