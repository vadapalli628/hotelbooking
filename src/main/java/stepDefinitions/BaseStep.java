package stepDefinitions;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.BookingFormPage;


public class BaseStep {

	protected WebDriver driver;

	protected BookingFormPage bookingFormPage;

	static {
		//String path = "/Users/vsr/Documents/codingpractice/src/test/resources/driver.mac/chromedriver";
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driverFiles/chromedriver");
		//System.setProperty("webdriver.chrome.driver",path);
	}
	public BaseStep(){

		//this.driver = new ChromeDriver();
	}
	
}
