package org.cubeVentures.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.cubeVentures.pageObjects.EntrepreneursPage;
import org.cubeVentures.pageObjects.HomePage;
import org.cubeVentures.reporting.Reporter;
import org.testng.Assert;

import static org.cubeVentures.steps.Hooks.getDriver;


/**
 * Represents the tests cases used in the Cube Ventures home page.
 *
 * @author juancamilo.gonzalez
 * @version 1.0
 */
public class CubeSteps {

    private HomePage home;
    private EntrepreneursPage entrepreneursPage;


    @Given("the user navigates the Cube Ventures home page")
    public void theUserNavigatesTheCubeVenturesHomePage() {
        this.home = new HomePage(getDriver());
    }

    @When("the user checks the options on the upper section of the page")
    public void theUserChecksTheOptionsOnTheUpperSectionOfThePage() {
        Assert.assertTrue(home.isEntrepreneursIconDisplayed(),
                "The entrepreneurs icon is not present.");
        Reporter.info("The Entrepreneurs icon is present.");
        home.accessEntrepreneursOption();
        home.entrepreneursPage();
    }

    @And("the user navigates to the entrepreneurs page")
    public void theUserNavigatesToTheEntrepreneursPage() {
        Reporter.info("Navigating to the entrepreneurs Page.");
        this.entrepreneursPage = home.entrepreneursPage();
    }

    @And("the user writes down the user information for the newsletter")
    public void theUserWritesDownTheUserInformationForTheNewsletter() {
        Reporter.info("Scrolling down to the button of the entrepreneurs page.");
        entrepreneursPage.scrollDown();
        Assert.assertTrue(entrepreneursPage.isNameFieldDisplayed(),
                "The name field is not present.");
        Reporter.info("The name field is present.");

        Assert.assertTrue(entrepreneursPage.isEmailFieldDisplayed(),
                "The email field is not present.");
        Reporter.info("The email field is present.");
    }

    @Then("the subscribe button should be visible")
    public void theSubscribeButtonShouldBeVisible() {
        Assert.assertTrue(entrepreneursPage.isSubscribeButtonDisplayed(),
                "The subscribe button is not present.");
        Reporter.info("The subscribe button is present.");
    }
}
