package org.step;

import org.demo.Baseclass;
import org.demo.LoginPojoFlp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition extends Baseclass {
	public static LoginPojoFlp f;

	@Given("user to launch the chrome browser")
	public void user_to_launch_the_chrome_browser() {
		chromeBrowser();
		launchUrl("https://www.flipkart.com/");
		maxwindow();
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
		f = new LoginPojoFlp();
		btnClick(f.getLoginbtn());

	}

	@When("To pass the valid  mobile number in numberfield")
	public void to_pass_the_valid_mobile_number_in_numberfield() {
		 f = new LoginPojoFlp();
		fillTextBox(f.getNumTxt(), "8940418811");

	}

	@When("To click the Request OTP button")
	public void to_click_the_Request_OTP_button() {
		f = new LoginPojoFlp();
		btnClick(f.getReqBtn());
	}

	@Then("To close the chrome browser")
	public void to_close_the_chrome_browser() {
		
		
	}
}
