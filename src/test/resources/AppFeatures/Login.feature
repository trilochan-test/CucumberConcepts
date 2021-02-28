Feature: Login Feature

  Scenario Outline: Login fail - possible combinations
    Given User is on Application Home Page
    When User clicks on Sign in button
    Then User is displayed login screen
    When User enters "<UserName>" in username field
    And User enters "<Password>" in password field
    And User Clicks Sign in button
    Then User gets login failed with error message

    Examples: 
      | UserName          | Password          |
      | IncorrectUserName |            676767 |
      | Trilochan         | IncorrectPassword |
      | IncorrectUserName | IncorrectPassword |
