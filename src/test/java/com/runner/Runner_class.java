package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.Base.Bass_class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\AAA\\eclipse-workspace\\CucumberProject\\src\\test\\java\\com\\feature\\lime.feature",
								glue = "com.step",
								plugin = {"pretty",
										"html:report/lime.html",
										"json:reportlime/lime.json",
										"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
					
public class Runner_class  extends Bass_class{
	
	@BeforeClass
	public static void browserLaunch() { 
		launchBrowser("Chrome"); 
	}
	@AfterClass
	public static void browserClose() {
		terminateBrowser();
	}
}
