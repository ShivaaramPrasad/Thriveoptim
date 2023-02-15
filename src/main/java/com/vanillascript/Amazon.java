package com.vanillascript;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Amazon {
	public static  void main(String[] args) throws InterruptedException {
		// Lunch  Chrome 
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
	
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		//Load URL:
		//	    1. Login to https://www.amazon.in/

		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		// Click Choose and Select Furniture
		driver.findElement(By.id("searchDropdownBox")).click();

		WebElement allCategories =driver.findElement(By.id("searchDropdownBox"));
		Select value_one = new Select(allCategories);
		List<WebElement> options_two=value_one.getOptions();
		//int count =options.size();
		value_one.selectByVisibleText("Electronics");

		// Type 'chairs for computer table' and Enter
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone",Keys.ENTER);

		List<WebElement> price = driver.findElements(By.xpath("(//span[text()='Sponsored'])[2]/following::span[@class='a-price']"));

		List<Integer> aNum = new ArrayList<Integer>();

		for (WebElement webElement_sort : price) {
			System.out.println("Iphone " +webElement_sort.getText());

		}

		driver.close();
	}


}
