Feature: Testing The Order Creation Functionality

  Scenario: Happy Path Order Creation MyMoney-Visa
    Given User provides username 'Tester' and password 'test' and Login Button
    When User Clicks Order Button
    And User provides 'MyMoney' and '4'  for the Product Information
    And User provides 'Aaron', '11 Devon Ave', 'IL', '60100' for the Address Information
    And User provides 'Visa', '1234567890123456', '11/30' for the Payment Information
    Then User clicks process button and validates 'New order has been successfully added.'
    And User clicks view all orders button and validates 'Aaron', 'MyMoney' from the list.


  Scenario: Happy Path Order Creation MyMoney-Visa DataTable
    Given User provides username and password and Login Button
      | username | Tester |
      | password | test   |
    When User Clicks Order Button
    And User provides product and quantity for the Product Information
      | product  | MyMoney |
      | quantity | 4       |
    And User provides customerName, street, state, zipCode for the Address Information
      | customerName | Aaron        |
      | street       | 11 Devon Ave |
      | state        | IL           |
      | zipCode      | 60100        |
    And User provides card, cardNumber, expireDate for the Payment Information
      | card       | Visa             |
      | cardNumber | 1234567890123456 |
      | expireDate | 11/30            |
    Then User clicks process button and validates message
      | New order has been successfully added. |
    And User clicks view all orders button and validates customerName, product from the list.
      | customerName | Aaron   |
      | product      | MyMoney |


  Scenario Outline: Happy Path Order Creation For All Products + Card Types
    Given User provides username '<username>' and password '<password>' and Login Button
    When User Clicks Order Button
    And User provides '<product>' and '<quantity>'  for the Product Information
    And User provides '<customerName>', '<street>', '<state>', '<zipCode>' for the Address Information
    And User provides '<card>', '<cardNumber>', '<expireDate>' for the Payment Information
    Then User clicks process button and validates '<message>'
    And User clicks view all orders button and validates '<customerName>', '<product>' from the list.

    Examples:
      | username | password | product     | quantity | customerName | street       | state | zipCode | card             | cardNumber       | expireDate | message                                |
      | Tester   | test     | MyMoney     | 4        | Aaron        | 11 Devon Ave | IL    | 60100   | Visa             | 1234567890123456 | 11/30      | New order has been successfully added. |
      | Tester   | test     | FamilyAlbum | 4        | Aaron        | 11 Devon Ave | IL    | 60100   | MasterCard       | 1234567890123456 | 11/30      | New order has been successfully added. |
      | Tester   | test     | ScreenSaver | 4        | Aaron        | 11 Devon Ave | IL    | 60100   | American Express | 1234567890123456 | 11/30      | New order has been successfully added. |


    #SUGGESTIONS:
  #First Create your hook class and add your @Before and @After
  # Read url from configuration.properties
  #Start creating your Page Object model
  #Login Page  MainPage OrderPage ViewOrderPage
  #Put the snips in step definition class
  # Start implementing your page classes
  #Login Page
       #-->username -->Tester   password -->test  LoginButton
    #MainPage
       #orderButton   viewAllOrdersButton
    #OrderPage
       #All the red dots boxes
       #Validation message
    #ViewOrderPage
       #Validate the name and productName from the list(only yours)