package searchingalgo;

import org.junit.Test;
import org.junit.Assert;

public class Squareroot {
	/*find the square root of given number n=25
	https://leetcode.com/problems/sqrtx/
	 */


	@Test
	public void test2() {
		int s= 4;
		int output= 2;
		Assert.assertEquals(2, squareroot(s));
	}

	@Test
	public void test4() {
		int s= 8;
		int output= 2;
		Assert.assertEquals(2, squareroot(s));
	}

	@Test
	public void test3() {
		int s= 1;
		int output= 1;
		Assert.assertEquals(1, squareroot(s));
	}

	@Test
	public void test1() {
		int s= 2;
		int output= 2;
		Assert.assertEquals(2, squareroot(s));
	}

	
	/*
	 Approach 
	 Declare Low =0 and High = s
	 when low is less than are equal to high
	 find the midpoint 
	 if mid* mid equals s  return mid 
	 else mid* mid greater than s reduce high by mid -1
	 else low  should be incremented and return mid 
	 if its not matching return low 
	 */
	public int squarerootb(int s) {
		int low =1, high=s;
		if (s == 0)
			return 0;
		if (s == 1)
			return 1;
		while(low<= high) {
			int mid = (low+high)/2;
			if(mid*mid==s) {
				return mid;
			} else if(mid*mid >s) {
				high =mid-1; 
			}else {
				low=mid+1; 
			}
		}
		return low;
	}
	
	public int squareroot(int x) {

		int low=1;
		int high=x;
		while(low<=high) {
			int mid=(high+low)/2;
			int r=x/mid;
			if(r==mid) return mid;
			else if (r < mid) {
				high = mid-1;
			}
			else {
				low = mid+1;
			}
		}
		return high;

	}

	public int mySqrtKirshana(int x) {

		int lo=1, hi=x,ans=0, mid=1;

		while(lo<=hi){ 
			mid=(lo+hi)/2;
			if(mid<=x/mid){
				ans=mid;
				lo=mid+1;
			}
			else if(mid>x/mid) hi=mid-1;

		} 
		return ans;
	}

	
}


