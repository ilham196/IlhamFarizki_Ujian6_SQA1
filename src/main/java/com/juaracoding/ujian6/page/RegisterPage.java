package com.juaracoding.ujian6.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.ujian6.driver.DriverSingleton;



public class RegisterPage {
	
	private WebDriver driver;
	
	public RegisterPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this); 
	}
	
	@FindBy(css = ".woocommerce-store-notice__dismiss-link")
	private WebElement btnDismiss;
	
	@FindBy(xpath = "//*[@id=\"noo-site\"]/header/div[1]/div/ul[2]/li[2]/a")
	private WebElement btnMyAccount;
	
	@FindBy(id = "reg_username")
	private WebElement txtRegUsername;
	
	@FindBy(id = "reg_email")
	private WebElement txtRegEmail;
	
	@FindBy(id = "reg_password")
	private WebElement txtRegPassword;
	
	@FindBy(xpath = "//*[@id=\"customer_login\"]/div[2]/form/p[4]/button")
	private WebElement btnReg;
	
	public void Dismiss() {
		btnDismiss.click();
	}
	
	public void gotoRegPage() {
		btnMyAccount.click();
	}
	
	public void gotoRegister(String username, String email, String password) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		WebDriverWait wait = new WebDriverWait(driver, 15);
		
		txtRegUsername.sendKeys(username);
		txtRegEmail.sendKeys(email);
		txtRegPassword.sendKeys(password);
		js.executeScript("window.scrollBy(0,100)");
		btnReg.click();
	}
	

}
