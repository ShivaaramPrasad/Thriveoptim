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

public class Amazon {
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

		// Click Choose and Select Electronics
		driver.findElement(By.id("searchDropdownBox")).click();
		WebElement allCategories =driver.findElement(By.id("searchDropdownBox"));
		Select value_one = new Select(allCategories);
		//List<WebElement> options_two=value_one.getOptions();
		//int count =options.size();
		value_one.selectByVisibleText("Electronics");
		// Type 'iphone' and Enter
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone",Keys.ENTER);
		String newTabURL=driver.findElement(By.xpath("(//div[@class='s-no-outline']//span/following::span[contains(@class,'a-size-medium a-color-base')])[1]/parent::a")).getAttribute("href");
		System.out.println("url : "+newTabURL);
		driver.findElement(By.xpath("(//div[@class='s-no-outline']//span/following::span[contains(@class,'a-size-medium a-color-base')])[1]")).click();
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));	   
		// newTab.get(UrlToClick);
	    System.out.println("Second Tab Title"+driver.getTitle());
	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("add-to-cart-button")));
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.findElement(By.xpath("//span[text()=' Cart ']/following::input")).click();
		driver.close();
		driver.quit();

	}
}
