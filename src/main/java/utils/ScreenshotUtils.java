package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class ScreenshotUtils {

    // Create reusable screenshot method
    public static void takeScreenshot(WebDriver driver)
            throws IOException {
        // Convert driver to TakesScreenshot
        TakesScreenshot ts = (TakesScreenshot) driver;
        // Capture screenshot
        File source = ts.getScreenshotAs(OutputType.FILE);
        // Define screenshot path
        Path destination = Path.of("screenshots", "Dashboard");
        // Create screenshot folder
        Files.createDirectories(destination.getParent());
        // Save screenshot
        Files.copy(source.toPath(), destination, StandardCopyOption.REPLACE_EXISTING);
        // Print message
        System.out.println("Screenshot taken successfully");
    }
}

