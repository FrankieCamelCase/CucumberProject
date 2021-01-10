package com.libraryapp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends Base {

    @FindBy(xpath="//span[.='Dashboard']" )
    private WebElement dashboardModule;

    @FindBy(xpath="//span[.='Users']")
    private WebElement usersModule;

    @FindBy(xpath="//span[.='Books']")
    private WebElement booksModule;

    @FindBy(xpath="//a[@id='navbarDropdown']")
    private WebElement navDropDown;

    @FindBy(xpath="//h2[@id='user_count']")
    private WebElement userCount;

    public WebElement userCount(){
        return userCount;
    }


}
