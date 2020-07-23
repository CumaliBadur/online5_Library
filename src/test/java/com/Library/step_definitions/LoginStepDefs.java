package com.Library.step_definitions;

import com.Library.pages.LoginPage;
import com.Library.utilities.ConfigurationReader;
import com.Library.utilities.Driver;
import com.Library.utilities.LibraryConstants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Map;

public class LoginStepDefs {
    LoginPage loginPage = new LoginPage();

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {

        String url = null;
        if (System.getProperty("env") != null) {
            url = ConfigurationReader.getProperty(System.getProperty("env")+"_url");

        } else {
            url = ConfigurationReader.getProperty("url");
        }

        System.out.println("Going to the login page");
        // login
        // Driver.getDriver()  --> gives us a driver object
        Driver.getDriver().get(url);

    }

    @When("I login as a librarian")
    public void i_login_as_a_librarian() {
        System.out.println("Logging in as a librarian");
        String email = ConfigurationReader.getProperty("librarian_email");
        String password = ConfigurationReader.getProperty("librarian_password");
        loginPage.login(email, password);
    }

    @Then("dashboard should be displayed")
    public void dashboard_should_be_displayed() {
        System.out.println("Verifying dashboard page");
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
        wait.until(ExpectedConditions.urlContains("dashboard"));
        String actualTitle = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualTitle.endsWith("dashboard"));
    }



}
