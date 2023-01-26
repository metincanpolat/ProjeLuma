package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _02_AddToCartSteps {
    DialogContent dc=new DialogContent();
    @When("Enter username and password and click Login Button")
    public void enterUsernameAndPasswordAndClickLoginButton() {

        dc.findAndSend("username","abc@technostudy.com");
        dc.findAndSend("password","abc123ABC123");
        dc.findAndClick("loginButton");


    }

    @And("Add to cart a product")
    public void addToCartAProduct() {
        dc.findAndMoveToElement("bagLink");
        dc.findAndClick("bagAddToCart");

    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.findAndContainsText("successMessage","added");
    }

    @And("Go to the shopping cart")
    public void goToTheShoppingCart() {
        dc.findAndClick("shoppingCart");
        dc.findAndClick("checkout");
    }

    @Then("Check the shopping cart")
    public void checkTheShoppingCart() {
        dc.findAndContainsList("shoppingCartList");
    }

    @And("Proceed the checkout")
    public void proceedTheCheckout() throws InterruptedException {

        dc.findAndClick("zeroShipping");
        dc.findAndClick("nextButton");
//        dc.findAndClick("orderSummeryTab");
//        dc.findAndClick("orderSummeryTab");
        dc.findAndClick("placeOrder");

    }

    @Then("Complete the shopping")
    public void completeTheShopping() {
        dc.findAndContainsText("thankYouMessage","Thank");
    }
}
