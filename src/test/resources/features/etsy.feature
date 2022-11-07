Feature: Etsy Functionality Title Verification

  Background:
    Given user is on the Etsy homepage


  Scenario: Etsy Title Verification
   # Given user is on the Etsy homepage
    Then user sees title is as expected


  Scenario: Etsy Search Functionality Title Verification
     # Given user is on the Etsy homepage
    When user types Wooden Spoon in the search box
    And user clicks search button
    Then user sees Wooden Spoon is in the title


    Scenario: Etsy Search Functionality Title Verification with parameters
       # Given user is on the Etsy homepage
      When user types "Mosaics" in the search box
      And user clicks search button
      Then user sees "Mosaics" is in the title