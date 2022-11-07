package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearMainPage {
    public SmartBearMainPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//input[@id='ctl00_MainContent_username']")
    public WebElement usernameInput;

    @FindBy (xpath = "//input[@id='ctl00_MainContent_password']")
    public WebElement passwordInput;

    @FindBy (xpath = "//input[@class='button']")
    public WebElement LoginBtn;

}
