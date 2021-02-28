package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;
	
	//1.by locators
	private By emailId = By.id("email");
	private By password = By.id("passwd");
	private By singInButton = By.id("SubmitLogin");
	private By forgetPwdLink = By.linkText("Forgot your password?256");
	
	// 2. Create constructore of page class
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	//3. page actions: features(behavior) of the page from of methods:
	
	public String getLoginPageTitle() {
		 return driver.getTitle();
	}
	public boolean isForgetPwdLinkPresent() {
		return driver.findElement(forgetPwdLink).isDisplayed();
	}
	public void enterUserName(String username) {
		driver.findElement(emailId).sendKeys(username);
	}
	
	public void enterPasword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	public void clickOnLogin() {
		driver.findElement(singInButton).click();
	}
}
