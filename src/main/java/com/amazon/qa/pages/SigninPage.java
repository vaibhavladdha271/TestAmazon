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
	WebElement validationmessage;
	
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
	
	@FindBy(id="remember_me_learn_more_link")
	WebElement detailslink;
	
	@FindBy(xpath="//button[contains(@class,'a-button-close')]")
	WebElement btnclose;
	
	@FindBy(xpath="//div[@id='a-popover-content-1']/p")
	WebElement Keepsigninmessage;
	
	@FindBy(xpath="//div[@id='a-popover-content-1']/p[2]")
	WebElement securecontentmessage;
	
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
    	return validationmessage.getText();
    }
    public String ValidateIncorrectPasswordmessage()
    {
    	emailfield.sendKeys("vaibhavladdha271@gmail.com");
    	continuebtn.click();
    	passwordfield.sendKeys("123");
    	btnlogin.click();
    	return validationmessage.getText();
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
    public void clickonPrivacynoticelink()
    {
    	privacynoticelink.click();
    }
    public void clickonDetailslink()
    {
    	detailslink.click();
    	
    }
    public void clickonClosebutton()
    {
    	emailfield.sendKeys("8928805601");
    	continuebtn.click();
    	clickonDetailslink();
    	btnclose.click();
    }
    public String KeepMeSigninmessage()
    {
    	emailfield.sendKeys("8928805601");
    	continuebtn.click();
    	detailslink.click();
    	return securecontentmessage.getText();
    }
}
