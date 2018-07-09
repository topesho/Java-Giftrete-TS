Feature: Login
  In order to use the website I need to Login

  Background:
    Given I navigate to "https://dev.giftrt.com/"
    When I click on login button


  Scenario: Login
    And I enter my email
    And I enter my password
    And I click the signin button
    Then I should be logged in


  Scenario: Login with parameters
    And I enter my email "topy_sho@yahoo.com"
    And I enter my password"tope81"
    And I click the signin button
    Then I should be logged in


  Scenario: Invalid Login
    And I enter my invalid email
    And I enter my password
    And I click the signin button
    Then I should not be logged in


  Scenario Outline: Logging with Invalid details
    When I enter my email
    And I enter my password
    And I click the signin button
    Then I should not be logged in
    And I log out

    Examples:
      | email              | password | warning |
      | topy_sho@yahoo.com |          | Please fill in this field.|
      | topy_shoyahoo.com  | tope81   | The Email field must contain a valid email address.|
