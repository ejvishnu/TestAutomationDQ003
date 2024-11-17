package org.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenShotManager {

    private WebDriver driver;


    public ScreenShotManager(WebDriver driver) {
        this.driver = driver;
    }

    // Capture screenshot and save it with a timestamp
    public String captureScreenshot(String screenshotName) {
        // Generate timestamp for unique file names
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String filePath = "screenshots/" + screenshotName + "_" + timestamp + ".png";

        // Take a screenshot
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destFile = new File(filePath);

        try {
            // Save the screenshot to the destination file
            FileUtils.copyFile(srcFile, destFile);
            System.out.println("Screenshot saved at: " + filePath);
        } catch (IOException e) {
            System.out.println("Failed to save screenshot: " + e.getMessage());
        }

        return filePath; // Return the file path for reporting purposes
    }
}
