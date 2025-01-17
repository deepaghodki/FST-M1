package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

public class Activity4_Test {

	public static void main(String[] args) {
		// Create a new instance of the Firefox driver
	    WebDriver driver = new FirefoxDriver();
		  //WebDriver driver = new ChromeDriver();
	    
	    // Open the browser
	    driver.get("https://training-support.net/webelements/target-practice");
	    //print the title
	    //String pageTitle = driver.getTitle();
	    System.out.println("The Browser Title as: " + driver.getTitle());
	    
	    //Find the 3rd header on the page and print it's text to the console.
	    driver.findElement(By.xpath("//h3[contains(text(),'#3')]")).getText();
	    //Find the 5th header on the page and print it's color.
	    Color fifthHeaderColor = Color.fromString(driver.findElement(By.xpath("//h5[contains(text(),'#5')]")).getCssValue("color"));
	    System.out.println("Color as RGB: " + fifthHeaderColor.asRgb());
        System.out.println("Color as hexcode: " + fifthHeaderColor.asHex());
	  //Find the purple button and print all it's classes.
        String purpleButtonClass = driver.findElement(By.xpath("//button[text()='Purple']")).getDomAttribute("class");
        System.out.println(purpleButtonClass);
	    //Enter the password
	    String slateButtonText = driver.findElement(By.xpath("//button[contains(@class, 'slate')]")).getText();
        System.out.println(slateButtonText);
	    

	    // Close the browser
	    // Feel free to comment out the line below
	    // so it doesn't close too quickly
	    driver.quit();

	}

}