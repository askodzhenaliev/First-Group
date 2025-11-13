package com.qa.practice.stepdefinitions;

import com.qa.practice.pages.RegisterUserPage;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class RegisterUserDef {

    WebDriver driver = DriverHelper.getDriver();
    RegisterUserPage registerPage = new RegisterUserPage(driver);

    @When("User Click on Signup and Login Button and Validate {string}")
    public void user_click_on_signup_and_login_button_and_validate(String expectedNewUserText) {
        registerPage.clickAndValidateText(expectedNewUserText);
    }

    @When("User Enter name {string}, email {string} and click Signup Button")
    public void user_enter_name_email_and_click_signup_button(String name, String email) {
        registerPage.signupFunctionality(name, email);
    }

    @When("User validates {string} and click the Title")
    public void user_validates_and_click_the_title(String expectedAccountInformationText) {
        registerPage.enterAccountInformationTextValidation(expectedAccountInformationText);
    }

    @When("User fills personal information {string}, {string}, {string}, {string}, {string}, {string} and clicks the checkbox")
    public void user_fills_personal_information_and_clicks_the_checkbox(String title, String name, String password, String day, String month, String year) {
        registerPage.accountInformationFunctionality(title, name, password, day, month, year);
    }

    @When("User fills address information {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_fills_address_information(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10) {

    }

    @When("User clicks Create Account Button")
    public void user_clicks_create_account_button() {

    }

    @When("User validates {string} and clicks Continue button")
    public void user_validates_and_clicks_continue_button(String string) {

    }

    @When("User validates the text {string} and click Delete Account Button")
    public void user_validates_the_text_and_click_delete_account_button(String string) {

    }

    @When("User verify that {string} is visible and click Continue button")
    public void user_verify_that_is_visible_and_click_continue_button(String string) {

    }

}
