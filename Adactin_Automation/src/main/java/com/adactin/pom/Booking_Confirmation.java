package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Confirmation {

	
	
	public WebDriver driver;
	
	@FindBy(xpath="//input[@id='my_itinerary']")
	private WebElement myItinerary_Btn;

	public Booking_Confirmation(WebDriver driver2) {

	this.driver=driver2;
PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getMyItinerary_Btn() {
		return myItinerary_Btn;
	}
}
