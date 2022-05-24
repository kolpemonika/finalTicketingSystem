package testCases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import generic.baseClass;
import junit.framework.Assert;
import pages.TypeMasterPage;
import pages.departmentMasterPage;
import pages.homePage;
import pages.loginPage;

public class TypeMasterTest extends baseClass{

	@Test
	public void setUp() throws FileNotFoundException, IOException, InterruptedException{
		
		homePage hp = new homePage(driver);
		loginPage lp = new loginPage(driver);
		departmentMasterPage dmp = new departmentMasterPage(driver);
		 
		driver.get(p.toReadDataFromPropertyFile("url"));
		Thread.sleep(2000);
		
		lp.emailAddress().sendKeys(p.toReadDataFromPropertyFile("userName"));
		Thread.sleep(2000);
		
		lp.password().sendKeys(p.toReadDataFromPropertyFile("password"));
		Thread.sleep(2000);
		
		lp.login().click();
		Thread.sleep(2000);
		
		driver.get(p.toReadDataFromPropertyFile("url"));
		Thread.sleep(2000);
		
	}
	
	@Test(priority = 10)
	public void TC_153(){
		
		homePage hp = new homePage(driver);
		
		System.out.println("Masters menu is present: " +hp.masters().isDisplayed());
		System.out.println("Text is : " +hp.masters().getText());
		
	}
	
	@Test(priority = 20)
	public void TC_154() throws InterruptedException{
		
		homePage hp = new homePage(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		hp.masters().click();
		Thread.sleep(2000);
		
		//js.executeScript("window.scrollBy(0, 300)", hp.typeMaster());
		
		System.out.println("Type Master menu is present: " +hp.typeMaster().isDisplayed());
		System.out.println("Text is : " +hp.typeMaster().getText());
		
	}
	
	@Test(priority = 30)
	public void TC_155() throws InterruptedException{
		
		homePage hp = new homePage(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		String actualURL = driver.getCurrentUrl();
		System.out.println("Current URL is: " +actualURL);
		
		js.executeScript("arguments[0].click()", hp.typeMaster());
		Thread.sleep(2000);
		
		String expectedURL = driver.getCurrentUrl();
		System.out.println("Expected URL is: " +expectedURL);
		
	}
	
	@Test(priority = 40)
	public void TC_156() throws InterruptedException{
		
		TypeMasterPage tmp = new TypeMasterPage(driver);
		
		System.out.println("Add button is present: " +tmp.addBtn().isDisplayed());
		
	}
	
	@Test(priority = 50)
	public void TC_157() throws InterruptedException{
		
		TypeMasterPage tmp = new TypeMasterPage(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		String actualURL = driver.getCurrentUrl();
		System.out.println("Current URL is: " +actualURL);
		
		js.executeScript("arguments[0].click()", tmp.addBtn());
		Thread.sleep(2000);
		
		String expectedURL = driver.getCurrentUrl();
		System.out.println("Expected URL is: " +expectedURL);
		
	}
	
	@Test(priority = 60)
	public void TC_158() throws InterruptedException{
		
		TypeMasterPage tmp = new TypeMasterPage(driver);
		
		System.out.println("Enter Type Name Field is present: " +tmp.enterTypeName().isDisplayed());
		
	}
	
	@Test(priority = 70)
	public void TC_159() throws InterruptedException{
		
		TypeMasterPage tmp = new TypeMasterPage(driver);
		
		System.out.println("Enter Remark Field is present: " +tmp.enterRemark().isDisplayed());
		
	}
	
	@Test(priority = 80)
	public void TC_160() throws InterruptedException{
		
		TypeMasterPage tmp = new TypeMasterPage(driver);
		
		System.out.println("Select Status Field is present: " +tmp.isActive().isDisplayed());
		
	}
	
	@Test(priority = 90)
	public void TC_161() throws InterruptedException{
		
		TypeMasterPage tmp = new TypeMasterPage(driver);
		
		tmp.enterTypeName().sendKeys("IT company");
		Thread.sleep(2000);
		
		tmp.enterRemark().sendKeys("test it");
		Thread.sleep(2000);
		
		tmp.isActive().click();
		Thread.sleep(2000);
		
		tmp.submitBtn().click();
		
	}
}
