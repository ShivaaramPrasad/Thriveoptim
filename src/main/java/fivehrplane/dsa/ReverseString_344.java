package fivehrplane.dsa;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class ReverseString_344 {
	
	


@Test
public void test(){
 char[] s={'h','e','l','l','o'};
 char[] o={'o','l','l','e','h'};
 reverseString(s);
 
}

public void reverseString(char[] s) {
    
int left = 0; int right = s.length-1;
	while (left < right) { // O(n/2) => o(n)
		// swap
		char temp = s[right];
		s[right--] = s[left];
		s[left++] = temp;
	}
	System.out.println(Arrays.toString(s));

   }

}
