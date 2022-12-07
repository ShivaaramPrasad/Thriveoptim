package dsa.interview.dpworld;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class DuplicateProduct {

	@Test
	public void test1() {

		String[] names = {"ball", "bat", "glove", "glove", "glove"};
		List<String> name =  Arrays.asList(names);

		Integer[] prices = {2, 3, 1, 2, 1};
		List<Integer> price =  Arrays.asList(prices);

		Integer[] weights = {2, 5, 1, 1, 1};
		List<Integer> weight =  Arrays.asList(weights);

		System.out.println(numDuplicates(name, price, weight));
	}


	public static int numDuplicates(List<String> names, List<Integer> price, 
			List<Integer> weight) {
		int match = 0;
		HashSet<String>set=new HashSet<String>();
		for (int i = 0; i < names.size(); i++) {
			String label= names.get(i)+" "+price.get(i)+" "+weight.get(i);
			if(!set.add(label)) {
				match++;
			}else {
				set.add(label);
			}
		}
		return match;
	}

}
