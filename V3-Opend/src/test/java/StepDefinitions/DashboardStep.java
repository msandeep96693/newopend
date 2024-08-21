package StepDefinitions;

import org.openqa.selenium.WebDriver;

import Base.Drivertest;
import ObjectPage.Dashboardpage;
import ObjectPage.Login1Page;
import io.cucumber.java.en.*;

public class DashboardStep {
	
	WebDriver driver;
	Dashboardpage dashboard;
	Login1Page login;
	
	@Given("user should navigate to the application")
	public void user_should_navigate_to_the_application() {
			 driver = Drivertest.getDriver();
			 login = new Login1Page(driver);
			 dashboard = new Dashboardpage(driver);
	}

	@When("user should enter url as {string}")
	public void user_should_enter_url_as(String URL) {
		driver.get(URL);
	    
	}

	@When("user should enter email address {string} and password {string}")
	public void user_should_enter_email_address_and_password(String email, String password) {
	    login.Emailfield(email);
	    login.Passwordfield(password);
	}

	@When("user should click on login button")
	public void user_should_click_on_login_button() {
	    login.SigninButton();
	}

	@When("user should verify the dashboard home page")
	public void user_should_verify_the_dashboard_home_page() {
	  login.validateDashboardpage();
	}

	@When("user validate campaign tab")
	public void user_validate_campaign_tab() {
		dashboard.Verifycampaigntab();
	}
	
	
	@When("user should search by campaign name")
	public void user_should_search_by_campaign_name() throws InterruptedException {
	    dashboard.searchandvalidateField();
	    dashboard.rows();
	}

	@When("user should select All status dropdown")
	public void user_should_select_all_status_dropdown() {
	 
	}

	@When("user should select campaign status dropdown")
	public void user_should_select_campaign_status_dropdown() {
	   
	}

	@When("user should select Date filter")
	public void user_should_select_date_filter() {
	   
	}

	@When("user should validate status name of campaign, open, click, sent data")
	public void user_should_validate_status_name_of_campaign_open_click_sent_data() {
	  
	}

	@Then("user should successfully validated the campaign Tab")
	public void user_should_successfully_validated_the_campaign_tab() {
	   
	}
}
