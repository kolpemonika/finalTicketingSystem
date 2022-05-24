package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {

	public homePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@role='button']//img[@alt='profile']")
	WebElement profile;
	
	public WebElement profile(){
		return profile;
	}
	
	@FindBy(xpath = "//span[text()='Masters']")
	WebElement masters;
	
	public WebElement masters(){
		return masters;
	}
	
	@FindBy(xpath = "//div[@class='header']//a//i")
	WebElement notificationBell;
	
	public WebElement notificationBell(){
		return notificationBell;
	}
	
	@FindBy(xpath = "//a[text()=' View all notifications']")
	WebElement viewAllNotification;
	
	public WebElement viewAllNotification(){
		return viewAllNotification;
	}
	
	@FindBy(xpath = "//a[@role='button']//img[@alt='profile']")
	WebElement profilePic;
	
	public WebElement profilePic(){
		return profilePic;
	}
	
	//Status Master
	@FindBy(xpath = "//span[text()='Status Master']")
	WebElement statusMaster;
	
	public WebElement statusMaster(){
		return statusMaster;
	}
	
	//Department Master
	@FindBy(xpath = "//span[text()='Department Master']")
	WebElement departmentMaster;
	
	public WebElement departmentMaster(){
		return departmentMaster;
	}
	
	//Role Master
	@FindBy(xpath = "//span[text()='Role Master']")
	WebElement roleMaster;
	
	public WebElement roleMaster(){
		return roleMaster;
	}
	
	//Country Master
	@FindBy(xpath = "//span[text()='Country Master']")
	WebElement countryMaster;
	
	public WebElement countryMaster(){
		return countryMaster;
	}
	
	@FindBy(xpath = "//span[text()='Reports']")
	WebElement reportMenu;
	
	public WebElement reportMenu(){
		return reportMenu;
	}
	
	@FindBy(xpath = "//span[text()='Resource Planning Report']")
	WebElement resourcePlanningReport;
	
	public WebElement resourcePlanningReport(){
		return resourcePlanningReport;
	}
	
	@FindBy(xpath = "//span[text()='Template Master']")
	WebElement templateMaster;
	
	public WebElement templateMaster(){
		return templateMaster;
	}
	
	@FindBy(xpath = "//span[text()='Customer Type Master']")
	WebElement typeMaster;
	
	public WebElement typeMaster(){
		return typeMaster;
	}
	
	@FindBy(xpath = "//span[text()='Tenant Master']")
	WebElement tenantMaster;
	
	public WebElement tenantMaster(){
		return tenantMaster;
	}
	
	@FindBy(xpath = "//span[text()='User Task Report']")
	WebElement userTaskReportMenu;
	
	public WebElement userTaskReportMenu(){
		return userTaskReportMenu;
	}
	
	@FindBy(xpath = "//span[text()='Customer Master']")
	WebElement customerMaster;
	
	public WebElement customerMaster(){
		return customerMaster;
	}
	
	@FindBy(xpath = "//span[text()='User Master']")
	WebElement userMaster;
	
	public WebElement userMaster(){
		return userMaster;
	}
	
	@FindBy(xpath = "//span[text()='Setting']")
	WebElement setting;
	
	public WebElement setting(){
		return setting;
	}
	
	@FindBy(xpath = "//span[text()='Customer Mapping']")
	WebElement customerMapping;
	
	public WebElement customerMapping(){
		return customerMapping;
	}
}
