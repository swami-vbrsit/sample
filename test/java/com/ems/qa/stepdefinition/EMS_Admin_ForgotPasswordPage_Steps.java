package com.ems.qa.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.ems.driverfactory.DriverFactory;
import com.ems.qa.pages.EMS_Employee_ForgotPassword_Pom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EMS_Admin_ForgotPasswordPage_Steps {
WebDriver driver;
EMS_Employee_ForgotPassword_Pom page = new EMS_Employee_ForgotPassword_Pom(DriverFactory.getdriver());

@Given ("User click on forgot password link in EMS login page")
public void User_click_on_forgot_password_link_in_EMS_login_page() {
	page.forgotlink();
}
@When("^User enter (.*) in email id field")
public void user_enter_email_id_in_email_id_field(String email) {
    page.emailfield(email);
}

@Then("User click on otp button")
public void user_click_on_otp_button() throws InterruptedException {
    page.otpbutton();
    
}

@When("^User enter (.*) in otp field")
public void user_enter_otp_in_otp_field(String otp) {
    page.enterotp(otp);
}

@When("^User enter (.*) in new password field")
public void user_enter_new_password_in_new_password_field(String enterpswd) {
    page.enterpassword(enterpswd);
}

@When("^User enter (.*) in confirm password field")
public void user_enter_confirm_password_in_confirm_password_field(String confirmpswd) {
   page.confirmpswd(confirmpswd);
}

@Then("User click on update password button")
public void user_click_on_update_password_button() {
    page.updatebtn();
}

}
