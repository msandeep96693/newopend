package StepDefinitions;

import org.openqa.selenium.WebDriver;

import Base.Drivertest;
import CommonUtils.CommonBase;
import Hooks.Myhooks;
import ObjectPage.Login1Page;
import io.cucumber.java.en.*;

public class LoginStep   {	
	

		WebDriver driver;
		Login1Page login;
	
		
		@Given("user should navigate to the login page")
		public void user_should_navigate_to_the_login_page() {
		    driver =Drivertest.getDriver();
		    login = new Login1Page(driver);
		    
		    System.out.println("User navigated to login page");	
		}

		@When("admin Enter url as {string}")
		public void admin_enter_url_as(String URL) {
		    driver.get(URL);
		}

		@And("admin enter the valid email address {string}")
		public void admin_enter_the_valid_email_address(String email) {
			login.Emailfield(email);
		}

		@And("admin enter the valid password {string}")
		public void admin_enter_the_valid_password(String password) {
			login.Passwordfield(password);
		}

		@And("admin click on signin button")
		public void admin_click_on_signin_button() {
		   login.SigninButton();
		}

		@Then("admin should able to login successfully")
		public void admin_should_able_to_login_successfully() {
//		   login.validateDashboardpage();
		   System.out.println("Logged in successfully");
		}

		@Then("admin validate the dashboard page")
		public void admin_validate_the_dashboard_page() {
		    login.validateDashboardpage();
		}

//		@When("admin click on admin person")
//		public void admin_click_on_admin_person() throws InterruptedException {
//		    login.clickonadminperson();
//		}
//
//		@And("admin click on logout button and close the browser")
//		public void admin_click_on_logout_button_and_close_the_browser() throws InterruptedException {
//		    login.clickonlogout();
//		}
	}						
	
	
	
	
	
	
						
	
	
	
	
	
	
