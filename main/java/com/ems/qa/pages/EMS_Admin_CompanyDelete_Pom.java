package com.ems.qa.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EMS_Admin_CompanyDelete_Pom {
WebDriver driver;
WebDriverWait wait;
public EMS_Admin_CompanyDelete_Pom(WebDriver driver) {
	this.driver = driver;
	this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	PageFactory.initElements(driver, this);	
}
@FindBy(xpath = "//input[@placeholder = 'Search by Company Name, Authorized Name ']")WebElement searchfield;
@FindBy(xpath = "//div[@title = 'Tcs']/parent::div/parent::div/following-sibling::div[4]/child::div/child::button[@title = 'Delete']")WebElement deleteoption;
@FindBy(xpath = "//button[text() = 'Delete']")WebElement popupbox;

public void searchinputvalid(String data) {
	searchfield.sendKeys(data);
}

public void deletecompany() throws InterruptedException {
	deleteoption.click();
	
}
public void acceptpopmsg() throws InterruptedException {
	Thread.sleep(3000);
	popupbox.click();
	Thread.sleep(3000);
}
}
