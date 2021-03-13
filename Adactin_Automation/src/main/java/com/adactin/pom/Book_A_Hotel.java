package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_A_Hotel {
	
	public static WebDriver driver;
	
	@FindBy(id="first_name")
	private  WebElement firstName;
	
	@FindBy(id="last_name")
	private  WebElement lastName;
	
	@FindBy(id="address")
	private  WebElement billingAddress;
	
	public Book_A_Hotel(WebDriver driver2) {

	this.driver=driver2;
	PageFactory.initElements(driver, this);
	}




	@FindBy(id="cc_num")
	private  WebElement creditCardNo;
	
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getBillingAddress() {
		return billingAddress;
	}

	public WebElement getCreditCardNo() {
		return creditCardNo;
	}

	public WebElement getCreditCardType() {
		return creditCardType;
	}

	public WebElement getExpiryDateMonth() {
		return expiryDateMonth;
	}

	public WebElement getExpiryDateYear() {
		return expiryDateYear;
	}

	public WebElement getCvvNumber() {
		return cvvNumber;
	}

	public WebElement getBookNow_Btn() {
		return bookNow_Btn;
	}

	@FindBy(xpath="//select[@name=\"cc_type\"]")
	private  WebElement creditCardType;
	
	@FindBy(id="cc_exp_month")
	private  WebElement expiryDateMonth;
	
	@FindBy(id="cc_exp_year")
	private  WebElement expiryDateYear;
	
	@FindBy(id="cc_cvv")
	private  WebElement cvvNumber;
	
	@FindBy(xpath="(//input[@type='button'])[1]")
	private  WebElement bookNow_Btn;
	
	

	
	

}
