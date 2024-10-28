package com.ems.qa.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.ems.driverfactory.DriverFactory;
import com.ems.qa.pages.EMS_Admin_CompanyRegistration_Pom;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EMS_Admin_CompanyRegistration_Steps {
	WebDriver driver;
	EMS_Admin_CompanyRegistration_Pom page = new EMS_Admin_CompanyRegistration_Pom(DriverFactory.getdriver()); 
	@Then("User check the company logo is displayed or not")
	public void User_check_the_company_logo_is_displayed_or_not() {
		page.company_logo();

	}

	@Then("User click on Employeer module in side nav-bar")
	public void user_click_on_employeer_module_in_side_nav_bar() {
		page.employermodule();
	}

	@Then("User check the url of the EMS Application")
	public void User_check_the_url_of_the_EMS_Application() {
		String expectedUrl = "https://122.175.43.71:2801/main";
		if (expectedUrl.equals(DriverFactory.getdriver().getCurrentUrl())) {
			System.out.println(DriverFactory.getdriver().getCurrentUrl());
		} else {
			System.out.println("Url does not match");
		}
	}

	@Then("User click on register option in employeer module")
	public void user_click_on_register_option_in_employeer_module() {
		page.registrationmodule();
	}

	@And("User select the pvt radio button in registration page")
	public void User_select_the_pvt_radio_button_in_registration_page() {
		page.radiobtn_1();
	}
	
	@And("User select the firm radio button in registration page")
	public void User_select_the_firm_radio_button_in_registration_page() {
		page.radiobtn_2();
	}

	@When("User enters valid company registration data fields {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, and {string}")
	public void user_enter_valid_data_in_company_registration_fields(String companyname_0, String shortname_0, String emailid_0, String password_0, String mobilenumber_0, String Alternatenumber_0, String companyaddress_0, String cinnumber_0, String gstnumber_0, String pannumber_0, String name_0, String personalmailid_0, String personalmobilenumber_0, String address_0) throws InterruptedException {
		page.validdata(companyname_0, shortname_0, emailid_0, password_0, mobilenumber_0, Alternatenumber_0, companyaddress_0, cinnumber_0, gstnumber_0, pannumber_0, name_0, personalmailid_0, personalmobilenumber_0, address_0);
	}

	@Then("User click on submit button in company registration page")
	public void User_click_on_submit_button_in_company_registration_page() throws InterruptedException {
		page.submitbtn();
	}

	@When("User enters invalid company registration data in fields {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, and {string}")
	public void user_enter_invalid_data_in_company_registration_fields(String companyname_1, String shortname_1, String emailid_1, String password_1, String mobilenumber_1, String Alternatenumber_1, String companyaddress_1, String cinnumber_1, String gstnumber_1, String pannumber_1, String name_1, String personalmailid_1, String personalmobilenumber_1, String address_1) throws InterruptedException {
		page.invaliddata(companyname_1, shortname_1, emailid_1, password_1, mobilenumber_1, Alternatenumber_1, companyaddress_1, cinnumber_1, gstnumber_1, pannumber_1, name_1, personalmailid_1, personalmobilenumber_1, address_1);
	}

	@When("User enters special characters, spaces in company registration data fields {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, and {string}")
	public void user_enter_special_characters_spaces_in_company_registration_fields(String companyname_2, String shortname_2, String emailid_2, String password_2, String mobilenumber_2, String Alternatenumber_2, String companyaddress_2, String cinnumber_2, String gstnumber_2, String pannumber_2, String name_2, String personalmailid_2, String personalmobilenumber_2, String address_2) throws InterruptedException {
		page.specialcharacters_spaces(companyname_2, shortname_2, emailid_2, password_2, mobilenumber_2, Alternatenumber_2, companyaddress_2, cinnumber_2, gstnumber_2, pannumber_2, name_2, personalmailid_2, personalmobilenumber_2, address_2);

	}
	
	@When ("User enters valid firm company registration data fields {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, and {string}")
	public void firm_valid_data(String companyname_4, String shortname_4, String emailid_4, String password_4, String mobilenumber_4, String Alternatenumber_4, String companyaddress_4, String company_register_no_04, String gstnumber_4, String pannumber_4, String name_4, String personalmailid_4, String personalmobilenumber_4, String address_4 ) {
		page.firmvaliddata(companyname_4, shortname_4, emailid_4, password_4, mobilenumber_4, Alternatenumber_4, companyaddress_4, company_register_no_04, gstnumber_4, pannumber_4, name_4, personalmailid_4, personalmobilenumber_4, address_4);
	  }
	  
	  @Then("User enter password in {string} field")
	  public void password(String pswd) {
		  page.psword(pswd);
	  }
	  @And ("User click on hidden eye icon")
	  public void User_click_on_hidden_eye_icon() {
		  page.hiddenicon();
	  }
}
