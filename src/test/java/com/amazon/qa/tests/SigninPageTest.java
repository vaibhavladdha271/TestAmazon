package com.amazon.qa.tests;
import com.amazon.qa.base.*;

import org.testng.Assert;
import org.testng.annotations.*;
import com.amazon.qa.pages.*;

public class SigninPageTest extends TestBase {

	HomePage homepage;
	SigninPage signin;
	@BeforeMethod
	public void setup()
	{
		initialize();
		homepage=new HomePage();
		signin=homepage.clickonSigninlink();
	}
	@Test
	public void verifyPagetitle()
	{
		String actualtitle=signin.getPageTitle();
		String expectedtitle="Amazon Sign In";
		Assert.assertEquals(actualtitle, expectedtitle);
	}
	@Test
	public void validateEmailerrormessage()
	{
		String actualmessage=signin.validateEmailfield();
		String expectedmessage="Enter your email or mobile phone number";
		Assert.assertEquals(actualmessage, expectedmessage);
	}
	@Test
	public void validatemobilenumberErrormessage()
	{
		String actualmessage=signin.validatemobilenumber();
		String expectedmessage="The phone number you entered cannot be used to sign in. Please check that the number you entered is correct or sign in with your email instead.";
		Assert.assertEquals(actualmessage, expectedmessage);
	}
	@Test
	public void Signinwithmobilenumber()
	{
		String actualpagetitle=signin.Signinwithmobilenumber();
		String expectedpagetitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		Assert.assertEquals(actualpagetitle, expectedpagetitle);
	}
	@Test
	public void clickonForgotPasswordlink()
	{
		signin.clickonForgotPasswordlink();
	}
	@Test
	public void clickonSigninissueslink()
	{
		signin.clickonSigninissueslink();
	}
	@Test 
	public void clickonChangelink()
	{
		signin.clickonchangelink();
	}
	@Test
	public void clickonConditionsofuselink() throws Exception
	{
		signin.clickonConditionsofuselink();
	}
	@Test
	public void validateincorrectpasswordmessage()
	{
		String actualmessage=signin.ValidateIncorrectPasswordmessage();
		String expectedmessage="Your password is incorrect";
		Assert.assertEquals(actualmessage, expectedmessage);
	}
	@Test
	public void Validatesigninmessage()
	{
		String actualmessage=signin.KeepMeSigninmessage();
		String expectedmessage="To keep your account secure, use this option only on your personal devices.";
		Assert.assertEquals(actualmessage, expectedmessage);
	}
	@Test
	public void clickonClosebutton()
	{
		signin.clickonClosebutton();
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
