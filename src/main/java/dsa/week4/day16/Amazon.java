package dsa.week4.day16;

import junit.framework.Assert;

public class Amazon {
	/*
	 int n=1234;
     int k=1; rotate the number k times
     output 2341
     Test:2 k= 2  n= 3412
      Test:3 k= 5  n= 
	
	
	Approch1
    - Convert n to String get the length 
    - in itration divide the number and get indivual value 
    -  appdend form kth value and add first value in last
	
 */
	
	@Test
	public void test1()
	{
		int n =1234;
		int k=1;
		Assert.assertEquals(3412, roatateArray(n, k));
	}

	private int  roatateArray(int n, int k) {
		int size =Integer.toString(n).length();
        int[] output =new int[size];
        int digit=0;

        while (n>0){
            
        }
        for (int i=0; i<k; i++)
        {
        	int temp=digit[j];
        	digit[j]=digit[j+1];
        	digit[j+1]=temp;
        }
        
		return null;
	}
	
	private int shiftDigit(int n, int k){
        String result="";
        String digit=String.valueOf(n);
        String toBeRotated=digit.substring(0,k);
        String remainingDigits=digit.substring(k);
        result+=remainingDigits+toBeRotated;
        return Integer.valueOf(result);
    }
}
