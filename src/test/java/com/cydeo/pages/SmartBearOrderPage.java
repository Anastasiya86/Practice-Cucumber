package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SmartBearOrderPage {
    public SmartBearOrderPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//a[.='Order']")
    public WebElement orderModule;
    @FindBy (xpath = "//a[.='View all orders']")
    public WebElement viewAllOrders;

    @FindBy (xpath = "//select[@onchange='productsChanged()']")
    public WebElement productDropdown;

    @FindBy (xpath = "//input[@id='ctl00_MainContent_fmwOrder_txtQuantity']")
    public WebElement quantity;

    @FindBy (xpath = "//input[@id='ctl00_MainContent_fmwOrder_txtName']")
    public WebElement customerName;

    @FindBy (xpath = "//input[@id='ctl00_MainContent_fmwOrder_TextBox2']")
    public WebElement street;

    @FindBy (xpath = "//input[@id='ctl00_MainContent_fmwOrder_TextBox3']")
    public WebElement city;
    @FindBy (xpath = "//input[@id='ctl00_MainContent_fmwOrder_TextBox4']")
    public WebElement state;

    @FindBy (xpath = "//input[@id='ctl00_MainContent_fmwOrder_TextBox5']")
    public WebElement zip;

    @FindBy (xpath = "//input[@name='ctl00$MainContent$fmwOrder$cardList']")
    public List <WebElement> cardType;

    @FindBy (xpath = "//input[@id='ctl00_MainContent_fmwOrder_TextBox6']")
    public WebElement cardNumber;

    @FindBy (xpath = "//input[@id='ctl00_MainContent_fmwOrder_TextBox1']")
    public WebElement expireDate;

    @FindBy (xpath = "//a[@id='ctl00_MainContent_fmwOrder_InsertButton']")
    public WebElement processButton;


}
