package org.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.junit.Test;
import org.utils.ScreenShotManager;

import java.net.MalformedURLException;
import java.net.URL;

public class Home {


    @Test
    public void check() throws MalformedURLException {
        //WebDriver driver =new ChromeDriver();
        UiAutomator2Options options = null;
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);


        driver.get("https://www.youtube.com/");
        new ScreenShotManager(driver).captureScreenshot("hey");
    }
}
