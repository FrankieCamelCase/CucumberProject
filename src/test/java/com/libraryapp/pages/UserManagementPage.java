package com.libraryapp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class UserManagementPage extends Base {

    @FindBy(xpath = "//a[@class='btn btn-lg btn-outline btn-primary btn-sm']")
    private WebElement addUserButton;

    @FindBy(xpath = "//select[@id='user_groups']")
    private WebElement userGroupsDropDown;

    @FindBy(xpath = "//select[@id='user_status']")
    private WebElement userStatus;

    @FindBy(name = "tbl_users_length")
    private WebElement showRecordsDropDown;

    @FindBy(name = "//tbody//td[6]")
    private List<WebElement> statusColumn;

    @FindBy(xpath = "//tbody//td[5]")
    private WebElement group;

    @FindBy(xpath = "//tbody//td[2]")
    private WebElement userIDColumn;

    @FindBy(xpath = "//tbody//tr[1]//td[1]")
    private WebElement editUserButton1;

    @FindBy(xpath = "//ul[@class='pagination']//li")
    private WebElement paginationLinks;

    @FindBy(xpath = "//input[@type='search']")
    private WebElement searchBox;

    @FindBy(xpath = "//h3[.='User Management']" )
    private WebElement userManagementHeading;

    @FindBy(xpath = "//input[@name='full_name']")
    private WebElement fullName;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement password;

    @FindBy(xpath = "//input[@name='email']")
    private WebElement email;

    @FindBy(xpath = "//input[@name='user_grou_id']")
    private WebElement UserGroup;

    @FindBy(xpath = "//input[@name='status']" )
    private WebElement status;

    @FindBy(xpath = "//input[@name='start date']")
    private WebElement startDate;

    @FindBy(xpath = "//div[@class='datepicker-days']//th[.='Today']")
    private WebElement todayDatePicker;

    @FindBy(xpath = "//input[@name='end_date']")
    private WebElement endDate;

    @FindBy(xpath = "//textarea[@id='address']")
    private WebElement addressBox;

    @FindBy(xpath = "//button[.='Save changes']")
    private WebElement saveChanges;

    @FindBy(xpath = "//tbody//td[.='Sarah']")
    private WebElement testUserSarah;

    @FindBy(xpath = "//tbody//td[3]")
    private WebElement fullNameCell1;

    @FindBy(xpath = "//input[@aria-invalid='false']")
    private WebElement fullNameInputNotEmpty;

    @FindBy(xpath = "//input[@aria-invalid='true']")
    private WebElement fullNameInputIsEmpty;

    @FindBy(xpath = "//tbody//td[2]")
    private List<WebElement> userIDs;

    @FindBy(xpath = "//tbody//td[2]")
    private WebElement userID;

    @FindBy(xpath = "//tbody")
    private WebElement tableBody;

    @FindBy(xpath = "//tbody//td[5]")
    private List<WebElement> students;

    @FindBy(xpath = "//tbody//td[5]")
    private WebElement firstStudent;

    @FindBy(xpath = "//div[@class='form-group has-error']")
    private WebElement error;

    @FindBy(xpath = "modal fade show")

    private WebElement editUserInformationWindow;

    public WebElement getEditUserInformationWindow(){
        return editUserInformationWindow;
    }

    public WebElement getError(){
        return error;
    }

    public WebElement getStatusDropDown(){
        return userStatus;
    }

    public WebElement getEditUserButton1(){
        return editUserButton1;
    }

    public WebElement getFirstStudent(){
        return firstStudent;
    }

    public List<WebElement> getListOfStudents(){
        return students;
    }

    public WebElement getUserDropDown(){
        return userGroupsDropDown;
    }

    public WebElement getUserID(){
        return userID;
    }

    public void clickAddUser(){
        addUserButton.click();
    }

    public void enterUserID(String userID){
        searchBox.sendKeys(userID);
    }

    public WebElement getFullNameInputIsEmpty(){
        return fullNameInputIsEmpty;
    }

    public WebElement getFullNameInputNotEmpty(){
        return fullNameInputNotEmpty;
    }

    public void setFullName(String name){
        fullName.sendKeys(name);
    }

    public void clickEditUserButton1(){
        editUserButton1.click();
    }

    public WebElement getTestUser(){
        return testUserSarah;
    }

    public WebElement getFullNameField(){
        return fullName;
    }

    public WebElement getPasswordField(){
        return password;
    }

    public WebElement getEmailField(){
        return email;
    }

    public WebElement getAddressField(){
        return addressBox;
    }

    public void clickSaveChangesButton(){
        saveChanges.click();
    }

    public boolean userManagementHeadingIsDisplayed(){
        if(!userManagementHeading.isDisplayed()){
            return false;
        }
        return true;
    }

    public List<String> getStringOfStudents(){
        List<String> studentStrings = new ArrayList<>();
        for(WebElement each : students){
            studentStrings.add(each.getText());
        }
        return studentStrings;
    }

    public void selectRecords(String records){
        Select select = new Select(showRecordsDropDown);
        select.selectByValue(records);
    }

    public List<String> getAllStatusAsString(){
        List<String> statusesAsStrings = new ArrayList<>();
        for(WebElement each : statusColumn){
            statusesAsStrings.add(each.getText());
        }
        return statusesAsStrings;
    }

    public List<String> getAllUserIDsAsStringList(){
        List<String> ids = new ArrayList<>();
        for(WebElement each : userIDs){
            ids.add(each.getText());
        }
        return ids;
    }

    public String getFullNameCellText(){
        String fullNameCellText = fullNameCell1.getText();
        return fullNameCellText;
    }
}
