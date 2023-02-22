package dsa.sdet.homework;

import org.junit.Assert;
import org.junit.Test;

public class MinimumRecolorstoGetKConsecutiveBlackBlocks_2379 {
	
	@Test
    public void example1() {

        String blocks = "WBBWWBBWBW";
        int k = 7;
        int output = 3;
        Assert.assertEquals(output, minimumRecolors(blocks, k));
    }

    @Test
    public void example2() {

        String blocks = "WWW";
        int k = 4;
        int output = 0;
        Assert.assertEquals(output, minimumRecolors(blocks, k));
    }

    @Test
    public void example3() {

        String blocks = "W";
        int k = 1;
        int output = 1;
        Assert.assertEquals(output, minimumRecolors(blocks, k));
    }

    @Test
    public void example4() {

        String blocks = "B";
        int k = 1;
        int output = 0;
        Assert.assertEquals(output, minimumRecolors(blocks, k));
    }

	private int  minimumRecolors(String blocks, int k) {
           int mini=Integer.MAX_VALUE;
           for (int i = 0; i < blocks.length()-k+1; i++) {
        	   int cont=0;
               for (int j = 0; j < i+k; j++) {
            	   if(blocks.toCharArray(j)=="W") {
            		   cont++;
            	   }
               }
            mini=min(mini,cont);
		}

		return null;
	}


}
