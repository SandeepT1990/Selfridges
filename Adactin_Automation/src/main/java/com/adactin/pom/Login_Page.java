package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	public static WebDriver driver;
	
	@FindBy(id="username")
	private static WebElement username;
	
	@FindBy(xpath="//input[@type=\"password\"]")
	private static WebElement password;
	
    @FindBy(id="login")
	private static WebElement login_btn;

	public Login_Page(WebDriver driver2) {

	this.driver=driver2;
	
	PageFactory.initElements(driver, this);
	}

	public static WebElement getUsername() {
		return username;
	}

	public static void setUsername(WebElement username) {
		Login_Page.username = username;
	}

	public static WebElement getPassword() {
		return password;
	}

	public static void setPassword(WebElement password) {
		Login_Page.password = password;
	}

	public static WebElement getLogin_btn() {
		return login_btn;
	}

	public static void setLogin_btn(WebElement login_btn) {
		Login_Page.login_btn = login_btn;
	}
	
	
}
