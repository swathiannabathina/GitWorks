package com.Main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPagePF 
{
	WebDriver driver;
	public RediffLoginPagePF(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@id='login1']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Go']")
	WebElement login;
	
	@FindBy(linkText="Home")
	WebElement home;
	
	public WebElement EmailId()
	{
		return username;
	}
	
	public WebElement PassWord()
	{
		return password;
	}
	
	public WebElement Home()
	{
		return home;
	}
	
	public WebElement LogIn()
	{
		return login;
	}
}