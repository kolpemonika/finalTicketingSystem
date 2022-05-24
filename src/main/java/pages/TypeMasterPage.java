package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TypeMasterPage {

	public TypeMasterPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Add']")
	WebElement addBtn;
	
	public WebElement addBtn(){
		return addBtn;
	}
	
	@FindBy(id = "type_name")
	WebElement enterTypeName;
	
	public WebElement enterTypeName(){
		return enterTypeName;
	}
	
	@FindBy(id = "remark")
	WebElement enterRemark;
	
	public WebElement enterRemark(){
		return enterRemark;
	}
	
	@FindBy(id = "is_active_1")
	WebElement isActive;
	
	public WebElement isActive(){
		return isActive;
	}
	
	@FindBy(id = "is_active_0")
	WebElement isDeactive;
	
	public WebElement isDeactive(){
		return isDeactive;
	}
	
	@FindBy(xpath = "//button[text()='Submit']")
	WebElement submitBtn;
	
	public WebElement submitBtn(){
		return submitBtn;
	}
}
