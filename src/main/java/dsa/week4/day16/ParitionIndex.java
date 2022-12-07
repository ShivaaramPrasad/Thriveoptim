package dsa.week4.day16;

import java.util.HashMap;

public class ParitionIndex {
	/*
Given an array you need to find the parition index where the left and right sum is equal.
arr[] = { 5,2 ,2 ,2,5}
5+2 =7 , 2+5 = 7
if found = partionIndex
if not found = -1
7,5,3,2,6,4,1,8
	 */
	
	
	
	public int findPivotIndex(int [] nums) {
		int sum=0,  count=0;
		HashMap<Integer,Integer> map =new HashMap<Integer, Integer>();
		map.put(0,1);
		for(int num: nums) {
			sum+=num;
			map.put(sum, map.getOrDefault(sum, 0)+1);
			if(map.containsKey(sum-)) {
			
			}
	}
}
