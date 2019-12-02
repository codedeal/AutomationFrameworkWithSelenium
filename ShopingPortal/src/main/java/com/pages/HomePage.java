package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Setup.TestBase;

public class HomePage extends TestBase
{
	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[1]/a")
	WebElement women;
	
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[1]/ul/li[2]/ul/li[1]/a")
	WebElement women_dress;
	
	public HomePage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public ProductPage selectItem(String ItemName)
	{
		selectItemFromMenu(women, women_dress); 
		return new ProductPage();
	}
 
}