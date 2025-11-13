#This is the place that we write our test cases

  #Feature is a general description of the test
Feature: Testing The Purchase Functionality
  #Is like BeforeMethod in feature life. it runs before every Scenario:
  Background: Repeating first 3 steps (navigation,departure,destination)
#    Given User navigates to the 'https://blazedemo.com/'
    When User chooses 'Boston' for departure
    And User choose 'London' for destination and click Finding Flight Button

#Scenario: is a testcase
  Scenario: Validating finding flights functionality
      #Given is a precondition
#    Given User navigates to the 'https://blazedemo.com/'
    #When is about action
#    When User chooses 'Boston' for departure
    #And is continues action
#    And User choose 'London' for destination and click Finding Flight Button
    #Then is result of action(validation)
    Then User validates the header 'Flights from Boston to London:'

  Scenario: Validating purchase ticket functionality

#    Given User navigates to the 'https://blazedemo.com/'
#    When User chooses 'Boston' for departure
#    And User choose 'London' for destination and click Finding Flight Button
    And User chooses first flight
    And User provides contact information 'Asylbek','11 Devon Ave','Chicago','IL','60100'
    And User provides payment information 'American Express','1234567891012345','10','2028','John Doe'
    And User selects the Remember Me button and click Purchase Flight Button
    Then User validates the message 'Thank you for your purchase today!'


