package com.libraryapp.step_definitions;

import com.libraryapp.pages.UserManagementPage;
import com.libraryapp.utils.BrowserUtils;
import com.libraryapp.utils.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchUserIDStepDefinitions {

    UserManagementPage userManagementPage = new UserManagementPage();

    @When("enters the valid User ID {string} into the search box")
    public void enters_the_valid_user_id_into_the_search_box(String string) throws InterruptedException {
        userManagementPage.enterUserID(string);
        BrowserUtils.wait(2);
    }

    @Then("the user with the valid User ID {string} will appear in the table")
    public void the_user_with_the_valid_user_id_will_appear_in_the_table(String string) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOf(userManagementPage.getUserID()));

        Assert.assertTrue(userManagementPage.getAllUserIDsAsStringList().contains(string));
    }

}
