package com.juaracoding.ujian6.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.ujian6.driver.DriverSingleton;

public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "user_login")
	private WebElement txtUsername;
	
	@FindBy(id = "user_pass")
	private WebElement txtPass;
	
	@FindBy(xpath = "//*[@id=\"wp-submit\"]")
	private WebElement btnLogin;
	
	public void gotoMyAccount(String username, String password) {
		txtUsername.sendKeys(username);
		txtPass.sendKeys(password);
		btnLogin.click();
	}
}
