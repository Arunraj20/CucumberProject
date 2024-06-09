package org.demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojoFlp extends Baseclass {
	public LoginPojoFlp() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Login']")
	private WebElement Loginbtn;
	
	@FindBy(xpath="//input[@type='text'][@class='r4vIwl BV+Dqf']")
	private WebElement numTxt;
	
	@FindBy(xpath="//button[text()='Request OTP']")
	private WebElement reqBtn;

	public WebElement getLoginbtn() {
		return Loginbtn;
	}

	public WebElement getNumTxt() {
		return numTxt;
	}

	public WebElement getReqBtn() {
		return reqBtn;
	}

}
