package activities;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity18_Alerts {

	public static void main(String[] args) {

		/*
		 * Activity 18 Alerts #1 Using Selenium:
		 * 
		 * Open a new browser to https://training-support.net/webelements/alerts Get the
		 * title of the page and print it to the console. Find the button to open a
		 * SIMPLE alert and click it. Switch the focus from the main window to the Alert
		 * box and get the text in it and print it. Close the alert once with OK. Close
		 * the browser.
		 */
		// Initialize the Firefox driver
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Open the page
		driver.get("https://training-support.net/webelements/alerts");
		// Print the title of the page
		System.out.println("Page title: " + driver.getTitle());

		// Find the element to launch the alert
		driver.findElement(By.id("simple")).click();

		// Switch focus to alert
		Alert simpleAlert = driver.switchTo().alert();

		// Print the alert text
		System.out.println("Alert message:" + simpleAlert.getText());

		// Click ok on the alert
		simpleAlert.accept();

		// close the browser
		driver.quit();
	}

}
