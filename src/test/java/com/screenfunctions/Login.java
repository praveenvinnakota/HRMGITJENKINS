package com.screenfunctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.runnerclass.Runnerclass;


public class Login extends Runnerclass{
	
	@FindBy(how=How.ID, using="txtUsername")
	public static WebElement EdiUserName;
	
	@FindBy(how=How.XPATH, using="//input[@id='txtPassword']")
	public static WebElement EdiPassword;
	
	@FindBy(how=How.XPATH, using="//input[@id='btnLogin']")
	public static WebElement BtnLogin;
	
	@FindBy(how=How.ID, using="welcome")
	public static WebElement LnkWelcome;
	
	@FindBy(how=How.XPATH, using="//a[text()='Logout']")
	public static WebElement LnkLogout;
	
	public void Login_Admin(String user, String password)
	{
		try
		{
			EdiUserName.sendKeys(user);
			Thread.sleep(1000);
			EdiPassword.sendKeys(password);
			Thread.sleep(1000);
			BtnLogin.click();
			Thread.sleep(1000);
			LnkWelcome.click();
			Thread.sleep(1000);
			LnkLogout.click();
			Thread.sleep(1000);
		}
		
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
	}


}
