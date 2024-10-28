package com.ems.driverfactory;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	public WebDriver driver;
	public static ThreadLocal<WebDriver> tldriver = new ThreadLocal<>();
	public WebDriver init_element(String browser) {
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();  
			tldriver.set(new ChromeDriver());
		}else if(browser.equals("ff")) {
			WebDriverManager.firefoxdriver().setup();
			tldriver.set(new FirefoxDriver());
		}
		getdriver().manage().deleteAllCookies();
		getdriver().manage().window().maximize();
		getdriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		getdriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		return getdriver();
	}
	
	public static WebDriver getdriver() {
		return tldriver.get();
	}
	
}
