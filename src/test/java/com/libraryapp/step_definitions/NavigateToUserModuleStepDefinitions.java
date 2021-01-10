package com.libraryapp.step_definitions;

import com.libraryapp.pages.DashboardPage;
import com.libraryapp.pages.LoginPage;
import com.libraryapp.pages.UserManagementPage;
import com.libraryapp.utils.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NavigateToUserModuleStepDefinitions {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboard = new DashboardPage();
    UserManagementPage userManagementPage = new UserManagementPage();


    @Given("user is on the dashboard")
    public void user_is_on_the_dashboard() {

        loginPage.navigateToLoginScreen();
        loginPage.login(ConfigurationReader.getProperty("email"));

        Assert.assertTrue("You are not on the dashboard", dashboard.userCount().isDisplayed());

    }

    @When("user clicks {string}")
    public void user_clicks(String string) {
        dashboard.navigateToModule(string);
    }

    @Then("the user will see the Users page")
    public void the_user_will_see_the_users_page() {
        Assert.assertTrue("User Management page is not displayed..", userManagementPage.userManagementHeadingIsDisplayed());
    }
}
