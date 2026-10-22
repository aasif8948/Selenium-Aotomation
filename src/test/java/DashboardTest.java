import base.BaseTest;
import pages.DashboardPage;
import pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.qameta.allure.testng.AllureTestNg;
import org.testng.annotations.Listeners;
import utils.ScreenshotUtils;

import java.io.IOException;


@Listeners(AllureTestNg.class)
public class DashboardTest extends BaseTest {

    @Test
    public void verifyPersonalDetails() throws InterruptedException, IOException {

        // Step 1: LoginPage Object
        LoginPage loginPage = new LoginPage(driver);
        DashboardPage dashboardPage = new DashboardPage(driver);

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

        boolean actualResult = dashboardPage.isDashboardDisplayed();
        // Assertion
        Assert.assertTrue(actualResult, "Dashboard is not visible");
        System.out.println("Dashboard is visible successfully");
//        dashboardPage.clickSideBtn();
        dashboardPage.MyInfoDetails();

        boolean actualDetails = dashboardPage.isPersonalDetailsDisplayed();
        // Assertion
        Assert.assertTrue(actualDetails, "Personal Details are not visible");
        System.out.println("Personal Details is visible successfully");


        boolean actualEmployeeFullName = dashboardPage.isEmployeeNameVisible();
        // Assertion
        Assert.assertTrue(actualEmployeeFullName, "Employee Full Name not visible");
        System.out.println("Employee Full Name is visible successfully");

        dashboardPage.enterFirstName("Ankit");
        dashboardPage.enterMiddleName("sing");
        dashboardPage.enterLastName("Pal");

        // Assertion
        boolean actualEmployeeId = dashboardPage.isEmployeeIdDisplayed();
        Assert.assertTrue(actualEmployeeId, "Employee Id  are not visible");
        System.out.println("Employee Id is visible successfully");


        dashboardPage.enterEmployeeId("708177");

        dashboardPage.clickSideBtn();

        boolean actualOtherId = dashboardPage.isOtherIdDisplayed();
        // Assertion
        Assert.assertTrue(actualOtherId, "Other Id not visible");
        System.out.println("Other Id is visible successfully");

        dashboardPage.enterEmployeeOtherId("1234");

        boolean actualDriverLicence = dashboardPage.isDriverLicenceNumberDisplayed();
        Assert.assertTrue(actualDriverLicence, "Driver's License Number are not visible");
        System.out.println("Driver's License Number is visible successfully");


        dashboardPage.enterDriverLicenceNumber("RHM2020");

        boolean actualLicenceExpiryDate = dashboardPage.isLicenceExpiryDateDisplayed();
        Assert.assertTrue(actualLicenceExpiryDate, "License Expiry Date Number are not visible");
        System.out.println("License Expiry Date Number is visible successfully");

        dashboardPage.enterExpiryDate();

        boolean actualNationality = dashboardPage.isNationalityDisplayed();
        Assert.assertTrue(actualNationality, "Nationality are not visible");
        System.out.println("Nationality is visible successfully");

        dashboardPage.selectNationality();

        boolean actualMaritalStatus = dashboardPage.isMaritalStatusDisplayed();
        Assert.assertTrue(actualMaritalStatus, "Marital Status not visible");
        System.out.println("Marital Status is visible successfully");

        dashboardPage.selectMaritalStatus();

        boolean actualDateOfBirth= dashboardPage.isDateOfBirthDisplayed();
        Assert.assertTrue(actualDateOfBirth, "Date of Birth not visible");
        System.out.println("Date of Birth is visible successfully");

        dashboardPage.selectDateOfBirth();

        boolean actualGender= dashboardPage.isGenderDisplayed();
        Assert.assertTrue(actualGender, "Gender not visible");
        System.out.println("Gender is visible successfully");

        dashboardPage.selectRadioButton();
        dashboardPage.saveButton();




        // Verify success message
        boolean actualSuccessMessage = dashboardPage.isVerifySuccessMassageDisplayed();
        // Apply assertion
        Assert.assertTrue(actualSuccessMessage, "Successfully Updated not visible");
        // Print success message
        System.out.println("Successfully Updated message verified");

        dashboardPage.scrollDown();


        boolean actualCustomFields= dashboardPage.isCustomFieldsDisplayed();
        Assert.assertTrue(actualCustomFields, "Custom Fields not visible");
        System.out.println("Custom Fields is visible successfully");

        boolean actualBloodType= dashboardPage.isBloodTypeDisplayed();
        Assert.assertTrue(actualBloodType, "Blood Type not visible");
        System.out.println("Blood Type is visible successfully");



        dashboardPage.selectBloodType();

        boolean actualTestField= dashboardPage.isTestFieldDisplayed();
        Assert.assertTrue(actualTestField, "Test_Field not visible");
        System.out.println("Test_Field is visible successfully");

        dashboardPage.enterTestField("8948");
        dashboardPage.setSaveButton1();

        // Verify success message
//        boolean actualSuccessMessage2 = dashboardPage.isVerifySuccessMassage2Displayed();
        // Apply assertion
//        Assert.assertTrue(actualSuccessMessage2, "Successfully Updated not visible");
        // Print success message
//        System.out.println("Successfully Updated message verified");

//        dashboardPage.scrollDown2();

        boolean actualAttachment= dashboardPage.isAttachmentDisplayed();
        Assert.assertTrue(actualAttachment, "Attachments not visible");
        System.out.println("Attachments is visible successfully");

        dashboardPage.setAttachmentAdd();


       // Upload attachment
        dashboardPage.uploadAttachment(
                "C:\\Users\\Ankit Pal\\Pictures\\Screenshots\\Screenshot 2025-02-07 134550.png"
        );

        dashboardPage.enterCommentHere("Hii everyone today i am filling tha form of my information");

        dashboardPage.setSaveButton3();
    }



}
