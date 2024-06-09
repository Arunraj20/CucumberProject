package org.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class faseBookPom extends Baseclass {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		LoginPojo l = new LoginPojo();
		
		WebElement emailTxt = l.getEmailTxt();
		emailTxt.sendKeys("arunraj201998@gmail.com");
		
		WebElement passTxt = l.getPassTxt();
		passTxt.sendKeys("arunraj20");
		
		WebElement loginBtn = l.getLoginBtn();
		loginBtn.click();
	}

}
