package activities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity15_Test {

	public static void main(String[] args) {
		/*
		 * Activity 15 Dynamic Attributes Using Selenium:
		 * 
		 * Open a new browser to
		 * https://training-support.net/webelements/dynamic-attributes Get the title of
		 * the page and print it to the console. Find the input fields and type in the
		 * required data in the fields. Wait for success message to appear and print it
		 * to the console. Close the browser.
		 */

		// Initialize the Firefox driver
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Open the page
		driver.get(" https://training-support.net/webelements/dynamic-attributes");
		// Print the title of the page
		System.out.println("Page title: " + driver.getTitle());

		// Find the full name field and enter the details
		driver.findElement(By.xpath("//input[starts-with(@id,'full-name-')]")).sendKeys("Deepa");

		// Find the email field and enter details
		driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("deepaghodki786@gmail.com");

		// Find the date field and enter details
		// Date must be entered as YYYY-MM-DD format
		driver.findElement(By.xpath("//input[contains(@name,'-event-date')]")).sendKeys("15-01-2025");

		// Find the additional details field and enter additional details
		driver.findElement(By.xpath("//label[text()='Additional Details']/following-sibling::textarea")).sendKeys("Sankranti!!");

		// Find and click the submit button
		driver.findElement(By.xpath("//button[text()='Submit']")).click();

		// to print confirmation message
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("action-confirmation"))).getText();
		String message = driver.findElement(By.id("action-confirmation")).getText();
		System.out.println(message);
		
		// close the browser
		driver.quit();

	}

}
