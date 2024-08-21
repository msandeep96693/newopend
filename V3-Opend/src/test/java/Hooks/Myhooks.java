package Hooks;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.Drivertest;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Myhooks extends Drivertest {
	
//	public static  WebDriver driver;
	
//	public Myhooks() {
//		super();
//	}

	@Before
	public static void setup() {
		
		Drivertest.initialiseBrowser("firefox");
//		driver=Drivertest.getDriver();
//		driver.get("https://v3opend.tech-active.com/auth/admin_login");
		
		
		
//		driver = new ChromeDriver();
//		driver.get("https://campaignsopend.tech-active.com/#/admin_login");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@After
	public  void TearDown() {
		driver.close();
	}
}
