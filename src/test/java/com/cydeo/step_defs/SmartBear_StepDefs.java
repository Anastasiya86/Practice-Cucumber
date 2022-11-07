package com.cydeo.step_defs;

import com.cydeo.pages.SmartBearMainPage;
import com.cydeo.pages.SmartBearOrderPage;
import com.cydeo.pages.ViewAllOrdersPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SmartBear_StepDefs {
    SmartBearMainPage smartBearMainPage= new SmartBearMainPage();
    SmartBearOrderPage smartBearOrderPage = new SmartBearOrderPage();
    ViewAllOrdersPage viewAllOrdersPage = new ViewAllOrdersPage();
    @Given("user is logged into SmartBear Tester account and on Order page")
    public void user_is_logged_into_smart_bear_tester_account_and_on_order_page() {
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        smartBearMainPage.usernameInput.sendKeys("Tester");
        smartBearMainPage.passwordInput.sendKeys("test");
        smartBearMainPage.LoginBtn.click();
        smartBearOrderPage.orderModule.click();
    }
    @When("user selects FamilyAlbum from product dropdown and user enters {string}")
    public void user_selects_family_album_from_product_dropdown_and_user_enters(String quantity) {
        Select select =new Select(smartBearOrderPage.productDropdown);
        select.selectByVisibleText("FamilyAlbum");
        smartBearOrderPage.quantity.clear();
        smartBearOrderPage.quantity.sendKeys(quantity);
    }
    @When("user enters {string} {string} {string} {string} {string}")
    public void user_enters(String customerName, String street, String city, String state, String zip) {
        smartBearOrderPage.customerName.sendKeys(customerName);
        smartBearOrderPage.street.sendKeys(street);
        smartBearOrderPage.city.sendKeys(city);
        smartBearOrderPage.state.sendKeys(state);
        smartBearOrderPage.zip.sendKeys(zip);


    }
    @When("user selects {string} as card type")
    public void userSelectsAsCardType(String string) {
        // smartBearOrderPage.cardType.click();
        for (WebElement eachCardType : smartBearOrderPage.cardType) {
            if(eachCardType.getAttribute("value").equalsIgnoreCase(string)){
                eachCardType.click();
            }
        }
    }

    @When("user enters {string} and {string}")
    public void user_enters_and(String cardNumber, String expireDate) {
        smartBearOrderPage.cardNumber.sendKeys(cardNumber);
        smartBearOrderPage.expireDate.sendKeys(expireDate);
    }
    @When("user clicks process button")
    public void user_clicks_process_button() {
    smartBearOrderPage.processButton.click();
    smartBearOrderPage.viewAllOrders.click();
    }
    @Then("user verifies {string} is in the list")
    public void user_verifies_is_in_the_list(String expextedTitle) {

        for (WebElement each : viewAllOrdersPage.names) {
            if(each.getText().equals(expextedTitle)){
                System.out.println(each.getText());
                break;
            }
        }
    }


}
