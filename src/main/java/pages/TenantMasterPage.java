package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TenantMasterPage {
	
	public TenantMasterPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Add']")
	WebElement addBtn;
	
	public WebElement addBtn(){
		return addBtn;
	}
	
	@FindBy(id = "company_name")
	WebElement companyName;
	
	public WebElement companyName(){
		return companyName;
	}
	
	@FindBy(id = "company_type")
	WebElement companyType;
	
	public WebElement companyType(){
		return companyType;
	}
	
	@FindBy(id = "email_id")
	WebElement emailID;
	
	public WebElement emailID(){
		return emailID;
	}
	
	@FindBy(id = "contact_no")
	WebElement contactNo;
	
	public WebElement contactNo(){
		return contactNo;
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
	
	@FindBy(xpath = "//button[text()='Update']")
	WebElement updateBtn;
	
	public WebElement updateBtn(){
		return updateBtn;
	}
	
	@FindBy(id = "remark")
	WebElement remark;
	
	public WebElement remark(){
		return remark;
	}
	
	@FindBy(xpath = "//button[text()='Update']")
	WebElement addTenantBtn;
	
	public WebElement addTenantBtn(){
		return addTenantBtn;
	}
	
	@FindBy(xpath = "//a[text()='Cancel']")
	WebElement cancelBtn;
	
	public WebElement cancelBtn(){
		return cancelBtn;
	}
	
	@FindBy(xpath = "//div[@id='cell-7-9']//a")
	WebElement editBtn;
	
	public WebElement editBtn(){
		return editBtn;
	}
	
	@FindBy(xpath = "//div[text()='Action']")
	WebElement actionColumn;
	
	public WebElement actionColumn(){
		return actionColumn;
	}
	
	@FindBy(xpath = "//i[@class='icofont-refresh']")
	WebElement refreshBtn;
	
	public WebElement refreshBtn(){
		return refreshBtn;
	}
	
	@FindBy(id = "search")
	WebElement search;
	
	public WebElement search(){
		return search;
	}
	

	@FindBy(xpath = "//i[@class='icofont-search-1']")
	WebElement searchBtn;
	
	public WebElement searchBtn(){
		return searchBtn;
	}
	
	@FindBy(id = "remark")
	WebElement enterRemark;
	
	public WebElement enterRemark(){
		return enterRemark;
	}
	
	@FindBy(xpath = "//div[text()='Sr']")
	WebElement srColumn;
	
	public WebElement srColumn(){
		return srColumn;
	}
	
	@FindBy(xpath = "//div[@role='columnheader']//span[text()='▲'][1]")
	WebElement srSort;
	
	public WebElement srSort(){
		return srSort;
	}
	
	@FindBy(xpath = "//div[text()='Name']")
	WebElement nameColumn;
	
	public WebElement nameColumn(){
		return nameColumn;
	}
	
	@FindBy(xpath = "//div[@data-column-id='2'][1]//span")
	WebElement nameSort;
	
	public WebElement nameSort(){
		return nameSort;
	}
	
	@FindBy(xpath = "//div[text()='Type']")
	WebElement typeColumn;
	
	public WebElement typeColumn(){
		return typeColumn;
	}
	
	@FindBy(xpath = "//div[@data-column-id='3'][1]//span")
	WebElement typeSort;
	
	public WebElement typeSort(){
		return typeSort;
	}
	
	@FindBy(xpath = "//div[text()='Remark']")
	WebElement remarkColumn;
	
	public WebElement remarkColumn(){
		return remarkColumn;
	}
	
	@FindBy(xpath = "//div[@data-column-id='4'][1]//span")
	WebElement remarkSort;
	
	public WebElement remarkSort(){
		return remarkSort;
	}
	
	@FindBy(xpath = "//div[text()='Updated By']")
	WebElement updatedByColumn;
	
	public WebElement updatedByColumn(){
		return updatedByColumn;
	}
	
	@FindBy(xpath = "//div[@data-column-id='5'][1]//span")
	WebElement updatedBySort;
	
	public WebElement updatedBySort(){
		return updatedBySort;
	}
	
	@FindBy(xpath = "//div[text()='Updated At']")
	WebElement updatedAtColumn;
	
	public WebElement updatedAtColumn(){
		return updatedAtColumn;
	}
	
	@FindBy(xpath = "//div[@data-column-id='6'][1]//span")
	WebElement updatedAtSort;
	
	public WebElement updatedAtSort(){
		return updatedAtSort;
	}
	
	@FindBy(xpath = "//div[text()='Action']")
	WebElement actionColumn1;
	
	public WebElement actionColumn1(){
		return actionColumn1;
	}
	

}
