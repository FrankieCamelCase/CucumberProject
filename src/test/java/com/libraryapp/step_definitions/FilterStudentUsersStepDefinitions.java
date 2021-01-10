package com.libraryapp.step_definitions;

import com.libraryapp.pages.UserManagementPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class FilterStudentUsersStepDefinitions {

    UserManagementPage userManagementPage = new UserManagementPage();
    Select select;

    @When("user selects the user group drop down")
    public void user_selects_the_user_group_drop_down() {
        select = new Select(userManagementPage.getUserDropDown());
    }

    @When("user selects Students")
    public void user_selects_students(){
        select.selectByIndex(2);
    }

    @Then("only Student users will be displayed")
    public void only_student_users_will_be_displayed() {
        try {
            Assert.assertFalse(userManagementPage.getStringOfStudents().contains("Librarian"));
        } catch (org.openqa.selenium.StaleElementReferenceException e){
            Assert.assertFalse(userManagementPage.getStringOfStudents().contains("Librarian"));
        }
    }
}
