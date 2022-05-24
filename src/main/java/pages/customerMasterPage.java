package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class customerMasterPage {

	public customerMasterPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Add']")
	WebElement addBtn;
	
	public WebElement addBtn(){
		return addBtn;
	}
	
	@FindBy(id = "name")
	WebElement customerName;
	
	public WebElement customerName(){
		return customerName;
	}
	
	@FindBy(id = "customer_type_id")
	WebElement customerType;
	
	public WebElement customerType(){
		return customerType;
	}
	
	@FindBy(id = "email_id")
	WebElement emailID;
	
	public WebElement emailID(){
		return emailID;
	}
	
	@FindBy(id = "contact_no")
	WebElement contactNumber;
	
	public WebElement contactNumber(){
		return contactNumber;
	}
	
	@FindBy(id = "address")
	WebElement address;
	
	public WebElement address(){
		return address;
	}
	
	@FindBy(id = "pincode")
	WebElement pincode;
	
	public WebElement pincode(){
		return pincode;
	}
	
	@FindBy(id = "country_id")
	WebElement selectCountry;
	
	public WebElement selectCountry(){
		return selectCountry;
	}
	
	@FindBy(id = "state_id")
	WebElement selectState;
	
	public WebElement selectState(){
		return selectState;
	}
	
	@FindBy(id = "city_id")
	WebElement selectCity;
	
	public WebElement selectCity(){
		return selectCity;
	}
	
	@FindBy(id = "remark")
	WebElement enterRemark;
	
	public WebElement enterRemark(){
		return enterRemark;
	}
	
	@FindBy(id = "is_active_1")
	WebElement activeStatus;
	
	public WebElement activeStatus(){
		return activeStatus;
	}
	
	@FindBy(id = "is_active_0")
	WebElement deactiveStatus;
	
	public WebElement deactiveStatus(){
		return deactiveStatus;
	}
	
	@FindBy(xpath = "//button[text()='Create']")
	WebElement createBtn;
	
	public WebElement createBtn(){
		return createBtn;
	}
	
	@FindBy(xpath = "//a[text()='Cancel']")
	WebElement cancelBtn;
	
	public WebElement cancelBtn(){
		return cancelBtn;
	}
	
	@FindBy(xpath = "//div[@id='cell-8-8']//a")
	WebElement editBtn;
	
	public WebElement editBtn(){
		return editBtn;
	}
	
	@FindBy(xpath = "//button[text()='Update']")
	WebElement updateBtn;
	
	public WebElement updateBtn(){
		return updateBtn;
	}
	
	@FindBy(id = "search")
	WebElement searchBar;
	
	public WebElement searchBar(){
		return searchBar;
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
	
	@FindBy(xpath = "//div[@data-sort-id='1']//span")
	WebElement srSort;
	
	public WebElement srSort(){
		return srSort;
	}
	
	@FindBy(xpath = "//div[@data-sort-id='2']//span")
	WebElement nameSort;
	
	public WebElement nameSort(){
		return nameSort;
	}
	
	@FindBy(xpath = "//div[@data-sort-id='3']//span")
	WebElement typeSort;
	
	public WebElement typeSort(){
		return typeSort;
	}
	
	@FindBy(xpath = "//div[@data-sort-id='5']//span")
	WebElement remarkSort;
	
	public WebElement remarkSort(){
		return remarkSort;
	}
	
	@FindBy(xpath = "//div[@data-sort-id='6']//span")
	WebElement updatedBySort;
	
	public WebElement updatedBySort(){
		return updatedBySort;
	}
	
	@FindBy(xpath = "//div[@data-sort-id='7']//span")
	WebElement updatedAtSort;
	
	public WebElement updatedAtSort(){
		return updatedAtSort;
	}
	
	@FindBy(id = "account_for")
	WebElement accountFor;
	
	public WebElement accountFor(){
		return accountFor;
	}
	
	@FindBy(id = "customer_id")
	WebElement selectCustomer;
	
	public WebElement selectCustomer(){
		return selectCustomer;
	}
}

