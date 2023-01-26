package StepDefinitions;

import Pages.DialogContent;
import Pages.Parent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class _01_LoginSteps extends Parent {

    DialogContent dc=new DialogContent();


    @Given("Navigate to Luma")
    public void navigateToLuma() {

        GWD.getDriver().get("https://magento.softwaretestingboard.com/");
        GWD.getDriver().manage().window().maximize();
        dc.findAndClick("signIn");
    }


    @When("Enter username as {string} and password as {string}and click Login button")
    public void enterUsernameAsAndPasswordAsAndClickLoginButton(String username, String password) {

        dc.findAndSend("username",username);
        dc.findAndSend("password",password);
        dc.findAndClick("loginButton");

    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        dc.findAndContainsText("welcomeMessage","Welcome");
    }

    @When("User send valid Username and invalid Password and click login button")
    public void userSendValidUsernameAndInvalidPasswordAndClickLoginButton(DataTable elements) {

        List<List<String>> listElements = elements.asLists(String.class);

        for (int i = 0; i < listElements.size(); i++) {
            dc.findAndSend(listElements.get(i).get(0), listElements.get(i).get(1));
        }
        dc.findAndClick("loginButton");

    }

    @Then("User should not be able to login")
    public void userShouldNotBeAbleToLogin() {
        dc.findAndContainsText("errorMessage","incorrect");


    }

    @When("User send invalid Username and valid Password and click login button")
    public void userSendInvalidUsernameAndValidPasswordAndClickLoginButton(DataTable elements) {

        List<List<String>> listElements = elements.asLists(String.class);

        for (int i = 0; i < listElements.size(); i++) {
            dc.findAndSend(listElements.get(i).get(0), listElements.get(i).get(1));
        }
        dc.findAndClick("loginButton");

    }
}
