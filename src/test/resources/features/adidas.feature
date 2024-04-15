Feature: adidas purchase functionality

  @wip
  Scenario: purchase "Sony vaio i5" functionality
    When  user click on Laptop button
    And   user click on Sony vaio ifive
    And   click on Add to cart
    And   accept pop up confirmation

  Scenario: purchase "Dell i7 8gb" functionality
    When user click on home button
    And  user click on Laptop button
    And   user click on Dell i7 8gb
    And   click on Add to cart
    And   accept pop up confirmation

    Scenario: cart functionality
      When user click on cart button
      And user delete "Dell i7 8gb" from cart
      And click on "Place order"
      And fill in all web form fields
      And click on "Purchase"
      Then users should see purchase amount as expected
      And  click on ok button





