package dsa.interview.sdet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class NoPairsAllowed {

	public static List<Integer>  minimalOperation(List<String> listWords) {
		ArrayList<Integer> output= new ArrayList<Integer>();
		for(String eachs:listWords) {
			output.add(checkOperation(eachs));
		}
		return output;
	}
	
	public static Integer checkOperation(String s) {
		char[] chars =s.toLowerCase().toCharArray();
		int count=0;
		for(int i = 0; i < chars.length-1; i++) {
			char x=chars[i];
			if(x==chars[i+1]){ 
			count++;
			i++;
		  }
		}
		return count;
	}
	
	@Test
	public void test1() {
		String[] words = {"add","boook","break"};
		List<String> listWords=Arrays.asList(words);
		System.out.println(minimalOperation(listWords));
	}
}