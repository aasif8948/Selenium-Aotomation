package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class DashboardPage {
    // Driver reference
    private final WebDriver driver;

    // Constructor
    public DashboardPage(WebDriver driver) {

        this.driver = driver;
    }

    // Locators
    // =================================================================================================================
    private final By SideBtn = By.xpath("//button[@class='oxd-icon-button oxd-main-menu-button']");
    private final By dashboardText = By.xpath("//h6[text()='Dashboard']");
    private final By MyInfo = By.xpath("//a[@href='/web/index.php/pim/viewMyDetails']");
    private final By MyPersonalDetails = By.xpath("//h6[text()='Personal Details']");
    private final By employeeFullName = By.xpath("//label[text()='Employee Full Name']");
    private final By firstName = By.xpath("//input[@name='firstName']");
    private final By middleName = By.xpath("//input[@name='middleName']");
    private final By lastName = By.xpath("//input[@name='lastName']");
    private final By employeeId = By.xpath("//label[text()='Employee Id']");
    private final By employeeIdNumber = By.xpath("//label[normalize-space()='Employee Id']/parent::div/following-sibling::div//input");
    private final By otherId = By.xpath("//label[text()='Other Id']");
    private final By otherIdNumber = By.xpath("//label[normalize-space()='Other Id']/parent::div/following-sibling::div//input");
    private final By driverLicenseNumber = By.xpath("//label[normalize-space()=\"Driver's License Number\"]");
    private final By inputBoxLicenseNumber = By.xpath("//label[normalize-space()=\"Driver's License Number\"]/parent::div/following-sibling::div//input");
    private final By licenceExpiryDate=By.xpath("//label[text()='License Expiry Date']");
    private final By inputExpiryDate=By.xpath("//label[normalize-space()='License Expiry Date']/parent::div/following-sibling::div//input");
    private final By nationality=By.xpath("//label[text()='Nationality']");
    private final By inputBoxNationality=By.xpath("//label[normalize-space()='Nationality']/parent::div/following-sibling::div//div[contains(@class,'oxd-select-text-input')]");
    private final By selectAmerican=By.xpath("//div[text()='Indian']");
    private final By maritalStatus=By.xpath("//label[text()='Marital Status']");
    private final By inputBoxMaritalStatus=By.xpath("//label[text()='Marital Status']/following::div[@class='oxd-select-text-input'][1]");
    private final By dateOfBirth=By.xpath("//label[text()='Date of Birth']");
    private final By selectDateOfBirth=By.xpath("//label[normalize-space()='Blood Type']/following::div[contains(@class,'oxd-select-text')][1]");
    private final By selectGender=By.xpath("//label[text()='Gender']");
    private final By selectRadioButton=By.xpath("//label[normalize-space()='Male']");
    private final By save=By.xpath("(//button[@type='submit' and normalize-space()='Save'])[1]");
    private final By successMessage=By.xpath("//p[contains(@class,'oxd-text--toast-message') and normalize-space()='Successfully Updated']");
    private final By successMessage2=By.xpath("//p[contains(@class,'oxd-text--toast-message') and normalize-space()='Successfully Updated']");
    private final By customFields=By.xpath("//h6[text()='Custom Fields']");
    private final By bloodType=By.xpath("//label[text()='Blood Type']");
    private final By bloodTypeInputBox=By.xpath("//label[normalize-space()='Blood Type']/following::div[contains(@class,'oxd-select-text-input')][1]");
    private final By bloodGroup=By.xpath("//label[normalize-space()='Blood Type']/following::div[@class='oxd-select-text-input' and normalize-space()='B+'][1]");
    private final By testField=By.xpath("//label[text()='Test_Field']");
    private final By test_Field=By.xpath("//label[normalize-space()='Test_Field']/following::input[1]");
    private final By saveButton1=By.xpath("//div[contains(@class,'orangehrm-custom-fields')]//button[@type='submit']");
    private final By attachmentAdd=By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--text']");
    private final By uploadFiles=By.xpath("//input[@type='file']");
    private final By attachmentContent=By.xpath("//h6[text()='Attachments']");
    private final By commentHereBox=By.xpath("//textarea[@placeholder='Type comment here']");
    private final By saveButton3=By.xpath("(//button[text()=' Save '])[3]");
    //======================================================================================================================

    // Methods
    //==================================================================================================================

    public void clickSideBtn() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(SideBtn).click();
    }


    public boolean isDashboardDisplayed() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver.findElement(dashboardText).isDisplayed();

    }

    public void MyInfoDetails() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(MyInfo).click();
    }




    public boolean isPersonalDetailsDisplayed() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        return driver.findElement(MyPersonalDetails).isDisplayed();

    }

    public boolean isEmployeeNameVisible() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver.findElement(employeeFullName).isDisplayed();
    }


    public void enterFirstName(String name) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement element = driver.findElement(firstName);
        Thread.sleep(1000);
        element.click();
        element.sendKeys(Keys.CONTROL + "a");
        element.sendKeys(name);
        element.sendKeys(Keys.TAB);

    }


    public void enterMiddleName(String name) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement element = driver.findElement(middleName);
        element.click();
        element.sendKeys(Keys.CONTROL + "a");
        element.sendKeys(name);
        element.sendKeys(Keys.TAB);
    }

    public void enterLastName(String name) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(110));
        WebElement element = driver.findElement(lastName);
        element.click();
        element.sendKeys(Keys.CONTROL + "a");
        element.sendKeys(name);
        element.sendKeys(Keys.TAB);

    }

    public boolean isEmployeeIdDisplayed() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver.findElement(employeeId).isDisplayed();
    }

    public void enterEmployeeId(String name)  {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebElement element = driver.findElement(employeeIdNumber);
        element.click();
        element.sendKeys(Keys.CONTROL + "a");
        element.sendKeys(name);
        element.sendKeys(Keys.TAB);
    }

    public boolean isOtherIdDisplayed(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver.findElement(otherId).isDisplayed();

    }

    public void enterEmployeeOtherId(String name) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebElement element = driver.findElement(otherIdNumber);
        element.click();
        element.sendKeys(Keys.CONTROL + "a");
        element.sendKeys(name);
        element.sendKeys(Keys.TAB);
    }

    public boolean isDriverLicenceNumberDisplayed() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver.findElement(driverLicenseNumber).isDisplayed();

    }

    public void enterDriverLicenceNumber(String name) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebElement element = driver.findElement(inputBoxLicenseNumber);
        element.click();
        element.sendKeys(Keys.CONTROL + "a");
        element.sendKeys(name);
        element.sendKeys(Keys.TAB);
    }

    public boolean isLicenceExpiryDateDisplayed() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver.findElement(licenceExpiryDate).isDisplayed();

    }

    public void enterExpiryDate() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebElement element = driver.findElement(inputExpiryDate);
        element.click();
        element.click();
    }

    public boolean isNationalityDisplayed(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver.findElement(nationality).isDisplayed();

    }

    public void selectNationality(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(inputBoxNationality).click();
        driver.findElement(inputBoxNationality).click();
    }

    public boolean isMaritalStatusDisplayed(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver.findElement(maritalStatus).isDisplayed();

    }

    public void selectMaritalStatus() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(inputBoxMaritalStatus).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(inputBoxMaritalStatus).click();
    }

    public boolean isDateOfBirthDisplayed(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver.findElement(dateOfBirth).isDisplayed();

    }

    public void selectDateOfBirth(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(selectDateOfBirth).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(selectDateOfBirth).click();
    }

    public boolean isGenderDisplayed(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver.findElement(selectGender).isDisplayed();

    }
    public void selectRadioButton(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(selectRadioButton).click();

    }

    public void saveButton(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(save).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    public boolean isVerifySuccessMassageDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(successMessage));
        return message.isDisplayed();
    }

    public void scrollDown() {
        // Create JavascriptExecutor object
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Scroll down 500 pixels
        js.executeScript("window.scrollBy(0, 300)");
    }


    public boolean isCustomFieldsDisplayed() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver.findElement(customFields).isDisplayed();
    }

    public boolean isBloodTypeDisplayed(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver.findElement(bloodType).isDisplayed();

    }

    public void selectBloodType() throws InterruptedException {
        Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(bloodTypeInputBox).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(bloodTypeInputBox).click();
    }

    public boolean isTestFieldDisplayed(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver.findElement(testField).isDisplayed();
    }

    public void enterTestField(String name)  {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebElement element = driver.findElement(test_Field);
        element.click();
        element.sendKeys(Keys.CONTROL + "a");
        element.sendKeys(name);
        element.sendKeys(Keys.TAB);
    }

    public void setSaveButton1(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(saveButton1).click();
    }

//    public boolean isVerifySuccessMassage2Displayed() throws InterruptedException {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        Thread.sleep(5000);
//        WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(successMessage2));
//        return message.isDisplayed();
//    }

    public void scrollDown2() {
        // Create JavascriptExecutor object
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Scroll down 500 pixels
        js.executeScript("window.scrollBy(0, 100)");
    }

    public boolean isAttachmentDisplayed(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver.findElement(attachmentContent).isDisplayed();

    }

    public void setAttachmentAdd() throws InterruptedException {
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(attachmentAdd).click();
    }

    public void uploadAttachment(String filePath) throws InterruptedException {

        // Locate file upload input
        Thread.sleep(1000);
        WebElement upload = driver.findElement(uploadFiles);
        // Upload file
        upload.sendKeys(filePath);
    }

    public void enterCommentHere(String name) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(110));
        WebElement element = driver.findElement(commentHereBox);
        element.click();
        element.sendKeys(Keys.CONTROL + "a");
        element.sendKeys(name);
        element.sendKeys(Keys.TAB);
    }

    public void setSaveButton3(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(saveButton3).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }






}

