package dsa.week2;

public class Palindrom {

	/*
	 * 1) Did I understand the problem? Yes -> If yes, go to next step !!
	 * 
	 * What is the input(s)? What is the expected output? Do I have constraints to
	 * solve the problem? Do I have all informations to go to next step!! How big is
	 * your test data set will be?
	 * 
	 * 2) Test data set
	 * 
	 * Minimum of 3 data set !! Positive, Edge, Negative Validate with the
	 * interviewer if the data set is fine by his/her assumptions
	 * 
	 * 3) Do I know how to solve it?
	 * 
	 * Yes - great, is there an alternate?
	 * 
	 * 4) Ask for hint (If you do not know how to solve)
	 * 
	 * 5) Do I know alternate solutions as well? No
	 * 
	 * No - That is still fine, proceed to solve by what you know !!
	 * 
	 * 6) If you know alternate solutions -> find out the O Notations (Performance)
	 * 
	 * Then, explain either both or the best (depends on the time)
	 * 
	 * Approach 1: Start with worst -> 
	 * 
	 * 
	 * @Test
    public void testCase1() {
        String s="Radar";
        String reversePalindrome = reversePalindrome(s);
        System.out.println(reversePalindrome);

    }

    /*Given a string s and a number k, find the maximum number of vowels in substring of size k.
    String s: "workaattech"
    k: 3
    /*pseudocode:
	 * 
	 * 
	 */
	//2 pointers

	public String reversePalindrome(String s) {

		char[] ch = s.toCharArray();              
		int left = 0, right = ch.length-1;
		while (left < right) { // O(n/2)
			// swap
			char temp = ch[right];
			ch[right--] = ch[left];
			ch[left++] = temp;
		}
		if(s.equalsIgnoreCase(new String(ch))){
			System.out.println("The Given String is not Palindrome");
		}
		else {
			System.out.println("The Given String is not Palindrome");
		}
		return new String(ch);
	}





	// BruteForce o[n]
	public String reversePalindromeBruteForce(String s) {
		char[] ch = s.toCharArray();
		String reverseInput = "";
		for(int i=ch.length-1;i>=0;i--) {
			reverseInput = reverseInput +ch[i];
		}
		if(s.equalsIgnoreCase(reverseInput)) {
			System.out.println("The Given String is Palindrome");
		}else {
			System.out.println("The Given String is not Palindrome");
		}
		return reverseInput;


	}


}
