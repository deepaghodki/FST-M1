package project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LMS_Activity3 {
    public static void main(String[] args) {
      
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        
        WebDriver driver = new ChromeDriver();

        try {
           
            driver.get("https://alchemy.hguy.co/lms");

           
            WebElement firstInfoBoxTitle = driver.findElement(By.xpath("//div[contains(@class,'elementor-icon-box-wrapper')][1]//h3"));

          
            String infoBoxTitleText = firstInfoBoxTitle.getText();

           
            if ("Actionable Training".equals(infoBoxTitleText)) {
                System.out.println("Info box title matches successfully.");
            } else {
                System.out.println("Info box title does not match. The actual title is: " + infoBoxTitleText);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            
            driver.quit();
        }
    }
}