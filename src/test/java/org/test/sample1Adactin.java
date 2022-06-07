package org.test;

import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

public class sample1Adactin extends BaseClassAdactin{
	
	loginpageAdac l;
	PaymentPage pp;
	SearchHotelAdactin sh;

	@BeforeClass
	private void Beforeclass() {
		System.out.println("@BeforeClass");
		lunchbrowser();
		urllunch("http://adactinhotelapp.com/");
		browserWait(30);

	}
	@BeforeMethod
	private void BeforeMethod() {
		System.out.println("....BeforeMethod......");
		Date d = new Date();
		System.out.println("Test Starts " +d);
	}
	
	@AfterClass
	
	private void AfterClass() {
		System.out.println("...AfterClass.......");
		//browserquit();
	}
	
	

	@AfterMethod
	private void AfterMethod() {
		System.out.println("...AfterMethod........");
		Date d = new Date();
		System.out.println("Test Ends "+ d);
	}

	@Test (priority=0)
	private void Test1() throws IOException, InterruptedException {
		System.out.println("...Test1.......");
		SearchHotelAdactin sh=new SearchHotelAdactin();
		selectByIndex(sh.getLocation(), 2);;
		selectByIndex(sh.getHotels(), 1);
		selectByIndex(sh.getRoom_type(), 2);
		selectByIndex(sh.getRoom_nos(), 2); 		
		selectByIndex(sh.getAdult_room(),1);
		selectByIndex(sh.getChild_room(), 2);
				
		String rc = ReadExcel("Junit", 1, 0);
		sh.getCheckInDate().clear();
		SendKeys(sh.getCheckInDate(), rc);
		sh.getCheckoutDate().clear();
		WebElement dde = sh.getCheckoutDate();
		SendKeys(dde, ReadExcel("Junit", 1, 1));

		click(sh.getSecondpageSubmit());
		click(sh.getRadiobutton());
		click(sh.getContinuebutton());
	}

	@Test (priority=-2)
	
	private void Test2()  {
		
		System.out.println("...Test2 login .......");
		
		 l=new loginpageAdac();
		SendKeys(l.getUsername(), "Muthu63548736");
		SendKeys(l.getPassword(), "Muthu@123");
		click(l.getLogin());
	}
	

	@Test(priority=1) 
	
	private void Test3() throws IOException{
		System.out.println("...Test3.......");
		
		pp =new PaymentPage();
		
		
		SendKeys(pp.getFirst_name(), "Muthu");
		SendKeys(pp.getLast_name(), "Lakshmi");
		SendKeys(pp.getAddress(), "chennai");
		SendKeys(pp.getCreditCardNo(), "5432678907653456");		
		selectByIndex(pp.getCreditCardtype(),1);
		selectByIndex(pp.getCc_exp_month(),11);
		selectByIndex(pp.getCc_exp_year(),11);
		WebElement cvv = pp.getCvv();
		SendKeys(cvv,ReadExcel("Junit", 1, 7));
		click(pp.getBook_nowbutton());
		System.out.println("Booking Succesfully");
	}

}