
import base.BaseTest;
// Import Selenium classes
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends  BaseTest {

    // Declare WebDriver
    private final WebDriver driver;

    // Constructor to initialize WebDriver
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Method to enter username
    public void enterUsername(String username) {

        // Locate username field and type value
        driver.findElement(By.name("username"))
                .sendKeys(username);
    }

    // Method to enter password
    public void enterPassword(String password) {

        // Locate password field and type value
        driver.findElement(By.name("password"))
                .sendKeys(password);
    }

    // Method to click login button
    public void clickLogin() {

        // Locate and click Login
        driver.findElement(
                By.cssSelector("button[type='submit']")
        ).click();
    }
}