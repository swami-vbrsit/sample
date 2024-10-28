package com.ems.qa.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.ems.driverfactory.DriverFactory;
import com.ems.qa.pages.EMS_Admin_CompanyDelete_Pom;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EMS_Admin_CompanyDelete_Steps {
WebDriver driver;
EMS_Admin_CompanyDelete_Pom page = new EMS_Admin_CompanyDelete_Pom(DriverFactory.getdriver());
	
	 @Then("User click on delete icon in employee summary module")
	  public void user_click_on_delete_icon_in_employee_summary_module() throws InterruptedException {
		 page.deletecompany();
	  }
	  
	  @And ("User see the popup box and click on delete option")
	  public void User_see_the_popup_box_and_click_on_delete_option() throws InterruptedException {
		  page.acceptpopmsg();
	  }
	  
	  @When ("^User enter (.*) in search field")
		 public void User_enter_valid_data_in_search_field(String searchdata) {
		  page.searchinputvalid(searchdata);
	  }
	
}
