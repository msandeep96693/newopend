package StepDefinitions;

import org.openqa.selenium.WebDriver;

import Base.Drivertest;
import ObjectPage.Dashboardpage;
import ObjectPage.Login1Page;
import io.cucumber.java.en.*;

public class DashboardStep extends Drivertest {
	
	WebDriver driver;
	Dashboardpage dashboard;
	Login1Page login;
	
	@Given("user navigate to the application")
	public void user_navigate_to_the_application() {
			 driver = Drivertest.getDriver();	
			 login = new Login1Page(driver);
			 dashboard = new Dashboardpage(driver);
	}

	@When("user enter url as {string}")
	public void user_enter_url_as(String URL) {
		driver.get(URL);
	    
	}

	@When("user enter email address {string} and password {string}")
	public void user_enter_email_address_and_password(String email, String password) {
	    login.Emailfield(email);
	    login.Passwordfield(password);
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
	    login.SigninButton();
	}

	@When("user verify the dashboard home page")
	public void user_verify_the_dashboard_home_page() {
	  login.validateDashboardpage();
	}

	@When("user validate campaign tab")
	public void user_validate_campaign_tab() {
		dashboard.Verifycampaigntab();
	}
	
	
	@When("user search by campaign name")
	public void user_search_by_campaign_name() throws InterruptedException {
	    dashboard.searchandvalidateField();
	    dashboard.DashboardRowdatavalidation();

	}

	@When("user select All status dropdown")
	public void user_select_all_status_dropdown() throws InterruptedException {
		dashboard.CampaignallStatusDropdown();	
		dashboard.validationofrows();
	}

	@When("user select campaign dropdown")
	public void user_select_campaign_status_dropdown() throws InterruptedException {
	   dashboard.campaignsdropdown();
	   dashboard.DashboardRowdatavalidation1();
	}

	@When("user select Date filter")
	public void user_select_date_filter() throws InterruptedException {
	   dashboard.DatefilterDropdown();
	   dashboard.DashboardRowdatavalidation2();
	}

	@When("user validate status name of campaign, open, click, sent data")
	public void user_validate_status_name_of_campaign_open_click_sent_data() {
	  dashboard.validatecardsdetails();
	}

	@Then("user successfully validated the campaign Tab")
	public void user_successfully_validated_the_campaign_tab() {
	   dashboard.validatealltabs();
	}
}
