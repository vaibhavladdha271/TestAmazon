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
	
	@FindBy(xpath="//a[contains(@class,'nav-link')]/span[contains(text(),'Your Account')]")
	WebElement youraccountlink;
	
	@FindBy(xpath="//a[contains(@class,'nav-link')]/span[contains(text(),'Your Orders')]")
	WebElement yourorderslink;
	
	@FindBy(xpath="//a[contains(@class,'nav-link')]/span[contains(text(),'Your Wish List')]")
	WebElement yourwishlistlink;
	
	@FindBy(xpath="//a[contains(@class,'nav-link')]/span[contains(text(),'Your Recommendations')]")
	WebElement yourrecommendationslink;
	
	@FindBy(xpath="//a[contains(@class,'nav-link')]/span[contains(text(),'Your Prime Membership')]")
	WebElement yourprimemembershiplink;
	
	@FindBy(xpath="//a[contains(@class,'nav-link')]/span[contains(text(),'Your Prime Video')]")
	WebElement yourprimevideolink;
	
	@FindBy(xpath="//a[contains(@class,'nav-link')]/span[contains(text(),'Your Subscribe & Save Items')]")
	WebElement subscribeandsaveitemslink;
	
	@FindBy(xpath="//a[contains(@class,'nav-link')]/span[contains(text(),'Your Amazon Business Account')]")
	WebElement amazonbusinessaccountlink;
	
	@FindBy(xpath="//a[contains(@class,'nav-link')]/span[contains(text(),'Seller Account')]")
	WebElement selleraccountlink;
	
	@FindBy(xpath="//a[contains(@class,'nav-link')]/span[contains(text(),'Manage Your Content and Devices')]")
	WebElement contentanddeviceslink;
	
	@FindBy(xpath="//a[contains(@class,'nav-link')]/span[contains(text(),'Sign Out')]")
	WebElement signoutlink;
	
	SigninPage signin=new SigninPage();
	
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
	public String clickonYourOrderlink()
	{
		Actions action=new Actions(driver);
		action.moveToElement(signinlink).moveToElement(yourorderslink).click().build().perform();
		return signin.Signinwithmobilenumber();
	}
	public String clickonYourwishlistlink()
	{
		Actions action=new Actions(driver);
		action.moveToElement(signinlink).moveToElement(yourwishlistlink).click().build().perform();
		return signin.Signinwithmobilenumber();
	}
	public String clickonYourRecommendationslink()
	{
		Actions action=new Actions(driver);
		action.moveToElement(signinlink).moveToElement(yourrecommendationslink).click().build().perform();
		return signin.Signinwithmobilenumber();
	}
	public String clickonPrimeMembershiplink()
	{
		Actions action=new Actions(driver);
		action.moveToElement(signinlink).moveToElement(yourprimemembershiplink).click().build().perform();
		return signin.Signinwithmobilenumber();
	}
	public String clickonPrimeVideolink()
	{
		Actions action=new Actions(driver);
		action.moveToElement(signinlink).moveToElement(yourprimevideolink).click().build().perform();
		return signin.Signinwithmobilenumber();
	}
	public String clickonSubscribeandSaveitemslink()
	{
		Actions action=new Actions(driver);
		action.moveToElement(signinlink).moveToElement(subscribeandsaveitemslink).click().build().perform();
		return signin.Signinwithmobilenumber();
	}
	public String clickonAmazonBusinessaccountlink()
	{
		Actions action=new Actions(driver);
		action.moveToElement(signinlink).moveToElement(amazonbusinessaccountlink).click().build().perform();
		return signin.Signinwithmobilenumber();
	}
	public String clickonSelleraccountlink()
	{
		Actions action=new Actions(driver);
		action.moveToElement(signinlink).moveToElement(selleraccountlink).click().build().perform();
		return signin.Signinwithmobilenumber();
	}
	public String clickonContentandDeviceslink()
	{
		Actions action=new Actions(driver);
		action.moveToElement(signinlink).moveToElement(contentanddeviceslink).click().build().perform();
		return signin.Signinwithmobilenumber();
	}
	public String clickonSignoutlink()
	{
		Actions action=new Actions(driver);
		action.moveToElement(signinlink).moveToElement(btnsignin).click().build().perform();
		signin.Signinwithmobilenumber();
		action.moveToElement(signinlink).moveToElement(signoutlink).click().build().perform();
		return driver.getTitle();
	}
	
}
