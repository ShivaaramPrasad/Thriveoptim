package dsa.interview.sdet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class MaxiumDiffrence {

	@Test
	public void test1() {
		Integer[] num = {5,1,3,7,3};
		List<Integer> asList=Arrays.asList(num);
		System.out.println(maxDiffApproch2(asList));
	}


	public static int maxDiff(List<Integer> num) {
		int min = num.get(0);
		int neg =-1;
		for(int i=1;i<num.size();i++) {
			if(num.get(i) > min) {
				neg = Math.max(num.get(i)-min, neg);
			}
			 min = Math.min(min, num.get(i));
		}
		return neg;	
	}
	public static int maxDiffApproch2(List<Integer> num) {
		int minEle = num.get(0);
        int maxEle = num.get(0);
        for (int i = 1; i < num.size(); i++) {
            minEle = Math.min(minEle, num.get(i));
            maxEle = Math.max(maxEle, num.get(i));
        }
        return (maxEle - minEle);
    }
}
