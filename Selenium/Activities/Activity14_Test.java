package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity14_Test {

	public static void main(String[] args) {

		/*
		 * Activity 14 Tables #2 Using Selenium:
		 * 
		 * Open a new browser to https://training-support.net/webelements/tables Get the
		 * title of the page and print it to the console. Using xpaths on the table:
		 * Find the number of rows and columns in the table and print them. Find and
		 * print the Book Name in the 5th row. Click the header of the Price column to
		 * sort it in ascending order. Find and print the Book Name in the 5th row
		 * again. Close the browser.
		 */

		// Initialize the Firefox driver
		WebDriver driver = new ChromeDriver();
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Open the page
		driver.get("https://training-support.net/webelements/tables");
		// Print the title of the page
		System.out.println("Page title: " + driver.getTitle());

		// print the number rows and columns
		List<WebElement> columns = driver.findElements(By.xpath("//table[contains(@class,'table-auto')]/thead/tr/th"));
		List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class,'table-auto')]/thead/tr"));
		System.out.println("No. of rows:" + rows.size());
		System.out.println("No. of columns:" + columns.size());

		// print the 5th book title from the table
		WebElement fifthRowBook = driver.findElement(By.xpath("//table[contains(@class,'table-auto')]/tbody/tr[5]/td[2]"));
		System.out.println("fifth book: " + fifthRowBook.getText());

		// sort the table by price
		driver.findElement(By.xpath("//table[contains(@class,'table-auto')]/thead/tr/th[5]")).click();

		// print the 5th book title from the table again
		fifthRowBook = driver.findElement(By.xpath("//table[contains(@class,'table-auto')]/tbody/tr[5]/td[2]"));
		System.out.println("fifthbook title again: " + fifthRowBook.getText());

		// close the browser
		driver.quit();
	}

}
