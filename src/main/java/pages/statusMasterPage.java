package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class statusMasterPage {

	public statusMasterPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Add']")
	WebElement addBtn;
	
	public WebElement addBtn(){
		return addBtn;
	}
	
	@FindBy(xpath = "//b[text()='Enter Status :']")
	WebElement labelEnterStatus;
	
	public WebElement labelEnterStatus(){
		return labelEnterStatus;
	}
	
	@FindBy(id = "status")
	WebElement enterStatus;
	
	public WebElement enterStatus(){
		return enterStatus;
	}
	
	@FindBy(xpath = "//b[text()='Enter Remark :']")
	WebElement labelEnterRemark;
	
	public WebElement labelEnterRemark(){
		return labelEnterRemark;
	}
	
	@FindBy(id = "remark")
	WebElement enterRemark;
	
	public WebElement enterRemark(){
		return enterRemark;
	}
	
	@FindBy(xpath = "//b[text()='Select Status :']")
	WebElement labelSelectStatus;
	
	public WebElement labelSelectStatus(){
		return labelSelectStatus;
	}
	
	@FindBy(id = "is_active_1")
	WebElement yesRadio;
	
	public WebElement yesRadioBtn(){
		return yesRadio;
	}
	
	@FindBy(xpath = "//button[text()='Update']")
	WebElement updateBtn;
	
	public WebElement updateBtn(){
		return updateBtn;
	}
	
	@FindBy(xpath = "//a[text()='Cancel']")
	WebElement cancelBtn;
	
	public WebElement cancelBtn(){
		return cancelBtn;
	}
	
	@FindBy(xpath = "//a[@href='/TicketDevelopment/Status/Edit/19']")
	WebElement editBtn;
	
	public WebElement editBtn(){
		return editBtn;
	}
	
	@FindBy(xpath = "//div[@id='cell-6-19']//button")
	WebElement deleteBtn;
	
	public WebElement deleteBtn(){
		return deleteBtn;
	}
}
