package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class SigninPage extends TestBase {
	
	@FindBy(xpath="//input[@id='ap_email']")
	WebElement emailfield;
	
	@FindBy(id="auth-fpp-link-bottom")
	WebElement forgotpasswordlink;
	
	@FindBy(xpath="//a[contains(@class,'a-expander-header')]")
	WebElement needhelplink;
	
	@FindBy(id="ap-other-signin-issues-link")
	WebElement signinissuelink;
	
	@FindBy(id="createAccountSubmit")
	WebElement createAccountbtn;
	
	@FindBy(id="continue")
	WebElement continuebtn;
	
	@FindBy(xpath="//div[@class='a-alert-content']")
	WebElement emailvalidationmessage;
	
	@FindBy(xpath="//div[@class='a-alert-content']/ul/li/span[@class='a-list-item']")
	WebElement mobilenumbervalidationmessage;
	
	@FindBy(id="ap_password")
	WebElement passwordfield;
	
	@FindBy(id="signInSubmit")
	WebElement btnlogin;
	
	@FindBy(id="ap_change_login_claim")
	WebElement changelink;
	
	@FindBy(xpath="//a[contains(text(),'Conditions of Use')]")
	WebElement conditionsofuselink;
	
	@FindBy(xpath="//a[contains(text(),'Privacy Notice')]")
	WebElement privacynoticelink;
	
	public SigninPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	
	public String validateEmailfield()
	{
		continuebtn.click();
		return emailvalidationmessage.getText();
	}
    public String validatemobilenumber()
    {
    	emailfield.sendKeys("111111111111");
    	continuebtn.click();
    	return mobilenumbervalidationmessage.getText();
    }
    public String Signinwithmobilenumber()
    {
    	emailfield.sendKeys("8928805601");
    	continuebtn.click();
        passwordfield.sendKeys("prime@321");
        btnlogin.click();
        return driver.getTitle();
    }
    public void clickonhelplink()
    {
    	needhelplink.click();
    }
    public void clickonForgotPasswordlink()
    {
    	clickonhelplink();
    	forgotpasswordlink.click();
    }
    public void clickonSigninissueslink()
    {
        clickonhelplink();
        signinissuelink.click();
    }
    public void clickonchangelink()
    {
    	emailfield.sendKeys("8928805601");
    	continuebtn.click();
    	changelink.click();
    	emailfield.clear();
    	emailfield.sendKeys("vaibhavladdha271@gmail.com");
    }
    public void clickonConditionsofuselink() throws Exception
    {
    	conditionsofuselink.click();
    }
}
