package dsa.interview.sdet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;

public class ReverseAList {

	@Test
	public void test1() {
		Integer[] nums = {1,3,2,4,5};
		List<Integer> listNums=Arrays.asList(nums);
		System.out.println(Arrays.toString(reverseAList(listNums)));
	}

	private Integer[] reverseAList(List<Integer> listNums) {
		
        Integer[] arr =listNums.toArray(new Integer[listNums.size()]);
        int strat=0, end=arr.length-1;
        while(strat<end) {
        	Integer temp=arr[strat];
        	arr[strat++]= arr[end];
        	arr[end--]=temp;

        }
		return arr;

	}
}
