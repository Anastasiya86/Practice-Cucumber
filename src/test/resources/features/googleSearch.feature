Feature: Google Search Functionality Title Verification


  Scenario: Title Verification
    Given user is on Google search page
    When user types apple in the google search box and clicks enter
    Then user sees apple-Google Search in the google title