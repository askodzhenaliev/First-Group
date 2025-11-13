Feature: Register User Functionality
  Scenario: New User Sign Up Functionality
    When User Click on Signup and Login Button and Validate 'New User Signup!'
    And User Enter name 'TestAsylbek', email 'testasylbek@gmail.com' and click Signup Button
    And User validates 'ENTER ACCOUNT INFORMATION' and click the Title
    And User fills personal information 'Mr', 'Test', 'test623', '5', 'May', '2000' and clicks the checkbox
    And User fills address information 'John', 'Doe', 'CodeWise', '11 Devon Ave', 'apt1', 'United States', 'IL', 'Chicago', '60100', '3123332222'
    And User clicks Create Account Button
    And User validates 'ACCOUNT CREATED' and clicks Continue button
    And User validates the text 'Logged in as username' and click Delete Account Button
    And User verify that 'ACCOUNT DELETED!' is visible and click Continue button

