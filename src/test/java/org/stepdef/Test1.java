package org.stepdef;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class Test1 {


    @Test

    public void check() {
        // ChromeDriver driver = new ChromeDriver();
        System.out.println("hello");
    }


    @Parameters({"userName", "password"})
    @Test(groups = {"regression2"})

    public void login(String userName, String password) {


        System.out.println("username is " + userName);
        System.out.println("password is " + password);
    }


    @Parameters({"browser"})
    @Test(groups = {"regression"})
    public void check1(String jsbcjsk) {
        //ChromeDriver driver = new ChromeDriver();

    }

    @Test(groups = {"regression"})
    public void check2() {
        //ChromeDriver driver = new ChromeDriver();
    }

    @Parameters({"browser"})
    @Test
    public void check3(String data) {

        System.out.println(data);


    }

    @Test
    public void check4() {
        //ChromeDriver driver = new ChromeDriver();
        System.out.println(Thread.currentThread());
    }


    @DataProvider(name = "loginCreds")
    public Object[][] provideData() {
        return new Object[][]{
                {"username@gmail.com", "12425235"},  // Row 1
                {"username@gmail2.com", "12425235"},    // Row 2
                {"username@gmail3.com", "12425235"} // Row 3
        };
    }


    @Test(dataProvider = "loginCreds")
    public void loginIntoApp(String name, String password) {
        System.out.println("Name: " + name + ", password: " + password);

    }
}
