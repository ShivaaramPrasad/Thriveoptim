package dsa.sdet.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class Substring_length3_Palindrome {
	@Test
    public void example1() {
        String s = "aBBBcdMOMkajleDAD";
        List<String> output = Arrays.asList(new String[]{"BBA", "MOM", "DAD"});
        Assert.assertEquals(countPalindromicSubsequence(s) , output);
    }

    /*
   1. Take k length substring from String s
   2. Check if it is a palindrome
   3. if true add to list
   4. return list
     */
    private boolean palindrome(String str) {

        int p=0;

        while(p<=str.length()/2) {
            if(str.charAt(p) != str.charAt(str.length()-1-p))
                return false;
            else p++;
        }

        return true;
    }

    public List<String> countPalindromicSubsequence(String s) {

        List<String> list = new ArrayList<>();
        int pointer =0, k=3, count =0;

        while(pointer <= s.length()-k){

            String str = s.substring(pointer, pointer+k);
            pointer++;
            if(palindrome(str))
               list.add(str);
        }
        return list;
    }
}