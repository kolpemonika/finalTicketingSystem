package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class resourcePlanningReportPage {

	public resourcePlanningReportPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='col-md-3']//div[1]")
	List<WebElement> selectUser;
	
	public List<WebElement> selectUser(){
		return selectUser;
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
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement searchBtn;
	
	public WebElement searchBtn(){
		return searchBtn;
	}
	
	@FindBy(xpath = "//div[@class='col-md-2']//button[2]")
	WebElement reloadBtn;
	
	public WebElement reloadBtn(){
		return reloadBtn;
	}
	
	@FindBy(xpath = "//div[@class='col-md-3'][1]//div[2]//div")
	WebElement dropdownArrowBtn;
	
	public WebElement dropdownArrowBtn(){
		return dropdownArrowBtn;
	}
	
	@FindBy(xpath = "//button[text()=' Export']")
	WebElement exportBtn;
	
	public WebElement exportBtn(){
		return exportBtn;
	}
}
