package teatcaseEnumeration;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FindtheFailer {
	
public static void main(String[] args) throws IOException {
	int count = 0;	
		String fileName = "./data/repot.txt";
		File file = new File(fileName);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line=br.toString();
		while((line = br.readLine()) != null){
			if(line.equals("Stack Trace")&& line.contains("Exception.")) {
				count++; 
				System.out.println(line);
			}
			System.out.println(count);
		}
		
	}

}
