package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class countryMasterPage {

	public countryMasterPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h2[text()='Country Master']")
	WebElement heading;
	
	public WebElement heading(){
		return heading;
	}
	
	@FindBy(xpath = "//a[text()='Add']")
	WebElement addBtn;
	
	public WebElement addBtn(){
		return addBtn;
	}
}
