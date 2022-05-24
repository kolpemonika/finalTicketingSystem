package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

	public loginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@alt='login-img']")
	WebElement logo;
	
	public WebElement logo(){
		return logo;
	}
	
	@FindBy(id = "email")
	WebElement emailAddress;
	
	public WebElement emailAddress(){
		return emailAddress;
	}
	
	@FindBy(id = "password")
	WebElement password;
	
	public WebElement password(){
		return password;
	}
	
	@FindBy(id = "login")
	WebElement login;
	
	public WebElement login(){
		return login;
	}
}
