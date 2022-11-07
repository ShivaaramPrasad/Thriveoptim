package dsa.week4.day6;

import org.junit.Test;

import java.util.Arrays;

import org.junit.Assert;

public class OccurrenceCharacterInString {

	/*
	 *I/p ZAAVVDDSSSG  to 1Z2A2V2D3S1G
	 */
	@Test
	public void test1() {
		String s="ZAAVVDDSSSG";
		String o="1Z2A2V2D3S1G";
		//System.out.println(occurrenceCharacter(s));
		Assert.assertEquals(occurrenceCharacter(s), o);
	}

	private String occurrenceCharacter(String s) {
		int start=0; int end=0; int count=0;
		char[] charStr=s.toCharArray();
		StringBuilder out= new StringBuilder();
		while(end<s.length())
		{
			if(charStr[start]==charStr[end])
			{
				count++;
				end++;

			}else if (charStr[start]!=charStr[end]){
				out.append(count+"");
				out.append(charStr[start]);
				count=0;
				start=end;
			}

		}
		out.append(count+"");
		out.append(charStr[start]);
		return out.toString();

	}
}