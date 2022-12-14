package dsa.interview.sdet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class DuplicatedProductsHacker {

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

	@Test
	public void test2() {

		String[] names = {"ball", "box", "ball", "ball", "box"};
		List<String> name =  Arrays.asList(names);

		Integer[] prices = {2, 2, 2, 2, 2};
		List<Integer> price =  Arrays.asList(prices);

		Integer[] weights = {1, 2, 1, 1, 3};
		List<Integer> weight =  Arrays.asList(weights);

		System.out.println(numDuplicates(name, price, weight));
	}



	public int numDuplicates(List<String> name, List<Integer> price, List<Integer> weight) {
		Set<String> unique = new HashSet<String>();
		int size = name.size();
		if(price.size() != size || weight.size() != size)
			return -1;
		int dupsCount = 0;
		for (int i = 0; i < size; i++) {
			if(!unique.add(name.get(i)+"-"+price.get(i)+"-"+weight.get(i))) {
				dupsCount++;
			}
		}
		return dupsCount;
	}


	public int numDuplicates2(List<String> name, List<Integer> price, List<Integer> weight) {
		int count = 0;
		String product = "";
		Map<String, Integer> dupMap = new HashMap<String, Integer>();
		for (int i = 0; i < name.size(); i++) {
			product = name.get(i) + price.get(i) + weight.get(i);
			if (dupMap.get(product) != null) {
				count++;
			} else {
				dupMap.put(product, 1);
			}
		}

		return count;
	}
}



