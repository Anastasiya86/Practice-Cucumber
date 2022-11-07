package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ViewAllOrdersPage {
    public ViewAllOrdersPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//table[@id='ctl00_MainContent_orderGrid']/tbody//tr//td[2]")
    public List<WebElement> names;

}
