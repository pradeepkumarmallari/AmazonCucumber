Feature: Cart Functionality
 		
   Scenario: Finding Amazon firestick using search bar
    Given User has account account in Amazon site
    When User opens Amazon URL using the "https://www.amazon.in/" in "chrome" browser
    And Searches with "Fire stick" in the search bar
    And Click on search button
    Then User is able to find "Fire TV Stick with all-new Alexa Voice Remote" in the seach results
 