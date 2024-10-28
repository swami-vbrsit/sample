package com.ems.qa.hooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.ems.driverfactory.DriverFactory;
import com.ems.qa.configreader.Config_Reader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Application_Hooks {
	private WebDriver driver;
	Properties prop;
	private Config_Reader configread;
	private DriverFactory factory;
	  
	@Before(order = 0)
	public void getprop() {
		configread = new Config_Reader();
		prop = configread.read_elements();
	}
	
	@Before(order = 1)
	public void setup() {
		String browsername = prop.getProperty("browser");
		factory = new DriverFactory();
		driver = factory.init_element(browsername);
	}
	
	@After
	public void teardown(Scenario sc) {
		if(sc.isFailed()) {
			String ScreenshotName=sc.getName().replaceAll("", "_");
			byte[] source=((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			sc.attach(source, "image/png", ScreenshotName);
		}
		//driver.quit();
	}
}
