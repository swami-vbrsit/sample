Feature: Functionality to check the forgot password link is working or not in EMS Application

  Background: 
    Given User enter the url in the browser
    And User click on Company login page
    When User enter the company "sattava"
    And User click on submit button

  Scenario Outline: Functionality to check the forgot password link
    Given User click on forgot password link in EMS login page
    When User enter <Email Id> in email id field
    Then User click on otp button
    Then User check the tostify message is displayed or not
    When User enter <Otp> in otp field
    Then User click on submit button
    Then User check the tostify message is displayed or not
    When User enter <New Password> in new password field
    When User enter <Confirm Password> in confirm password field
    Then User click on update password button
    Then User check the tostify message is displayed or not

    Examples: 
      | Email Id          | Otp    | New Password | Confirm Password |
      | sattava@gmail.com | 123456 | Path@2023    | Path@2023        |
  
  Scenario Outline: Functionality to check the email id with invalid data in forgot password page
    Given User click on forgot password link in EMS login page
    When User enter <Email Id> in email id field
    Then User click on otp button

    Examples: 
      | Email Id          |
      | satava@gmail.com  |
      | 1234567@gmail.com |
      | !@$%^@gmail.com   |
      | sattava           |
      |                   |

  Scenario Outline: Functionality to check the otp with invalid data in forgot password page
    Given User click on forgot password link in EMS login page
    When User enter <Email Id> in email id field
    Then User click on otp button
    When User enter <Otp> in otp field
    Then User click on submit button

    Examples: 
      | Email Id          | Otp      |
      | sattava@gmail.com |   098765 |
      | sattava@gmail.com | !@$%%&   |
      | sattava@gmail.com | asvdjdcv |
      | sattava@gmail.com |          |

  Scenario Outline: Functionality to check the new password fields with invalid data in forgot password page
    Given User click on forgot password link in EMS login page
    When User enter <Email Id> in email id field
    Then User click on otp button
    When User enter <Otp> in otp field
    Then User click on submit button
    Then User check the tostify message is displayed or not
    When User enter <New Password> in new password field
    When User enter <Confirm Password> in confirm password field
    Then User click on update password button
    Then User check the tostify message is displayed or not

    Examples: 
      | Email Id          | Otp    | New Password | Confirm Password |
      | sattava@gmail.com | 123456 | sattava      | sattava          |
      | sattava@gmail.com | 123456 | Path@2024    | Path@2023        |
      | sattava@gmail.com | 123456 | Path@2024    |                  |
      | sattava@gmail.com | 123456 |              |                  |
      | sattava@gmail.com | 123456 | !@%^&&       | Path@2024        |
      | sattava@gmail.com | 123456 | Path@2024    | !@$%^&&          |