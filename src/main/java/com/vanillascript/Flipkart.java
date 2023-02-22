package com.vanillascript;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	public static  void main(String[] args) throws InterruptedException {

	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	WebDriver driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	driver.findElement(By.name("q")).sendKeys("washing machine",Keys.ENTER);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(5000);
	WebElement rating = driver.findElement(By.xpath("//div[text()='4★ & above']"));
	JavascriptExecutor jse_option = (JavascriptExecutor)driver;
	jse_option.executeScript("arguments[0].scrollIntoView(true)", rating);
	jse_option.executeScript("arguments[0].click();", rating);
	Thread.sleep(3000);
		
	List<WebElement> productNameWeb = driver.findElements(By.xpath("//span[contains(text(),'Ratings')]/preceding::div[2]"));
	List<WebElement> productRatingWeb = driver.findElements(By.xpath("//span[starts-with(@id,'productRating')]//div"));
	List<WebElement> productPriceWeb = driver.findElements(By.xpath("//span[contains(text(),'off')]/preceding::div[2]"));
	String productName;
	String productPriceText;
	String productRatingText;
	double  productRating;
	int productPrice;
	for(int i=0;i<productNameWeb.size();i++) {
		productName = productNameWeb.get(i).getText();
		productRatingText = productRatingWeb.get(i).getText();
		productRating = Double.parseDouble(productRatingText);
		productPriceText = productPriceWeb.get(i).getText();
		productPriceText = productPriceText.replaceAll("[^0-9]", "");
		productPrice = Integer.parseInt(productPriceText);
		//map_final_products.put(int_product_price,product_name);
		System.out.println(productName+" "+productRating+" "+productPrice);	
		
}
	}
}
