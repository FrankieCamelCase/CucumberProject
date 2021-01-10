package com.libraryapp.step_definitions;

import com.libraryapp.pages.DashboardPage;
import com.libraryapp.pages.LoginPage;
import com.libraryapp.utils.ConfigurationReader;
import com.libraryapp.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user logs in as {string}")
    public void user_logs_in_as(String string) {
        loginPage.login(string);
    }

    @Then("the user should see the dashboard")
    public void the_user_should_see_the_dashboard() {
        DashboardPage dashboard = new DashboardPage();
        Assert.assertTrue(dashboard.userCount().isDisplayed());
    }

}

