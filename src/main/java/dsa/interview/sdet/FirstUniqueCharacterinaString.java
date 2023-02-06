package dsa.interview.sdet;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class FirstUniqueCharacterinaString {

	@Test
	public void test1() {
		String s = "leetcode";
		Assert.assertEquals(0, firstUniqChar1(s));
	}
	
	@Test
	public void test2() {
		String s = "loveleetcode";
		Assert.assertEquals(2, firstUniqCha2(s));
	}
	
	@Test
	public void test3() {
		String s = "aabb";
		Assert.assertEquals(-1, firstUniqCha2(s));
	}
	
	public int firstUniqChar1(String s) {
		Map<Character,Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
		}
		for (int i = 0; i < s.length(); i++) {
			if(map.get(s.charAt(i))==1) {
				return i;
			}
		}
		return -1;
	}

	public int firstUniqCha2(String s) {
		for (int i = 0; i < s.length(); i++) {
			char temp= s.charAt(i);
			if(s.indexOf(temp)==s.lastIndexOf(temp))
				return i;
		} 
		return -1;
	}
}
