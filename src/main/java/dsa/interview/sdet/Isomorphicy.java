package dsa.interview.sdet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class Isomorphicy {


	@Test
	public void test1() { String s = "egg"; String t = "add"; Assert.assertEquals(true, isIsomorphic(s, t));}
	@Test
	public void test2() { String s = "foo"; String t = "bar"; Assert.assertEquals(false, isIsomorphic(s, t));}
	@Test
	public void test4() { String s ="bbbaaaba"; String t ="aaabbbba"; Assert.assertEquals(false, isIsomorphic(s, t));}
	@Test
	public void test3() { String s = "paper"; String t = "title"; Assert.assertEquals(true, isIsomorphic(s, t));}

	private boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> smap= new HashMap();
        HashMap<Character, Character> tmap= new HashMap();
        if(s.length()!= t.length()) return false;
        for(int i=0;i<s.length();i++){
            smap.put(s.charAt(i),t.charAt(i));
            tmap.put(t.charAt(i),s.charAt(i));
        }
        for(int i=0;i<s.length();i++){
            if(!(smap.get(s.charAt(i))==t.charAt(i) && tmap.get(t.charAt(i))==s.charAt(i)))
                return false;
        }
        return true;
    }
	
}