package com.VyTrack.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefs {
    @Given("User is on the login page")
    public void userIsOnTheLoginPage() {
        System.out.println("->User is on the login page");
    }

    @When("User logs in as Truck Driver")
    public void userLogsInAsTruckDriver() {
        System.out.println("->User logs in as truck driver");
    }

    @Then("User should see dashboard")
    public void userShouldSeeDashboard() {
        System.out.println("->User should see dashboard");
    }
}
