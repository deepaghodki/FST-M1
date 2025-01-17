package activities;

import java.sql.Time;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2_Test {

	public static void main(String[] args) {
		// Create a new instance of the Firefox driver
	    WebDriver driver = new FirefoxDriver();
		  //WebDriver driver = new ChromeDriver();
	    
	    // Open the browser
	    driver.get("https://training-support.net/webelements/login-form");
	    //print the title
	    //String pageTitle = driver.getTitle();
	    System.out.println("The Browser Title as: " + driver.getTitle());
	    
	    //Click on user name
	    driver.findElement(By.id("username")).click();
	    //Enter the user name
	    driver.findElement(By.id("username")).sendKeys("admin");
	  //Click on password
	    driver.findElement(By.id("password")).click();
	    //Enter the password
	    driver.findElement(By.id("password")).sendKeys("password");
	    //Click on submit
	    driver.findElement(By.xpath("//button[text()='Submit']")).click();	    
	    // Print the page title of the About Us page
	    String message = driver.findElement(By.tagName("h1")).getText();
        System.out.println(message);

	    

	    // Close the browser
	    // Feel free to comment out the line below
	    // so it doesn't close too quickly
	    driver.quit();

	}

}