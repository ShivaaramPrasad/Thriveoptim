package dsa.sdet.homework;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.Test;


public class PascalsTriangle_119 {

	

	@Test
	public void test1() {
		int rowIndex = 0;
		System.out.println(getRow(rowIndex));
	}
	
	@Test
	public void test2() {
		int rowIndex = 1;
		System.out.println(getRow(rowIndex));
	}
	
	@Test
	public void test3() {
		int rowIndex = 3;
		System.out.println(getRow(rowIndex));
	}

	public List<Integer> getRow(int rowIndex) {

		/*
		Approch 
		Create arry list 
		itrate from 0 to row count 
		use another for loop add center values 
		finaly return list
		 */
		int[] arr = new int[rowIndex + 1];
		Arrays.fill(arr, 0);
		arr[0] = 1;

		for (int i = 1; i <= rowIndex; i++) {
			for (int j = i; j > 0; j--) {
				arr[j] = arr[j] + arr[j - 1];
			}
		}
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());    
		return list;
	}
}