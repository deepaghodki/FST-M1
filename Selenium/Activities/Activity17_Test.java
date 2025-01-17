package activities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity17_Test {

	public static void main(String[] args) {
		/*
		 * Activity 17 Selects #2 Using Selenium:
		 * 
		 * Open a new browser to https://training-support.net/webelements/selects Get
		 * the title of the page and print it to the console. On the Multi Select:
		 * Select the "HTML" option using the visible text. Select the 4th, 5th and 6th
		 * options using the index. Select the "Node" option using the value. Deselect
		 * the 5th option using index. Close the browser.
		 */

		// Initialize the Firefox driver
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Open the page
		driver.get("https://training-support.net/webelements/selects");
		// Print the title of the page
		System.out.println("Page title: " + driver.getTitle());

		// Find the dropdown element

		WebElement select2 = driver.findElement(By.xpath("//select[@multiple='']"));
		Select multiSelect = new Select(select2);

		// select the "HTML" option using the visible text
		multiSelect.selectByVisibleText("HTML");

		// select the 4th,5th and 6th options using the index
		for (int i = 3; i <= 5; i++) {
			multiSelect.selectByIndex(i);
		}

		// select the "Node" option using the value
		multiSelect.selectByValue("nodejs");

		// Delect the 5th option using index
		multiSelect.deselectByIndex(4);

		// option that are currently selected
		System.out.println("Selected option are:");
		List<WebElement> selectOptions = multiSelect.getAllSelectedOptions();
		for (WebElement selectedoption : selectOptions) {
			System.out.println(selectedoption.getText());
		}
		// close the browser
		driver.quit();

	}

}
