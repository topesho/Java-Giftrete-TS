Feature: In order to use the website I need to register

  Background:
    Given I navigate to "https://dev.giftrt.com/"
    When I click on register

  @valid
  Scenario: Valid Registration
    And I enter my first name
    And I enter my last name
    And I enter my email
    And I enter my password
    And I confirm my password
    And I click sign up button
    Then I should be registered

  @invalid
  Scenario: Registration with invalid email
    And I enter my first name
    And I enter my last name
    And I enter my invalid email
    And I enter my password
    And I confirm my password
    And I click sign up button
    Then I should be registered

  @valid
  Scenario: Valid Registration with parameters
    And I enter my first name "tope"
    And I enter my last name "shodeinde"
    And I enter my email "topy_sho@yahoo.com"
    And I enter my password"tope81"
    And I confirm my password "tope81"
    And I click sign up button
    Then I should be registered
  @invalid
  Scenario Outline: Registration with invalid credentials
    And I enter my first name
    And I enter my last name
    And I enter my invalid email
    And I enter my password
    And I confirm my password
    And I click sign up button
    Then I should be registered
    And I log out

    Examples:


      | First Name | Last Name | Email               | Password | warning                           |
      |            | sho       | topy_sho@yahoo.com  | tope81   | Field Is Required.                |
      | tope       | shodeinde | topy_shoyahoo.com   | tope81   | Please Enter A Valid Email Address|


































































































































































































































































































































































