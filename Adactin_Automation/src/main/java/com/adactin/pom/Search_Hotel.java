package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//select[@name=\"location\"]")
	private WebElement location;
	
	@FindBy(xpath="//select[@name=\"hotels\"]")
	private WebElement hotels;
	
	@FindBy(xpath="//select[@name=\"room_type\"]")
	private WebElement roomtype;
	
	@FindBy(xpath="//select[@name=\"room_nos\"]")
	private WebElement numberOfRooms;
	
	@FindBy(xpath ="//input[@name=\"datepick_in\"]")
	private static WebElement checkInDate;
	
	@FindBy(id="datepick_out")
	private static WebElement checkOutDate;
	
	@FindBy(xpath="//select[@name=\"adult_room\"]")
	private static WebElement adultsPerRoom;
	
	@FindBy(xpath="//select[@name=\"child_room\"]")
	private static WebElement childPerRoom;
	
	@FindBy(id="Submit")
	private static WebElement search_Btn;

	public Search_Hotel(WebDriver driver2) {

	this.driver=driver2;
	PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public void setLocation(WebElement location) {
		this.location = location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public void setHotels(WebElement hotels) {
		this.hotels = hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public void setRoomtype(WebElement roomtype) {
		this.roomtype = roomtype;
	}

	public WebElement getNumberOfRooms() {
		return numberOfRooms;
	}

	public void setNumberOfRooms(WebElement numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}

	public static WebElement getCheckInDate() {
		return checkInDate;
	}

	public static void setCheckInDate(WebElement checkInDate) {
		Search_Hotel.checkInDate = checkInDate;
	}

	public static WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public static void setCheckOutDate(WebElement checkOutDate) {
		Search_Hotel.checkOutDate = checkOutDate;
	}

	public static WebElement getAdultsPerRoom() {
		return adultsPerRoom;
	}

	public static void setAdultsPerRoom(WebElement adultsPerRoom) {
		Search_Hotel.adultsPerRoom = adultsPerRoom;
	}

	public static WebElement getChildPerRoom() {
		return childPerRoom;
	}

	public static void setChildPerRoom(WebElement childPerRoom) {
		Search_Hotel.childPerRoom = childPerRoom;
	}

	public static WebElement getSearch_Btn() {
		return search_Btn;
	}

	public static void setSearch_Btn(WebElement search_Btn) {
		Search_Hotel.search_Btn = search_Btn;
	}
	
	
	

}
