package com.ems.qa.pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EMS_Admin_CompanyUpdate_Pom {
WebDriver driver;
WebDriverWait wait;

public EMS_Admin_CompanyUpdate_Pom(WebDriver driver) {
	this.driver = driver;
	this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//a[text() = 'Summary']") WebElement Summary_Option;
@FindBy(id = "pagination-next-page")WebElement Navigation_Icon;
@FindBy(xpath = "//div[text() = 'Sattava']/parent::div/parent::div/following-sibling::div[4]/child::div/child::button[@title = 'Edit']")WebElement Edit_icon;
@FindBy(name = "mobileNo")WebElement MobileNo;
@FindBy(name = "alternateNo")WebElement AlternateNo;
@FindBy(name = "companyAddress")WebElement CompanyAddress;
@FindBy(name = "name") WebElement Name;
@FindBy(name = "personalMailId") WebElement PersonalEmailId;
@FindBy(name = "personalMobileNo")WebElement PersonalMobileNumber;
@FindBy(name = "address")WebElement Address;
@FindBy(xpath = "//button[text() = 'Update Company']")WebElement Update_btn;


public void summaryoption() throws InterruptedException  {
	  Summary_Option.click();
	  Thread.sleep(3000);
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("window.scrollTo(0,1000)");
	  Thread.sleep(3000);
	  Navigation_Icon.click();
}

public void editicon(){
	  Edit_icon.click();
	  driver.navigate().refresh();
}

public void mobileno(String mobileno) throws InterruptedException {
	Thread.sleep(1000);
	MobileNo.clear();
	MobileNo.sendKeys(mobileno);
}

public void alternatenumber(String alternatenumber) {
	AlternateNo.clear();
	AlternateNo.sendKeys(alternatenumber);
}

public void companyaddress(String companyaddress) throws InterruptedException {
	CompanyAddress.clear();
	CompanyAddress.sendKeys(companyaddress);
}

public void name(String name) throws InterruptedException {
	Name.clear();
	Name.sendKeys(name);
}

public void personalemailid(String personalemailid) throws InterruptedException {
	PersonalEmailId.clear();
	PersonalEmailId.sendKeys(personalemailid);
}

public void personalmobilenumber(String personalmobileno) throws InterruptedException {
	PersonalMobileNumber.clear();
	PersonalMobileNumber.sendKeys(personalmobileno);
}

public void address(String address) throws InterruptedException {
	Address.clear();
	Address.sendKeys(address);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollTo(0,1500)");
}
public void updatebutton() throws InterruptedException {
Thread.sleep(2000);	
Update_btn.click();
}

public void validupdate(String data_01, String data_02, String data_03, String data_04, String data_05, String data_06, String data_07) throws InterruptedException {
	mobileno(data_01);
	alternatenumber(data_02);
	companyaddress(data_03);
	name(data_04);
	personalemailid(data_05);
	personalmobilenumber(data_06);
	address(data_07);
}

public void invalidupdate(String data_011, String data_012, String data_013, String data_014, String data_015, String data_016, String data_017) throws InterruptedException {
	mobileno(data_011);
	alternatenumber(data_012);
	companyaddress(data_013);
	name(data_014);
	personalemailid(data_015);
	personalmobilenumber(data_016);
	address(data_017);
}

public void specialcharactersandspaces(String data_021, String data_022, String data_023, String data_024, String data_025, String data_026, String data_027) throws InterruptedException {
	mobileno(data_021);
	alternatenumber(data_022);
	companyaddress(data_023);
	name(data_024);
	personalemailid(data_025);
	personalmobilenumber(data_026);
	address(data_027);
}


}
