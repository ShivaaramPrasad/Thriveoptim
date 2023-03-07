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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.junit.Assert;

public class Salseforce {
	public static  void main(String[] args) throws InterruptedException {
		// Lunch  Chrome 
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();


		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

		driver.findElement(By.id("username")).sendKeys("laksvijay07@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Chennai@1992");
		driver.findElement(By.id("Login")).click();

		Actions action =new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;		
	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	    
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='photoContainer forceSocialPhoto']")));		
		WebElement globaActions= driver.findElement(By.xpath("//span[@class='photoContainer forceSocialPhoto']"));
		action.moveToElement(globaActions);
		String ViewProfile= driver.findElement(By.xpath("//span[@class='photoContainer forceSocialPhoto']")).getText();
		if(ViewProfile.equals("View profile")) {
			System.out.println("verified "+ViewProfile);
		}
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//li[@class='slds-global-actions__item slds-dropdown-trigger slds-dropdown-trigger--click'])[1]")));
		
		driver.findElement(By.xpath("(//li[@class='slds-global-actions__item slds-dropdown-trigger slds-dropdown-trigger--click'])[1]")).click();
		driver.findElement(By.xpath("//span[text()='New Lead']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Prasad");
		driver.findElement(By.xpath("//span[text()='Company']/following::input)[1]")).click();
		driver.findElement(By.xpath("//span[text()='Company']/following::input)[1]")).sendKeys("thriveopmtim");
		driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
		String verify_message = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]")).getText();
		if(verify_message.contains("Lead"))
			System.out.println(verify_message);
		else
			System.out.println("Create Lead is not successful");
		driver.findElement(By.className("slds-icon-waffle")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		String salesTab = driver.findElement(By.xpath("//span[@title='Sales']")).getText();
		if(salesTab.contains("Sales"))
			System.out.println("Tab "+salesTab);
		else
			System.out.println("Sales Tab not shown");
		String openNumText = driver.findElement(By.xpath("//span[contains(text(),'Open')]/following-sibling::lightning-formatted-text")).getText();
		openNumText = openNumText.replaceAll("[^0-9]", "");
		int productOffer = Integer.parseInt(openNumText);
		System.out.println("Amount "+productOffer);
		
		driver.findElement(By.xpath("//span[text()='Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Leads']")).click();
		List<WebElement> elementName = driver.findElements(By.xpath( "//a[@data-refid='recordId']"));
		List<String> name = new ArrayList<String>();
		for (int i = 0; i < elementName.size(); i++) {
			name.add(elementName.get(i).getText());
			}
		System.out.println(name);
		Collections.sort(name);
		driver.findElement(By.xpath("//span[text()='Name']")).click();
		List<String> nameSort = new ArrayList<String>();
		List<WebElement> elementNameSort = driver.findElements(By.xpath( "//a[@data-refid='recordId']"));

		for (int i = 0; i < elementNameSort.size(); i++) {
			nameSort.add(elementNameSort.get(i).getText());
			}
		System.out.println(nameSort);
		//driver.close();
		//driver.quit();

	}
}
