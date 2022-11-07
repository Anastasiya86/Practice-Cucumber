package com.cydeo.step_defs;

import com.cydeo.pages.WikiSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WikiSearch_StepDefs {
    WikiSearchPage wikiSearchPage = new WikiSearchPage();
    @Given("user is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org");

    }
    @When("user types Steve Jobs in the wiki search box and user clicks wiki search button")
    public void user_types_steve_jobs_in_the_wiki_search_box_and_user_clicks_wiki_search_button() {
        wikiSearchPage.searchBox.sendKeys("Steve Jobs");
        wikiSearchPage.searchButton.click();
    }
    @Then("user sees Steve Jobs is in the wiki title")
    public void user_sees_steve_jobs_is_in_the_wiki_title() {
    String actualTitle = Driver.getDriver().getTitle();
    String expectedTitle= "Steve Jobs";
        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }
    @When("user types {string} in the wiki search box and user clicks wiki search button")
    public void userTypesInTheWikiSearchBoxAndUserClicksWikiSearchButton(String searchInput) {
        wikiSearchPage.searchBox.sendKeys(searchInput);
        wikiSearchPage.searchButton.click();
    }
    @Then("user sees {string} is in the wiki title")
    public void userSeesIsInTheWikiTitle(String expectedTitle) {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }


    @Then("user sees {string} is in the main header")
    public void userSeesIsInTheMainHeader(String expectedHeader) {
        String actualHeader = wikiSearchPage.headerTitle.getText();
        Assert.assertTrue(actualHeader.contains(expectedHeader));
    }

    @Then("user sees {string} is in the image header")
    public void userSeesIsInTheImageHeader(String expectedImageHeader) {
        String actualImageHeader = wikiSearchPage.imageTitle.getText();
        Assert.assertTrue(actualImageHeader.contains(expectedImageHeader));
    }
}
