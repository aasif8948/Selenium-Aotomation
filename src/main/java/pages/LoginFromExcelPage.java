
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginFromExcelPage {

    private WebDriver driver;

    // Constructor
    public void LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private final By usernameField = By.id("username");
    private final By passwordField = By.id("password");
    private final By loginButton = By.id("login");

    // Enter Username
    public void enterUsername(String username) {

        driver.findElement(usernameField)
                .sendKeys(username);
    }

    // Enter Password
    public void enterPassword(String password) {

        driver.findElement(passwordField)
                .sendKeys(password);
    }

    // Click Login Button
    public void clickLogin() {

        driver.findElement(loginButton).click();
    }
}
