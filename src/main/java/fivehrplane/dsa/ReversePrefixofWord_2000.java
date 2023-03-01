package fivehrplane.dsa;

import org.junit.Test;

public class ReversePrefixofWord_2000 {
	
	@Test
	public void text() {
	   String word= "abcdefd";
	    char ch='d';
	   reversePrefix(word,ch);
	 }
	 
	public String reversePrefix(String word, char ch) {
        String start= word.substring(0,word.indexOf(ch)+1);
		String end= word.substring(word.indexOf(ch)+1,word.length());
		StringBuffer sb =new StringBuffer();
		sb.append(start);
		sb.reverse();
		sb.append(end);
		return sb.toString();
    }

}
