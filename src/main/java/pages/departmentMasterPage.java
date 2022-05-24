package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class departmentMasterPage {

	public departmentMasterPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h2[text()='Department Master']")
	WebElement heading;
	
	public WebElement heading(){
		return heading;
	}
	
	@FindBy(xpath = "//a[text()='Add']")
	WebElement addBtn;
	
	public WebElement addBtn(){
		return addBtn;
	}
	
	@FindBy(id = "department")
	WebElement enterDepartment;
	
	public WebElement enterDepartment(){
		return enterDepartment;
	}
	
	@FindBy(id = "remark")
	WebElement enterRemark;
	
	public WebElement enterRemark(){
		return enterRemark;
	}
	
	@FindBy(id = "is_active_1")
	WebElement selectStatus;
	
	public WebElement selectStatus(){
		return selectStatus;
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
	
	@FindBy(xpath = "//div[@id='cell-6-8']//a")
	WebElement editBtn;
	
	public WebElement editBtn(){
		return editBtn;
	}
	
	@FindBy(xpath = "//div[@id='cell-6-8']//button")
	WebElement deleteBtn;
	
	public WebElement deleteBtn(){
		return deleteBtn;
	}
	
	@FindBy(id = "search")
	WebElement search;
	
	public WebElement search(){
		return search;
	}
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement searchBtn;
	
	public WebElement searchBtn(){
		return searchBtn;
	}
	
	@FindBy(xpath = "//i[@class='icofont-refresh']")
	WebElement refreshBtn;
	
	public WebElement refreshBtn(){
		return refreshBtn;
	}
	
}
