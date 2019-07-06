Feature: Cart Functionality
 		
   Scenario Outline: Logging into Amazon website
    Given User has account account in Amazon site
    When User opens Amazon URL using the "<url>" in "Chrome" browser
    And Enter credentials using "<username>" and "<password>"
    And Click on Sign in button
    Then User is able to login using credentials
 

	Examples: 
 	|       username              |password|   url       |
 	|pradeepkumarmallari@gmail.com|mpk.7099|www.amazon.in|
 	
 	