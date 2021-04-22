Feature: Test login functionality
  Description: testing login page with valid and invalid credentials

  Scenario: Test login with valid creadentials
    Given user is on login page
    When user enter username which is "rajat"
    And user enter password which is "rajat123"
    And user click on submit button
    Then user is on home page
    
Scenario Outline: Test login with valid creadentials
    Given user is on login page
    When user enter username which is "<username>"
    And user enter password which is "<passowrd>"
    And user click on submit button
    Then user is on home page
    
Examples: 
| username | passowrd |
| rajat    |rajat123  |
| rajat    |rajat321  |

