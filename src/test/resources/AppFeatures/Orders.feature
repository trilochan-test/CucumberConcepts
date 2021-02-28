Feature: Amazon Orders Page
   In order to check my order details
   As a Registered user
   I Want to specify the features of order details page

  Background: 
    Given A Registered User Exists
    Given User is on Amazon login page
    When User  enters username
    And User enters password
    And User Clicks on login button
    Then User navigates to order page

  @Smoke
  Scenario: Check Previous Order Details
    When User Clicks on order link
    Then User checks the previous order details
   

  @Regression
  Scenario: Check Open Order Details
    When User Clicks on open order link
    Then User checks the open order details

  @Prod
  Scenario: Check Cancelled Order Details
    When User Clicks on Cancelled order link
    Then User checks the Cancelled order details
