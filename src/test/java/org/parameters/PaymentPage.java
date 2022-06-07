package org.parameters;

import org.base.BaseClassAdactin;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage extends BaseClassAdactin{

	public PaymentPage(){
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="first_name")
	private WebElement first_name;
		
	@FindBy(id="last_name")
	private WebElement last_name;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement CreditCardNo;
	
	@FindBy(name="cc_type")
	private WebElement CreditCardtype;
	
	@FindBy (id="cc_exp_month")
	private WebElement cc_exp_month;
	
	@FindBy(id="cc_exp_year")
	private WebElement cc_exp_year;
	
	@FindBy(name="cc_cvv")
	private WebElement cvv;
    
	@FindBy(id="book_now") 
	private WebElement book_nowbutton;
	
	public WebElement getFirst_name() {
		return first_name;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditCardNo() {
		return CreditCardNo;
	}

	public WebElement getCreditCardtype() {
		return CreditCardtype;
	}

	public WebElement getCc_exp_month() {
		return cc_exp_month;
	}

	public WebElement getCc_exp_year() {
		return cc_exp_year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook_nowbutton() {
		return book_nowbutton;
	}	
}
