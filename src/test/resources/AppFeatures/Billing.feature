Feature: Calculate Billing Amount

  Scenario Outline: Billing Amount
    Given User is on billing page
    When User enters Billing Amount "<BillingAmount>"
    When User enters Tax Amount "<TaxAmount>"
    And User Clicks on Calculate button
    Then It gives the Final Amount "<FinalAmount>"

    Examples: 
      | BillingAmount | TaxAmount | FinalAmount |
      |          1000 |        10 |        1010 |
      |           500 |        20 |         520 |
      |           100 |       5.5 |       105.5 |
