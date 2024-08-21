package ObjectPage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;					
import org.openqa.selenium.WebElement;					
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonUtils.Elementutils;
import CommonUtils.WaitHelper;					
					
public class Login1Page extends Elementutils {
					
//	WebDriver driver;				
					
	private WebDriver driver;

	public Login1Page(WebDriver driver) {				
	super(driver);
	this.driver = driver;		
	PageFactory.initElements(driver, this);	
	}	
				
	@FindBy(xpath = "//input[@placeholder='Enter Email']") private WebElement EmailAddress;				
	@FindBy(xpath ="//input[@placeholder='Enter Password']") private WebElement password;				
	@FindBy(xpath ="//button[.='Sign In']") private WebElement Signin;
	@FindBy(xpath = "//h1[.='Dashboard']") private WebElement verifydashboard;
//	@FindBy(xpath = "//a[@id='profileDropdown']")  private WebElement adminperson;
	@FindBy(xpath = "//a[@class='dropdown-toggle nav-link']/img") private WebElement adminperson;
	@FindBy(xpath = "(//div)[40]/ul") private List<WebElement> profileoption;
	
	
					
	public void Emailfield(String Mail) {				
		EmailAddress.clear();			
		EmailAddress.sendKeys(Mail);			
	}				
					
	public void Passwordfield(String Pass) {				
		password.clear();			
		password.sendKeys(Pass);			
	}				
					
	public void SigninButton() {				
		Signin.click();			
	}
	
	public void validateDashboardpage() {
		String text = verifydashboard.getText();
		System.out.println("Dashboard verified name :-"+ text);
	}
	
//	public void clickonadminperson() throws InterruptedException {
//		System.out.println("click1");
////		waitforvisibilityofelement(adminperson, Duration.ofSeconds(5));
//		waitforvisibilityofelement1(adminperson, 10);
//		adminperson.click();
//		System.out.println("click2");
//	}
//	
//	public void clickonlogout() throws InterruptedException {
//		List<WebElement> listofoptions = profileoption;
//		for(WebElement  options:listofoptions) {
//			String textname = options.getText();
//			System.out.println(textname);
//			if(textname.equalsIgnoreCase("Log Out")) {
//				options.click();
//				System.out.println("Clicked on Logout button");
//				break;
//			}
//		}
//	}
					
}					
						
						


