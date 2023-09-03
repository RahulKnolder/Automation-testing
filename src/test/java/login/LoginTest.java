package login;

import base.BaseTest;
import base.LoginPage;
import base.SecureAreaPage;
import org.checkerframework.dataflow.qual.TerminatesExecution;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class LoginTest extends BaseTest {

    @Test
    public void testSuccessfullLogin() {
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUserName("tomsmith");
        loginPage.setPasswaord("SuperSecretPassword!");
      SecureAreaPage secureAreaPage= loginPage.clickLoginBUtton();
      secureAreaPage.getAlertText();
       assertEquals(secureAreaPage.getAlertText(),"You logged into a secure area! ×","Alert is incorrect");
    }
}
