package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity16_Test {

	public static void main(String[] args) {

		/*
		 * Activity 16 Selects #1 Using Selenium:
		 * 
		 * Open a new browser to https://training-support.net/webelements/selects Get
		 * the title of the page and print it to the console. On the Single Select:
		 * Select the second option using the visible text. Select the third option
		 * using the index. Select the fourth option using the value. Get all the
		 * options and print them to the console. Close the browser.
		 */

		// Initialize the Firefox driver
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Open the page
		driver.get("https://training-support.net/webelements/selects");
		// Print the title of the page
		System.out.println("Page title: " + driver.getTitle());

		// Find the dropdown element

		WebElement select1 = driver.findElement(By.tagName("select"));
		Select dropdown = new Select(select1);

		// select the second option using the visible text
		dropdown.selectByVisibleText("Two");
		System.out.println("Selected option: " + dropdown.getFirstSelectedOption().getText());

		// Select the third option using the index

		dropdown.selectByIndex(3);
		System.out.println("Selected option: " + dropdown.getFirstSelectedOption().getText());

		// select the fourth option using the value
		dropdown.selectByValue("four");
		System.out.println("Selected option: " + dropdown.getFirstSelectedOption().getText());

		// get att the option and print them to the console
		for (WebElement option : dropdown.getOptions()) {
			System.out.println(option.getText());
		}
		
		//close the browser
 		driver.quit();
	}

}
