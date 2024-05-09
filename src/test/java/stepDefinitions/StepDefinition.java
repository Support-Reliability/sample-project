package stepDefinitions;

import io.cucumber.java.en.*;

public class StepDefinition {

    @Given("a registered user with username {string} and password {string}")
    public void aRegisteredUserWithUsernameAndPassword(String username, String password) {
        System.out.println("Executing step: a registered user with username {string} and password {string}");
    }

    @When("the user sends a login request")
    public void theUserSendsALoginRequest() {
        System.out.println("Executing step: the user sends a login request");
    }

    @Then("the login is successful and a valid session is created")
    public void theLoginIsSuccessfulAndAValidSessionIsCreated() {
        System.out.println("Executing step: the login is successful and a valid session is created");
    }

    @Given("an unregistered or incorrect user credentials with username {string} and password {string}")
    public void anUnregisteredOrIncorrectUserCredentialsWithUsernameAndPassword(String username, String password) {
        System.out.println("Executing step: an unregistered or incorrect user credentials with username {string} and password {string}");
    }

    @Then("the login attempt is unsuccessful and the error message {string} is returned")
    public void theLoginAttemptIsUnsuccessfulAndTheErrorMessageIsReturned(String error_message) {
        System.out.println("Executing step: the login attempt is unsuccessful and the error message {string} is returned");
    }

    @Given("user {string} is logged in")
    public void userIsLoggedIn(String username) {
        System.out.println("Executing step: user {string} is logged in");
    }

    @When("the user adds product with ID {string} to the cart")
    public void theUserAddsProductWithIdToTheCart(String product_id) {
        System.out.println("Executing step: the user adds product with ID {string} to the cart");
    }

    @Then("the product is added successfully showing a confirmation message {string}")
    public void theProductIsAddedSuccessfullyShowingAConfirmationMessage(String message) {
        System.out.println("Executing step: the product is added successfully showing a confirmation message {string}");
    }

    @Given("user {string} is logged in and has an order with ID {string}")
    public void userIsLoggedInAndHasAnOrderWithId(String username, String order_id) {
        System.out.println("Executing step: user {string} is logged in and has an order with ID {string}");
    }

    @When("the user cancels the order")
    public void theUserCancelsTheOrder() {
        System.out.println("Executing step: the user cancels the order");
    }

    @Then("the cancellation is confirmed with a message {string}")
    public void theCancellationIsConfirmedWithAMessage(String cancel_message) {
        System.out.println("Executing step: the cancellation is confirmed with a message {string}");
    }

}
