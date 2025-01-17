package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11_Test {

	public static void main(String[] args) {
		/*
		 * Using Selenium:
		 * 
		 * Open a new browser to
		 * https://training-support.net/webelements/dynamic-controls Get the title of
		 * the page and print it to the console. On the page, perform: Find the checkbox
		 * on the page. Click the "Toggle Checkbox" button to remove the checkbox. Wait
		 * for the checkbox to disappear. Toggle the checkbox again. Wait for it appear
		 * and then select it. Close the browser.
		 */

		// Initialize the Firefox driver
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Open the page
		driver.get("https://training-support.net/webelements/dynamic-controls");
		// Print the title of the page
		System.out.println("Page title: " + driver.getTitle());

		// find the checkbox
		WebElement checkbox = driver.findElement(By.id("checkbox"));

		// click the button to Toggle Checkbox visibility
		driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();

		// wait for the checkbox to disappear
		wait.until(ExpectedConditions.invisibilityOf(checkbox));

		
		// click the button to Toggle visibility
		driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
		
		// close the browser
		driver.quit();
	}

}
