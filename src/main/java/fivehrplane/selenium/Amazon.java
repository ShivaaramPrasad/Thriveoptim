package fivehrplane.selenium;

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

		driver.findElement(By.id("searchDropdownBox")).click();
		WebElement allCategories =driver.findElement(By.id("searchDropdownBox"));
		Select value_one = new Select(allCategories);

		value_one.selectByVisibleText("Electronics");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Apple iPhone",Keys.ENTER);
		Thread.sleep(5000);

       WebElement element = driver.findElement(By.xpath("(//span[contains(text(),'Apple iPhone')]/..)[last()]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);

		String newTabURL=driver.findElement(By.xpath("(//span[contains(text(),'Apple iPhone')]/..)[last()]")).getAttribute("href");
		System.out.println("url : "+newTabURL);
		driver.findElement(By.xpath("(//span[contains(text(),'Apple iPhone')]/..)[last()]")).click();
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));	   
	    System.out.println("Second Tab Title"+driver.getTitle());
	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("add-to-cart-button")));
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.findElement(By.xpath("//span[text()=' Cart ']/following::input")).click();
		driver.close();
		driver.quit();

	}
}
