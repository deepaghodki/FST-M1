package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LMS_Activity1 {
    public static void main(String[] args) {
     
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

      
        WebDriver driver = new ChromeDriver();

        try {
           
            driver.get("https://alchemy.hguy.co/lms");

          
            String title = driver.getTitle();

           
            if ("Alchemy LMS – An LMS Application".equals(title)) {
                System.out.println("Title matches successfully.");
            } else {
                System.out.println("Title does not match. The actual title is: " + title);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
          
            driver.quit();
        }
    }
}
