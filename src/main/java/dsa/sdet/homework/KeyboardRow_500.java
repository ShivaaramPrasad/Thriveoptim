package dsa.sdet.homework;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class KeyboardRow_500 {
	
	@Test
    public void example1() {
        String[] words = {"Hello","Alaska","Dad","Peace"};
        String[] output = new String[]{"Alaska", "Dad"};
        Assert.assertEquals(output,findWords(words) );
    }
    @Test
    public void example2() {

        String[] words = {"omk"};
        String[] output = {};
        Assert.assertEquals(output,findWords(words) );
    }

    @Test
    public void example3() {

        String[] words = {"adsdf","sfd"};
        String[] output = {"adsdf","sfd"};
        Assert.assertEquals(output,findWords(words) );
    }

    @Test
    public void example4() {

        String[] words = {"A", "b", "C", "d"};
        String[] output = {"A", "b", "C", "d"};
        Assert.assertEquals(output,findWords(words) );
    }

   
    public String[] findWords(String[] words) {

    	String s1 = "qwertyuiopQWERTYUIOP";
        String s2 = "asdfghjklASDFGHJKL";
        String s3 = "zxcvbnmZXCVBNM"; 
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            int count1=0,count2=0,count3=0,len=words[i].length();
            for(int j=0;j<len;j++){
                if(s1.contains(Character.toString(words[i].charAt(j))))
                    count1++;
                else if(s2.contains(Character.toString(words[i].charAt(j))))
                    count2++;
                else if(s3.contains(Character.toString(words[i].charAt(j))))
                    count3++;
                if(count1==len || count2==len || count3==len)
                    list.add(words[i]);
            }
        }
        String ans[] = new String[list.size()];
        list.toArray(ans);
        return ans;
    }

}
