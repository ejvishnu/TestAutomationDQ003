package org.stepdef;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.plugin.event.Node;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginStepDef {





    @Given("User on login page")
    public void user_on_login_page() {
        new ChromeDriver();

    }
    @Then("user enters user name and password")
    public void user_enters_user_name_and_password() {

      System.out.println("hello");
    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {

    }
    @Then("user navigated to home page")
    public void user_navigated_to_home_page() {

    }


    @Then("user enters {string} and {string}")
    public void userEntersAnd(String arg0, String arg1) {

        System.out.println(arg0+" - "+arg1);

    }

    @Test
    public void test()
    {
        System.out.println("load13r");
    }

    @And("User enters age as {int}")
    public void userEntersAgeAs(int arg0) {
    }

    @Then("user enters user name and password - {int}")
    public void userEntersUserNameAndPassword(int arg0) {

        if(arg0==0)
        {
            //valid test data
        }
        else
        {
            //invalid test data
        }

    }

    @Then("user enters <user name> and <password>")
    public void userEntersUserNameAndPassword() {
        
    }


    @Then("user able to see <message>")
    public void userAbleToSeeMessage() {
    }
}
