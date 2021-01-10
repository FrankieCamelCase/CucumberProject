package com.libraryapp.step_definitions;

import com.libraryapp.pages.UserManagementPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class DisplayRecordsStepDefs {

    UserManagementPage userManagementPage = new UserManagementPage();

    @When("enters clicks {string} records")
    public void enters_clicks_records(String string) {
        userManagementPage.selectRecords(string);
    }

    @Then("the user will see {string} records in the table")
    public void the_user_will_see_records_in_the_table(String string) {

        try {
            Assert.assertTrue(userManagementPage.getStringOfStudents().size() <= Integer.valueOf(string));
        } catch(org.openqa.selenium.StaleElementReferenceException e) {
            Assert.assertTrue(userManagementPage.getStringOfStudents().size() <= Integer.valueOf(string));
        }
    }
}
