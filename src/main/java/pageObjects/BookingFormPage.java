package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BookingFormPage {


	public BookingFormPage(WebDriver rdriver) {
		PageFactory.initElements(rdriver, this);
	}

	
	@FindBy(id = "firstname")
	WebElement FirstName_TextField;

	@FindBy(id = "lastname")
	WebElement SurName_TextField;

	@FindBy(id = "totalprice")
	WebElement Price_TextField;
	
	@FindBy(id = "depositpaid")
	WebElement Deposit;

	@FindBy(id = "checkin")
	WebElement Checkin_TextField;

	@FindBy(id = "checkout")
	WebElement CheckOut_TextField;

	@FindBy(xpath = "//input[contains(@value,'Save')] ")
	WebElement Save_Button;

	@FindBy(xpath = "//input[contains(@onclick,'deleteBooking')]")
	WebElement Delete_Button;

	@FindBy(xpath = "//p[normalize-space()='Test1']")
	WebElement FirstName_Test1;

	@FindBy(xpath = "//p[normalize-space()='Test2']")
	WebElement SurName_Test2;
	
	
	public void enterFirstName (String firstName) {
		FirstName_TextField.clear();
		FirstName_TextField.sendKeys(firstName);
	}

	public void enterSurName (String surName) {
		SurName_TextField.clear();
		SurName_TextField.sendKeys(surName);
	}

	public void enterPrice (String price) {
		Price_TextField.clear();
		Price_TextField.sendKeys(price);
	}

/*
	public void verifyDefaultDeposit () {
		
		Select select = new Select(Deposit);

		WebElement option = select.Dep();
		String defaultItem = option.getText();		
		if(defaultItem.equals("true")) {
			System.out.println("The default true is selected");
		}else 
			System.out.println("The default is not true");

			//*[@id="bookings"]

		}*/

	public void enterCheckin(String checkinDate) {
		Checkin_TextField.clear();
		Checkin_TextField.sendKeys(checkinDate);
	}

	public void enterCheckout(String checkoutDate) {
		CheckOut_TextField.clear();
		CheckOut_TextField.sendKeys(checkoutDate);
	}

	public void clickSaveButton () {
		Save_Button.click();
	}

	public void clickDeleteButton () {
		Delete_Button.click();
	}

	public void boooking_FirstNameDisplayed () {
		FirstName_Test1.isDisplayed();
	}

	public void boooking_surNameDisplayed () {
		SurName_Test2.isDisplayed();
	}


	public void boooking_FirstNameNOTDisplayed () {
	//	Assert.assertTrue(!FirstName_Test1.isDisplayed());

	}

}
	

