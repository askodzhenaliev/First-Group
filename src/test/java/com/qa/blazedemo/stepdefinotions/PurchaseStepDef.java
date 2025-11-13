package com.qa.blazedemo.stepdefinotions;

import com.qa.blazedemo.pages.BlazePurchasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;


public class PurchaseStepDef {

    WebDriver driver = DriverHelper.getDriver();
    BlazePurchasePage blazePurchasePage = new BlazePurchasePage(driver);

    @Given("User navigates to the {string}")
    public void user_navigates_to_the(String url) {
        driver.get(url);
    }

    @When("User chooses {string} for departure")
    public void user_chooses_for_departure(String departure) {
        blazePurchasePage.choosingDepartureFlight(departure);
    }

    @When("User choose {string} for destination and click Finding Flight Button")
    public void user_choose_for_destination_and_click_finding_flight_button(String destination) {
        blazePurchasePage.choosingDestinationAndClickingFindingFlight(destination);
    }

    @Then("User validates the header {string}")
    public void user_validates_the_header(String expectedHeader) {
        blazePurchasePage.validateHeader(expectedHeader);
    }

    @When("User chooses first flight")
    public void user_chooses_first_flight() {
        blazePurchasePage.clickFirstFlightButton();
    }

    @When("User provides contact information {string},{string},{string},{string},{string}")
    public void user_provides_contact_information(String name, String address, String city, String state, String zipCode) {
        blazePurchasePage.contactInformation(name, address, city, state, zipCode);
    }

    @When("User provides payment information {string},{string},{string},{string},{string}")
    public void user_provides_payment_information(String cardType, String creditCardNumber, String month, String year, String nameOnCard) {
        blazePurchasePage.paymentInformation(cardType, creditCardNumber, month, year, nameOnCard);
    }

    @When("User selects the Remember Me button and click Purchase Flight Button")
    public void user_selects_the_remember_me_button_and_click_purchase_flight_button() {
        blazePurchasePage.rememberMeButtonAndClickPurchase();
    }

    @Then("User validates the message {string}")
    public void user_validates_the_message(String expectedMessage) {
        blazePurchasePage.messageValidation(expectedMessage);
    }

}


