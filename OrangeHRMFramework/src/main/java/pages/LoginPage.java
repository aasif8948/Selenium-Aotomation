package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class LoginPage {

    // Driver reference
    private final WebDriver driver;

    // Constructor
    public LoginPage(WebDriver driver) {

        this.driver = driver;
    }


    //Locators
    //==================================================================================================================
    private final By loginHeading = By.xpath("//h5[normalize-space()='Login']");
    private final By userName = By.xpath("//input[@placeholder='Username']");
    private final By userPassword = By.xpath("//input[@placeholder='Password']");
    private final By loginBtn = By.xpath("//button[@type='submit']");
    private final By validUserName = By.xpath("//input[@placeholder='Username']");
    private final By validUserPassword = By.xpath("//input[@placeholder='Password']");
    private final By SubmitToLogin = By.xpath("//button[@type='submit']");

    //==================================================================================================================

    //Methods
    //==================================================================================================================

    public String getLoginHeading() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String actualText = wait.until(ExpectedConditions.visibilityOfElementLocated(loginHeading)).getText();
        return actualText.trim();
    }

    public void enterUserName(String name) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.findElement(userName).clear();
        driver.findElement(userName).sendKeys(name);
    }

    public void enterUserPassword(String name) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.findElement(userPassword).clear();
        driver.findElement(userPassword).sendKeys(name);
    }

    public void clickToLogin() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(loginBtn).click();
    }

    public void validEnterUserName(String name) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(validUserName).sendKeys(name);
    }

    public void enterValidUserPassword(String name) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.findElement(userPassword).clear();
        driver.findElement(validUserPassword).sendKeys(name);
    }

    public void SubmitToLoginDasBoard() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(loginBtn).click();
    }

    public boolean getInvalidCredentialsMessage() {
        // Website se actual error message
        String actualText = driver.findElement(By.xpath("//p[normalize-space()='Invalid credentials']")).getText();
        // Expected message se compare
        return actualText.equals("Invalid credentials");
    }

}



