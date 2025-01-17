package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity5_Test {

	public static void main(String[] args) {

		/*
		 * Open a new browser to
		 * https://training-support.net/webelements/dynamic-controls Get the title of
		 * the page and print it to the console. On the page, perform: Find the checkbox
		 * input element. Check if it is visible on the page. Click the
		 * "Remove Checkbox" button. Check if it is visible again and print the result.
		 * Close the browser.
		 */

		WebDriver driver = new ChromeDriver();
		driver.get(" https://training-support.net/webelements/dynamic-controls");
		System.out.println("Page title is: " + driver.getTitle());
		WebElement checkbox = driver.findElement(By.id("checkbox"));

		System.out.println("Is The checkbox visible:" + checkbox.isDisplayed());
		driver.findElement(By.xpath("//button[contains90]")).click();
		System.out.println("Is the checkbox visible?" + checkbox.isDisplayed());
		driver.quit();
	}

}
