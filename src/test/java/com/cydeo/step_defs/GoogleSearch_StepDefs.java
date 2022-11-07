package com.cydeo.step_defs;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleSearch_StepDefs {
    GoogleSearchPage googleSearchPage = new GoogleSearchPage();
    @Given("user is on Google search page")
    public void user_is_on_google_search_page() {
     //   Driver.getDriver().get(ConfigurationReader.getProperty("googleSearchEnv"));
        Driver.getDriver().get("https://www.google.com/");
    }
    @When("user types apple in the google search box and clicks enter")
    public void user_types_apple_in_the_google_search_box_and_clicks_enter() {
        googleSearchPage.declineCookies.click();
        googleSearchPage.searchBox.sendKeys("apple"+ Keys.ENTER);

    }
    @Then("user sees apple-Google Search in the google title")
    public void user_sees_apple_google_search_in_the_google_title() {
    String actualTitle= Driver.getDriver().getTitle();
    String expectedTitle = "apple - Google Търсене";
        Assert.assertEquals(expectedTitle,actualTitle);

    }
}
