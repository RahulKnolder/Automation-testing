package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    private WebDriver webDriver;


    WebDriverWait wait;
    private By userNaemFiled = By.id("username");
    private By passwaordField = By.id("password");

    private By loginButton = By.cssSelector("#login button");


    public LoginPage(WebDriver webDriver) {
        wait=new WebDriverWait(webDriver, Duration.ofSeconds(10));
        this.webDriver = webDriver;
    }

    public void setUserName(String userName) {
        webDriver.findElement(userNaemFiled).sendKeys(userName);
    }
    public void setPasswaord(String passward) {
        webDriver.findElement(passwaordField).sendKeys(passward);
    }


    public SecureAreaPage clickLoginBUtton(){
        webDriver.findElement(loginButton).click();
        return new SecureAreaPage(webDriver);
    }
}
