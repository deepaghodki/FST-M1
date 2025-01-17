package activities;

import org.testng.annotations.Test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
    WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        driver = new FirefoxDriver();

        // Open browser
        driver.get("https://training-support.net/webelements/login-form");
    }

    @Test (priority = 1)
    public void pageTitleTest() {
   	 // Get the page title Assert page title
    	System.out.println(driver.getTitle());
       Assert.assertEquals(driver.getTitle(), "Login Success!");
    }
       
    @Test (priority = 2)
    public void loginTest() {
        // Find the username and password fields
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));

        // Enter credentials
        username.sendKeys("admin");
        password.sendKeys("password");

        // Click login
        driver.findElement(By.xpath("//button[text()='Submit']")).click();

        //Verify/Read the  login message
        String loginMessage = driver.findElement(By.cssSelector("h2.text-center")).getText();
        Assert.assertEquals("Welcome Back, Admin!", loginMessage);
    }

    @AfterClass
    public void afterClass() {
        // Close browser
        driver.close();
    }
}