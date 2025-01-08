package ObjectPage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonUtils.Elementutils;
import io.cucumber.java.hu.De;

public class Dashboardpage extends Elementutils {

	public WebDriver driver;

	public Dashboardpage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[.='Campaigns']") private WebElement campaigntab;
	@FindBy(xpath = "//input[@placeholder='Search by Campaign']") private WebElement searchfield;
	@FindBy(xpath = "//html//table/thead/tr/th") private List<WebElement> tableheadingrow;
	@FindBy(xpath = "//html//table/tbody/tr") private List<WebElement> rowsdataInaTable;
	@FindBy(xpath = "//div[@class='row']/div") private List<WebElement> cardsdetails;
	@FindBy(xpath = "//span[.=' All Status']") private WebElement clickonallStatusdropdown;	
	@FindBy(xpath = "//div[@class='fixed-selection1']/div/div") private List<WebElement> statusoption;
	@FindBy(xpath = "//button[.='Apply']") private List<WebElement> applybutton;
	@FindBy(xpath = "//span[.=' Normal']") private WebElement clickoncampaigndropdown;
	@FindBy(xpath = "(//div[@class='fixed-selection1'])[2]/div/div") private List<WebElement> campaignoption;
	@FindBy(xpath = "//span[.=' Today']") private WebElement clickondatefilterdropdown;
	@FindBy(xpath = "(//div[@aria-labelledby='filterdropdown'])[3]/div[1]/div") private List<WebElement> datedropdownoption;
	@FindBy(xpath = "//div[@role='tablist']/span") private List<WebElement> alltabs;
	
	
	
	public void zoomIn() throws AWTException {
		Robot rt = new Robot();
		rt.keyPress(KeyEvent.VK_CONTROL);
		rt.keyPress(KeyEvent.VK_MINUS);
	}
	

	
	public void Verifycampaigntab() 
	{
		String tabname = "Campaigns";

		String Nameoftab = campaigntab.getText();
		if (Nameoftab.equalsIgnoreCase(tabname)) 
		{
			System.out.println("Campaign tab page is validated");
		} else 
		{
			System.out.println("Campaign tab page is not validated");
		}
		}

	public void searchandvalidateField() throws InterruptedException 
	{
		Thread.sleep(1000);
		String searching = "Test camp";
		
		
		String search = searchfield.getAttribute("placeholder");
		if(search.equalsIgnoreCase("Search by Campaign")) 
		{
		 	searchfield.sendKeys(searching);
			System.out.println("Data entered into the field");
			System.out.println();
			Thread.sleep(3000);
		}
		
		List<WebElement> DetailedCards = cardsdetails;
		for(WebElement detailedcards:DetailedCards) {
			String GetCardDetails = detailedcards.getText();
			System.out.println("Card Details :-"+GetCardDetails);
		}

		List<WebElement> nameofheading = tableheadingrow;	
		try
		{
		for(WebElement listofheading:nameofheading) 
		{
				javascriptbyscrollbar(listofheading, 35);
//				String heading = driver.findElement(By.xpath("//html//table/thead/tr/th")).getText();
				String heading = listofheading.getText();
				System.out.println("Campaign Heading Name :-"+heading);	
				
		} 
		}
		catch (StaleElementReferenceException e)
		{
				String heading = driver.findElement(By.xpath("//html//table/thead/tr/th")).getText();
				System.out.println("Campaign Heading Name :-"+heading);
		}
	}
		
		public void DashboardRowdatavalidation() throws InterruptedException {
			
		List<WebElement> nameofrowsdata = rowsdataInaTable;	
		System.out.println("Size of rows :-"+nameofrowsdata.size());
		if(nameofrowsdata.size() > 0)  
		{
			
			WebElement numrows = nameofrowsdata.get(0);
			List<WebElement> cells = numrows.findElements(By.xpath("//html//table/tbody/tr/td"));
			
			for(WebElement cell:cells) {
			
				String NoRows = cell.getText();
				if(!NoRows.equalsIgnoreCase("No Records Found")) 
				{
					try
					{
						Thread.sleep(1000);
						System.out.println("Rows Data :-"+cell.getText());
					} catch (StaleElementReferenceException e) 
					{
						Thread.sleep(1000);
						List<WebElement> rowdata = driver.findElements(By.xpath("//html//table/tbody/tr/td"));
						for(WebElement row:rowdata) 
						{
							System.out.println("Rows Data :-"+row.getText());
						}
					}
					
				} else
				{
					Thread.sleep(1000);
					System.out.println("No Rows Found in the Table");
				}
			} 
		}
		
	}	

		public void CampaignallStatusDropdown() throws InterruptedException 
		{
			JavascriptExecutor scroll = (JavascriptExecutor) driver;
			scroll.executeScript("window.scrollBy(0, -800);");
			System.out.println("---------------- asdhfasdfsdfasdjh ---------------");
			try {
				Thread.sleep(1000);
				clickonallStatusdropdown.click();
			} catch (org.openqa.selenium.ElementClickInterceptedException e) {
				Thread.sleep(1000);
				clickonallStatusdropdown.click();
			}
			
			String statusname = "Scheduled";
			List<WebElement> Allstatusoption = statusoption;
			for(WebElement allstatusoption:Allstatusoption) 
			{
				String namesofstatus = allstatusoption.getText();
				if(namesofstatus.equalsIgnoreCase(statusname)) 
				{
					allstatusoption.click();
					System.out.println(statusname);
					break;
				} 
			}
			
			for(WebElement apply:applybutton) 
			{
				apply.click();
				break;
			}
	
		}
		
		public void validationofrows() 
		{
			JavascriptExecutor scroll = (JavascriptExecutor) driver;
			scroll.executeScript("window.scrollBy(0, 800);");
			
			List<WebElement> cells = driver.findElements(By.xpath("//html//table/tbody/tr/td"));
			WebElement statusname = cells.get(3);
			System.out.println("Status name :-"+ statusname.getText());
		}

		public void campaignsdropdown() throws InterruptedException 
		{
			JavascriptExecutor scroll = (JavascriptExecutor) driver;
			scroll.executeScript("window.scrollBy(0, -800);");
			Thread.sleep(1000);
			clickoncampaigndropdown.click();
			List<WebElement> Campaignoption = campaignoption;
			for(WebElement option:Campaignoption) 
			{
				String selectoption = option.getText();			
				if(selectoption.equalsIgnoreCase("Recurring")) 
				{
					option.click();
					break;
				}
			}
	
			driver.findElement(By.xpath("(//button[.='Apply'])[2]")).click();	
		}
		
		public void DashboardRowdatavalidation1() throws InterruptedException {
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,700);");
			List<WebElement> nameofrowsdata = rowsdataInaTable;	
			System.out.println("Size of rows :-"+nameofrowsdata.size());
			if(nameofrowsdata.size() > 0)  
			{
				List<WebElement> cells;
				
				WebElement numrows = nameofrowsdata.get(0);
				try 
				{
					cells = numrows.findElements(By.xpath("//html//table/tbody/tr/td"));
				} 
				catch (Exception e) 
				{
					cells = numrows.findElements(By.xpath("//html//table/tbody/tr/td"));
				}
				
				
				for(WebElement cell:cells) {
				
					String NoRows = cell.getText();
					if(!NoRows.equalsIgnoreCase("No Records Found")) 
					{
						try
						{
							Thread.sleep(1000);
							System.out.println("Rows Data :-"+cell.getText());
						} catch (StaleElementReferenceException e) 
						{
							Thread.sleep(1000);
							List<WebElement> rowdata = driver.findElements(By.xpath("//html//table/tbody/tr/td"));
							for(WebElement row:rowdata) 
							{
								System.out.println("Rows Data :-"+row.getText());
							}
						}
						
					} else
					{
						Thread.sleep(1000);
						System.out.println("No Rows Found in the Table");
					}
				} 
			}
			
		}	
	
		public void DatefilterDropdown() throws InterruptedException 
		{
			JavascriptExecutor scroll = (JavascriptExecutor) driver;
			scroll.executeScript("window.scrollBy(0, -800);");
			Thread.sleep(2000);
			clickondatefilterdropdown.click();
			for(WebElement Dateoptions:datedropdownoption) 
			{
				String selectday = Dateoptions.getText();
				if(selectday.equalsIgnoreCase("This Week")) 
				{
					Dateoptions.click();
					break;
				}
			}
			
			driver.findElement(By.xpath("(//button[.='Apply'])[3]")).click();
		}
		
		public void DashboardRowdatavalidation2() throws InterruptedException 
		{			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,700);");			
			List<WebElement> nameofrowsdata = rowsdataInaTable;	
			System.out.println("Size of rows :-"+nameofrowsdata.size());
			if(nameofrowsdata.size() > 0)  
			{
				
				WebElement numrows = nameofrowsdata.get(0);
				List<WebElement> cells = numrows.findElements(By.xpath("//html//table/tbody/tr/td"));
				
				for(WebElement cell:cells) {
				
					String NoRows = cell.getText();
					if(!NoRows.equalsIgnoreCase("No Records Found")) 
					{
						try
						{
							Thread.sleep(1000);
							System.out.println("Rows Data :-"+cell.getText());
						} catch (StaleElementReferenceException e) 
						{
							Thread.sleep(1000);
							List<WebElement> rowdata = driver.findElements(By.xpath("//html//table/tbody/tr/td"));
							for(WebElement row:rowdata) 
							{
								System.out.println("Rows Data :-"+row.getText());
							}
						}
						
					} else
					{
						Thread.sleep(1000);
						System.out.println("No Rows Found in the Table");
					}
				} 
			}
			
		}	
		
		
		public void validatecardsdetails() 
		{
			JavascriptExecutor scroll = (JavascriptExecutor) driver;
			scroll.executeScript("window.scrollBy(0, -800);");
			List<WebElement> DetailedCards = cardsdetails;
			for(WebElement detailedcards:DetailedCards) 
			{
				String GetCardDetails = detailedcards.getText();
				System.out.println("Card Details :-"+GetCardDetails);
			}
		}
		
		public void validatealltabs() 
		{
			JavascriptExecutor scroll = (JavascriptExecutor) driver;
			scroll.executeScript("window.scrollBy(0, 800);");
			for(WebElement Alltab:alltabs)
				{
					String Alltabnamelist = Alltab.getText();
					System.out.println(Alltabnamelist);
				}
		}
}
		



