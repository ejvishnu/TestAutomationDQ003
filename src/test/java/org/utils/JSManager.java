package org.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JSManager {
    private JavascriptExecutor jsExecutor;

    // Constructor
    public JSManager(WebDriver driver) {
        this.jsExecutor = (JavascriptExecutor) driver;
    }

    // Click an element using JavaScript
    public void clickElement(WebElement element) {
        jsExecutor.executeScript("arguments[0].click();", element);
    }

    // Scroll to a specific element
    public void scrollToElement(WebElement element) {
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    // Scroll by a specific amount (x, y)
    public void scrollBy(int x, int y) {
        jsExecutor.executeScript("window.scrollBy(arguments[0], arguments[1]);", x, y);
    }

    // Retrieve the page title
    public String getPageTitle() {
        return jsExecutor.executeScript("return document.title;").toString();
    }

    // Retrieve the page URL
    public String getPageURL() {
        return jsExecutor.executeScript("return document.URL;").toString();
    }

    // Set value for an input field
    public void setInputValue(WebElement element, String value) {
        jsExecutor.executeScript("arguments[0].value='" + value + "';", element);
    }

    // Highlight an element
    public void highlightElement(WebElement element) {
        jsExecutor.executeScript("arguments[0].style.border='3px solid red'", element);
    }

    // Remove highlight from an element
    public void removeHighlight(WebElement element) {
        jsExecutor.executeScript("arguments[0].style.border=''", element);
    }

    // Refresh the browser using JavaScript
    public void refreshBrowser() {
        jsExecutor.executeScript("location.reload();");
    }
}
