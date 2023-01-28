package dsa.interview.sdet;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class DiscountTag {
	
	@Test
	public void test1() {
		Integer[] num = {5,1,3,7,3};
		List<Integer> asList=Arrays.asList(num);
		System.out.println(discountTag(asList));
	}

	private static long discountTag(List<Integer> asList) {
        int total = 0;
        int minEle = Integer.MIN_VALUE;

        for(int i=0; i<= asList.size()-1; i++){
            total = total + asList.get(i);
            minEle = Math.min(minEle, total);
        }
       
        return minEle;
	}


	

}
