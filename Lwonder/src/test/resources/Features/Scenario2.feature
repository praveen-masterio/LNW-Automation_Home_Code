Feature: Cart Item Addition and Subtotal Verification

  Background:
    Given Open "chrome" Browser and User is on the Amazon homepage
    
     @pk002
  Scenario Outline: Adding a Laptop Item in Cart and verifying subtotal
    When User searches for "Laptop"
    And User selects the second item from the list
    And User adds the item to the cart
    And User opens the cart
    Then The price in the cart should match the price on the product page
    And The subtotal in the cart should match the total price of the item added

    Examples:
      | input  | 
      | laptop |