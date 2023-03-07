package com.vanillascript;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.junit.Assert;

public class ChromeDowloadShadowDom {
	
	public static  void main(String[] args) throws InterruptedException {

	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	WebDriver driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get("chrome://downloads");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	JavascriptExecutor js= (JavascriptExecutor)driver;
	WebElement ele= (WebElement)js.executeScript("return document.querySelector(\"body > downloads-manager\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#leftSpacer > h1\")");
	System.out.println(ele.getText());
	Assert.assertEquals("Downloads", ele.getText());
    
}
	
}
