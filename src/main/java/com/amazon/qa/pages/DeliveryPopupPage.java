package com.amazon.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class DeliveryPopupPage extends TestBase {

	@FindBy(xpath="//input[@type='submit' and @aria-label='Sign in to see your addresses']")
	WebElement signinbtn;
	
	@FindBy(id="GLUXChangePostalCodeLink")
	WebElement changepostalcodelink;
	
	@FindBy(xpath="//button[text()='Done']")
	WebElement Donebtn;
	
	@FindBy(id="GLUXZipUpdateInput")
	WebElement zipupdatefield;
	
	@FindBy(xpath="//span[@id='GLUXZipUpdate']/span/input")
	WebElement Applybtn;
	
	@FindBy(xpath="//h4[@class='a-popover-header-content']")
	WebElement locationtitle;
	
	public DeliveryPopupPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getDeliveryPopupTitle()
	{
		System.out.println(locationtitle.getText());
		return locationtitle.getText();
	}
	
	public String changeZipCode()
	{
		changepostalcodelink.click();
		zipupdatefield.sendKeys("411009");
		Applybtn.click();
	    return (driver.findElement(By.id("GLUXZipConfirmationValue"))).getText();
	}
}
