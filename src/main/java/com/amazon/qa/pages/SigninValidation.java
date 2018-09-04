package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.amazon.qa.base.TestBase;

public class SigninValidation extends TestBase {

	@FindBy(xpath="//input[@id='ap_email']")
	WebElement emailfield;
	
	@FindBy(xpath="//div[@class='a-alert-content']")
	WebElement emailvalidationmessage;
	
	@FindBy(xpath="//div[@class='a-alert-content']/ul/li/span[@class='a-list-item']")
	WebElement mobilenumbervalidationmessage;
}
