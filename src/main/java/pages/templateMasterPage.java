package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class templateMasterPage {

	public templateMasterPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Add']")
	WebElement addBtn;
	
	public WebElement addBtn(){
		return addBtn;
	}
	
	@FindBy(id = "template_name")
	WebElement templateName;
	
	public WebElement templateName(){
		return templateName;
	}
	
	@FindBy(name = "calculate_from")
	WebElement calculateFrom;
	
	public WebElement calculateFrom(){
		return calculateFrom;
	}
	
	@FindBy(xpath = "//th[text()=' Basket Name ']")
	WebElement basketNameColumn;
	
	public WebElement basketNameColumn(){
		return basketNameColumn;
	}
	
	@FindBy(xpath = "//th[text()=' Assign To ']")
	WebElement assignToColumn;
	
	public WebElement assignToColumn(){
		return assignToColumn;
	}
	
	@FindBy(xpath = "//th[text()=' Action']")
	WebElement actionColumn;
	
	public WebElement actionColumn(){
		return actionColumn;
	}
	
	@FindBy(xpath = "//button[text()='Create Task']")
	WebElement createTaskBtn;
	
	public WebElement createTaskBtn(){
		return createTaskBtn;
	}
	
	@FindBy(id = "taskName")
	WebElement titleField;
	
	public WebElement titleField(){
		return titleField;
	}
	
	@FindBy(xpath = "//label[text()='No. of Days :']")
	WebElement labelNoOfDays;
	
	public WebElement labelNoOfDays(){
		return labelNoOfDays;
	}
	
	@FindBy(name = "hours")
	WebElement noOfDays;
	
	public WebElement noOfDays(){
		return noOfDays;
	}
	
	@FindBy(name = "days")
	WebElement startTask;
	
	public WebElement startTask(){
		return startTask;
	}
	
	@FindBy(xpath = "//button[text()='Add Task']")
	WebElement addTaskBtn;
	
	public WebElement addTaskBtn(){
		return addTaskBtn;
	}
	
	@FindBy(xpath = "//tr[@id='addr_0']//button")
	WebElement addBasketBtn;
	
	public WebElement addBasketBtn(){
		return addBasketBtn;
	}
	
	@FindBy(name = "basket_name")
	WebElement basketName;
	
	public WebElement basketName(){
		return basketName;
	}
	
	@FindBy(xpath = "//tr[@id='addr_1']//input[@name='basket_name']")
	WebElement basketTwo;
	
	public WebElement basketTwo(){
		return basketTwo;
	}
	
	@FindBy(name = "basket_owner")
	WebElement basketOwnerOne;
	
	public WebElement basketOwnerOne(){
		return basketOwnerOne;
	}
	
	@FindBy(xpath = "//tr[@id='addr_1']//select[@name='basket_owner']")
	WebElement basketOwnerTwo;
	
	public WebElement basketOwnerTwo(){
		return basketOwnerTwo;
	}
	
	@FindBy(xpath = "//button[text()='Submit']")
	WebElement submit;
	
	public WebElement submit(){
		return submit;
	}
	
	@FindBy(xpath = "//div[@class='col-md-3 mb-2'][2]//input[@id='taskName']")
	WebElement taskTwo;
	
	public WebElement taskTwo(){
		return taskTwo;
	}
	
}
