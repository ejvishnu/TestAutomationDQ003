Feature: Login

  @reg
  Scenario: User able to login with valid credentials
    Given User on login page
    Then user enters user name and password
    When user clicks on login button
    Then user navigated to home page



  Scenario: User able should not able to login with in-valid credentials