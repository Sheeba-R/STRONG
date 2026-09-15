
package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LoginSteps {

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("User is on the login page");
    }

    @When("User enters valid username and password")
    public void user_enters_valid_username_and_password() {
        System.out.println("Valid username and password entered");
    }

    @Then("User should be logged in successfully")
    public void user_should_be_logged_in_successfully() {
        System.out.println("Login successful");
    }

    @When("User enters invalid username and password")
    public void user_enters_invalid_username_and_password() {
        System.out.println("Invalid username and password entered");
    }

    @Then("User should see login error message")
    public void user_should_see_login_error_message() {
        System.out.println("Login error message displayed");
    }
}
