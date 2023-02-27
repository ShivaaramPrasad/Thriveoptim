package com.vanillascript;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.apache.tools.ant.types.CommandlineJava.SysProperties;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.Assertion;

import groovyjarjarantlr4.v4.codegen.model.Action;

public class Myntra {

	public static  void main(String[] args) throws InterruptedException {
		// Lunch  Chrome 
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);	
		driver.manage().window().maximize();		
		driver.get("https://www.myntra.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
	//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));

	    Actions action =new Actions(driver);
        JavascriptExecutor js = (JavascriptExecutor)driver;		

		WebElement men= driver.findElement(By.xpath("//a[text()='Men']"));
		action.moveToElement(men).build().perform();
	    driver.findElement(By.xpath("//a[text()='Jackets']")).click();
	    Thread.sleep(5000);
	    WebElement roadster =driver.findElement(By.xpath("//span[text()='Brand']//following::input[@value='Roadster' and @type='checkbox']"));
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Brand']//following::input[@value='Roadster' and @type='checkbox']")));
        js.executeScript("arguments[0].click();", roadster);
        WebElement wrong = driver.findElement(By.xpath("//input[@value='WROGN' and @type='checkbox']"));
        js.executeScript("arguments[0].click();", wrong);
	    Thread.sleep(5000);
		String offerText = driver.findElement(By.xpath("(//span[contains(text(),'OFF')])[1]")).getText();
		offerText = offerText.replaceAll("[^0-9]", "");
		int offerPrice = Integer.parseInt(offerText);
		System.out.println("First product offer "+offerPrice);
		driver.findElement(By.xpath("(//div[@class='search-searchProductsContainer row-base']//following::img)[1]")).click();
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));	   
	    System.out.println("Second Tab Title "+driver.getTitle());
	    String oFF = driver.findElement(By.className("pdp-discount")).getText();
		String productOfferText= driver.findElement(By.xpath("//span[contains(text(),'OFF')]")).getText();
		productOfferText = productOfferText.replaceAll("[^0-9]", "");
		int productOffer = Integer.parseInt(offerText);
		System.out.println("Selected product offer "+oFF+" "+productOffer);
        Assert.assertEquals("PASS", productOffer, offerPrice);
		String discountPriceText= driver.findElement(By.xpath("//span[@class='pdp-price']//strong[1]")).getText();
		String mrpPriceText= driver.findElement(By.xpath("//span[text()='MRP ']//s")).getText();
		mrpPriceText = mrpPriceText.replaceAll("[^0-9]", "");
		int mrpPrice = Integer.parseInt(mrpPriceText); 
        System.out.println("MRP Price: "+mrpPrice);
		discountPriceText = discountPriceText.replaceAll("[^0-9]", "");
		int discountPrice = Integer.parseInt(discountPriceText);
		System.out.println("Discount Price: "+discountPrice);
		int diffrenceAmount=mrpPrice-discountPrice;
		double discountPercentage=(diffrenceAmount/mrpPrice)*100;
	    System.out.println("Discount Percentage: "+discountPercentage);
		List<WebElement> findElements = driver.findElements(By.xpath("//button[not(contains(@class,'disabled')) and contains(@class,'size-buttons-size-button')]"));
		Random r = new Random();
		int randomValue = r.nextInt(findElements.size()); //Getting a random value that is between 0 and (list's size)-1
		findElements.get(randomValue).click(); //Clicking on the random item in the list.
	    Thread.sleep(5000);
		driver.findElement(RelativeLocator.with(By.tagName("span")).toRightOf(By.xpath("//div[contains(text(),'ADD TO BAG')]"))).click();
	    Thread.sleep(5000);
		//driver.findElement(By.xpath("//div[contains(text(),'ADD TO BAG')]")).click();
	   // Thread.sleep(5000);
        driver.quit();
}
}
