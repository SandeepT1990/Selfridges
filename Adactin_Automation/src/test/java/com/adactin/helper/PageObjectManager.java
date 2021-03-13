package com.adactin.helper;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.Login_Page;

public class PageObjectManager {
	
	public static WebDriver driver;
	
	

	
	public PageObjectManager(WebDriver driver2) {

	this.driver=driver2;
	
	
	}











	public Login_Page getlogin_page() {

		Login_Page lp = new Login_Page(driver);
		
		return lp;
		
	}
	
	
}
