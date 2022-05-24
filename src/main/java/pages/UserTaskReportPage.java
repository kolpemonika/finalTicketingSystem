package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserTaskReportPage {

	public UserTaskReportPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "from_date")
	WebElement fromDate;
	
	public WebElement fromDate(){
		return fromDate;
	}
	
	@FindBy(name = "to_date")
	WebElement toDate;
	
	public WebElement toDate(){
		return toDate;
	}
	
	@FindBy(id = "react-select-2-input")
	WebElement selectUser;
	
	public WebElement selectUser(){
		return selectUser;
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
	
	@FindBy(name = "task_name")
	WebElement taskName;
	
	public WebElement taskName(){
		return taskName;
	}
	
	@FindBy(xpath = "//div[text()='Sr']")
	WebElement srColumn;
	
	public WebElement srColumn(){
		return srColumn;
	}
	
	@FindBy(xpath = "//div[text()='Ticket Id']")
	WebElement ticketIDColumn;
	
	public WebElement ticketIDColumn(){
		return ticketIDColumn;
	}
	
	@FindBy(xpath = "//div[text()='Task Name']")
	WebElement taskNameColumn;
	
	public WebElement taskNameColumn(){
		return taskNameColumn;
	}
	
	@FindBy(xpath = "//div[text()='User Name']")
	WebElement userNameColumn;
	
	public WebElement userNameColumn(){
		return userNameColumn;
	}
	
	@FindBy(xpath = "//div[text()='Task Status']")
	WebElement taskStatusColumn;
	
	public WebElement taskStatusColumn(){
		return taskStatusColumn;
	}
	
	@FindBy(xpath = "//div[text()='Total Worked']")
	WebElement totalWorkedColumn;
	
	public WebElement totalWorkedColumn(){
		return totalWorkedColumn;
	}
	
	@FindBy(xpath = "//div[text()='Updated At']")
	WebElement updatedAtColumn;
	
	public WebElement updatedAtColumn(){
		return updatedAtColumn;
	}
	
	@FindBy(xpath = "//button[text()=' Export']")
	WebElement exportBtn;
	
	public WebElement exportBtn(){
		return exportBtn;
	}
	
}
