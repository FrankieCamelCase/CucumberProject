package com.libraryapp.step_definitions;

import com.libraryapp.pages.UserManagementPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class FilterInactiveUsersStepDefinitions {

    UserManagementPage userManagementPage = new UserManagementPage();
    Select select;

    @When("user selects the STATUS drop down")
    public void user_selects_the_status_drop_down() {
        select = new Select(userManagementPage.getStatusDropDown());
    }

    @When("user selects Inactive")
    public void user_selects_inactive() {
        select.selectByIndex(1);
    }

    @Then("only Inactive users will be displayed")
    public void only_inactive_users_will_be_displayed() {
        try {
            Assert.assertFalse(userManagementPage.getAllStatusAsString().contains("ACTIVE"));
        } catch (org.openqa.selenium.StaleElementReferenceException e){
            Assert.assertFalse(userManagementPage.getAllStatusAsString().contains("ACTIVE"));
        }
    }
}
