package com.cydeo.step_defs;

import com.cydeo.pages.EtsyPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Etsy_StepDefs {
    EtsyPage etsyPage = new EtsyPage();
    @Given("user is on the Etsy homepage")
    public void user_is_on_the_etsy_homepage() {
        Driver.getDriver().get("https://www.etsy.com/");
        etsyPage.cookiesAccept.click();

    }
    @Then("user sees title is as expected")
    public void user_sees_title_is_as_expected() {
    String actualTitle = Driver.getDriver().getTitle();
    String expectedTitle = "Etsy Bulgaria - Shop for handmade, vintage, custom, and unique gifts for everyone";
        Assert.assertEquals(expectedTitle,actualTitle);

    }

    @When("user types Wooden Spoon in the search box")
    public void userTypesWoodenSpoonInTheSearchBox() {
        etsyPage.searchBox.sendKeys("Wooden Spoon");
    }

    @And("user clicks search button")
    public void userClicksSearchButton() {
        etsyPage.searchButton.click();
    }

    @Then("user sees Wooden Spoon is in the title")
    public void userSeesWoodenSpoonIsInTheTitle() {
        String expectedTitle = "Wooden spoon";
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle));
    }

    @When("user types {string} in the search box")
    public void user_types_in_the_search_box(String string) {
       etsyPage.searchBox.sendKeys(string);

    }
    @Then("user sees {string} is in the title")
    public void user_sees_is_in_the_title(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));

    }




}
