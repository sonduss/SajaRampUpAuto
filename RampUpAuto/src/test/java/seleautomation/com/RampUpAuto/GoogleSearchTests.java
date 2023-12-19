package RampUpAuto.src.test.java.seleautomation.com.RampUpAuto;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class GoogleSearchTests {
    public WebDriver Driver = null;

    @BeforeClass
    public void setUp() {
        Driver = new ChromeDriver();
        System.setProperty("Webdriver.chrome.driver", "/Users/sajasalahat/Desktop/chromedriver-mac-x64");
        Driver.get("https://www.google.com");
    }

    @Test (priority = 0)
    public void verifyUserCanSearchForAnyKeyword() {
        GoogleSearch Search = new GoogleSearch();
        Search.TestBox_Search(Driver);
        Search.ButtonSearch(Driver);
        //System.out.println(" Search done");
    }

    @Test (priority = 1)
    public void verifyTitleOnSearchResult()
    {
        TitleSearch TitleSearch_ = new TitleSearch();
        TitleSearch_.AssertionTitleResult_(Driver);

        System.out.println(" Validation Title done");

    }

    @AfterTest
    public void EndProcess() throws InterruptedException {
        Thread.sleep(4000);
        Driver.quit();
    }
}
