Feature: Functionality to check the employee login in EMS Application

  Scenario: check login is successful with valid credentials
    Given User enter the url in the browser
    And User click on Company login page
    When User enter the company "sattava"
    And User click on submit button
    When User Enter valid username "sattava@gmail.com" and password "Path@2024" in company login page
    Then User click on sign_in button
    And User Enter otp "123456" into otp field
    Then User click on sign_in button
    Then User check the tostify message is displayed or not

  Scenario Outline: Check the functionality of shortname in EMS employee login
    Given User enter the url in the browser
    And User click on Company login page
    When User enter the company <shortname>

    Examples: |shortname|
      | dsfghjk   |
      |   1245678 |
      | %^&*(     |
      | h  *** )( |
      |           |

  Scenario Outline: Check the functionality of employee login page with invalid credentials
    Given User enter the url in the browser
    And User click on Company login page
    When User enter the company "sattava"
    And User click on submit button
    When User enter invalid <username> and <password>
    Then User click on sign_in button

    Examples: 
      | username         | password  |
      | sattavagmail.com | Path@2024 |
      | $%^&             |  12345678 |
      |           123456 | $%^&*(    |
      |                  |           |
