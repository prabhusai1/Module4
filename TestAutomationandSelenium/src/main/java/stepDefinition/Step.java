package stepDefinition;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.capg.pom.DriverInitializer;
import com.capg.pom.PaymentPOM;
import com.capg.pom.RegisterPOM;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step {
	WebDriver driver;
	
	RegisterPOM register = null;
	PaymentPOM payment = null;

	@Given("^user is register in$")
	public void user_is_register_in() throws Throwable {

		DriverInitializer.setBrowserName();
		DriverInitializer.setBrowserConfig();
		DriverInitializer.runTest();

		register = new RegisterPOM(DriverInitializer.driver);
		payment = new PaymentPOM(DriverInitializer.driver);

	}

	@When("^title of page is something$")
	public void title_of_page_is_something() throws Throwable {

		String title = DriverInitializer.driver.getTitle();
		assertEquals("Conference Registration", title);
	}

	@Then("^user enters first name$")
	public void user_enters_first_name() throws Throwable {

		register.clickNext();
		register.typeFirstName();
	}

	@Then("^user enters last name$")
	public void user_enters_last_name() throws Throwable {
		register.clickNext();
		register.typeLastName();
	}

	@Then("^user enters email$")
	public void user_enters_email() throws Throwable {
		register.clickNext();
		register.typeEmail();
	}

	@Then("^user enters contact number$")
	public void user_enters_contact_number() throws Throwable {
		register.clickNext();
		register.typeContactNo();
	}

	@Then("^user selects no of people$")
	public void user_selects_no_of_people() throws Throwable {
		register.clickNext();
		register.typeNumberofPeople();
	}

	@Then("^user enters building name and room no$")
	public void user_enters_building_name_and_room_no() throws Throwable {
		register.clickNext();
		register.typeBuildingNameRoomNo();
	}

	@Then("^user enters area name$")
	public void user_enters_area_name() throws Throwable {
		register.clickNext();
		register.typeAreaName();
	}

	@Then("^user selects city$")
	public void user_selects_city() throws Throwable {
		register.clickNext();
		register.typeCity();
	}

	@Then("^user selects state$")
	public void user_selects_state() throws Throwable {
		register.clickNext();
		register.typeState();
	}

	@Then("^user selects conference access$")
	public void user_selects_conference_access() throws Throwable {
		register.clickNext();
		register.typeConferencefullAccess();
	}

	@Then("^click on submit button$")
	public void click_on_submit_button() throws Throwable {
		register.clickNext();
	}

	@Then("^title of Payment page$")
	public void title_of_Payment_page() throws Throwable {
		String title = DriverInitializer.driver.getTitle();
		assertEquals("Payment Details", title);
	}

	@Then("^user enters card holder name$")
	public void user_enters_card_holder_name() throws Throwable {
		payment = new PaymentPOM(DriverInitializer.driver);

		payment.submitButton();
		payment.typeCardholderName();
		
	}

	@Then("^user enters debit card number$")
	public void user_enters_debit_card_number() throws Throwable {

		payment.submitButton();
		payment.typeCardNumber();
	}

	@Then("^user enters cvv number$")
	public void user_enters_cvv_number() throws Throwable {

		payment.submitButton();
		payment.typeCvv();
	}

	@Then("^user enters card expiration month$")
	public void user_enters_card_expiration_month() throws Throwable {
		payment.submitButton();
		payment.typeExpireMonth();
	}

	@Then("^user enters card expiration year$")
	public void user_enters_card_expiration_year() throws Throwable {

		payment.submitButton();
		payment.typeExpireYear();
	}

	@Then("^Make Payment$")
	public void make_Payment() throws Throwable {
		payment.submitButton();
		DriverInitializer.quitTest();
	}

}
