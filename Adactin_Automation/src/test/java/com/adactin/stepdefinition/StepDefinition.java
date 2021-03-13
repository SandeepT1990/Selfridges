package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.Base_Class;
import com.adactin.helper.FileReaderManager;
import com.adactin.helper.PageObjectManager;
import com.adactin.pom.Book_A_Hotel;
import com.adactin.pom.Booked_Itinerrary;
import com.adactin.pom.Booking_Confirmation;
import com.adactin.pom.Login_Page;
import com.adactin.pom.Search_Hotel;
import com.adactin.pom.Select_Hotel;
import com.adactin.runner.Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends Base_Class {

	public static WebDriver driver = Runner.driver;

	
	PageObjectManager pom = new PageObjectManager(driver);
	
	//Login_Page lp = new Login_Page(driver);
	Search_Hotel sh = new Search_Hotel(driver);
	Select_Hotel slh = new Select_Hotel(driver);
	Book_A_Hotel bah = new Book_A_Hotel(driver);
	Booking_Confirmation bc = new Booking_Confirmation(driver);
	Booked_Itinerrary bi = new Booked_Itinerrary(driver);

	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {

		String geturl = FileReaderManager.getInstance().getInstanceCR().geturl();
		getUrl(geturl);
	}

	@When("^user Enters The UserName In UserName Textbox$")
	public void user_Enters_The_UserName_In_UserName_Textbox() throws Throwable {

		String username = FileReaderManager.getInstance().getInstanceCR().getUsername();

		inputValueElement(pom.getlogin_page().getUsername(), username);

	}

	@When("^user Enters The Password In Password Textbox$")
	public void user_Enters_The_Password_In_Password_Textbox() throws Throwable {

		String password = FileReaderManager.getInstance().getInstanceCR().getPassword();

		inputValueElement(pom.getlogin_page().getPassword(), password);

	}

	@Then("^user Click On Login Button And It Navigates To Next Page$")
	public void user_Click_On_Login_Button_And_It_Navigates_To_Next_Page() throws Throwable {

		clickOnElement(pom.getlogin_page().getLogin_btn());
	}

	@When("^user Selects The Location$")
	public void user_Selects_The_Location() throws Throwable {

		singleDropDown(sh.getLocation(), "value", "Sydney");
	}

	@When("^user Selects The Hotel$")
	public void user_Selects_The_Hotel() throws Throwable {

		singleDropDown(sh.getHotels(), "value", "Hotel Creek");

	}

	@When("^user Selects The Room Type$")
	public void user_Selects_The_Room_Type() throws Throwable {

		singleDropDown(sh.getRoomtype(), "value", "Standard");
	}

	@When("^user Selects The Number Of Rooms$")
	public void user_Selects_The_Number_Of_Rooms() throws Throwable {

		singleDropDown(sh.getNumberOfRooms(), "value", "1");
	}

	@When("^user Enters The Check In Date$")
	public void user_Enters_The_Check_In_Date() throws Throwable {

		clearElement(sh.getCheckInDate());
		Thread.sleep(2000);

		inputValueElement(sh.getCheckInDate(), "21/02/2021");
	}

	@When("^user Enters The Check Out Date$")
	public void user_Enters_The_Check_Out_Date() throws Throwable {

		clearElement(sh.getCheckOutDate());
		Thread.sleep(2000);
		inputValueElement(sh.getCheckOutDate(), "25/02/2021");
	}

	@When("^user Selects Number Of Adutls Per Room$")
	public void user_Selects_Number_Of_Adutls_Per_Room() throws Throwable {

		singleDropDown(sh.getAdultsPerRoom(), "value", "1");
	}

	@When("^User Selects Number Of Childern Per Room$")
	public void user_Selects_Number_Of_Childern_Per_Room() throws Throwable {

		singleDropDown(sh.getChildPerRoom(), "value", "0");
	}

	@Then("^User Clicks On Search And It Navigates To Next Page$")
	public void user_Clicks_On_Search_And_It_Navigates_To_Next_Page() throws Throwable {

		clickOnElement(sh.getSearch_Btn());
	}

	@When("^user Selects The Hotel Through CheckBox$")
	public void user_Selects_The_Hotel_Through_CheckBox() throws Throwable {

		checkbox(slh.getRadio_Btn());

	}

	@Then("^user Clicks On Continue And Navigates To Next Page$")
	public void user_Clicks_On_Continue_And_Navigates_To_Next_Page() throws Throwable {

		clickOnElement(slh.getContinue_Btn());
	}

	@When("^user Enters First Name in Textbox$")
	public void user_Enters_First_Name_in_Textbox() throws Throwable {

		inputValueElement(bah.getFirstName(), "John");

		Thread.sleep(2000);
	}

	@When("^user Enters Last Name in Textbox$")
	public void user_Enters_Last_Name_in_Textbox() throws Throwable {

		inputValueElement(bah.getLastName(), "Wick");
	}

	@When("^user Enters Address in Billing Address Textbox$")
	public void user_Enters_Address_in_Billing_Address_Textbox() throws Throwable {

		inputValueElement(bah.getBillingAddress(), "no 21 Continantal, NewYork");
	}

	@When("^user Enters Credit Card Number In Textbox$")
	public void user_Enters_Credit_Card_Number_In_Textbox() throws Throwable {

		inputValueElement(bah.getCreditCardNo(), "1234567890987654");
	}

	@When("^user Selects  Credit Card Type$")
	public void user_Selects_Credit_Card_Type() throws Throwable {

		singleDropDown(bah.getCreditCardType(), "value", "AMEX");
	}

	@When("^user Selects Expiry Month From Drop Down$")
	public void user_Selects_Expiry_Month_From_Drop_Down() throws Throwable {

		singleDropDown(bah.getExpiryDateMonth(), "value", "1");
	}

	@When("^user Selects Expiry Year From Drop Down$")
	public void user_Selects_Expiry_Year_From_Drop_Down() throws Throwable {

		singleDropDown(bah.getExpiryDateYear(), "value", "2022");
	}

	@When("^user Enters Cvv Number In TextBox$")
	public void user_Enters_Cvv_Number_In_TextBox() throws Throwable {

		inputValueElement(bah.getCvvNumber(), "298");
	}

	@Then("^user Click on Book Now Button And Navigates To Next Page$")
	public void user_Click_on_Book_Now_Button_And_Navigates_To_Next_Page() throws Throwable {
		Thread.sleep(2000);
		clickOnElement(bah.getBookNow_Btn());
	}

	@Then("^user Click On My Itinerary Button And Navigates To Next Page$")
	public void user_Click_On_My_Itinerary_Button_And_Navigates_To_Next_Page() throws Throwable {

		Thread.sleep(5000);
		clickOnElement(bc.getMyItinerary_Btn());
	}

	@When("^user Selects The Order Check Box$")
	public void user_Selects_The_Order_Check_Box() throws Throwable {

		clickOnElement(bi.getOrderIdCheckbox());
	}

	@Then("^user Click On The Logout Button to Navigate To Home Page$")
	public void user_Click_On_The_Logout_Button_to_Navigate_To_Home_Page() throws Throwable {

		clickOnElement(bi.getLogout_Btn());
	}

}
