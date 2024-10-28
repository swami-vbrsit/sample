package com.ems.qa.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.ems.driverfactory.DriverFactory;
import com.ems.qa.pages.EMS_Admin_CompanyUpdate_Pom;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class EMS_Admin_CompanyUpdatePage {
WebDriver driver;
EMS_Admin_CompanyUpdate_Pom page = new EMS_Admin_CompanyUpdate_Pom(DriverFactory.getdriver());

@And("User click on summary option in side-nav bar") 
public void User_click_on_summary_option_in_sidenav_bar() throws InterruptedException {
	page.summaryoption();
}

@And("User click on edit icon in employee summary module") 
public void User_click_on_edit_icon_in_employee_summary_module() throws InterruptedException {
	page.editicon(); 
}

@When("User enters valid data in update company page {string}, {string}, {string}, {string}, {string}, {string} and {string}"
) public void User_update_valid_data_in_update_company_page(String mobilenumber_1, String landnumber_1, String companyaddress_1, String name_1, String personalemailid_1, String personalmobilenum_1, String address_1) throws InterruptedException { 
	page.validupdate(mobilenumber_1, landnumber_1, companyaddress_1, name_1, personalemailid_1, personalmobilenum_1, address_1); 
}

@And("User click on update button") 
public void User_click_on_update_button()throws InterruptedException { 
	page.updatebutton(); 
	  }

@When("User enters invalid data in update company page {string}, {string}, {string}, {string}, {string}, {string} and {string}")
public void User_enters_invalid_data_in_update_company_page(String mobilenumber_2, String landnumber_2, String companyaddress_2, String name_2, String personalmailid_2, String personalmobilenumber_2, String address_2) throws InterruptedException { 
	page.invalidupdate(mobilenumber_2, landnumber_2, companyaddress_2, name_2, personalmailid_2, personalmobilenumber_2, address_2); 
	  }

@When("User enters special characters, spaces in update company page {string}, {string}, {string}, {string}, {string}, {string} and {string}")
public void User_enters_specialcharacters_spaces_data_in_update_company_page(String mobilenumber_3, String landnumber_3, String companyaddress_3, String name_3, String personalmailid_3, String personalmobilenumber_3, String address_3)throws InterruptedException {
	page.specialcharactersandspaces(mobilenumber_3, landnumber_3, companyaddress_3, name_3, personalmailid_3, personalmobilenumber_3, address_3); 
}
}
