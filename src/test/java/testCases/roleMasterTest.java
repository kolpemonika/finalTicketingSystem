package testCases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import generic.baseClass;
import pages.departmentMasterPage;
import pages.homePage;
import pages.loginPage;
import pages.roleMasterPage;

public class roleMasterTest extends baseClass{

	@Test
	public void setUp() throws FileNotFoundException, IOException, InterruptedException{
		
		homePage hp = new homePage(driver);
		loginPage lp = new loginPage(driver);
		roleMasterPage rmp = new roleMasterPage(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 
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
		
		hp.masters().click();
		Thread.sleep(2000);
		
		js.executeScript("arguments[0].click();", hp.roleMaster());
		Thread.sleep(2000);
		
		ss.takeScreenShot(driver, "displayRoleMaster");
		Thread.sleep(2000);
	}
	
	@Test(priority = 1)
	public void displayElements(){
		
		roleMasterPage rmp = new roleMasterPage(driver);
		
		String actualHeading = rmp.heading().getText();
		String expectedHeading = " Role Master";
		
		System.out.println("heading of the page is: " +actualHeading);
		
		if(actualHeading == expectedHeading){
			System.out.println("heading is correct");
		}else{
			System.out.println("heading is not correct");
		}
		
		System.out.println("Add button is displayed: " +rmp.addBtn().isDisplayed());
		System.out.println("Edit button is displayed: " +rmp.editBtn().isDisplayed());
		System.out.println("Delete button is displayed: " +rmp.deleteBtn().isDisplayed());
		System.out.println("Search button is displayed: " +rmp.searchBtn().isDisplayed());
		System.out.println("Refresh button is displayed: " +rmp.refreshBtn().isDisplayed());
	
	}
	
	@Test(priority = 2)
	public void addData() throws InterruptedException, IOException{
		
		roleMasterPage rmp = new roleMasterPage(driver);
		
		rmp.addBtn().click();
		Thread.sleep(2000);
		
		System.out.println("Enter Role field is present: " +rmp.labelEnterRole().isDisplayed());
		Thread.sleep(2000);
		
		rmp.enterRole().sendKeys("tester");
		Thread.sleep(2000);
		
		System.out.println("Enter remark field is present: " +rmp.labelEnterRemark().isDisplayed());
		Thread.sleep(2000);
		
		rmp.enterRemark().sendKeys("ok");
		Thread.sleep(2000);
		
		System.out.println("Select status field is present: " +rmp.labelSelectStatus().isDisplayed());
		Thread.sleep(2000);
		
		System.out.println("Radio button active is present: " +rmp.statusActive().isDisplayed());
		Thread.sleep(2000);
		
		rmp.statusActive().click();
		Thread.sleep(2000);
		
		System.out.println("Radio button deactive is present: " +rmp.statusDeactive().isDisplayed());
		Thread.sleep(2000);
		
		//update button
		String actualText = rmp.updateBtn().getText();
		String expectedText = "Add";
		System.out.println("actual text is: "+actualText + " And expected text is: "+expectedText);
				
		if(actualText == expectedText){
			System.out.println("text verify ");
		}else{
			System.out.println("text not verify ");
		}
		Thread.sleep(2000);
		
		System.out.println("cancel button is present: " +rmp.cancelBtn().isDisplayed());
		Thread.sleep(2000);
		
		rmp.updateBtn().click();
		Thread.sleep(2000);
		
		ss.takeScreenShot(driver, "AddRole");		
		
	}
	
	@Test(priority = 2)
	public void editData() throws InterruptedException{
		
		roleMasterPage rmp = new roleMasterPage(driver);
		
		rmp.editBtn().click();
		Thread.sleep(2000);
		
		rmp.enterRole().clear();
		Thread.sleep(2000);
		
		rmp.enterRole().sendKeys("Server and Network Security");
		Thread.sleep(2000);
		
		rmp.enterRemark().clear();
		Thread.sleep(2000);
		
		rmp.enterRemark().sendKeys("ok");
		Thread.sleep(2000);
		
		rmp.updateBtn().click();
		Thread.sleep(2000);
		
		rmp.cancelBtn().click();
		Thread.sleep(2000);
		
	}
	
	@Test(priority = 3)
	public void delete() throws InterruptedException, IOException{
		
		roleMasterPage rmp = new roleMasterPage(driver);
		
		rmp.deleteBtn().click();
		Thread.sleep(2000);
		
		ss.takeScreenShot(driver, "deleteRecord");
		
		if(rmp.deleteBtn().isEnabled()){
			System.out.println("delete button not working");
		}else{
			System.out.println("delete button working");
		}
	}
	
	@Test(priority = 4)
	public void search() throws InterruptedException, IOException{
		 
		roleMasterPage rmp = new roleMasterPage(driver);
		
		rmp.enterSearch().sendKeys("Tester");
		Thread.sleep(2000);
		
		rmp.searchBtn().click();
		Thread.sleep(2000);
		
		ss.takeScreenShot(driver, "searchRecord");
		
		rmp.refreshBtn().click();
		Thread.sleep(2000);
	}
	
	
}
