package com.amazon.qa.tests;
import com.amazon.qa.base.*;
import com.amazon.qa.pages.HomePage;
import com.amazon.qa.pages.SigninPage;
import com.amazon.qa.pages.YourOrdersPage;

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
	@Test 
	public void clickonYourAmazonlink()
	{
	   	
	}
	@Test 
	public YourOrdersPage clickonYourOrderslink()
	{
		String actualtitle=homepage.clickonYourOrderlink();
		String expectedtitle="Your Orders";
		Assert.assertEquals(actualtitle,expectedtitle);
		return new YourOrdersPage();
	}
	@Test
	public void clickonYourwishlistlink()
	{
		String actualtitle=homepage.clickonYourwishlistlink();
		String expectedtitle="Amazon.in";
		Assert.assertEquals(actualtitle, expectedtitle);
	}
	@Test
	public void clickonYourRecommendationslink()
	{
		String actualtitle=homepage.clickonYourRecommendationslink();
		String expectedtitle=" Your Amazon.in";
		Assert.assertEquals(actualtitle, expectedtitle);
	}
	@Test 
	public void clickonPrimeMembershiplink()
	{
		String actualtitle=homepage.clickonPrimeMembershiplink();
		String expectedtitle=" Amazon.in: Your Amazon Prime Membership ";
		Assert.assertEquals(actualtitle, expectedtitle);
	}
	@Test 
	public void clickonPrimeVideolink()
	{
		String actualtiitle=homepage.clickonPrimeVideolink();
		String expectedtitle="Amazon Prime Video:  Access Hundreds of New releases, Popular Bollywood Blockbusters, Hollywood movies, TV Shows- Amazon.in";
		Assert.assertEquals(actualtiitle, expectedtitle);
	}
	@Test
	public void clickonSubscribeandSaveitemslink()
	{
		String actualtitle=homepage.clickonSubscribeandSaveitemslink();
		String expectedtitle="Amazon.in - Your Subscribe & Save Items";
		Assert.assertEquals(actualtitle, expectedtitle);
	}
	@Test
	public void clickonSignoutlink()
	{
		String actualtitle=homepage.clickonSignoutlink();
		String expectedtitle="Amazon Sign In";
		Assert.assertEquals(actualtitle, expectedtitle);
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
