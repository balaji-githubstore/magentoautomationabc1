package com.abc.magentopages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	WebDriver driver;
	By myAccount=By.linkText("MY ACCOUNT");
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickOnMyAccount()
	{
		System.out.println(driver);
		driver.findElement(myAccount).click();
		
	}

}
