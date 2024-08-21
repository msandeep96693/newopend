package ObjectPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonUtils.Elementutils;

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

	
	public void Verifycampaigntab() {
		String tabname = "Campaigns";

		String Nameoftab = campaigntab.getText();
		if (Nameoftab.equalsIgnoreCase(tabname)) {
			System.out.println("Campaign tab page is validated");
		} else {
			System.out.println("Campaign tab page is not validated");
		}
	}

	public void searchandvalidateField() 
	{
		
		String searching = "Test diasbled STO setting";
		
		String search = searchfield.getAttribute("placeholder");
		if(search.equalsIgnoreCase("Search by Campaign")) 
		{
		 	searchfield.sendKeys(searching);
			System.out.println("Data entered into the field");
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
	
	public void rows() {
	
	List<WebElement> nameofrowsdata = rowsdataInaTable;	
	int numofrows = nameofrowsdata.size();
	System.out.println(numofrows);

	for(WebElement listofrows:nameofrowsdata) {
		
		
		 String rowsdata = listofrows.getText();
		 System.out.println("Rows data :-"+rowsdata);
}
	
	}	

}
