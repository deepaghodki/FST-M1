package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LMS_Activity2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

		WebDriver driver = new ChromeDriver();

		try {

			driver.get("https://alchemy.hguy.co/lms");

			WebElement headingElement = driver.findElement(By.tagName("h1"));

			String headingText = headingElement.getText();

			if ("Learn from Industry Experts".equals(headingText)) {
				System.out.println("Heading matches successfully.");
			} else {
				System.out.println("Heading does not match. The actual heading is: " + headingText);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			driver.quit();
		}
	}
}