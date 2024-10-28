package com.ems.qa.stepdefinition;

import org.openqa.selenium.WebDriver;
import com.ems.driverfactory.DriverFactory;
import com.ems.qa.pages.EMS_EmployeeLogin_Pom;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EMS_Employee_Login_Steps {
WebDriver driver;
EMS_EmployeeLogin_Pom page = new EMS_EmployeeLogin_Pom(DriverFactory.getdriver());


@When("User click on Company login page")
public void user_click_on_company_login_page() {
	page.clickcompanylgn();
}

@When("^User enter the company (.*)")
public void user_enter_the_company_shortname(String shortname) {
	page.entercompanyname(shortname);
}

@When("User click on submit button")
public void user_click_on_submit_button() { 
	page.clicksubmitbtn();
}

@When("User Enter valid username {string} and password {string} in company login page")
public void user_enter_valid_username_and_password_in_company_login_page(String username, String password) {
	page.enterusername(username);
	page.enterpassword(password);
}

@When("User click on sign_in button")
public void user_click_on_sign_in_button() {
	page.clickloginbtn();
}

@When("User Enter otp {string} into otp field")
public void user_enter_otp_into_otp_field(String otp) {
	page.enterotp(otp);
}


@When ("^User enter company (.*)")
public void User_enter_company_shortname(String shortname) {
	page.entercompanyname(shortname);
}
@And ("^User Enter invalid (.*) into otp field")
public void User_Enter_invalid_otp_into_otp_field(String otp) {
	page.enterotp(otp);
}
@Then ("User click on cross mark button")
public void User_click_on_cross_mark_button() throws InterruptedException {
	page.cancelmark();
}
}
