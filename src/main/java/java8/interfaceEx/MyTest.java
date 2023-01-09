package java8.interfaceEx;

import org.openqa.selenium.WebDriver.Timeouts;

public class MyTest {
	
 public static void main(String[] args) {
	
	 Chrome  driver= new Chrome();
	 driver.getTitle(); // from Chrome 
	 driver.maximize(); // from Browser Interface method access via obj
	 
	 // access static method 
	 Browser.quit();
	 
	 // Interface : Selenium Example 
	 //WebDriver , WebElement, A lert, SerachContext 
	 
	 //After 1.8
	 /*
	 Under WebDriverTime 
	 default Timeouts implicitlyWait(Duration duration) {
		return (duration); 
	 }
	 */
}

}
