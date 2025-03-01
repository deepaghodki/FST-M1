package project;


	import java.time.Duration;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.openqa.selenium.support.ui.ExpectedConditions;

	public class LMS_Activity9 {
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

	            
	            WebElement firstCourse = driver.findElement(By.cssSelector(".ld-course-list .ld-course"));
	            firstCourse.click();

	            
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".entry-title")));

	            
	            WebElement courseTitle = driver.findElement(By.cssSelector(".entry-title"));
	            System.out.println("Course Title: " + courseTitle.getText());

	            
	            WebElement firstLesson = driver.findElement(By.cssSelector(".course-lesson-list li a"));
	            firstLesson.click();

	            
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".entry-title")));

	           
	            WebElement lessonTitle = driver.findElement(By.cssSelector(".entry-title"));
	            System.out.println("Lesson Title: " + lessonTitle.getText());

	            
	            try {
	                WebElement markCompleteButton = driver.findElement(By.cssSelector(".ld-mark-complete"));
	                if (markCompleteButton.isDisplayed()) {
	                    markCompleteButton.click();
	                    System.out.println("Lesson marked as complete.");
	                }
	            } catch (Exception e) {
	                System.out.println("No 'Mark Complete' button found.");
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            
	            driver.quit();
	        }
	    }
	}
