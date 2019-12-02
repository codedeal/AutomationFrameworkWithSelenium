package com.smokesuite;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Setup.TestBase;
import com.pages.HomePage;
import com.pages.ProductPage;

public class HomePageTest extends TestBase
{
		HomePage homePage;
		ProductPage productPage;
	
		@BeforeMethod
		public void setUp()
		{
			initialization();
			homePage = new HomePage();
			productPage = new ProductPage();
		}
		
		@Test
		public void verifyHomePageTitleTest(){
			String homePageTitle = homePage.verifyHomePageTitle();
			Assert.assertTrue(homePageTitle.contains("My Store"));
			
		}
		
		@Test(priority=1)
		public void when_we_hover_women_we_should_be_able_to_select_dress(){
		      productPage= homePage.selectItem("dress");
		      productPage.selectaDress();
			
		}
		
		@AfterMethod
		public void tearDown(){
			driver.quit();
		}
}
