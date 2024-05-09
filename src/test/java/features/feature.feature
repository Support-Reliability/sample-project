Feature: Tira Beauty E-commerce Application API Testing
@Regression @Smoke @Regression @healthcheck @Regression 

  Scenario: User Login to Tira Beauty Application
    Given a registered user with username "<username>" and password "<password>"
    When the user sends a login request
    Then the login is successful and a valid session is created

  Scenario: User attempts to login with invalid credentials
    Given an unregistered or incorrect user credentials with username "<username>" and password "<password>"
    When the user sends a login request
    Then the login attempt is unsuccessful and the error message "<error_message>" is returned

  Scenario: User adds product to shopping cart
    Given user "<username>" is logged in
    When the user adds product with ID "<product_id>" to the cart
    Then the product is added successfully showing a confirmation message "<message>"

  Scenario: User cancels an order
    Given user "<username>" is logged in and has an order with ID "<order_id>"
    When the user cancels the order
    Then the cancellation is confirmed with a message "<cancel_message>"
