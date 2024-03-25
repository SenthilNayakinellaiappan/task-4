Feature: Login Action
  Description: This feature will test a LogIn and LogOut functionality

  Scenario Outline: Login with valid and Invalid Credentials
    Given User is on Home Page
    When User navigate to Login Page
    Then User enters "<username>" and "<password>"
    And Message displayed Login Successfully

  Scenario Outline: Login with invalid credentials
    Given User is on Home Page
    When User navigate to Login Page
    Then User enters "<username>" and "<password>"
    And Provide correct credentials

Examples:
  | username       | password   | Case   |
  | 9442065166     |Senthil@22  | Valid  |
  | abc1@gmail.com | dfsd2      | Invalid|
