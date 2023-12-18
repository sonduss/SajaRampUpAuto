package src.GoogleSearch;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;

public class TitleSearch {

   public void AssertionTitleResult_(WebDriver Driver) {
       String pageTitle = Driver.getTitle();
       String expectedTitle = "Selenium Tutorials";
       Assert.assertEquals("Selenium Tutorials", expectedTitle, pageTitle);

   }

   }