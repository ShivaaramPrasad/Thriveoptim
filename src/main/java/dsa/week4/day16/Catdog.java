package dsa.week4.day16;

import java.util.ArrayList;
import java.util.List;

public class Catdog {
	
	
	private String[] allPermutationsOfStr(String s){
        if(s.length() < 1) return new String[]{} ;
        List<String> output = new ArrayList<>();
        String permutatedStr = "";
        returnPermutation(s, permutatedStr, output);
        return output.toArray(new String[output.size()]);
    }
    private void returnPermutation(String s, String pStr, List<String> output){
        if(s.length() == 0)  output.add(pStr);// return pStr;//System.out.println(pStr);
        for(int i = 0; i < s.length(); i++){
            String res = s.substring(0,i)+s.substring(i+1);
            returnPermutation(res, pStr+s.charAt(i), output);
        }
    }

}
