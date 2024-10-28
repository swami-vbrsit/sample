package com.ems.qa.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.ems.driverfactory.DriverFactory;
import com.ems.qa.pages.EMS_Admin_LoginPage_pom;

import io.cucumber.java.en.*;

public class EMS_Admin_loginPage {
    WebDriver driver;
	EMS_Admin_LoginPage_pom page = new EMS_Admin_LoginPage_pom(DriverFactory.getdriver());
	@Given("User enter the url in the browser")
	public void User_enter_the_url_in_the_browser() {
		DriverFactory.getdriver().get("https://122.175.43.71:2801/");	
	}
	@When("User click the EMS Admin login button")
	public void user_click_the_ems_admin_login_button() {
		page.ems_admin_btn();
	}

	@Then("User check the image is displayed or not in EMS login page")
	public void User_check_the_image_is_displayed_or_not_in_EMS_login_page() {
		page.ems_page_image();
	}

	@When("User enter username {string}")
	public void user_enter_username(String usrname) {
		page.username(usrname);
	}

	@When("User enter password {string}")
	public void user_enter_password(String pswd) {
		page.password(pswd);
	}

	@Then("User click on signin button")
	public void User_click_on_signin_button() {
		page.sign_in_btn();

	}

	@Then("User check the tostify message is displayed or not")
	public void tostifymessage() {
		page.tostify_msg();

	}
	@Then ("User click on hamburgor is clickable or not")
	public void User__click_on_hamburgor_is_clickable_or_not() {
		page.hamborgour();
	}
	
	@And ("User can check the EMS Admin Home page logo is displayed or not")
	public void User_can_check_the_EMS_Admin_Home_page_logo_is_displayed_or_not() {
		page.adminlogo();
	}
	
	@Then ("User click on profile icon in Ems Application home page")
	public void User_click_on_profile_icon_in_Ems_Application_home_page() {
		page.profileicon();
	}
	
	@And ("User click on logout button in EMS Application home page")
	public void User_click_on_logout_button_in_EMS_Application_home_page() {
		page.logout();
	}

	@When("^User enter invalid (.*) and (.*)$")
	public void user_enter_invalid_username_in_username_and_password_in_their_fields(String usname, String pwd) {
		page.username(usname);
		page.password(pwd);
	}




}
