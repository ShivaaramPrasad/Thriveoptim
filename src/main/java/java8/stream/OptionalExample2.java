package java8.stream;

import java.util.Optional;

public class OptionalExample2 {

	public static void main(String[] arg) {

		String[] mentorName =new String[5];
		// Default value --> null
		mentorName[0] ="Shivaaram";
		mentorName[1] ="Krishna";
		mentorName[2] ="Sagar";
		mentorName[3] ="Pranathi";

		// Upto java 1.7
	
		for (int i = 0; i < mentorName.length; i++) {
			if(mentorName[i]!=null) {
			System.out.println(mentorName[i].toUpperCase());
			} else {
				System.out.println("This name is null , so here is default name");
			}
		}
		
		
		// From java 1.8
		
		for (int i = 0; i < mentorName.length; i++) {
			Optional<String> name = Optional.ofNullable(mentorName[i]);
			if(name.isPresent()) {
				System.out.println(name.get().toUpperCase());
			}else {
				System.out.println("The name is null , so here is default name");
			}
		}

	}

	
}
