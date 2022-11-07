Feature: SmartBear order process

  @scenarioOutline
  Scenario Outline:SmartBear order process
  Given user is logged into SmartBear Tester account and on Order page
  When user selects FamilyAlbum from product dropdown and user enters "<quantity>"
  And user enters "<CustomerName>" "<Street>" "<City>" "<State>" "<Zip>"

  When user selects "Visa" as card type
  And user enters "<CardNumber>" and "<ExpireDate>"

  And user clicks process button
  Then user verifies "<CustomerName>" is in the list

    Examples:


      | quantity | CustomerName | Street     | City    | State | Zip   | CardNumber       | ExpireDate |
      | 4        | John Wick    | Kinzie Ave | Chicago | IL    | 60056 | 1111222233334444 | 12/22      |