Feature: Hotel Booking In Adactin Application
Scenario Outline: : user Login In The Login Page

Given user Launch The Application 
When user Enters The "<UserName>" In UserName Textbox
And user Enters The "<Password>" In Password Textbox
Then user Click On Login Button And It Navigates To Next Page

Examples:
|UserName|Password|
|abc|123|
|cibi|234|
|sandeep1990|india@123|

Scenario: user Books Hotel In Search Hotel Page
When user Selects The Location
And user Selects The Hotel
And user Selects The Room Type
And user Selects The Number Of Rooms
And user Enters The Check In Date
And user Enters The Check Out Date
And user Selects Number Of Adutls Per Room
And User Selects Number Of Childern Per Room 
Then User Clicks On Search And It Navigates To Next Page

Scenario: user Selects Hotel 
When user Selects The Hotel Through CheckBox
Then user Clicks On Continue And Navigates To Next Page  

Scenario: user Books The Hotel By Giving Personal Informations 
When user Enters First Name in Textbox
And user Enters Last Name in Textbox
And user Enters Address in Billing Address Textbox
And user Enters Credit Card Number In Textbox
And user Selects  Credit Card Type 
And user Selects Expiry Month From Drop Down 
And user Selects Expiry Year From Drop Down 
And user Enters Cvv Number In TextBox
Then user Click on Book Now Button And Navigates To Next Page


Scenario: user Booking Confirmation 
Then user Click On My Itinerary Button And Navigates To Next Page


Scenario: users Booked Itinerary Order ID
When user Selects The Order Check Box
Then user Click On The Logout Button to Navigate To Home Page   
