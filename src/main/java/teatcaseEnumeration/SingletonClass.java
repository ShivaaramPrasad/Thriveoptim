package teatcaseEnumeration;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class SingletonClass {
	
	/*
	 * DESIGN a driver class for chrome browser
test classes will use driver to get a browser
each test runs in different thread
each thread has only one browser - no matter how many times you ask for a new browser

	 */
	
	static Map <Long, WebDriver> drivermap =  new HashMap<>();
      public  WebDriver getBrowserInstance(){
    	  //long threadId = Thread.currentThread().getId();
    	  WebDriver driver = null;
    	  if(drivermap.containsValue(Thread.currentThread().getId())){
    		  return drivermap.get(Thread.currentThread().getId());
    	  }
    	  else {
    		  driver= new ChromeDriver();
    		  drivermap.put(Thread.currentThread().getId(),driver);
    		  return driver;
    	  }
        	
        }      
   
      @Test
      public void test1() {
    	  WebDriver driver=getBrowserInstance();
    	  driver.get("https://www.google.com");
      }
      
      @Test
      public void test2() {
    	  WebDriver driver=getBrowserInstance();
    	  driver.get("https://www.facebook.com");
      }
      
}
