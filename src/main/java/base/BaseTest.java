package base;

// Selenium Imports
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// TestNG Imports
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import utils.ScreenshotUtils;

public class BaseTest {

    // WebDriver Variable
    protected WebDriver driver;

    // Browser Setup
    @BeforeTest
    public void setUp() {

        // Chrome Browser Open
        driver = new ChromeDriver();

        // Browser Maximize
        driver.manage().window().maximize();

        // OrangeHRM Website Open
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    // Inside BaseTest class
    @AfterMethod(alwaysRun = true)
    public void tearDown(ITestResult result) {

        try {

            // Check if test failed
            if (result.getStatus() == ITestResult.FAILURE) {

                // Check driver is available
                if (driver != null) {

                    // Take screenshot
                    ScreenshotUtils.takeScreenshot(
                            driver
                    );
                }
            }

        }
        catch (Exception e) {

            // Print error
            e.printStackTrace();

        } finally {

            // Close browser
            if (driver != null) {
//                driver.quit();
                driver = null;
            }
        }
    }
}