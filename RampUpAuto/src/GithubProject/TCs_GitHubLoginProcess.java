package RampUpAuto.src.GithubProject;

import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


import java.lang.reflect.Method;

public class TCs_GitHubLoginProcess {

    public WebDriver Driver = null;

    @DataProvider(name = "Test")
    public Object[][] githubSigninDb(Method m) {
        switch (m.getName()) {
            case "validSignInProcess":
                return new Object[][]{
                        {"asaltest19@gmail.com", "password123456789s*"},
                };

            case "invalidSignInProcess":
                return new Object[][]{
                        {"asaltest1646449@gmail.com", "password123456789s*"},
                        {"asaltest19@gmail.com", "password123456789sgg"},
                        {"", ""}
                };
        }
        return null;

    }

    ;


    @BeforeMethod
    @Parameters("browser")
    public void setup(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "/Users/sajasalahat/Desktop/chromedriver-mac-x64");
            Driver = new ChromeDriver();
            Driver.get("https://github.com/login");
        } else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "/Users/sajasalahat/Desktop/msedgedriver 3");
            Driver = new EdgeDriver();
            Driver.get("https://github.com/login");

        } else
            throw new IllegalArgumentException("Invalid");

    }

    @Test(dataProvider = "Test", priority = 1)
    public void validSignInProcess(String Email, String Password) {

        GitHubSignIn GitHubSignIn_ = new GitHubSignIn();
        GitHubSignIn_.LoginIndicator(Driver, Email, Password);
        GitHubSignIn_.clickSigninButton(Driver);

    }

    @Test(dataProvider = "Test", priority = 2)
    public void invalidSignInProcess(String Email, String Password) {
        GitHubSignIn GitHubSignIn_ = new GitHubSignIn();
        GitHubSignIn_.LoginIndicator(Driver, Email, Password);
        GitHubSignIn_.clickSigninButton(Driver);
        GitHubSignIn_.InvalidIndicator(Driver);
    }

}

