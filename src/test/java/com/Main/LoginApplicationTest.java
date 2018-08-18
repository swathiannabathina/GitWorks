package com.Main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginApplicationTest 
{
	@Test
	public void logIn()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\studies\\testing\\selenium\\Libraries\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		RediffLoginPage rlp = new RediffLoginPage(driver);
		
		rlp.Home().click();
		
		RediffHomePage rhp = new RediffHomePage(driver);
		
		rhp.SearchBox().sendKeys("earphones");
		System.out.println("SearchBox Executed");
		rhp.Submit().click();
		System.out.println("Submit Method Executed");
		
		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		
		rlp.EmailId().sendKeys("swathi.annabathina");
		rlp.PassWord().sendKeys("Naga@1911");
		rlp.LogIn().click();
	}
}