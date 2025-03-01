package project;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.List;

	public class LMS_Activity7 {
	    public static void main(String[] args) {
	        
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

	      
	        WebDriver driver = new ChromeDriver();

	        try {
	           
	            driver.get("https://alchemy.hguy.co/lms");

	            
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("nav")));

	          
	            WebElement allCoursesMenuItem = driver.findElement(By.linkText("All Courses"));
	            allCoursesMenuItem.click();

	          
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ld-course-list")));

	           
	            List<WebElement> courses = driver.findElements(By.cssSelector(".ld-course-list .ld-course"));

	           
	            System.out.println("Number of courses on the page: " + courses.size());
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	           
	            driver.quit();
	        }
	    }
	}