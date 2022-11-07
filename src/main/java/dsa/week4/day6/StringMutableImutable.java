package dsa.week4.day6;

public class StringMutableImutable {
	
public static void main(String[] args) {
	
	String s= "Good";
	// No append method
	s=s+" Morning";
	System.out.println("s "+s);
	
	StringBuffer str = new StringBuffer("Good"); 
	str.append(" Morning");
	System.out.println("str "+str);
	StringBuilder stB = new StringBuilder("Good"); 
	stB.append(" Morning");
	System.out.println("stB "+stB);

}	
	

}
