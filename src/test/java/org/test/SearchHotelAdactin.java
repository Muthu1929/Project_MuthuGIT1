package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelAdactin extends BaseClassAdactin {

	public SearchHotelAdactin() {
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotels;
	
	@FindBy(id="room_type")
	private WebElement room_type;
	
	@FindBy(id="room_nos")
	private WebElement room_nos;
	
	@FindBy(id="adult_room")
	private WebElement adult_room;
	
	@FindBy(id="child_room") 
	private WebElement child_room;
	
	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoom_type() {
		return room_type;
	}

	public WebElement getRoom_nos() {
		return room_nos;
	}

	public WebElement getAdult_room() {
		return adult_room;
	}
	
	public WebElement getChild_room() {
		return child_room;
	}
	
	@FindBy(id="datepick_in")
	private WebElement CheckInDate;
	
	@FindBy(id="datepick_out")
	private WebElement CheckoutDate;
	
	public WebElement getCheckInDate() {
		return CheckInDate;
	}

	public WebElement getCheckoutDate() {
		return CheckoutDate;
	}
	
	@FindBy(id="Submit")
	public WebElement secondpageSubmit;

	public WebElement getSecondpageSubmit() {
		return secondpageSubmit;
	}
	
	@FindBy(id="radiobutton_0")
	public WebElement radiobutton;
	
	@FindBy(id="continue")
	public WebElement continuebutton;
	
	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getContinuebutton() {
		return continuebutton;
	}

	public void search(int loc,int name,int type,int no,int chechin,int Checkout,int adult,int child ) {
		selectByIndex(getLocation(), loc);
		selectByIndex(getHotels(), name);
		selectByIndex(getRoom_type(), type);
		selectByIndex(getRoom_nos(), no); 
//		SendKeys(getCheckInDate(),chechin);
//		SendKeys(getCheckoutDate(), Checkout);
				
		selectByIndex(getAdult_room(),adult);
		selectByIndex(getChild_room(), child);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
	

}
