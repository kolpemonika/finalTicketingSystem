package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class customerMappingPage {

	public customerMappingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "project_id")
	WebElement selectProject;
	
	public WebElement selectProject(){
		return selectProject;
	}
	
	@FindBy(id = "module_id")
	WebElement selectModule;
	
	public WebElement selectModule(){
		return selectModule;
	}
	
	@FindBy(id = "submodule_id")
	WebElement selectSubModule;
	
	public WebElement selectSubModule(){
		return selectSubModule;
	}
	
	@FindBy(id = "query_type_id")
	WebElement selectQueryType;
	
	public WebElement selectQueryType(){
		return selectQueryType;
	}
	
	@FindBy(id = "dynamic_form_id")
	WebElement selectForm;
	
	public WebElement selectForm(){
		return selectForm;
	}
	
	@FindBy(id = "department_id")
	WebElement selectDepartment;
	
	public WebElement selectDepartment(){
		return selectDepartment;
	}
	
	@FindBy(id = "template_id")
	WebElement selectTemplate;
	
	public WebElement selectTemplate(){
		return selectTemplate;
	}
	
	@FindBy(id = "priority")
	WebElement selectPriority;
	
	public WebElement selectPriority(){
		return selectPriority;
	}
	
	@FindBy(id = "approach")
	WebElement selectApproach;
	
	public WebElement selectApproach(){
		return selectApproach;
	}
	
	@FindBy(id = "user_policy")
	WebElement userPolicy;
	
	public WebElement userPolicy(){
		return userPolicy;
	}
	
	@FindBy(xpath = "//button[text()='Add']")
	WebElement settingAddBtn;
	
	public WebElement settingAddBtn(){
		return settingAddBtn;
	}
	
	@FindBy(xpath = "//a[text()='Cancel']")
	WebElement cancelBtn;
	
	public WebElement cancelBtn(){
		return cancelBtn;
	}
	
}
