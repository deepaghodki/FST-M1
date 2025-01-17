package activities;

import java.sql.Time;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1_Test {

	public static void main(String[] args) {
		// Create a new instance of the Firefox driver
	    WebDriver driver = new FirefoxDriver();
		  //WebDriver driver = new ChromeDriver();
	    
	    // Open the browser
	    driver.get("https://training-support.net");
	    //print the title
	    //String pageTitle = driver.getTitle();
	    System.out.println("The Browser Title as: " + driver.getTitle());
	    
	    //Click on About us
	    driver.findElement(By.linkText("About Us")).click();
        // Print the page title of the About Us page
        System.out.println("New page title is: " + driver.getTitle());
	    

	    // Close the browser
	    // Feel free to comment out the line below
	    // so it doesn't close too quickly
	    driver.quit();
	}

}