Feature: Wikipedia Search Functionality

  Background:
    Given user is on Wikipedia home page

  Scenario: Wikipedia Search Functionality Title Verification
  #Given user is on Wikipedia home page
  When user types Steve Jobs in the wiki search box and user clicks wiki search button
  Then user sees Steve Jobs is in the wiki title


  Scenario: Wikipedia Search Functionality Title Verification
    #Given user is on Wikipedia home page
    When user types "Diego Maradona" in the wiki search box and user clicks wiki search button
    Then user sees "Diego Maradona" is in the wiki title


    Scenario Outline: Wikipedia Search Functionality Title Verification with using DDT
      #Given user is on Wikipedia home page
      When user types "<searchInput>" in the wiki search box and user clicks wiki search button
      Then user sees "<expectedTitle>" is in the wiki title
      Examples:
        | searchInput       | expectedTitle     |
        | Steve Jobs        | Steve Jobs        |
        | Bill Gates        | Bill Gates        |
        | Cristiano Ronaldo | Cristiano Ronaldo |
        | Elon Musk         | Elon Musk         |
        | Albert Einstein   | Albert Einstein   |
        | Chuck Norris      | Chuck Norris      |
        | Alisher Usmanov   | Alisher Usmanov   |


    Scenario: Wikipedia Search Functionality Header Verification
    #Given user is on Wikipedia home page
     When user types "Elon Musk" in the wiki search box and user clicks wiki search button
     Then user sees "Elon Musk" is in the main header


  Scenario: Wikipedia Search Functionality Image Header Verification
    #Given user is on Wikipedia home page
    When user types "Elon Musk" in the wiki search box and user clicks wiki search button
    Then user sees "Elon Musk" is in the image header