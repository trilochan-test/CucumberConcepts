Feature: User Registration

  Scenario: User Registration with different data
    Given User is on Registration Page
    When User enters following user details
      | Trilochan   | Reddy | Tri@gmail.com    | 9090909090 | ATP |
      | Pavankalyan | Reddy | pavan@gmail.com  | 8080808080 | KDP |
      | Mahesh      | Reddy | mahesh@gmail.com | 7070707070 | NLR |
    Then User Registration should be sucessful

  Scenario: User Registration with different data with columns
    Given User is on Registration Page
    When User enters following user details with columns
      | FirstName   | LastName | EmailID          | PhoneNumber | City |
      | Trilochan   | Reddy    | Tri@gmail.com    |  9090909090 | ATP  |
      | Pavankalyan | Reddy    | pavan@gmail.com  |  8080808080 | KDP  |
      | Mahesh      | Reddy    | mahesh@gmail.com |  7070707070 | NLR  |
    Then User Registration should be sucessful
