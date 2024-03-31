Feature: Cart Item Addition of two  and Subtotal Verification

  Background:
    Given Open "Edge" Browser and User is on the Amazon homepage
    
     @pk003
  Scenario Outline: Adding two items in Cart and verifying subtotal
    When User types "<item1>" in the Search field
    And User presses "Enter"
    And User selects the first item from the list
    And User adds the item to the cart
    And User types "<item2>" in the Search field
    And User presses "Enter"
    And User selects the first item from the list
    And User adds the item to the cart
    And User opens the cart
    Then Each item's total price in the cart should match the price on the product page
    And The subtotal in the cart should be the sum of the prices of the two items

    Examples:
      | item1     | item2   | 
      | Headphones| Keyboard|
    