package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LMS_Activity6 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

		WebDriver driver = new ChromeDriver();

		try {

			driver.get("https://alchemy.hguy.co/lms");

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("nav")));

			WebElement myAccountMenuItem = driver.findElement(By.linkText("My Account"));
			myAccountMenuItem.click();

			wait.until(ExpectedConditions.titleContains("My Account"));

			String pageTitle = driver.getTitle();
			if (!pageTitle.contains("My Account")) {
				System.out.println("Failed to navigate to the correct page. The current title is: " + pageTitle);
				return;
			}

			WebElement loginButton = driver.findElement(By.linkText("Login"));
			loginButton.click();

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_login")));

			WebElement usernameField = driver.findElement(By.id("user_login"));
			usernameField.sendKeys("root");

			WebElement passwordField = driver.findElement(By.id("user_pass"));
			passwordField.sendKeys("pa$$w0rd");

			WebElement submitButton = driver.findElement(By.id("wp-submit"));
			submitButton.click();

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout")));

			WebElement logoutButton = driver.findElement(By.linkText("Logout"));
			if (logoutButton.isDisplayed()) {
				System.out.println("Login successful.");
			} else {
				System.out.println("Login failed.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			driver.quit();
		}
	}
}
