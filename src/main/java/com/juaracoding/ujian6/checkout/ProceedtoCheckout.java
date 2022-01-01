package com.juaracoding.ujian6.checkout;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.ujian6.driver.DriverSingleton;

public class ProceedtoCheckout {

	private WebDriver driver;
	
	public ProceedtoCheckout() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"nav-menu-item-cart\"]/a/span/span[2]")
	private WebElement btnCartPage;
	
	@FindBy(xpath = "//*[@id=\"post-6\"]/div/div/div[2]/div[2]/div/a")
	private WebElement btnCheckout;
	
	@FindBy(id = "billing_first_name")
	private WebElement txtFirstname;
	
	@FindBy(id = "billing_last_name")
	private WebElement txtLastname;
	
	@FindBy(id = "billing_company")
	private WebElement txtCompany;
	
	@FindBy(id = "select2-billing_country-container")
	private WebElement selectCountry;
	
	@FindBy(id = "billing_address_1")
	private WebElement txtAddress1;
	
	@FindBy(id = "billing_address_2")
	private WebElement txtAddress2;
	
	@FindBy(id = "billing_city")
	private WebElement txtCity;
	
	@FindBy(id = "select2-billing_state-container")
	private WebElement selectState;
	
	@FindBy(id = "billing_postcode")
	private WebElement txtPostcode;
	
	@FindBy(id = "billing_phone")
	private WebElement txtPhone;
	
	@FindBy(id = "order_comments")
	private WebElement txtAdditional;
	
	@FindBy(xpath = "//*[@id=\"terms\"]")
	private WebElement checkbtnTerms;
	
	@FindBy(xpath = "//*[@id=\"place_order\"]")
	private WebElement btnCheckoutFinish;
	
	public void gotoCartPage() {
		btnCartPage.click();
	}
	
	public void gotoCheckout() {
		btnCheckout.click();
	}
	
	public void gotoFinish(String firstname, String lastname, String company, 
			String address1, String address2, String city, String postcode, 
			String phone, String additional, String country, String state) {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,500)");
		txtFirstname.sendKeys(firstname);
		txtLastname.sendKeys(lastname);
		txtCompany.sendKeys(company);
		selectCountry.click();
		new Select(selectCountry).selectByVisibleText(country);
		txtAddress1.sendKeys(address1);
		txtAddress2.sendKeys(address2);
		js.executeScript("window.scrollBy(0,500)");
		txtCity.sendKeys(city);
		selectState.click();
		new Select(selectState).selectByVisibleText(state);
		txtPostcode.sendKeys(postcode);
		txtPhone.sendKeys(phone);
		js.executeScript("window.scrollBy(0,100)");
		txtAdditional.sendKeys(additional);
	}
	
	public void gotoFinish2() {
		checkbtnTerms.click();
		btnCheckoutFinish.click();
	}
	
}
