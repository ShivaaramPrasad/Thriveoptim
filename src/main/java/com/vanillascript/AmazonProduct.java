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

public class AmazonProduct {
	public static  void main(String[] args) throws InterruptedException {
		// Lunch  Chrome 
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		//String currentHandle= driver.getWindowHandle();
		//Load URL:
		//	    1. Login to https://www.amazon.in/

		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//span[contains(text(),'sign in')]")).click();
		driver.findElement(By.id("ap_email")).sendKeys("");;
		driver.findElement(By.id("ap_email")).sendKeys("");;
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//span[text()='Returns']/following-sibling::span")).click();
		driver.findElement(By.xpath("//span[text()[normalize-space()='past 3 months']]")).click();
		driver.findElement(By.linkText("2022")).click();
		(//span[text()[normalize-space()='Delivered 09-Dec-2022']]/following::a[@class='a-link-normal'])
		driver.close();
		driver.quit();

	}
}
