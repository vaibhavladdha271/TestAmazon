package com.amazon.qa.tests;
import com.amazon.qa.base.*;
import com.amazon.qa.pages.HomePage;
import com.amazon.qa.pages.SigninPage;

import org.testng.Assert;
import org.testng.annotations.*;

public class HomePageTest extends TestBase {

	HomePage homepage;
	SigninPage signin;
	@BeforeMethod
	public void setup()
	{
		initialize();
		homepage=new HomePage();
	}
	
	@Test(priority=1)
	public void verifyPageTitle()
	{
		String actualtitle=homepage.getPageTitle();
		String expectedtitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		Assert.assertEquals(actualtitle, expectedtitle);
	}
	
	@Test(priority=2)
	public void clickonDeliverylink()
	{
		homepage.clickonDeliverylink();
	}
	@Test
	public void clickonSigninlink()
	{
		signin=homepage.clickonSigninlink();
	}
	@Test
	public void clickonSigninbtn()
	{
		signin=homepage.clickonSigninbtn();
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
