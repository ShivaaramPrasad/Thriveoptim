package fivehrplane.dsa;

import org.junit.Assert;
import org.junit.Test;

public class MergeStringsAlternately_1768 {



	@Test
	public void testCase1() {
		String word1="abc", word2="pqr";
		Assert.assertEquals(mergeString(word1, word2),"apbqcr");
	}

	@Test
	public void testCase2() {
		String word1="ab", word2="pqrs";
		Assert.assertEquals(mergeString(word1, word2),"apbqrs");
	}

	@Test
	public void test3() {
		String word1="abcd";
		String word2 = "pq";
		Assert.assertEquals(mergeString(word1, word2),"apbqcd");

	}

	/*pseudocode:
	 * declare an empty string variable
	 * intialze 2 variables as 0
	 * iterate throught word1 & word2
	 * if i is less than word1lenth & word2lenth append each character
	 * reurn op
	 * 
	 */
	//bruteForce--> TC:-O[N];	sc:-O[1]
	public String mergeString(String word1,String word2) {
		String  op ="";
		int a =0,b=0;
		for(int i=0;i<word1.length()+word2.length();i++){       
			if(i<word1.length()){
				op+=word1.charAt(a);
				a++;
			}
			if(i<word2.length()){
				op +=word2.charAt(b);
				b++;
			}
		}   
		return op;

	}
	

	public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 0;
        int m = word1.length();
        int n = word2.length();
        while (i < m || j < n){
            if (i < m) sb.append(word1.charAt(i++));        
            if (j < n) sb.append(word2.charAt(j++));    
        }
        return sb.toString();
    }
	
}

