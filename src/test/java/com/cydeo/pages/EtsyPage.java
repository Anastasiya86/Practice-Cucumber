package com.cydeo.pages;

import com.cydeo.utilities.Driver;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EtsyPage {
    public EtsyPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//input[@name='search_query']")
    public WebElement searchBox;

    @FindBy (xpath = "//button[@class='wt-btn wt-btn--filled wt-mb-xs-0']")
    public WebElement cookiesAccept;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement searchButton;


}
