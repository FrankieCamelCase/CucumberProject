package com.libraryapp.step_definitions;

import com.libraryapp.pages.UserManagementPage;
import com.libraryapp.utils.BrowserUtils;
import com.libraryapp.utils.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EditUserStepDefinitions {

    UserManagementPage usermanagementpage = new UserManagementPage();

    @When("user clicks the edit user button")
    public void user_clicks_the_edit_user_button() {
        usermanagementpage.clickEditUserButton1();
    }

    @When("user changes the full name to {string}")
    public void user_changes_the_full_name_to(String string) {
        BrowserUtils.wait(2);
        usermanagementpage.getFullNameField().clear();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
        usermanagementpage.setFullName(string);
    }

    @When("user clicks the save changes button")
    public void user_clicks_the_save_changes_button() {
        usermanagementpage.clickSaveChangesButton();
        Driver.refreshWebPage();
    }

    @Then("the updated full name {string} will appear in the records table")
    public void the_updated_full_name_will_appear_in_the_records_table(String string) {
        String expected = string;
        Assert.assertEquals("The full names do not match", expected, usermanagementpage.getFullNameCellText() );
    }
}
