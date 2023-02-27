package com.vanillascript;

import java.time.Duration;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart {
	public static  void main(String[] args) throws InterruptedException {
		Map<String,Integer> productMap= new HashMap<String,Integer>();
		String productName;
		String productPriceText;
		String productRatingText;
		double  productRating;
		int productPrice;
		String lowestValueUrl = null;
		int lowestPrice = Integer.MAX_VALUE;

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
		List<WebElement> productLink = driver.findElements(By.xpath("//span[contains(text(),'Ratings')]/preceding::a[contains(@target,'blank')]"));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Help Center']")));

		for(int i=0;i<productLink.size();i++) {
			productName = productNameWeb.get(i).getText();
			productRatingText = productRatingWeb.get(i).getText();
			productRating = Double.parseDouble(productRatingText);
			productPriceText = productPriceWeb.get(i).getText();
			productPriceText = productPriceText.replaceAll("[^0-9]", "");
			productPrice = Integer.parseInt(productPriceText);
			String url = productLink.get(i).getAttribute("href");
			System.out.println(productName+" "+productRating+" "+productPrice);
			System.out.println(url);
			productMap.put(productLink.get(i).getAttribute("href"), productPrice);
		}
		
		for (Map.Entry<String, Integer> entry : productMap.entrySet()) {
			if (lowestValueUrl == null || entry.getValue() < productMap.get(lowestValueUrl)) {
				lowestValueUrl = entry.getKey();
				lowestPrice = entry.getValue();
			}
		}
		System.out.println("Lowest Product Url: "+lowestValueUrl);
		System.out.println("Lowest Product Price: "+lowestPrice);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to(lowestValueUrl);
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
	}
}
