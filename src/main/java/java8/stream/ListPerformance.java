package java8.stream;

import java.awt.FontFormatException;
import java.util.ArrayList;
import java.util.List;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

//@FunctionalInterface // can have only one interface method ==1
public class ListPerformance {

	public static void main(String[] args) {
		
		List<String> mentors =new ArrayList<>();
		mentors.add("Shivaaram");
		mentors.add("Ram");
		mentors.add("Aravind");
		mentors.add("Dillip");
		mentors.add("Pranathi");
		mentors.add("Sagar");
		
	// I want to find out how many mentors have name length greater than 5
	
	int count =0;
	for(int i=0 ;  i< mentors.size();  i++) {
		if(mentors.get(i).length() > 5) {
			count++;
		}
	}
	System.out.println(count);
	
	long count2 = mentors.stream().filter(ment -> ment.length() >8).count();
	System.out.println(count2);
}
}