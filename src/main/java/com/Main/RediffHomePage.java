package com.Main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomePage 
{
	WebDriver driver;
	public RediffHomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='srchword']")
	WebElement searchbox;
	
	@FindBy(xpath="//input[@value='Search']")
	WebElement submit;
	
	public WebElement SearchBox()
	{
		return searchbox;
	}
	
	public WebElement Submit()
	{
		return submit;
	}
}