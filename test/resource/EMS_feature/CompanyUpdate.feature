Feature: User check the functionality of Update Company Registration in  EMS Admin Login Page

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
    And User click on edit icon in employee summary module

  Scenario Outline: User check the functionality of company update with valid data in Ems Application Admin login page
    When User enters valid data in update company page "<Mobilenumber>", "<Alternatenumber>", "<CompanyAddress>", "<Name>", "<Personalemailid>", "<Personalmobileno>" and "<Address>"
    And User click on update button
    Then User check the tostify message is displayed or not
    Examples: 
      | Mobilenumber | Alternatenumber | CompanyAddress     | Name        | Personalemailid      | Personalmobileno | Address              |
      |   9087654567 |      9078654325 | Hyderabad, Raidurg | Swami Reddy | swamireddy@gmail.com |       9887767554 | Hyderabad, Khajaguda |

  Scenario Outline: User check the functionality of company update with invalid data in Ems Application Admin login page
    When User enters invalid data in update company page "<Mobilenumber>", "<Alternatenumber>", "<CompanyAddress>", "<Name>", "<Personalemailid>", "<Personalmobileno>" and "<Address>"
    And User click on update button

    Examples: 
      | Mobilenumber | Alternatenumber | CompanyAddress | Name      | Personalemailid | Personalmobileno | Address     |
      | asdfgh       | asdfghj         |     1234567543 | 123456543 | 12345@gmail.com | qwertyuytred     | 12345643245 |

  Scenario Outline: User check the functionality of company update with special charactes, spaces in Ems Application Admin login page
    When User enters special characters, spaces in update company page "<Mobilenumber>", "<Alternatenumber>", "<CompanyAddress>", "<Name>", "<Personalemailid>", "<Personalmobileno>" and "<Address>"
    And User click on update button

    Examples: 
      | Mobilenumber | Alternatenumber | CompanyAddress | Name      | Personalemailid | Personalmobileno | Address   |
      | !@$%  !@$    | !@$%  !@$       | !@$%  !@$      | !@$%  !@$ | !@$%  !@$       | !@$%  !@$        | !@$%  !@$ |
      
      

