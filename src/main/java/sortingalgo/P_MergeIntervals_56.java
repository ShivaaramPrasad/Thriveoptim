package sortingalgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class P_MergeIntervals_56 {

	/*
	 Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

Example 1:

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].


Example 2:

Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.
	 */

	@Test
	public void test1(){
		int[][] intervals={{1,3},{2,6},{8,10},{15,18}};
		Assert.assertArrayEquals(new int[][]{{1,6},{8,10},{15,18}},mergeIntervals(intervals));
	}
	
	@Test
	public void test2(){
		int[][] intervals={{1,4},{4,5}};
		Assert.assertArrayEquals(new int[][]{{1,5}},mergeIntervals(intervals));
	}
	@Test
	public void test3(){
		int[][] intervals={{1,4},{5,6}};
		Assert.assertArrayEquals(new int[][]{{1,4},{5,6}},mergeIntervals(intervals));
	}
	
	private int[][] mergeIntervals(int[][] intervals) {
	      if(intervals.length==1) return intervals;
	      Arrays.sort(intervals,(a,b)->{if(a[0]!=b[0]) return a[0]-b[0]; else return a[1]-b[1];});
	      List<List<Integer>>meetings=new ArrayList<>();
	      int startTime=intervals[0][0];
	      int endTime=intervals[0][1];
		return null;
	}

}
