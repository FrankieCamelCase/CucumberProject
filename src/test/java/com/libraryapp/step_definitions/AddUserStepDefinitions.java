package com.libraryapp.step_definitions;

import com.libraryapp.pages.DashboardPage;
import com.libraryapp.pages.LoginPage;
import com.libraryapp.pages.UserManagementPage;
import com.libraryapp.utils.ConfigurationReader;
import com.libraryapp.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AddUserStepDefinitions {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    UserManagementPage userManagementPage = new UserManagementPage();

    @Given("user is on the User Management page")
    public void user_is_on_the_user_management_page() {

        loginPage.navigateToLoginScreen();
        loginPage.login(ConfigurationReader.getProperty("email"));

        dashboardPage.navigateToModule(ConfigurationReader.getProperty("module"));

        Assert.assertTrue(userManagementPage.userManagementHeadingIsDisplayed());

    }

    @When("user clicks the add user button")
    public void user_clicks_the_add_user_button() {
        userManagementPage.clickAddUser();
    }


    @When("the user enters <Full Name>, <Password>, <Address>")
    public void the_user_enters_full_name_password_address(io.cucumber.datatable.DataTable dataTable) {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfAllElements(userManagementPage.getFullNameField()));

        List<List<String>> data = dataTable.asLists();

        userManagementPage.getFullNameField().sendKeys(data.get(0).get(1));
        userManagementPage.getPasswordField().sendKeys(data.get(1).get(1));
        userManagementPage.getEmailField().sendKeys(data.get(2).get(1));
        userManagementPage.getAddressField().sendKeys(data.get(3).get(1));

    }

    @When("clicks the save changes button")
    public void clicks_the_save_changes_button() {
        userManagementPage.clickSaveChangesButton();
    }

    @Then("the new user information will appear in the table.")
    public void the_new_user_information_will_appear_in_the_table() {
        Assert.assertTrue(userManagementPage.getTestUser().isDisplayed());
    }
}
