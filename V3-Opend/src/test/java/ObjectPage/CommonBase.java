package ObjectPage;

import java.util.List;				

import org.openqa.selenium.WebDriver;				
import org.openqa.selenium.WebElement;				
import org.openqa.selenium.support.PageFactory;				
				
import CommonUtils.WaitHelper;				
				
public class CommonBase {				
				
	WebDriver driver;			
				
	public CommonBase(WebDriver driver) {			
				
		this.driver = driver;		
		PageFactory.initElements(driver, this);		
				
	}			
				
	public void waitHelper(WebElement element)			
	{			
		WaitHelper wait = new WaitHelper(driver);		
		wait.waitforElement(element, 30);		
				
	}			
				
	public void waitHelper(List<WebElement> element)			
	{			
		WaitHelper wait = new WaitHelper(driver);		
		wait.waitforElement(element,30);		
	}		
	
	
				
}				
				
