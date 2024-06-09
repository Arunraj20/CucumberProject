package org.demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends Baseclass {
	public LoginPojo() {
	PageFactory.initElements(driver, this);	
	}
 @FindBy(id="email")	
 private  WebElement emailTxt;
 
 @FindBy(name="pass")
 private WebElement passTxt;
 
 @FindBy(name="login")
 private WebElement loginBtn;

public WebElement getEmailTxt() {
	return emailTxt;
}

public WebElement getPassTxt() {
	return passTxt;
}

public WebElement getLoginBtn() {
	return loginBtn;
}
 
 
  
}
