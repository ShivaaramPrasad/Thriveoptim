package fivehrplane.dsa;

import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;

public class UniqueEmailAddresses_929 {
	

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
