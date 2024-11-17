package org.pages;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.utils.ScreenShotManager;

public class Home {

    @Test
    public void check()
    {
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.youtube.com/");
        new ScreenShotManager(driver).captureScreenshot("hey");
    }
}
