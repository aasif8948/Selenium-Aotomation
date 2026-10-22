import base.BaseTest;
import pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.qameta.allure.testng.AllureTestNg;
import org.testng.annotations.Listeners;
import utils.ScreenshotUtils;

import java.io.IOException;


@Listeners(AllureTestNg.class)
public class LoginTest extends BaseTest {

    @Test
    public void verifyLoginHeading() throws IOException {

        // Step 1: LoginPage Object
        LoginPage loginPage = new LoginPage(driver);

        // Step 2: Get actual text from website
        String actualText = loginPage.getLoginHeading();

        // Step 3: Define expected text
        String expectedText = "Login";

        // Step 4: Validate using assertion
        Assert.assertEquals(actualText, expectedText, "Login heading does not match!");

        // Step 5: Print success message
        System.out.println("Login heading verified successfully");
        loginPage.validEnterUserName("Admin");
        loginPage.enterValidUserPassword("admin123");
        loginPage.SubmitToLoginDasBoard();
        ScreenshotUtils.takeScreenshot(driver);
    }
    @Test
    public void verifyInvalidCredentials() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterUserName("Aasif");
        loginPage.enterUserPassword("8948046372");
        loginPage.clickToLogin();
        // True ya false return karma
        boolean actualResult = loginPage.getInvalidCredentialsMessage();

        // Assertion
        Assert.assertTrue(actualResult, "Invalid credentials message does not match!");

        System.out.println("Invalid credentials validated successfully");
    }



}