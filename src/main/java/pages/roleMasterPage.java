package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class roleMasterPage {

	public roleMasterPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h2[text()='Role Master']")
	WebElement heading;
	
	public WebElement heading(){
		return heading;
	}
	
	//Add Button
	@FindBy(xpath = "//a[text()='Add']")
	WebElement addBtn;
	
	public WebElement addBtn(){
		return addBtn;
	}
	
	//Edit Button
	@FindBy(xpath = "//div[@id='cell-6-10']//a")
	WebElement editBtn;
	
	public WebElement editBtn(){
		return editBtn;
	}
	
	//deleteButton
	@FindBy(xpath = "//div[@id='cell-6-10']//button")
	WebElement deleteBtn;
	
	public WebElement deleteBtn(){
		return deleteBtn;
	}
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement searchBtn;
	
	public WebElement searchBtn(){
		return searchBtn;
	}
	
	@FindBy(className = "icofont-refresh")
	WebElement refreshBtn;
	
	public WebElement refreshBtn(){
		return refreshBtn;
	}
	
	@FindBy(xpath = "//b[text()='Enter Role :']")
	WebElement labelEnterRole;
	
	public WebElement labelEnterRole(){
		return labelEnterRole;
	}
	
	@FindBy(id = "role")
	WebElement enterRole;
	
	public WebElement enterRole(){
		return enterRole;
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
	WebElement statusActive;
	
	public WebElement statusActive(){
		return statusActive;
	}
	
	@FindBy(id = "is_active_0")
	WebElement statusDeactive;
	
	public WebElement statusDeactive(){
		return statusDeactive;
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
	
	@FindBy(id = "search")
	WebElement enterSearch;
	
	public WebElement enterSearch(){
		return enterSearch;
	}
	
	
}
