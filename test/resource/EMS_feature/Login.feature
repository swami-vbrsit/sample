Feature: Functionality of EMS admin

  Scenario: Functionality of EMS admin login page with valid credientials
    Given User enter the url in the browser
    When User click the EMS Admin login button
    Then User check the image is displayed or not in EMS login page
    When User enter username "admin@pathbreaker.com"
    When User enter password "Passw0rd!"
    Then User click on signin button
    Then User check the tostify message is displayed or not
    Then User click on hamburgor is clickable or not
    And User can check the EMS Admin Home page logo is displayed or not

  Scenario Outline: Functionality of EMS admin login page with invalid credientials
    Given User enter the url in the browser
    When User click the EMS Admin login button
    When User enter invalid <username> and <password>
    Then User click on signin button

    Examples: 
      | username              | password  |
      | adminpathbreaker.com  | path@2024 |
      |                       | Passw0rd! |
      | admin@pathbreaker.com |           |
      |                       |           |

    Scenario: To check the logout functioanlity in EMS Application
   Given User enter the url in the browser
    When User click the EMS Admin login button
    Then User check the image is displayed or not in EMS login page
    When User enter username "admin@pathbreaker.com"
    When User enter password "Passw0rd!"
    Then User click on signin button
    Then User check the tostify message is displayed or not
    Then User click on profile icon in Ems Application home page
    And User click on logout button in EMS Application home page
      