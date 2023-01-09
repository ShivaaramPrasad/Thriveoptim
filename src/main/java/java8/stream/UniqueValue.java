package java8.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqueValue {

	public static void main(String[] arg) {


		int[] nums = {2,5,3,1,2,3,4,6,4,6};
		Set<Integer> unique = new HashSet<Integer>();

		for(int i=0; i< nums.length; i++) {
			if(unique.add(nums[i])) {}
		}
		System.out.println(unique);
		
      List<Integer> numbers =Arrays.asList(2,5,3,1,2,3,4,6,4,6);
      List<Integer> distinct = numbers.stream().distinct().collect(Collectors.toList());
      System.out.println(distinct);
	}
}
