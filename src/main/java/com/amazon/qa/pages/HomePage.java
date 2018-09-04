package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.amazon.qa.base.TestBase;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

	@FindBy(id="searchDropdownBox")
	WebElement dropdownsearch;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchtextbox;
	
	@FindBy(className="nav-input")
	WebElement btnsearch;
	
	@FindBy(className="nav-logo-link")
	WebElement amazonlogo;
	
	@FindBy(xpath="//a[contains(@class,'nav-prime-try')]")
	WebElement tryprimelink;
	
	@FindBy(linkText="Get started")
	WebElement getstartedlink;
	
	@FindBy(id="nav-link-shopall")
	WebElement shopbycategorylink;
	
	@FindBy(id="nav-your-amazon")
	WebElement youramazonlink;
	
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement dealslink;
	
	@FindBy(xpath="//a[contains(text(),'Pay')]")
	WebElement amazonpaylink;
	
	@FindBy(linkText="Sell")
	WebElement selllink;
	
	@FindBy(xpath="//a[contains(text(),'Service')]")
    WebElement customerservicelink;
	
	@FindBy(id="nav-link-yourAccount")
	WebElement signinlink;
	
	@FindBy(id="nav-link-prime")
	WebElement primelink;
	
	@FindBy(id="nav-link-wishlist")
	WebElement wishlistlink;
	
	@FindBy(id="nav-cart")
	WebElement cartlink;
	
	@FindBy(xpath="//a[contains(@class,'a-popover-trigger')]")
	WebElement deliverylink;
	
	@FindBy(xpath="//a[@class='nav-action-button']")
	WebElement btnsignin;
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	
	public void clickonYourAmazonlink()
	{
		youramazonlink.click();
	}
	
	public void clickonDealslink()
	{
		dealslink.click();
	}
	
	public void clickonSelllink()
	{
		selllink.click();
	}
	
	public void clickonCustomerServicelink()
	{
		customerservicelink.click();
	}
	
	public DeliveryPopupPage clickonDeliverylink()
	{
		deliverylink.click();
		return new DeliveryPopupPage();
	}
	public void clickonShopbyCategorylink()
	{
		shopbycategorylink.click();
	}
	
	public SigninPage clickonSigninlink()
	{
		signinlink.click();
		return new SigninPage();
	}
	public SigninPage clickonSigninbtn()
	{
		Actions action=new Actions(driver);
		action.moveToElement(signinlink).moveToElement(btnsignin).click().build().perform();
		return new SigninPage();
	}
}
