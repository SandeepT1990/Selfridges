package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.Base_Class;
import com.adactin.helper.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactin//feature",
glue = "com.adactin.stepdefinition",
monochrome=true,
strict= false,
plugin= {"html:Report/htmlFile","json:Report/json_file.json","pretty","junit:Report/JunitFile.xml"
		,"com.cucumber.listener.ExtentCucumberFormatter:Report/FileExtent.html"})

	
		
		
		
		


public class Runner {
	public static WebDriver driver;
	@BeforeClass
	public static  void set_Up() throws Throwable {
		
		String broswer = FileReaderManager.getInstance().getInstanceCR().getBrowser();
		
		driver=Base_Class.getBrowser(broswer);
		
		

	}
@AfterClass
	public static void tear_Down() {
		
		//driver.close();

	}
}
