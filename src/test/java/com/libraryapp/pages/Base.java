package com.libraryapp.pages;

import com.libraryapp.utils.ConfigurationReader;
import com.libraryapp.utils.Driver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;


public abstract class Base {

    public Base(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void navigateToLoginScreen(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    public void navigateToModule(String module){
        String moduleXPath = "//span[.='"+module+"']";
        WebElement moduleElement = Driver.getDriver().findElement(By.xpath(moduleXPath));
        moduleElement.click();
    }

    public void takeScreenshot(String fileName){
        File scrFile = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.FILE);
        String path = System.getProperty("user.dir")
                + File.separator + "test-output"
                + File.separator + "screenshots"
                + " " + fileName + ".png";
        try {
            FileUtils.copyFile(scrFile, new File(path));
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
