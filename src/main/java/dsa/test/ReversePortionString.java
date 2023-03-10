package dsa.test;

public class ReversePortionString {
	public static void main(String[] args) {
		String str = "automation";
	    int len = str.length();
	    int mid = len / 2;
	    
	    // Divide the string into two parts
	    String part1 = str.substring(0, mid);
	    String part2 = str.substring(mid);
	    
	    // Reverse the two parts
	    String revPart1 = new StringBuilder(part1).reverse().toString();
	    String revPart2 = new StringBuilder(part2).reverse().toString();
	    
	    // Combine the two reversed parts to get the final output
	    String output = revPart1 + revPart2;
	    System.out.println(output);  // motuanoita
	}
}
