package com.vanillascript;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Goibibo {
	
	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/flights");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));

		int size =driver.findElements(By.xpath("//span[@class='logSprite icClose']")).size();
		if(size==1) {
			driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		}else {
			System.out.println("No close button");
		}
		driver.findElement(By.xpath("//span[text()='Round-trip']/preceding-sibling::span")).click();
		driver.findElement(By.xpath("//p[text()='Enter city or airport']")).click();
		driver.findElement(By.xpath("//span[text()='From']/following-sibling::input[@type='text']")).sendKeys("Chennai");
		//driver.findElement(By.xpath("//span[text()='Chennai, India']")).click();
		driver.findElement(By.xpath("//span[text()='Chennai, India']")).click();

		//driver.findElement(By.xpath("(//p[text()='Enter city or airport'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='To']/following-sibling::input[@type='text']")).sendKeys("Bangalore");
		//driver.findElement(By.xpath("//span[text()='Bengaluru, India']")).click();	
		driver.findElement(By.xpath("//span[text()='Done']")).click();
		driver.findElement(By.xpath("//a[text()='Done']")).click();

		driver.findElement(By.xpath("//span[text()='SEARCH FLIGHTS']")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[contains(@class,'common-elementsstyles__AnimatedBackground')]")));
		
	   
		
	}
	


}
