package dsa.sdet.homework;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class MeetingRoom_252 {
	/*
	Given an array of meeting time intervals consisting of start and end times [s1, e1], [s2, e2], ... , 
	determine if a person could attend all meetings.

For example,
Given [ [0, 30], [5, 10], [15, 20] ],
return false.

	 */

	@Test
	public void test1(){
		int [][] meeting ={{0, 30}, {5, 10}, {15, 20}};
		Assert.assertEquals(false,attendMeeting(meeting));
	}
	@Test
	public void test2(){
		int [][] meeting ={{0, 10}, {15, 30}, {40, 60}};
		Assert.assertEquals(true,attendMeeting(meeting));
	}

	@Test
	public void test3(){
		int [][] meeting ={{0, 15}, {12, 30}, {28, 60}};
		Assert.assertEquals(false,attendMeeting(meeting));
	}

	@Test
	public void test4(){
		int [][] meeting ={{0, 10}, {11, 30}, {31, 60}};
		Assert.assertEquals(true,attendMeeting(meeting));
	}

	@Test
	public void test5(){
		int [][] meeting ={{0, 10}, {10, 30}, {30, 60}};
		Assert.assertEquals(true,attendMeeting(meeting));
	}
	/*
	Approch  
	end time should not be greater than the next start time 

	2 1 value  should not be greater than 1 2 value 
	3 1 value  should not be greater than 2 2 value 
	4 1 value  should not be greater than 3 2 value 
	 */

	public boolean attendMeeting(int[][] meeting){
		Arrays.sort(meeting,(a,b)-> Integer.compare(a[0],b[0]));   
		int ep= meeting[0][1];
		for(int i=1 ;i<meeting.length; i++){
			if( meeting[i][0] < ep){
				return false;
			}else {
				ep =meeting[i][1];
			}
		}
		return true;
	}
}
