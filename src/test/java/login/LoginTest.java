package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.*;

/**
 * Created by Nahid Chowdhury
 * Date: 4/19/2022
 * Time: 2:42 AM
 */

public class LoginTest extends BaseTests {

    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.enterUsername("tomsmith");
        loginPage.enterPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        secureAreaPage.getFlashMessage();
        assertTrue(secureAreaPage.getFlashMessage().contains("You logged into a secure area!"),"Flash text is incorrect");
    }
}
