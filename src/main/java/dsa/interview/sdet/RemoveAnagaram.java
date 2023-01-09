package dsa.interview.sdet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class RemoveAnagaram {

	/*
	"code","doce","ocde","framer","frame" --> 
	remove anagrams and return the remaining strings

	 */

	@Test
	public void test1() {

		String[] names = {"code", "doce", "ocde", "framer", "frame"};
		List<String> name =  Arrays.asList(names);
     System.out.println(removeAnagram(name));
     System.out.println(funAnagram(name));

	}

	private List<String> removeAnagram(List<String> list) {
		//  String[] arr =name.toArray(new String[name.size()]);
		HashSet<String>set=new HashSet<>();
		List<String> output=new ArrayList<>();
		for (int i=0;i<list.size();i++){
			char[] chars = list.get(i).toCharArray();
			Arrays.sort(chars);
			String s = String.valueOf(chars);
			if(!set.contains(s))
			output.add(list.get(i));
			set.add(s);
		}

		Collections.sort(output);
		return output;
	}

	private List<String> funAnagram(List<String> input){
		List<String> op = new ArrayList<>();
		Set<Map<Character,Integer>> set = new HashSet<>();
		for (String each : input) {
			Map<Character, Integer> map = new HashMap<>();
			for(char c : each.toCharArray())
				map.put(c, map.getOrDefault(c, 0)+1);
			if(!set.contains(map)) {
				op.add(each);
				set.add(map);
			}
		}
		Collections.sort(op);
		return op;
	}

}

