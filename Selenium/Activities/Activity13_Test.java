package activities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity13_Test {

	public static void main(String[] args) {

		/*
		 * Activity 13 Tables #1 Using Selenium:
		 * 
		 * Open a new browser to https://training-support.net/webelements/tables Get the
		 * title of the page and print it to the console. Using xpaths on the table:
		 * Find the number of rows and columns in the table and print them. Find and
		 * print all the cell values in the third row of the table. Find and print the
		 * cell value at the second row second column. Close the browser.
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

		// print the third row of the table
		WebElement thirdRow = driver.findElement(By.xpath("//table[contains(@class,'table-auto')]/tbody/tr[3]"));
		System.out.println("Third row: " + thirdRow.getText());

		// print the second row, second cell value
		WebElement row2Cell2 = driver.findElement(By.xpath("//table[contains(@class,'table-auto')]/tbody/tr[2]/td[2]"));
		System.out.println("Second row,Second cell:" + row2Cell2.getText());
		
		// close the browser
		driver.quit();

	}

}
