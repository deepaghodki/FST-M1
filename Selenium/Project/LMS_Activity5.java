package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LMS_Activity5 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

		WebDriver driver = new ChromeDriver();

		try {

			driver.get("https://alchemy.hguy.co/lms");

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("nav")));

			WebElement myAccountMenuItem = driver.findElement(By.linkText("My Account"));
			myAccountMenuItem.click();

			wait.until(ExpectedConditions.titleContains("My Account"));

			String pageTitle = driver.getTitle();

			if ("My Account – Alchemy LMS".equals(pageTitle)) {
				System.out.println("Successfully navigated to the My Account page.");
			} else {
				System.out.println("Failed to navigate to the correct page. The current title is: " + pageTitle);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			driver.quit();
		}
	}
}