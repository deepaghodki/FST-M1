package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LMS_Activity4 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

		WebDriver driver = new ChromeDriver();

		try {

			driver.get("https://alchemy.hguy.co/lms");

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(20));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ld-course-grid")));

			WebElement secondCourseTitle = driver.findElement(By.xpath("(//h3[@class='ld-course-title'])[2]"));

			String courseTitleText = secondCourseTitle.getText();

			if ("Email Marketing Strategies".equals(courseTitleText)) {
				System.out.println("Course title matches successfully.");
			} else {
				System.out.println("Course title does not match. The actual title is: " + courseTitleText);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			driver.quit();
		}
	}
}