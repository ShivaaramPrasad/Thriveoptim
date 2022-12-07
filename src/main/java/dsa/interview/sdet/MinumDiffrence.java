package dsa.interview.sdet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class MinumDiffrence {

	@Test
	public void test1() {
		Integer[] num = {5,1,3,7,3};
		List<Integer> asList=Arrays.asList(num);
		System.out.println(maxDiff(asList));
	}


	public static int maxDiff(List<Integer> num) {
		if(num.size() < 2) return 0;
		if(num.size() == 2) return Math.abs(num.get(0)-num.get(1));
		Collections.sort(num);
		int sum = 0;
		for (int i = 0; i < num.size()-1; i++) {
			sum += Math.abs(num.get(i) - num.get(i+1));
		}
		return sum;
	}
}
