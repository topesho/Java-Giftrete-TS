Feature: Wishlist
 In order to desire a item I need to create a wishlist

  Background:
    Given I navigate to "https://dev.giftrt.com/"
    When I click on wishlist
    And I click on create wishlist

    Scenario: Wishlist for Myself
    And I click on wishlist for myself
    And I enter my name
    And I enter the occasion
    And I enter the event date
    And I select type of product I want
    And I enter a brief description of the product
    And I make click the privacy button to make it public
    And I click save
    Then Wishlist is created

  Scenario: Wishlist for a Friend
    And I click on wishlist for a friend
    And I enter the name "Tobi"
    And I enter the occasion "birthday"
    And I enter the event date "22/05/18"
    And I select type of product I want "DVD"
    And I enter a brief description of the product "Best DVD"
    And I make click the privacy button to make it public
    And I click save
    Then Wishlist is created

