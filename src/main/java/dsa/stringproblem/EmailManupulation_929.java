package dsa.stringproblem;

public class EmailManupulation_929 {

	public static void main(String[] args) {
		String email="teste.mail+david@lee.tcode.com";
		System.out.println("Email: "+email);
		int split_position =email.indexOf("@");
		String username = email.substring(0, split_position);
		System.out.println("UserName: "+username);
		String domainame = email.substring(split_position);
		System.out.println("Domin: "+domainame);
		int plus_position = username.indexOf("+"); 
		username=username.substring(0,plus_position);
		System.out.println("Remove+: "+username);
		username=username.replace(".", "");
		System.out.println("Remove.: "+username);		
		String newEmail=username+domainame;
		System.out.println("Add Username and domainame: "+newEmail);
	}

}
