package com.ems.qa.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EMS_Employee_ForgotPassword_Pom {
	WebDriver driver;
	WebDriverWait wait;
	public EMS_Employee_ForgotPassword_Pom(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@href='/forgotPassword']")WebElement ForgotLink;
	@FindBy(xpath = "//input[contains(@placeholder,'Enter Your')]")WebElement Emailfield;
	@FindBy(xpath = "//button[text() = 'Send OTP']")WebElement Otpbutton;
	@FindBy(xpath = "//input[@placeholder='Enter OTP']")WebElement Enterotp; 
	@FindBy(xpath = "//button[text() = 'Submit']")WebElement Submitbutton;
	@FindBy(xpath = "//input[contains(@placeholder,'Enter Your')]")WebElement Enterpassword;
	@FindBy(xpath = "//input[contains(@placeholder,'Confirm')]")WebElement Confirmpassword;
    @FindBy(xpath = "//button[text() = 'Update Password']") WebElement Updatebutton;
	
public void forgotlink() {
	ForgotLink.click();
}
public void emailfield(String Email) {
	Emailfield.sendKeys(Email);
}
public void otpbutton() {
Otpbutton.click();	
}
public void enterotp(String otp) {
	wait.until(ExpectedConditions.visibilityOf(Enterotp)).sendKeys(otp);
	//Enterotp.sendKeys(otp);
}
public void submitbtn() {
	Submitbutton.click();
}
public void enterpassword(String Enterpasword) {
	Enterpassword.sendKeys(Enterpasword);
}

public void confirmpswd(String confirmpswd) {
	Confirmpassword.sendKeys(confirmpswd);
}
public void updatebtn() {
	Updatebutton.click();
}
}
