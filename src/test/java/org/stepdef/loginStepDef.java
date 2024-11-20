package org.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginStepDef {


    @Given("User on login page")
    public void user_on_login_page() {
      System.out.println("hello");
    }
    @Then("user enters user name and password")
    public void user_enters_user_name_and_password() {

    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {

    }
    @Then("user navigated to home page")
    public void user_navigated_to_home_page() {

    }



}
