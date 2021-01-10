package com.libraryapp.pages;

import com.libraryapp.utils.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Base{


    @FindBy(id="inputEmail")
    private WebElement emailInputBox;

    @FindBy(id="inputPassword")
    private WebElement passwordInputBox;

    public void login(String email, String password){
        emailInputBox.sendKeys(email);
        passwordInputBox.sendKeys(password, Keys.ENTER);
    }

    public void login(String role){
        String usernameValue = ConfigurationReader.getProperty("email");
        String passwordValue = ConfigurationReader.getProperty("password");
        emailInputBox.sendKeys(usernameValue);
        passwordInputBox.sendKeys(passwordValue, Keys.ENTER);
    }


}
