package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booked_Itinerrary {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//input[@name='check_all']")
	private WebElement orderIdCheckbox;
	
	public Booked_Itinerrary(WebDriver driver2) {

	this.driver=driver2;
	PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getOrderIdCheckbox() {
		return orderIdCheckbox;
	}

	public WebElement getLogout_Btn() {
		return logout_Btn;
	}

	@FindBy(id="logout")
	private WebElement logout_Btn;

	

	

}
