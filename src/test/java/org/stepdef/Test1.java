package org.stepdef;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {


    @Parameters({"browser", "url"})
    @Test(groups = {"regression1"})

    public void check(String browser, String url) {
        ChromeDriver driver = new ChromeDriver();
        System.out.println(browser + url);
    }

    @Test(groups = {"regression"})
    public void check1() {
        ChromeDriver driver = new ChromeDriver();

    }

    @Test(groups = {"regression"})
    public void check2() {
        ChromeDriver driver = new ChromeDriver();
    }

    @Test
    public void check3() {
        ChromeDriver driver = new ChromeDriver();
    }

    @Test
    public void check4() {
        ChromeDriver driver = new ChromeDriver();
    }


    @DataProvider(name = "testData")
    public Object[][] provideData() {
        return new Object[][]{
                {"Alice", 25},  // Row 1
                {"Bob", 30},    // Row 2
                {"Charlie", 35} // Row 3
        };
    }


    @Test(dataProvider = "testData")
    public void testWithDataProvider(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
