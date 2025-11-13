package com.qa.smartbear.definitions;

import com.qa.smartbear.pages.SmartBearLoginPage;
import com.qa.smartbear.pages.SmartBearOrderPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

import java.util.List;
import java.util.Map;

public class SmartBearDef {

    WebDriver driver = DriverHelper.getDriver();
    SmartBearLoginPage smartBearLoginPage = new SmartBearLoginPage(driver);
    SmartBearOrderPage smartBearOrderPage = new SmartBearOrderPage(driver);

    @Given("User provides username {string} and password {string} and Login Button")
    public void user_provides_username_and_password_and_login_button(String username, String password) throws InterruptedException {
        smartBearLoginPage.loginFunctionality(username, password);
    }

    @When("User Clicks Order Button")
    public void user_clicks_order_button() {
        smartBearLoginPage.clickOrderButton();
    }

    @When("User provides {string} and {string}  for the Product Information")
    public void user_provides_and_for_the_product_information(String productName, String quantity) {
        smartBearOrderPage.productInformation(productName, quantity);
    }

    @When("User provides {string}, {string}, {string}, {string} for the Address Information")
    public void user_provides_for_the_address_information(String customerName, String street, String city, String zip) {
        smartBearOrderPage.addressInformation(customerName, street, city, zip);
    }

    @And("User provides {string}, {string}, {string} for the Payment Information")
    public void userProvidesCardCardNumberExpireDateForThePaymentInformation(String card, String cardNumber, String expireDate) {
        smartBearOrderPage.paymentInformation(card, cardNumber, expireDate);
    }

    @Then("User clicks process button and validates {string}")
    public void user_clicks_process_button_and_validates(String expectedMessage) {
        smartBearOrderPage.textValidation(expectedMessage);
    }

    @Then("User clicks view all orders button and validates {string}, {string} from the list.")
    public void user_clicks_view_all_orders_button_and_validates_from_the_list(String expectedName, String expectedProduct) {
        smartBearOrderPage.clickViewAllOrdersButton();
        smartBearOrderPage.viewOrderValidation(expectedName, expectedProduct);
    }



    @Given("User provides username and password and Login Button")
    public void user_provides_username_and_password_and_login_button(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
        Map<String, String> loginInformation = dataTable.asMap();
        smartBearLoginPage.loginFunctionality(loginInformation.get("username"), loginInformation.get("password"));
        smartBearLoginPage.clickOrderButton();
    }
    @When("User provides product and quantity for the Product Information")
    public void user_provides_product_and_quantity_for_the_product_information(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> productInformation = dataTable.asMap();
       smartBearOrderPage.productInformation(productInformation.get("product"), productInformation.get("quantity"));
    }
    @When("User provides customerName, street, state, zipCode for the Address Information")
    public void user_provides_customer_name_street_state_zip_code_for_the_address_information(io.cucumber.datatable.DataTable dataTable) {
      Map<String, String> addressInformation = dataTable.asMap();
      smartBearOrderPage.addressInformation(addressInformation.get("customerName"), addressInformation.get("street"), addressInformation.get("state"), addressInformation.get("zipCode"));
    }
    @When("User provides card, cardNumber, expireDate for the Payment Information")
    public void user_provides_card_card_number_expire_date_for_the_payment_information(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> paymentInformation = dataTable.asMap();
        smartBearOrderPage.paymentInformation(paymentInformation.get("card"), paymentInformation.get("cardNumber"), paymentInformation.get("expireDate"));
    }
    @Then("User clicks process button and validates message")
    public void user_clicks_process_button_and_validates_message(io.cucumber.datatable.DataTable dataTable) {
        List<String> message = dataTable.asList();
        smartBearOrderPage.textValidation(message.get(0));
    }
    @Then("User clicks view all orders button and validates customerName, product from the list.")
    public void user_clicks_view_all_orders_button_and_validates_customer_name_product_from_the_list(io.cucumber.datatable.DataTable dataTable) {
        smartBearOrderPage.clickViewAllOrdersButton();
        Map<String, String> validation = dataTable.asMap();
        smartBearOrderPage.viewOrderValidation(validation.get("customerName"), validation.get("product"));
    }
}

