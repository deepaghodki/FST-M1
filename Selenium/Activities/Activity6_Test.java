package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Activity6_Test {

	public static void main(String[] args) {
		// Create a new instance of the Firefox driver
	    WebDriver driver = new FirefoxDriver();
		  //WebDriver driver = new ChromeDriver();
	    
	    // Open the browser
	    driver.get("https://training-support.net/webelements/dynamic-controls");
	    //print the title
	    //String pageTitle = driver.getTitle();
	    System.out.println("The Browser Title as: " + driver.getTitle());
	    
	    //Find the checkbox input element.
	    WebElement checkbox = driver.findElement(By.xpath("//input[@id='checkbox']"));
	    System.out.println("Checkbox is displayed: " + checkbox.isDisplayed());
	    
	    driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
	    System.out.println("Checkbox is displayed: " + checkbox.isDisplayed());
	    checkbox.isDisplayed();
	    // Close the browser
	    driver.quit();

	}

}

