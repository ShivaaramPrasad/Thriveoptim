package dsa.sdet.homework;

import org.junit.Assert;
import org.junit.Test;

public class ReversePrefixofWord_2000 {
	@Test
	public void test1 () {
		String  word = "abcdefd", ch = "d";
		Assert.assertEquals("dcbaefd", reversePrefix(word,ch));
	}
	@Test
	public void test2() {
		String  word = "xyxzxe", ch = "z";
		Assert.assertEquals("zxyxxe", reversePrefix(word,ch));
	}
	private String reversePrefix(String word, String ch) {		
		 String start= word.substring(0,word.indexOf(ch)+1);
			String end= word.substring(word.indexOf(ch)+1,word.length());
			StringBuffer sb =new StringBuffer();
			sb.append(start);
			sb.reverse();
			sb.append(end);
			return sb.toString();
	}

}
