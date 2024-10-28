#EMS Login  --->  company Registration
Feature: User check the functionality of Company Registration with privated limited radio button in EMS Admin Login Page

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
    And User click on register option in employeer module

  # EMS Login ---> Valid company registration data with private limited radio button
  Scenario Outline: User check the functionality of Company Registration with valid data in EMS Admin login Page
    And User select the pvt radio button in registration page
    When User enters valid company registration data fields "<company_name>", "<shortname>", "<company_email_id>", "<Password>", "<mobile_number>", "<Alternate_number>", "<company_Address>", "<cin_number>", "<company_GST_number>", "<Pan_number>", "<name>", "<personal_email_id>", "<personal_mobile_number>", and "<Address>"
    Then User click on submit button in company registration page
    Then User check the tostify message is displayed or not

    Examples: 
      | company_name | shortname | company_email_id  | Password  | mobile_number | Alternate_number | company_Address          | cin_number            | company_GST_number | Pan_number | name        | personal_email_id       | personal_mobile_number | Address                     |
      | Sattava      | sattava   | sattava@gmail.com | Path@2024 |    9843574568 |       7896541235 | Nasuja Building, Raidurg | L12345LK4132LKJ654312 | 22TYGHF2134T5Z4    | ASDSG1234F | Swami Reddy | swamireddyk11@gmail.com |             8978685745 | Hyderabad, Mindspace, 4-117 |

  # EMS Login ---> Invalid company registration data
  Scenario Outline: User check the functionality of Company Registration with invalid data in EMS Admin login Page
    And User select the pvt radio button in registration page
    When User enters invalid company registration data in fields "<company_name>", "<shortname>", "<company_email_id>", "<Password>", "<mobile_number>", "<Alternate_number>", "<company_Address>", "<cin_no>", "<company_GST_number>", "<Pan_no>", "<name>", "<personal_email_id>", "<personal_mobile_number>", and "<Address>"
    Then User click on submit button in company registration page

    Examples: 
      | company_name | shortname | company_email_id | Password  | mobile_number | Alternate_number | company_Address | cin_no                | company_GST_number | Pan_no     | name      | personal_email_id | personal_mobile_number | Address      |
      |        12345 |      1234 | 1234@gmail.com   | path@2024 | ASdfghjklm    | asxwdecvfr       |    122334567534 | l12345lk1234lkj654321 | 22pkjds4235f4z6    | asdfg1234f | 123456786 | 123456@gmail.com  | asdfghjhgfdsdf         | 123456765435 |

  #EMS Login ---> Special charaters, spaces, are entered in company registration data fields
  Scenario Outline: User check the functionality of Company Registration with special characters, spaces in EMS Admin login Page
    And User select the pvt radio button in registration page
    When User enters special characters, spaces in company registration data fields "<company_name>", "<shortname>", "<company_email_id>", "<Password>", "<mobile_number>", "<Alternate_number>", "<company_Address>", "<cin_no>", "<company_GST_number>", "<Pan_no>", "<name>", "<personal_email_id>", "<personal_mobile_number>", and "<Address>"
    Then User click on submit button in company registration page

    Examples: 
      | company_name | shortname   | company_email_id | Password | mobile_number | Alternate_number | company_Address | cin_no  | company_GST_number | Pan_no | name   | personal_email_id | personal_mobile_number | Address |
      | !@$   !@$    | !@$%   &^%$ | !@$%^  %^        | !@$ $%^& | !%^&  !@$     | ^&%$  @!         | !@$%  %$@!      | ^%  $!@ | !@  %^             | !@  %^ | !@  %^ | !@  %^            | !@  %^                 | !@  %^  |

  # EMS Login ---> Valid company registration data with firm radio button
  Scenario Outline: User check the functionality of Company Registration with valid data with firm radio button in EMS Admin login Page
    And User select the firm radio button in registration page
    When User enters valid firm company registration data fields "<company_name>", "<shortname>", "<company_email_id>", "<Password>", "<mobile_number>", "<Alternate_number>", "<company_Address>", "<Company_Register_Number>", "<company_GST_number>", "<Pan_number>", "<name>", "<personal_email_id>", "<personal_mobile_number>", and "<Address>"
    Then User click on submit button in company registration page
    Then User check the tostify message is displayed or not

    Examples: 
      | company_name | shortname | company_email_id | Password  | mobile_number | Alternate_number | company_Address          | Company_Register_Number | company_GST_number | Pan_number | name        | personal_email_id       | personal_mobile_number | Address                     |
      | Tcs          | tcs       | tcs@gmail.com    | Path@2024 |    9843574567 |       7896541237 | Nasuja Building, Raidurg | L12345LK4132LKJ654316   | 22TYGHF2134T5Z6    | ASDSG1234K | Swami Reddy | swamireddyk21@gmail.com |             8978685545 | Hyderabad, Mindspace, 4-117 |
      
      Scenario: User check the password hidden button is working or not
      Then User enter password in "path@2024" field
      And User click on hidden eye icon
