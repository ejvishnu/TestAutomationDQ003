package org.utils;

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


}
