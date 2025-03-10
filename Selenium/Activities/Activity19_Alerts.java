package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity19_Alerts {

	public static void main(String[] args) {
		/*
		 * Activity 19 Alerts #2 Using Selenium:
		 * 
		 * Open a new browser to https://training-support.net/webelements/alerts Get the
		 * title of the page and print it to the console. Find the button to open a
		 * CONFIRM alert and click it. Switch the focus from the main window to the
		 * Alert box and get the text in it and print it. Close the alert once with Ok
		 * and again with Cancel. Close the browser.
		 */
		
		 // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://training-support.net/webelements/alerts");
        // Print the title of the page
        System.out.println("Page title: " + driver.getTitle());

        // Find and click the button to open the alert
        driver.findElement(By.id("confirm")).click();

        // Switch focus to the alert
        Alert confirmAlert = driver.switchTo().alert();

        // Print the text in the alert
        String alertText = confirmAlert.getText();
        System.out.println("Text in alert: " + alertText);

        // Close the alert by clicking OK
        confirmAlert.accept();

        // Can also close the alert by clicking Cancel
        // confirmAlert.dismiss();

        // Print the message
        System.out.println(driver.findElement(By.id("result")).getText());

        // Close the browser
        driver.quit();
    }
}