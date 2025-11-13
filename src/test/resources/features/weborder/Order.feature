@regression
Feature: Testing Food-Order Functionality

  Scenario:Happy Path Order For My House
    When User provides email 'guest1@microworks.com', 'Guest1!' and Click Login Button
    And User validates title 'ORDER DETAILS - Weborder'
    And User clicks Group Order Box and Next Button
    And User sends the word 'I love Cucumber' for note to the Invitees Section
    And User sends e-mail address which are 'ahmet@gmail.com' and 'mehmet@gmail.com' to the invite list
    And User chooses delivery address 'My House' and validates the address '3137 Laguna'
    And User clicks the create group order button
    Then User validates the header of the page 'View Group Order'
    And User validates the word 'Your group order is now pending' from description


