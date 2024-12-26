package org.utils;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.Map;

public class MobileUtils {



  /*The general syntax for using AccessibilityId is:
    //driver.findElement(MobileBy.AccessibilityId("Login Button")).click();

  /*The general syntax for using UIAutomator is:

    MobileBy.AndroidUIAutomator("UiSelector().property()");

    Here:

    UiSelector() is the class used to locate elements.
    property() refers to the specific property you want to match.

    */


    /*
    1. Locate by Text

    Finds an element based on its text property (visible text).

    driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Submit\")")).click();

    2. Locate by Resource ID

   If the element has resource-id="com.example:id/username":
   driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.example:id/username\")")).sendKeys("testUser");

   3. Locate by Class Name

   To find a button with the class android.widget.Button:
   driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.widget.Button\")")).click();

   4. Locate by Content Description

   If an element has content-desc="Login Button"
   driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().description(\"Login Button\")")).click();

   5. Locate by Index

   To click the second button in a group of buttons:
   driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.widget.Button\").index(1)")).click();

   6.Locate by Scrollable

   Scroll to an element with text "Settings"
   driver.findElement(MobileBy.AndroidUIAutomator(
    "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Settings\"))"));





    */

    AndroidDriver driver;
    public void scrollToElement(AndroidDriver driver, By locator, String direction) {

        WebElement element = driver.findElement(locator);
        JavascriptExecutor js = driver;
        Map<String, Object> scrollArgs = new HashMap<>();
        scrollArgs.put("elementId", ((org.openqa.selenium.remote.RemoteWebElement) element).getId());
        scrollArgs.put("direction", direction);
        // scrollArgs.put("percent", 3.0);
        js.executeScript("mobile: scrollGesture", scrollArgs);
    }

    public void test() {
        scrollToElement(driver, AppiumBy.id("com.google:id/targetElement"), "down");
    }

    public void scrollByScreenSizeUsingJS(AndroidDriver driver) {
        int screenHeight = driver.manage().window().getSize().height;
        int screenWidth = driver.manage().window().getSize().width;
        int startX = screenWidth / 2;
        int startY = (int) (screenHeight * 0.8);
        int endY = (int) (screenHeight * 0.2);
        JavascriptExecutor js = driver;
        js.executeScript("mobile: scrollGesture",
                ImmutableMap.of(
                        "startX", startX,
                        "startY", startY,
                        "endX", startX,
                        "endY", endY
                ));
    }

}
