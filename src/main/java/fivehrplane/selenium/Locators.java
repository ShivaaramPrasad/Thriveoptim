package fivehrplane.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Locators {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();


	}
	/*
	ID Locator: It is the most common way to locate a web element by its unique ID attribute. The syntax to locate an element using ID locator is:

		driver.findElement(By.id(""));

Name Locator: This locator is used to locate elements by their name attribute. The syntax to locate an element using name locator is:

		driver.findElement(By.name(""));

Class Name Locator: This locator is used to locate elements by their class attribute. The syntax to locate an element using class name locator is:

		driver.findElement(By.className(""));

Tag Name Locator: This locator is used to locate elements by their tag name. The syntax to locate an element using tag name locator is:

		driver.findElement(By.tagName(""));

Link Text Locator: This locator is used to locate hyperlink elements by their link text. The syntax to locate an element using link text locator is:

		driver.findElement(By.linkText(""));

Partial Link Text Locator: This locator is used to locate hyperlink elements by a partial match of their link text. The syntax to locate an element using partial link text locator is:

		driver.findElement(By.partialLinkText(""));

CSS Selector Locator: This locator is used to locate elements by CSS selectors. The syntax to locate an element using CSS selector locator is:

		driver.findElement(By.cssSelector(""));

XPath Locator: This locator is used to locate elements using XPath expressions. The syntax to locate an element using XPath locator is:

		driver.findElement(By.xpath(""));


near
		driver.findElement(RelativeLocator.with(By.tagName("span")).near(By.xpath("//div[contains(text(),'ADD TO BAG')]"))).click();

above
		driver.findElement(RelativeLocator.with(By.tagName("span")).above(By.xpath("//div[contains(text(),'ADD TO BAG')]"))).click();

below
		driver.findElement(RelativeLocator.with(By.tagName("span")).below(By.xpath("//div[contains(text(),'ADD TO BAG')]"))).click();

to_left_of
		driver.findElement(RelativeLocator.with(By.tagName("span")).toLeftOf(By.xpath("//div[contains(text(),'ADD TO BAG')]"))).click();

to_right_of
		driver.findElement(RelativeLocator.with(By.tagName("span")).toRightOf(By.xpath("//div[contains(text(),'ADD TO BAG')]"))).click();

	 */
	

}
