package com.runnerclass;

import org.openqa.selenium.WebDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions
(glue={"com.testcases"},
features="Features",
monochrome=true)

public class Runnerclass extends AbstractTestNGCucumberTests {

	public static WebDriver driver;
	
}
