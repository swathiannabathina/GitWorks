package com.Main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage 
{
	WebDriver driver;
	public RediffLoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	By username = By.xpath("//input[@id='login1']");
	By password = By.xpath("//input[@id='password']");
	By login = By.xpath("//input[@value='Go']");
	By home = By.linkText("Home");
	
	public WebElement EmailId()
	{
		return driver.findElement(username);
	}
	
	public WebElement PassWord()
	{
		return driver.findElement(password);
	}
	
	public WebElement Home()
	{
		return driver.findElement(home);
	}
	
	public WebElement LogIn()
	{
		return driver.findElement(login);
	}
}