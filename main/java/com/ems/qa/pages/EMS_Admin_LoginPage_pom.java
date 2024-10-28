package com.ems.qa.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EMS_Admin_LoginPage_pom {
	private WebDriver driver;
	 WebDriverWait wait;
public EMS_Admin_LoginPage_pom(WebDriver driver) {
	this.driver = driver;
	this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//button[text() = 'EMS Login']")
WebElement EMS_Admin_btn;
@FindBy(xpath = "//div[@class = 'newLoginLeftImgHolder']")
WebElement EMS_page_Image;
@FindBy(name = "username")
WebElement Username;
@FindBy(name = "password")
WebElement Password;
@FindBy(xpath = "//button[text() = 'Sign in']")
WebElement Sign_in_btn;
@FindBy(xpath = "//div[@class = 'Toastify__toast-body']")
WebElement Tostify_msg;
@FindBy(xpath = "//div[@class = 'Toastify__toast-body']/following-sibling::button")
WebElement cancel_tostify_msg;
@FindBy(xpath = "//a[@class = 'sidebar-toggle js-sidebar-toggle']") 
WebElement Hamborgour;
@FindBy(xpath = "//a[@class = 'sidebar-brand']")
WebElement Ems_Adminlogo;
@FindBy(xpath = "//i[@class = 'bi bi-person-circle']")
WebElement profile_icon;
@FindBy(xpath = "//a[text() = 'Logout']")
WebElement Logout;

public void ems_admin_btn() {
	driver.findElement(By.id("details-button")).click();
	driver.findElement(By.id("proceed-link")).click();
	EMS_Admin_btn.click();
}

public void ems_page_image() {
	System.out.println(EMS_page_Image.isDisplayed()+ " the image is displayed.");
}

public void username(String usname) {
	Username.sendKeys(usname);
}

public void password(String pwd) {
	Password.sendKeys(pwd);
}

public void sign_in_btn() {
	Sign_in_btn.click();
	
}

public void tostify_msg() {
	wait.until(ExpectedConditions.visibilityOf(Tostify_msg));
	System.out.println(Tostify_msg.isDisplayed()+ " the url is matched.");
	System.out.println(Tostify_msg.getText());
	cancel_tostify_msg.click();
	
}
public void hamborgour() {
	Hamborgour.click();
}

public void adminlogo() {
	Ems_Adminlogo.click();
}
public void profileicon() {
	profile_icon.click();
}

public void logout() {
	Logout.click();
}
}
