package ObjectPage;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import CommonUtils.CommonBase;

public class createcampaignpage  extends CommonBase {
	
	WebDriver driver;
	
	public createcampaignpage(WebDriver driver) {
		super(driver);
	}

	/* ------------------- Define Campaign page ----------------------------------------*/						
	
	@FindBy(xpath = "(//ul)[1]/li/a") private List<WebElement> sidemenu;						
	@FindBy(xpath = "//button[.='New Campaign']") private WebElement newcontactbutton;						
	@FindBy(xpath = "(//select[@formcontrolname='DropdownControl'])[1]") private WebElement Advertiserdrop;						
	@FindBy(xpath = "(//input[@placeholder='Max 100 Characters'])[1]") private WebElement campaignName;						
	@FindBy(xpath = "(//select[@formcontrolname='DropdownControl'])[2]") private WebElement campaignGroupDrop;						
	@FindBy(xpath = "(//input[@formcontrolname='radio'])[3]") private WebElement advertiserFreeCostType;						
	@FindBy(xpath = "(//input[@formcontrolname='radio'])[4]") private WebElement advertiserPaidCostType;						
	@FindBy(xpath = "(//select[@formcontrolname='DropdownControl'])[3]") private WebElement countryDrop;						
	@FindBy(xpath = "(//select[@formcontrolname='DropdownControl'])[4]") private WebElement audiencetypeDrop;						
	@FindBy(xpath = "//input[@placeholder='Select Campaign Sector']") private WebElement campaignsector;						
	@FindBy(xpath = "//input[@placeholder='Search']") private WebElement searchcampaignsector;						
	@FindBy(xpath = "//label[.='Select All']") private WebElement selectallcheckbox;						
	@FindBy(xpath = "//button[.='Select']") private WebElement selectbutton;						
	@FindBy(xpath = "//input[@placeholder='Select Publisher']") private WebElement publisher;						
	@FindBy(xpath = "//input[@placeholder='Search']") private WebElement searchpublisher;						
	@FindBy(xpath = "//label[.='Select All']") private WebElement selectallcheckbox1;						
	@FindBy(xpath = "//button[.='Select']") private WebElement selectbutton1;						
	@FindBy(xpath = "(//input[@formcontrolname='radio'])[8]") private WebElement publisherFreeCostType;						
	@FindBy(xpath = "(//input[@formcontrolname='radio'])[9]") private WebElement publisherPaidCostType;						
	@FindBy(xpath = "//input[@placeholder='Select Suppression List']") private WebElement suppressionList;						
	@FindBy(xpath = "//input[@placeholder='Search']") private WebElement searchsuppression;						
	@FindBy(xpath = "//label[.='Select All']") private WebElement selectallcheckbox2;						
	@FindBy(xpath = "//button[.='Select']") private WebElement selectbutton2;						
	@FindBy(xpath = "//button[.=' Proceed ']") private WebElement proceedbutton;						
							
							
	/*---------------------------Define Template -----------------------------------*/		
	
	@FindBy(xpath = "(//input[@formcontrolname='radio'])[11]") private WebElement ABsplitradiobutton;
	@FindBy(xpath = "(//select[@formcontrolname='DropdownControl'])[5]") private WebElement ABsplitypedropdown;
	@FindBy(xpath = "(//select[@formcontrolname='DropdownControl'])[6]") private WebElement Fromnamedropdown;
	@FindBy(xpath = "//input[@placeholder='Max 150 Characters']") private List<WebElement> ABsplitsubjecttextfields;
	@FindBy(xpath = "//label[@class='input-group-text']") private WebElement ABsplituploadfilefield;
	@FindBy(xpath = "//input[@type='checkbox']") private WebElement ABsplitsavecreativecheckbox;
							
	@FindBy(xpath = "//input[@placeholder='Max 150 Characters']") private List<WebElement> Regularsubjecttextfields;						
	@FindBy(xpath = "(//input[@placeholder='Max 100 Characters'])[2]") private WebElement preheader1textfield;
	@FindBy(xpath = "(//input[@placeholder='Max 100 Characters'])[3]") private WebElement preheader2textfield;
	
	@FindBy(xpath = "//label[@class='input-group-text']") private WebElement Regularuploadfilefield;
	
	@FindBy(xpath = "//button[.='Creatives ']") private WebElement creativebutton;						
	@FindBy(xpath = "((//div)[269]/table/tbody/tr[1]/td/container-element)") private List<WebElement> creativetemplate;						
//	@FindBy(xpath = "((//div)[269]/table/tbody/tr[1]/td/container-element)") private List<WebElement> 1stRowTemplate;						
	@FindBy(xpath = "//input[@type='checkbox']") private WebElement Regularsavecreativecheckbox;						
	@FindBy(xpath = "(//select[@formcontrolname='DropdownControl'])[8]") private WebElement creativegroupDrop;						
	@FindBy(xpath = "//input[@placeholder='Enter your Creative Name']") private WebElement creativeNametextfield;						
	@FindBy(xpath = "(//button[.=' Next '])[1]") private WebElement Nextbutton;						
							
							
	/*---------------------------Choose audience -------------------------------------*/						
//	@FindBy(xpath = "") private WebElement						
//	@FindBy(xpath = "") private WebElement						
//	@FindBy(xpath = "") private WebElement						
//	@FindBy(xpath = "") private WebElement						
//	@FindBy(xpath = "") private WebElement						
//	@FindBy(xpath = "") private WebElement						
//	@FindBy(xpath = "") private WebElement						
//							
//	/*-----------------------------              ---------------------------------------------*/						
//	@FindBy(xpath = "") private WebElement						
//	@FindBy(xpath = "") private WebElement						
//	@FindBy(xpath = "") private WebElement						
//	@FindBy(xpath = "") private WebElement						
//	@FindBy(xpath = "") private WebElement						
//	@FindBy(xpath = "") private WebElement						
							
							
	/*  ------------------------------------ 1st  STEP ----------------------------------------*/						
							
							
	public void leftnavigationbar() {						
		List<WebElement> menu = sidemenu;					
		for(WebElement sidebar:menu) {					
			String Text = sidebar.getText();				
			if(Text.equalsIgnoreCase("Campaigns")) {				
				sidebar.click();			
				break;			
			}				
		}					
	}						
							
	public void clickNewcampaign() {						
		newcontactbutton.click();					
	}						
							
	public void advertiserDropdown() {						
		Select sel = new Select(Advertiserdrop);					
		sel.deselectByVisibleText("Known ltd(lukefairbrass36@hotmail.com) ");					
		List<WebElement> listofOptions = sel.getOptions();					
		for(WebElement option:listofOptions) {					
			String text = option.getText();				
			if(text.equals("Known ltd(lukefairbrass36@hotmail.com) ")) {				
				option.click();			
				break;			
				}			
			System.out.println("Selected Advertiser is Correct");				
		}					
	}						
							
	public void EntercampaignNameintofield() {						
		campaignName.sendKeys("Create campaign");					
	}						
							
	public void campaigngroupDropdown() {						
		Select sel1 = new Select(campaignGroupDrop);					
		sel1.selectByVisibleText("Default ");					
							
	}						
							
	public void selectadvertiserfreecosttype() {						
		advertiserFreeCostType.click();					
	}						
							
	public void selectadvertiserpaidcosttype() {						
		advertiserPaidCostType.click();					
	}						
							
	public void campaigncountryDrop() {						
		Select sel1 = new Select(countryDrop);					
		sel1.selectByVisibleText("United Kingdom ");					
		sel1.selectByVisibleText("United States ");					
		List<WebElement> listofOptions = sel1.getOptions();					
		for(WebElement option:listofOptions) {					
			String text = option.getText();				
			if(text.equals("United Kingdom ")) {				
				option.click();			
				System.out.println("Selected country is Correct");			
				break;			
			} else {				
				System.out.println("Selected Audience type is not correct");			
			}				
		}					
	}						
							
	public void audiencetypeDrop() {						
		Select sel2 = new Select(audiencetypeDrop);					
		sel2.selectByVisibleText("UK Consumer Data ");					
		List<WebElement> listofOptions = sel2.getOptions();					
		for(WebElement option:listofOptions) {					
			String text=option.getText();				
			if(text.equalsIgnoreCase("UK Consumer Data ")) {				
				option.click();			
				System.out.println("Selected Audience type is correct");			
				break;			
			}else {				
				System.out.println("Selected Audience type is not correct");			
			}				
		}					
	}						
							
	public void campaignsectorpopup() {						
		campaignsector.click();					
		Set<String> Pid = driver.getWindowHandles();					
		for(String Cid : Pid) {					
			driver.switchTo().window(Cid);				
		}					
	}						
							
	public void campaignsectorpopup1() {						
//		searchcampaignsector.sendKeys("Online Betting");					
		selectallcheckbox.click();					
		selectbutton.click();					
							
	}						
							
	public void publisherpopup() {						
		publisher.click();					
		Set<String> Pid = driver.getWindowHandles();					
		for(String Cid:Pid) {					
			driver.switchTo().window(Cid);				
		}					
	}						
							
	public void publisherpopup1() {						
//		searchpublisher.sendKeys("");					
		selectallcheckbox1.click();					
		selectbutton1.click();					
	}						
							
	public void selectpublisherfreecosttype() {						
		publisherFreeCostType.click();					
	}						
							
	public void selectpublisherpaidfreecosttype() {						
		publisherPaidCostType.click();					
	}						
							
	public void Suppressionlistpopup() {						
		suppressionList.click();					
		Set<String> Pid = driver.getWindowHandles();					
		for(String Cid:Pid) {					
			driver.switchTo().window(Cid);				
		}					
	}						
							
	public void Suppressionpopup1() {						
//		searchsuppression.sendKeys("");					
		selectallcheckbox2.click();					
		selectbutton2.click();					
	}						
							
	public void clickproceedbutton() {						
		proceedbutton.click();					
	}						
							
	/*-----------------------------------------------2nd STEP -------------------------------------*/						
							
	public void Entersubjecttextfield() {						
		Regularsavecreativecheckbox.sendKeys("");					
	}						
							
	public void EnterpreheaderTextfield() {						
		preheader1textfield.sendKeys("");					
	}						
							
	public void ClickOnCreativeButton() {						
		creativebutton.click();					
		Set<String> Pid = driver.getWindowHandles();					
		for(String Cid:Pid) {					
			driver.switchTo().window(Cid);				
		}					
	}						
							
	public void selectTemplateFromList() {						
		List<WebElement> list = creativetemplate;					
		for(WebElement columoption:list) {					
			String text = columoption.getText();				
			if(text.equalsIgnoreCase("Select")) {				
				columoption.click();			
				break;			
			}				
		}					
		}					
							
	public void clickonsavecreativecheckbox() {						
		Regularsavecreativecheckbox.click();					
	}						
							
	public void selectcreativegroupDrop() {						
		Select sel3 = new Select(creativegroupDrop); 					
							
		
	
	}						
	

}

