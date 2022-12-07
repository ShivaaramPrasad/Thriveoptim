package dsa.interview.dpworld;

import org.junit.Test;

public class Squareroot {
	/*find the square root of given number n=25
	 */
	

	@Test

	public double squareroot(int s) {
		double  max=Integer.MIN_VALUE;
		for(int i =1; i<s/2; i++) {
			int output=i*i;
			if(output <=s) {
				max= Math.max(max, output);
			}
		}
		return max;
	}
	public double squarerootb(int s) {
		int low =0, high=s;
		while(low<= high) {
			int mid = (low+high)/2;
			if(mid*mid==s) {
				return mid;
			} else if(mid*mid >s) {
				high =mid-1; 
			}else {
				low=mid+1; 
			}
			return mid;
		}
		return -1;
	}
} 


