package com.vanillascript;

import java.text.DecimalFormat;
import java.text.Format;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Bestbuy {
	public static  void main(String[] args) throws InterruptedException {
		// Lunch  Chrome 
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		//String currentHandle= driver.getWindowHandle();
		//Load URL:
		//	    1. Login to https://www.amazon.in/

		driver.get("https://www.bestbuy.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

  /*
   1) Go to https://www.bestbuy.com/
2) Select the country as the United States
3) Close the Signup pop up [If it appeared – it may appear after few seconds]
4) Enter the search field as ""Laptops"" and Choose an option from the options (laptops
computers)
5) Get the overall count of items displayed
6) Choose the checkboxes of HP and Dell, Under the brand category and confirm the filters
of the same brand is appearing on the right
7) Confirm count of items has reduced from the previously

   */

	//choose United State
		driver.findElement(By.xpath("//h4[text() = 'United States']")).click();	
		
	/* close signin dialog
		WebDriverWait wait = new WebDriverWait(driver, 30);	
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[@type='button']")));
		driver.findElement(By.xpath("//button[@type='button']")).click();
	*/

	//search for laptops
		driver.findElement(By.id("gh-search-input")).sendKeys("Laptops");
		driver.findElement(By.className("header-search-icon")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;

	//get the laptop count and print
		
	//choose PC laptops and get the count
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[contains(text(),'items')])[1]")));
		WebElement items = driver.findElement(By.xpath("(//span[contains(text(),'items')])[1]"));

		jse.executeScript("arguments[0].scrollIntoView(true)", items);
		
		WebElement beforeCount = driver.findElement(By.xpath("(//span[contains(text(),'items')])[1]"));
		String strCount = beforeCount.getText().replaceAll("[^0-9]", "");
		int beforeFilter = Integer.valueOf(strCount);
		System.out.println("beforeFilter :" + beforeFilter);
	
	//choose HP and Dell checkbox 
		WebElement DIVelement = driver.findElement(By.xpath("(//div[contains(@class,'sticky-container lv')])[1]"));

		jse.executeScript("arguments[0].scrollIntoView(true)", DIVelement);
		
		driver.findElement(By.xpath("//a[text() = 'HP']/parent::div/preceding-sibling::input")).click();
		driver.findElement(By.xpath("//a[text() = 'Dell']/parent::div/preceding-sibling::input")).click();
		Thread.sleep(5000);
		
	//confirm if HP and Dell laptops are displayed



		List<WebElement> hpdellList = driver.findElements(By.className("sku-title"));
		
		for(int i=0; i<hpdellList.size(); i++) {
			 String str = hpdellList.get(i).getText();
	    	 if(!str.contains("HP") || !str.contains("Dell")) {
	    		 System.out.println("Filters contains other brand items: " + str);
	    		 break;
	    	 }
	     }
	
	//take the count and compare with the original count
		
		WebElement afterCount = driver.findElement(By.className("item-count"));
		String strCount2 = afterCount.getText().replaceAll("[^0-9]", "");
		int afterFilter = Integer.valueOf(strCount2);
		System.out.println("afterFilter :" + afterFilter);
		
		if(beforeFilter == afterFilter) 
			System.out.println("Count remains same even after filtering wrt brands");
		else
			System.out.println("Count differs after filtering wrt brands");
	
	//choose Price Low to High from SortBy dropdown		
		WebElement sortByBest = driver.findElement(By.id("sort-by-select")); 
		Select sc = new Select(sortByBest);
		
		sc.selectByValue("Price-Low-To-High");		

	}
}
