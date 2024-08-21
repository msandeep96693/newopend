package CommonUtils;

import java.time.Duration;					
import java.util.List;					
					
import org.openqa.selenium.WebDriver;					
import org.openqa.selenium.WebElement;					
import org.openqa.selenium.support.ui.ExpectedCondition;					
import org.openqa.selenium.support.ui.ExpectedConditions;					
import org.openqa.selenium.support.ui.WebDriverWait;					
					
public class WaitHelper {					
					
					
	WebDriver driver;				
					
	public WaitHelper(WebDriver driver) {				
					
		this.driver = driver;			
					
	}				
					
					
	public void waitforElement(WebElement element, Duration time) {				
					
		WebDriverWait wait = new WebDriverWait(driver, time);			
		wait.until(ExpectedConditions.visibilityOf(element));			
	}				
					
					
	public void waitforElement(WebElement element, int i) {				
		// TODO Auto-generated method stub			
					
	}				
					
					
	public void waitforElement(List<WebElement> element, int i) {				
		// TODO Auto-generated method stub			
					
	}				
					
					
					
}					