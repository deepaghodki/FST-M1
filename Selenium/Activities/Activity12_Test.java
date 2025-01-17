package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity12_Test {

	public static void main(String[] args) {
		/*
		 * Open a new browser to
		 * https://training-support.net/webelements/dynamic-content Get the title of the
		 * page and print it to the console. On the page, perform: Find and click the
		 * "Click me!" button. Wait till the word "release" appears. Get the text and
		 * print it to console. Close the browser.
		 */

		// Initialize the Firefox driver
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Open the page
		driver.get(" https://training-support.net/webelements/dynamic-content");
		// Print the title of the page
		System.out.println("Page title: " + driver.getTitle());
		// find button
		driver.findElement(By.id("genButton")).click();

		// wait for till relese appears on the page
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("word"), "release"));

		// Then print the text
		String ele = driver.findElement(By.id("word")).getText();
		System.out.println("Element: "+ele);
		
		// close the browser
		driver.quit();

	}

}
