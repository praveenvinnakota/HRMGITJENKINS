package com.testcases;


import cucumber.api.java.en.And;

import java.util.List;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.runnerclass.Runnerclass;
import com.screenfunctions.Login;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;

public class Login_Test extends Runnerclass{
	
	@Given("^I want to launch the firefox browser$")
	public void launchBrowser() 
	{
		driver=new FirefoxDriver();	    
	}
	
	@And("^I need to maximize it$")
	public void maximizeBrowser()
	{
		driver.manage().window().maximize();
		
	}
	
	@When("^It maximizes enter the URL$")
	public void enterURL()
	{
		driver.get("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");
	}
	
	@Then("^I need to enter valid credentials$")
	public void enterCredentials(DataTable credentials)
	{
		List<List<String>> cred = credentials.raw();
		
		System.out.println("Credentails size : " + cred.size());
		
		for(int i=0;i<cred.size();i++)
		{
			Login lgn = PageFactory.initElements(driver, Login.class);
			lgn.Login_Admin(cred.get(i).get(0), cred.get(i).get(1));
		}
	}
	@And("^I close the browser$")
	public void closeBrowser()
	{
		driver.close();
	}


}
