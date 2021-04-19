package stepDefinitions;

import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.BookingFormPage;

import static java.lang.Thread.*;


public class HotelBookingSteps extends BaseStep {



    private String hotelbookingURL;
    @Given("User launch a browser")
    public void user_launch_a_browser() {
        // Write code here that turns the phrase above into concrete actions
        this.driver = new ChromeDriver();
        // initilize page obj
        bookingFormPage = new BookingFormPage(driver);
        System.out.println("Browser is succesffuly launched");

    }

    @Given("User opens URL {string}")
    public void user_opens_url(String url) {
        this.hotelbookingURL = url;
        driver.get(this.hotelbookingURL); // Write code here that turns the phrase above into concrete actions
        System.out.println("Hotel home page is  launched");
    }
    @Given("the form firstname as {string}")
    public void the_form_firstname_as(String firstName) {
       bookingFormPage.enterFirstName(firstName);
       System.out.println("Firstname entered ");
    }

    @Given("surName as {string}")
    public void sur_name_as(String surName) {
        bookingFormPage.enterSurName(surName);
        System.out.println("Surname entered");
    }
    @Given("price as {string}")
    public void price_as(String price) {
        bookingFormPage.enterPrice(price);
        System.out.println("price entered");
    }
    @Given("check-inDate as {string}")
    public void check_in_date_as(String check_inDate) throws InterruptedException {
        bookingFormPage.enterCheckin(check_inDate);
        Thread.sleep(2000);
        System.out.println("entered check in date");
    }
    @Given("check-outDate as {string}")
    public void check_out_date_as(String check_outDate) throws InterruptedException {
       bookingFormPage.enterCheckout(check_outDate);
        Thread.sleep(2000);
        System.out.println("entered check out date");
    }
    @When("clicks on Save Button")
    public void clicks_on_save_button() throws InterruptedException  {
        bookingFormPage.clickSaveButton();
        Thread.sleep(4000);
        System.out.println("save button clicked");
    }
    @Then("Successfully displays the booking record")
    public void successfully_displays_the_booking_record() throws InterruptedException  {
        bookingFormPage.boooking_FirstNameDisplayed();
        Thread.sleep(3000);
        bookingFormPage.boooking_surNameDisplayed();
        System.out.println("Record is successfully saved andfirst name and surname displayed");
    }
    @Then("close browser")
    public void close_browser() {
        driver.close();
        driver.quit();
        System.out.println("Browser is succesffuly launched");
    }

    @When("clicks on Delete Button")
    public void clicks_on_delete_button() {
        bookingFormPage.clickDeleteButton();
        System.out.println("Clicked Deleted Button");
    }


    @Then("Successfully deletes the booking record of surname")
    public void successfully_deletes_the_booking_record_of_surname() {

       // bookingFormPage.boooking_FirstNameDisplayed();

        System.out.println("Browser is succesffuly launched");
    }
}


