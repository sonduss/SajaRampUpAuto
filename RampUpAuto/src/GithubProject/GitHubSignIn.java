package RampUpAuto.src.GithubProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GitHubSignIn {

    public WebElement LoginIndicator(WebDriver Driver, String Email, String Password) {
        WebElement Element = Driver.findElement(By.name("login"));
        Element.sendKeys("" + Email);
        Element = Driver.findElement(By.name("password"));
        Element.sendKeys("" + Password);
        return Element;
    }

    public WebElement clickSigninButton(WebDriver Driver) {
        WebElement Element = Driver.findElement(By.name("commit"));
        Element.click();
        return Element;
    }

    public WebElement InvalidIndicator(WebDriver Driver) {
        WebElement Element = Driver.findElement(By.id("js-flash-container"));
        return Element;
    }
}
