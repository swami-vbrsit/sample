Feature: User check the  functionality of Delete Company in EMS Admin Registration Page

  Background: 
    Given User enter the url in the browser
    When User click the EMS Admin login button
    Then User check the image is displayed or not in EMS login page
    When User enter username "admin@pathbreaker.com"
    When User enter password "Passw0rd!"
    Then User click on signin button
    Then User check the tostify message is displayed or not
    Then User check the company logo is displayed or not
    And User click on Employeer module in side nav-bar
    Then User check the url of the EMS Application
    And User click on summary option in side-nav bar

  Scenario Outline: User can check the functionality to delete company in EMS Application
    When User click on delete icon in employee summary module
    And User see the popup box and click on delete option

    Scenario Outline: User check the functionality of search field with valid data in summary option in EMS Application
    When User enter <valid data> in search field

    Examples: 
      | valid data |
      | sattava    |
      |       1234 |
      | ! @ $ %    |