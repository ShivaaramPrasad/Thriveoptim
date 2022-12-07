package dsa.interview.mckensy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class Panagaram {


	@Test
	public void test1() {
		String[] names = {"pack my box with five dozen liquor jugs","this is not panagram"};
		List<String> sentence =  Arrays.asList(names);
		System.out.println(isPnagaram(sentence) );
	}


	public String isPnagaram(List<String> sentence) {

		String output="";
		for(String eachs:sentence) {
			output+=""+isPnagaramString(eachs);
		}
		return output;
	}

	public int isPnagaramString(String s) {

		int[] asciiChar=new int[26];
		s= s.replaceAll(" ","");
		char[] chars =s.toLowerCase().toCharArray();
		for (char c: chars) {
			asciiChar[c-'a']++;
		}
		for (int i = 0; i < asciiChar.length; i++) {
			if(asciiChar[i]<1) return 0;
		}
		return 1;
	}
}
