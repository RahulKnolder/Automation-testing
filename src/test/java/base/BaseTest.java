package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.List;

public class BaseTest {
    private WebDriver driver;

    protected HomePage homePage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        //single element
//       WebElement webElement= driver.findElement(By.linkText("Inputs"));
//        webElement.click();


        //multiple elements
//       List<WebElement> webElements =driver.findElements(By.tagName("a"));
//        System.out.println(webElements.size());

        homePage = new HomePage(driver);

    }


    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    public static void main(String[] args) {
        BaseTest test = new BaseTest();
        test.setUp();

    }
}
