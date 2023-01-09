package dsa.hashing;

import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;

public class UniqueEmailAddresses_929 {
	/*
	 929. Unique Email Addresses
		https://leetcode.com/problems/unique-email-addresses/
	Every valid email consists of a local name and a domain name, separated by the '@' sign. Besides lowercase letters, the email may contain one or more '.' or '+'.

For example, in "alice@leetcode.com", "alice" is the local name, and "leetcode.com" is the domain name.
If you add periods '.' between some characters in the local name part of an email address, mail sent there will be forwarded to the same address without dots in the local name. Note that this rule does not apply to domain names.

For example, "alice.z@leetcode.com" and "alicez@leetcode.com" forward to the same email address.
If you add a plus '+' in the local name, everything after the first plus sign will be ignored. This allows certain emails to be filtered. Note that this rule does not apply to domain names.

For example, "m.y+name@email.com" will be forwarded to "my@email.com".
It is possible to use both of these rules at the same time.

Given an array of strings emails where we send one email to each emails[i], return the number of different addresses that actually receive mails.

Example 1:

Input: emails = ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]
Output: 2
Explanation: "testemail@leetcode.com" and "testemail@lee.tcode.com" actually receive mails.


Example 2:

Input: emails = ["a@leetcode.com","b@leetcode.com","c@leetcode.com"]
Output: 3

	 */


	@Test
	public void test1()
	{
		String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
		String [] Outputarry= {"testemail@leetcode.com","testemail@lee.tcode.com"};
		int Output= 2;
		System.out.println(numUniqueEmails(emails));
		Assert.assertEquals(Output, numUniqueEmails(emails));
	}

	@Test
	public void test2()
	{
		String[] emails = {"a@leetcode.com","b@leetcode.com","c@leetcode.com"};
		int Output= 3;
		System.out.println(numUniqueEmails(emails));
		Assert.assertEquals(Output, numUniqueEmails(emails));
	}


	/*
		-Declare a HashSet to get the unique email
		- Declare String username, domainame newEmail
		- Iterate a for loop 
		 -	Get the Split position of email into two parts by @ usernameside and domainameside
		 -	Get the substring of usernameside from 0 to split_position
		 -	Get the substring of domainame from split_position
		 -	if username contains + get the index of + 
		 -	get username substring from 0 to +position 
		 -	remove . from the username 
		 -	Concatenate username and domainname
		 -  Add in the uniqueEmails set and return size 
	 */

	private int numUniqueEmails(String[] emails) {

		HashSet<String> uniqueEmails= new HashSet<String>();
		for (String email : emails) {
			int split_position =email.indexOf("@");
			String username = email.substring(0, split_position);
			String domainame = email.substring(split_position);

			if(username.contains("+")) { 
				int plus_position = username.indexOf("+"); 
				username=username.substring(0,plus_position);
				username=username.replace(".", "");

			}	
			String newEmail=username+domainame;
			uniqueEmails.add(newEmail);
		}

		return uniqueEmails.size();
	}


}
