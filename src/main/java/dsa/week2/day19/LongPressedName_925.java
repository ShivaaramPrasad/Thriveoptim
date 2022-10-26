package dsa.week2.day19;

import org.junit.Assert;
import org.junit.Test;

public class LongPressedName_925 {
/*
 * 925. Long Pressed Name

 Your friend is typing his name into a keyboard. Sometimes, when typing a character c, the key might get long pressed, and the character will be typed 1 or more times.

You examine the typed characters of the keyboard. Return True if it is possible that it was your friends name, with some characters (possibly none) being long pressed.


*/


	@Test  //Positive
	public void example1(){
		String name = "alex";
		String typed = "aaleex";
		
		Assert.assertTrue(isLongPressedName(name,typed));

	}
	
	@Test  //Negative
	public void example2(){
		String name = "saeed";
		String typed = "ssaaedd";
		
		Assert.assertFalse(isLongPressedName(name,typed));

	}


	/*
    - initialize two pointers p1=0, p2=0
    - convert the strings into character arrays
    - iterate both the arrays using pointers p1, p2
    - check if the characters at indices p1, p2 are same
        - if same, increment both the pointers
        - if not same
            - check if the value at p2 and p2-1 in the typed arrays same
                - if yes, increment p2
                - else, return false

	 */
    public boolean isLongPressedName(String name, String typed) {

	int p1=0, p2=0;

	if(name.length()==1 && typed.length()==1) return false;
	if(name.charAt(0)!=typed.charAt(0)) return false;
	if(name.length()> typed.length()) return false;
	char[] named= name.toCharArray();
	char[] type=typed.toCharArray();

	while(p1<named.length && p2<type.length){
		if(named[p1]==type[p2]) {
			p1++;
			p2++;
		}
		else{
			if(type[p2]==type[p2-1]) p2++;
			else return false;
		}
	}
	while(p2<type.length){
		if(named[p1-1]==type[p2]) {
			p2++;
		}
		else{
			if(type[p2]==type[p2-1]) p2++;
			else return false;
		}
	}
	while(p1<named.length){
		if(named[p1]!=type[p2-1]) return false;
	}

	return true;
}

}
