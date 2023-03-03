
package fivehrplane.dsa;

import org.junit.Test;

import java.util.HashSet;

import org.junit.Assert;

public class FairCandySwap_888 {


	@Test
	public void test1() {
		int [] aliceSizes  = {1,1};
		int [] bobSizes   = {2,2};
		Assert.assertEquals(new int[] {1,2},fairCandySwap(aliceSizes,bobSizes));
	}


	 public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
	        int[] ans = new int[2];
	        HashSet<Integer> set = new HashSet<>();
	        int sumA = 0;
	        int sumB = 0;
	        for (int i : bobSizes) {
	            set.add(i);
	            sumB += i;
	        }
	        for (int i : aliceSizes) {
	            sumA += i;
	        }
	        for (int i : aliceSizes) {
	            int y = i - ((sumA - sumB) / 2);
	            if (set.contains(y)) {
	                ans[0] = i;
	                ans[1] = y;
	                break;
	            }
	        }
	        return ans;
	    }

}