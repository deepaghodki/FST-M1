package project;


	import java.time.Duration;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.openqa.selenium.support.ui.ExpectedConditions;

	public class LMS_Activity8 {
	    public static void main(String[] args) {
	       
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

	        
	        WebDriver driver = new ChromeDriver();

	        try {
	          
	            driver.get("https://alchemy.hguy.co/lms");

	            
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("nav")));

	            
	            WebElement contactMenuItem = driver.findElement(By.linkText("Contact"));
	            contactMenuItem.click();

	            
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("wpforms-8-field_0")));

	          
	            WebElement fullNameField = driver.findElement(By.id("wpforms-8-field_0"));
	            fullNameField.sendKeys("John Doe");

	            WebElement emailField = driver.findElement(By.id("wpforms-8-field_1"));
	            emailField.sendKeys("johndoe@example.com");

	            WebElement messageField = driver.findElement(By.id("wpforms-8-field_3"));
	            messageField.sendKeys("This is a test message for the Contact Us form.");

	          
	            WebElement submitButton = driver.findElement(By.id("wpforms-8-submit"));
	            submitButton.click();

	         
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".wpforms-confirmation-container")));

	           
	            WebElement confirmationMessage = driver.findElement(By.cssSelector(".wpforms-confirmation-container"));
	            System.out.println("Confirmation Message: " + confirmationMessage.getText());

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            
	            driver.quit();
	        }
	    }
	}