@All
Feature: Uber Booking Feature
  @Smoke
  Scenario: Booking Cab For BMW
    Given User wants to select a car type "BMW" from uber application
    When User Selects a car "BMW" and pick up point "Bangalore" and drop location "Hyderabad"
    Then Driver starts journey
    And Driver ends journey
    Then User pays 1000 RS

  @Regression
  Scenario: Booking Cab For Mini
    Given User wants to select a car type "Mini" from uber application
    When User Selects a car "BMW" and pick up point "Bangalore" and drop location "Hyderabad"
    Then Driver starts journey
    And Driver ends journey
    Then User pays 1000 RS

  @Prod
  Scenario: Booking Cab For SVU
    Given User wants to select a car type "SVU" from uber application
    When User Selects a car "BMW" and pick up point "Bangalore" and drop location "Hyderabad"
    Then Driver starts journey
    And Driver ends journey
    Then User pays 1000 RS

  @Regression @Smoke
  Scenario: Booking Cab For Swift
    Given User wants to select a car type "Swift" from uber application
    When User Selects a car "BMW" and pick up point "Bangalore" and drop location "Hyderabad"
    Then Driver starts journey
    And Driver ends journey
    Then User pays 1000 RS
