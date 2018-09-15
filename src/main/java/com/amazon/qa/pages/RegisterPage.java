package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {
	
	@FindBy(id="ap_customer_name")
	WebElement customername;
	
	@FindBy(id="auth-country-picker")
	WebElement countrycodedropdown;
	
	@FindBy(id="ap_phone_number")
	WebElement mobilenumber;
	
	@FindBy(className="a-link-emphasis")
	WebElement signinlink;
	
	

}
