package com.amazon.qa.tests;
import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.DeliveryPopupPage;
import com.amazon.qa.pages.HomePage;

import org.testng.Assert;
import org.testng.annotations.*;

public class DeliveryPopupPageTest extends TestBase {
	
	DeliveryPopupPage deliverypage;
	HomePage homepage;
	@BeforeMethod
	public void setup()
	{
		initialize();
		homepage=new HomePage();
		deliverypage=new DeliveryPopupPage();
		homepage.clickonDeliverylink();
	}
	@Test
	public void verifyLocationTitle()
	{
		String title=deliverypage.getDeliveryPopupTitle();
		String expectedtitle="Choose your location";
		Assert.assertEquals(title, expectedtitle);
	}
	@Test
	public void changeZipCode()
	{
		String updatedzipcode=deliverypage.changeZipCode();
		String expectedzipcode="411009";
		Assert.assertEquals(expectedzipcode, updatedzipcode);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	

}
