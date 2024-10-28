package com.ems.qa.pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EMS_Admin_CompanyRegistration_Pom {
WebDriver driver;
WebDriverWait wait;
public EMS_Admin_CompanyRegistration_Pom(WebDriver driver) {
	this.driver = driver;
	this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//img[@class = 'align-middle']") WebElement Company_logo;
@FindBy(xpath = "//span[text() = 'Employer']")WebElement Employer_module;
@FindBy(xpath = "//a[text() = 'Registration']")WebElement Registation_module;
@FindBy(xpath = "//input[@value = 'Private Limited']")WebElement Radio_btn_1;
@FindBy(xpath = "//input[@value = 'Firm']")WebElement Radio_btn_2;
@FindBy(name = "companyName")WebElement Company_name;
@FindBy(name = "shortName")WebElement short_name;
@FindBy(name = "emailId")WebElement Email_id;
@FindBy(name = "password")WebElement Password;
@FindBy(xpath = "//input[@placeholder = 'Enter Password']/following-sibling::i")WebElement hiddeneye;
@FindBy(name = "mobileNo")WebElement Mobile_no;
@FindBy(name = "alternateNo")WebElement AlternateNo;
@FindBy(name = "companyAddress")WebElement Company_address;
@FindBy(name = "companyRegNo")WebElement companyregno;
@FindBy(name = "cinNo")WebElement Cin_no;
@FindBy(name = "gstNo")WebElement Gst_no;
@FindBy(name = "panNo")WebElement Pan_no;
@FindBy(name = "name")WebElement Name;
@FindBy(name = "personalMailId")WebElement Personal_mail_id;
@FindBy(name = "personalMobileNo")WebElement Personal_mobile_no;
@FindBy(name = "address")WebElement Address;
@FindBy(xpath = "//button[@type='submit']")WebElement Submit_btn; 

public void company_logo() {
	System.out.println(Company_logo.isDisplayed()+ " Company logo is displayed.");
}
public void employermodule()  {
	Employer_module.click();
}
public void registrationmodule() {
	Registation_module.click();
}

public void radiobtn_1() {
	Radio_btn_1.click();
}
public void radiobtn_2() {
	Radio_btn_2.click();
}
public void companyname(String cmpnyname) {
	Company_name.sendKeys(cmpnyname);
}
public void shortname(String shrtname) {
	short_name.sendKeys(shrtname);
}
public void emailid(String emailid) {
	Email_id.sendKeys(emailid);
	/*
	 * JavascriptExecutor js = (JavascriptExecutor)driver;
	 * js.executeScript("window.scrollTo(0,900);");
	 */
}
public void password(String pswd) {
	Password.sendKeys(pswd);
}
public void mobilenumber(String mobilenum) {
	Mobile_no.sendKeys(mobilenum);
}
public void alternatenumber(String alternatenum) {
	AlternateNo.sendKeys(alternatenum);
}
public void companyaddress(String companyadd) {
	
	Company_address.sendKeys(companyadd);
}
public void cinno(String Cinno) {
	Cin_no.sendKeys(Cinno);
}
public void comapanyregisterno(String Company_reg_no) {
	companyregno.sendKeys(Company_reg_no);
}
public void gstnumber(String gstno) {
	Gst_no.sendKeys(gstno);
}
public void pannumber(String panno){
	Pan_no.sendKeys(panno);
	/*
	 * JavascriptExecutor js = (JavascriptExecutor)driver;
	 * js.executeScript("window.scrollTo(0,900);");
	 */
}
public void name(String personalname) {
	Name.sendKeys(personalname);
}

public void personalmailid(String personalmail) {
	Personal_mail_id.sendKeys(personalmail);
}
public void personalmobilenumber(String personalmobilenum) {
	Personal_mobile_no.sendKeys(personalmobilenum);
}
public void address(String add) {
	Address.sendKeys(add);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollTo(0,1500)");
}
public void submitbtn() throws InterruptedException {
	Thread.sleep(5000);
	Submit_btn.click(); 
}

public void psword(String pwd) {
	Password.sendKeys(pwd);
}
public void hiddenicon() {
	hiddeneye.click();
}

public void validdata(String data_01, String data_02, String data_03,
		String data_04, String data_05, String data_06, String data_07, String data_08, String data_09,
		String data_10, String data_11, String data_12, String data_13, String data_14
) {
	companyname(data_01);
	shortname(data_02);
	emailid(data_03);
	password(data_04);
	mobilenumber(data_05);
	alternatenumber(data_06);
	companyaddress(data_07);
	cinno(data_08);
	gstnumber(data_09);
	pannumber(data_10);
	name(data_11);
	personalmailid(data_12);
	personalmobilenumber(data_13);
	address(data_14);
}

public void invaliddata(String data_1, String data_2, String data_3,
		String data_4, String data_5, String data_6, String data_7, String data_8, String data_9, String data_10,
		String data_11, String data_12, String data_13, String data_14
) {
	companyname(data_1);
	shortname(data_2);
	emailid(data_3);
	password(data_4);
	mobilenumber(data_5);
	alternatenumber(data_6);
	companyaddress(data_7);
	cinno(data_8);
	gstnumber(data_9);
	pannumber(data_10);
	name(data_11);
	personalmailid(data_12);
	personalmobilenumber(data_13);
	address(data_14);
}

public void specialcharacters_spaces(String data_011, String data_012,
		String data_013, String data_014, String data_015, String data_016, String data_017, String data_018, String data_019,
		String data_020, String data_021, String data_022, String data_023, String data_024) {
	companyname(data_011);
	shortname(data_012);
	emailid(data_013);
	password(data_014);
	mobilenumber(data_015);
	alternatenumber(data_016);
	companyaddress(data_017);
	cinno(data_018);
	gstnumber(data_019);
	pannumber(data_020);
	name(data_021);
	personalmailid(data_022);
	personalmobilenumber(data_023);
	address(data_024);
}
public void firmvaliddata(String data_01, String data_02, String data_03,
		String data_04, String data_05, String data_06, String data_07, String data_08, String data_09,
		String data_10, String data_11, String data_12, String data_13, String data_14
) {
	companyname(data_01);
	shortname(data_02);
	emailid(data_03);
	password(data_04);
	mobilenumber(data_05);
	alternatenumber(data_06);
	companyaddress(data_07);
	comapanyregisterno(data_08);
	gstnumber(data_09);
	pannumber(data_10);
	name(data_11);
	personalmailid(data_12);
	personalmobilenumber(data_13);
	address(data_14);
}

}
