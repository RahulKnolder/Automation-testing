package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    private WebDriver webDriver;
    WebDriverWait wait;
    private By formAuthenticationLink = By.xpath("//a[@href=\"/login\"]");

    public HomePage(WebDriver webDriver) {
        wait=new WebDriverWait(webDriver, Duration.ofSeconds(10));
        this.webDriver = webDriver;
    }



    public LoginPage clickFormAuthentication() {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(formAuthenticationLink));
        webDriver.findElement(formAuthenticationLink).click();
        return new LoginPage(webDriver);
    }




}
