package org.demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static Alert al;

	//ChromBrowser
	public static void chromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	//EdgeBrowser
	public static void edgeBrowser() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();

	}
	//EdgeBrowser
	public static void fireFox() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();

	}

	//Launch Url
	public static void launchUrl(String url) {
		driver.get(url);
	}
	public static void maxwindow() {
	driver.manage().window().maximize();

}
	//PageTitle
	public static String pageTitle() {
		String title = driver.getTitle();
		return title;
	}

	//PageUrl
	public static String pageUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("current pageUrl :" + currentUrl);
		return currentUrl;
	}

	//Close Browser
	public static void closeBrowser() {
		driver.close();

	}

	//Quit Browser
	public static void quitBrowser() {
		driver.quit();
	}

	//Sendkeys TextBox
	public static void fillTextBox(WebElement element, String value) {
		element.sendKeys(value);

	}

	//Click Button
	public static void btnClick(WebElement element) {
		element.click();

	}

	//RightClick
	public static void rightlick(WebElement element) {
		a = new Actions(driver);
		a.contextClick(element).perform();
	}

	//Click To select
	public static void clickDouble(WebElement element) {
		a = new Actions(driver);
		a.doubleClick(element).perform();
	}

	//Mouse moveToElement
	public static void moveElement(WebElement element) {
		a = new Actions(driver);
		a.moveToElement(element).perform();

	}

	//Drag and Drop
	public static void dragDrop(WebElement start, WebElement end) {
		a = new Actions(driver);
		a.dragAndDrop(start, end).perform();
	}

	//KeyDown
	public static void KeyDown() {
		a = new Actions(driver);
		a.keyDown(Keys.SHIFT).build().perform();
	}

	//KeyUp
	public static void keyUp() throws AWTException {
		a = new Actions(driver);
		a.keyUp(Keys.SHIFT).build().perform();
	}

	//Copy
	public static void copy() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
	}

	//Paste
	public static void paste() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
	}

	//Alert Accept
	public static void alertAccept() {
		al = driver.switchTo().alert();
		al.accept();
	}

	//Alert Dismiss
	public static void alertDismiss() {
		al = driver.switchTo().alert();
		al.dismiss();
	}

	//Alert Senkeys
	public static void sendKeysAlert(String text) {
		al = driver.switchTo().alert();
		al.sendKeys(text);
		al.accept();
	}

	//Alert Get Text
	public static void getTextAlert() {
		al = driver.switchTo().alert();
		al.getText();
	}

	//Frame Index
	public static void switchToFrameIndex(int IndexNo) {
		driver.switchTo().frame(IndexNo);

	}

	//Frame Name
	public static void switchToFrameName(String text) {
		driver.switchTo().frame(text);

	}

	//Frame WebElement
	public static void switchToFrameWebElement(WebElement element) {
		driver.switchTo().frame(element);

	}

	//Frame Default Content
	public static void switchToFrameDefaultContent() {
		driver.switchTo().defaultContent();
	}

	//Frame Parent
	public static void switchToFrameParent() {
		driver.switchTo().parentFrame();
	}

	//Date and Time
	public static void getDateAndTime() {
		Date d = new Date();
		System.out.println(d);
	}

	//Windows Handling Url
	public static void handlingUrl(String text) {
		driver.switchTo().window(text);
	}

	//Windows Handling Title
	public static void handlingTitle(String text) {
		driver.switchTo().window(text);
	}

	//Windows Handling WindowsId
	public static void handlingWindowsId(String text) {
		driver.switchTo().window(text);
	}

}
