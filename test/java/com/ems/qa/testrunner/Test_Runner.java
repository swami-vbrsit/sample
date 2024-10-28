package com.ems.qa.testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Swami Reddy\\eclipse-workspace\\EMS_App_Testing\\src\\test\\resource\\EMS_feature",glue = {"com.ems.qa.stepdefinition","com.ems.qa.hooks"},
plugin = {"pretty","html:output-type","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class Test_Runner {

}
