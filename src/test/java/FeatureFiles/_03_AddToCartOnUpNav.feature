Feature:Add To Cart Functionality On UpNav
  Background:
    Given Navigate to Luma
    When Enter username and password and click Login Button
    Then User should login successfully

  Scenario: Add to Cart a product on UpNav
    And Add to cart a product from UpNow
    Then Success message should be displayed
    And Go to the shopping cart
    Then Check the shopping cart
#    And Proceed the checkout
#    Then Complete the shopping