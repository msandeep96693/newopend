package Base;

import java.time.Duration;

import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Drivertest  {
	
	public static WebDriver driver;
	
	
	
	public static WebDriver initialiseBrowser(String BrowserName) {
		
		
		
//		String BrowserName ="chrome";
		
		if(BrowserName.equalsIgnoreCase("chrome")) {
			
			driver = new ChromeDriver();
			
		} else if (BrowserName.equalsIgnoreCase("firefox")) {
			
			driver = new FirefoxDriver();
			
		} else if (BrowserName.equalsIgnoreCase("edge")) {
			
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		return driver;
		
		
		
		}

	public static WebDriver getDriver() {
		 
		return driver;
	}

	
	public  void TearDown() {
		driver.close();
	}
	
}
