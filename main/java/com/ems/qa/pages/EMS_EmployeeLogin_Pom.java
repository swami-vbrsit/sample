package com.ems.qa.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EMS_EmployeeLogin_Pom {
WebDriver driver;
WebDriverWait wait;
public EMS_EmployeeLogin_Pom(WebDriver driver) {
	this.driver = driver;
	this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//button[@class='btn btn-primary btn-lg']/../../following-sibling::div[2]/child::button")
WebElement companylgn;
@FindBy(name = "companyName")
WebElement shortnamefield;
@FindBy(xpath = "//button[@class = 'btn btn-primary']")
WebElement submitbtn;
@FindBy(name = "username")
WebElement usernameele;
@FindBy(name = "password")
WebElement passwordele;
@FindBy(xpath = "//button[text() = 'Sign in']")
WebElement loginbtn;
@FindBy(name = "otp")
WebElement otpele;

@FindBy(xpath = "//button[@class='btn-close']")
WebElement xmark;
public void clickcompanylgn() {
	driver.findElement(By.id("details-button")).click();
	driver.findElement(By.id("proceed-link")).click();
	companylgn.click();
}

public void entercompanyname(String shortname) {
	shortnamefield.sendKeys(shortname);
}

public void clicksubmitbtn()  {
	submitbtn.click();
}

public void enterusername(String username) {
	usernameele.sendKeys(username);
}

public void enterpassword(String password) {
	passwordele.sendKeys(password);

}

public void clickloginbtn() {
	loginbtn.click();
}

public void enterotp(String otp) {
	otpele.sendKeys(otp);
}

public void cancelmark() throws InterruptedException {
	Thread.sleep(5000);
	xmark.click();
}
}
