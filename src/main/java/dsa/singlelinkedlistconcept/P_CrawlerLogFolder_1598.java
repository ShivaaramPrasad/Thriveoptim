package dsa.singlelinkedlistconcept;

import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;

public class P_CrawlerLogFolder_1598 {
	@Test
	public  void test1() {
		String [] logs = {"d1/","d2/","../","d21/","./"};
        int output=2;
        
        Assert.assertEquals(output, minOperations(logs));
	}
	
	@Test
	public  void test2() {
		String [] logs = {"d1/","d2/","./","d3/","../","d31/"};
        int output=3;
        
        Assert.assertEquals(output, minOperations(logs));
	}
	
	@Test
	public  void test3() {
		String [] logs = {"d1/","../","../","../"};
        int output=0;
        
        Assert.assertEquals(output, minOperations(logs));
	}
	
	/*
	Pseudocode - Stack
	1. If new dir then add to stack
	2. If ../ - pop the stack (if stack is not empty)
	3. If ./ - do not perform any actions
	4. Return the size of stack
*/

	private int minOperations(String[] logs) {
        Stack<String> stack =new Stack();
		
        for( String log:logs) {
        	if( log.equals("../"))
        	{
        		{if(!stack.isEmpty())stack.pop();}
        	}else if(log.equals("./")) {
        		continue;
        	}else {
        		stack.push(log);
        	}
        }
		return stack.size();
	}
}
