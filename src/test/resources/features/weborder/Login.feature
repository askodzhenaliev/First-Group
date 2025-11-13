@regression
Feature: Testing login functionality

  @smoke
  Scenario: Happy path Login

    When User provides email 'guest1@microworks.com', 'Guest1!' and Click Login Button
    Then User validates title 'ORDER DETAILS - Weborder'


  Scenario Outline: Negative Login (Wrong email or password) Functionality
    When User provides email '<email>', '<password>' and Click Login Button
    Then  User validates the message '<message>' and background-color '<color>'
    Examples:
      | email                 | password | message        | color                  |
      | guest1@microworks.com | Guest1   | Sign in Failed | rgba(248, 215, 218, 1) |
      | st1@microworks.com    | Guest1!  | Sign in Failed | rgba(248, 215, 218, 1) |
      | gu1@microworks.com    | asdqwffd | Sign in Failed | rgba(248, 215, 218, 1) |



#  @smoke
#  Scenario: Correct password But wrong email
#    When User provides email 'st1@microworks.com', 'Guest1!' and Click Login Button
#    Then  User validates the message 'Sign in Failed' and background-color 'rgba(248, 215, 218, 1)'
#
#  Scenario: Wrong password And Wrong email
#    When User provides email '', '' and Click Login Button
#    Then  User validates the message 'Sign in Failed' and background-color 'rgba(248, 215, 218, 1)'
