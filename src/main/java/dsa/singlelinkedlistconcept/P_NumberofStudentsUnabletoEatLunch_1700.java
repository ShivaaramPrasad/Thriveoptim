package dsa.singlelinkedlistconcept;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.LinkedList;

import org.junit.Assert;

public class P_NumberofStudentsUnabletoEatLunch_1700 {


	@Test
	public void test1()
	{
		int[] students = {1,1,0,0};
		int[] sandwiches = {0,1,0,1};
		int output=0;
		Assert.assertEquals(output, countStudents1(students,sandwiches));

	}



	@Test
	public void test2()
	{
		int[] students = {1,1,1,0,0,1};
		int[] sandwiches = {1,1,1,0,0,1};
		int output=3;

		Assert.assertEquals(output, countStudents1(students,sandwiches));
	}



	private int countStudents(int[] students, int[] sandwiches) {
		ArrayDeque<Integer> stuQue= new ArrayDeque<Integer>();
		for (int student: students) {
			stuQue.add(student);
		}
		int sandwicheindex=0,temp=0;

		while(temp<stuQue.size()){
			if(stuQue.peek()==sandwiches[sandwicheindex]) {
				sandwicheindex++;
				stuQue.poll();
				temp=0;
			}
			else {
				stuQue.add(stuQue.pollLast());
				temp++;
			}
		}
		return stuQue.size();
	}

	private int countStudents1(int[] students, int[] sandwiches) {
		ArrayDeque<Integer> stuQue= new ArrayDeque<Integer>();
		for (int student: students) {
			stuQue.add(student);
		}
		for (int i = 0; i < sandwiches.length; i++) {
			while (stuQue.getFirst() != sandwiches[i]){
				Integer first = stuQue.getFirst();
				stuQue.remove();
				stuQue.add(first);
			}
		}
		return stuQue.size();
	}
}