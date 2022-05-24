package testCases;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic.baseClass;
import pages.departmentMasterPage;
import pages.homePage;
import pages.loginPage;



public class departmentMasterTest extends baseClass {
	
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
		
		hp.masters().click();
		Thread.sleep(2000);
		
		hp.departmentMaster().click();
		Thread.sleep(2000);
		
		ss.takeScreenShot(driver, "displayDepartmentMaster");
		Thread.sleep(2000);
	}
	
	@Test(priority = 1)
	public void displayElements() throws InterruptedException{
		homePage hp = new homePage(driver);
		loginPage lp = new loginPage(driver);
		departmentMasterPage dmp = new departmentMasterPage(driver);
		
		//departmentMaster
		if(hp.departmentMaster().isDisplayed()){
			System.out.println("department master is present");
		}else{
			System.out.println("department master not present");
		}
		Thread.sleep(2000);
		
		//add button
		if(dmp.addBtn().isDisplayed()){
			System.out.println("add button is displayed");
		}else{
			System.out.println("add button not displayed");
		}
		Thread.sleep(2000);
		
		//edit button
		System.out.println("edit button is display: " +dmp.editBtn().isDisplayed());
		
		//search button
		System.out.println("search button is display: " +dmp.search().isDisplayed());
		
		System.out.println("refresh button is display: " +dmp.refreshBtn().isDisplayed());
		
		
	}
	
	@Test(priority = 2)
	public void verifyHeading() throws InterruptedException, IOException{
		
		homePage hp = new homePage(driver);
		loginPage lp = new loginPage(driver);
		departmentMasterPage dmp = new departmentMasterPage(driver);
		
		String actualHeading = "Department Master";
		String expectedHeading = dmp.heading().getText();
		
		Assert.assertEquals(actualHeading, expectedHeading);
		
		//click on add button 
		dmp.addBtn().click();
		Thread.sleep(2000);
		
		ss.takeScreenShot(driver, "addDepartmentPage");
		Thread.sleep(2000);
		
		//enter department
		dmp.enterDepartment().sendKeys("IT testing");
		Thread.sleep(2000);
		
		dmp.enterRemark().sendKeys("ok");
		Thread.sleep(2000);
		
		dmp.selectStatus().click();
		Thread.sleep(2000);
		
		//update button
		String actualText = dmp.updateBtn().getText();
		String expectedText = "Add";
		System.out.println("actual text is: "+actualText + " And expected text is: "+expectedText);
		
		//Assert.assertEquals(actualText, expectedText);
		if(actualText == expectedText){
			System.out.println("text verify ");
		}else{
			System.out.println("text not verify ");
		}
		Thread.sleep(2000);
		
		System.out.println("cancel button is display: " +dmp.cancelBtn().isDisplayed());
		dmp.cancelBtn().click();
		
		//edit button
		if(dmp.editBtn().isDisplayed()){
			System.out.println("edit button is present");
		}else{
			System.out.println("edit button not present");
		}
		
		Thread.sleep(2000);
		
		dmp.editBtn().click();
		Thread.sleep(2000);
		
		//enter remark
		dmp.enterRemark().clear();
		Thread.sleep(2000);
		
		dmp.enterRemark().sendKeys("InTech");
		Thread.sleep(2000);
		
		dmp.updateBtn().click();
		Thread.sleep(2000);
		
		ss.takeScreenShot(driver, "updateDepartment");
		
		//cancel button
		dmp.cancelBtn().click();
		Thread.sleep(2000);
		
		//delete button
		dmp.deleteBtn().click();
		Thread.sleep(2000);
		
		ss.takeScreenShot(driver, "deleteButton");
			
	}
	
	@Test(priority = 3)
	public void search() throws InterruptedException, IOException{
		homePage hp = new homePage(driver);
		loginPage lp = new loginPage(driver);
		departmentMasterPage dmp = new departmentMasterPage(driver);
		
		dmp.search().click();
		Thread.sleep(2000);
		
		dmp.search().sendKeys("IT Testing");
		Thread.sleep(2000);
		
		dmp.searchBtn().click();
		Thread.sleep(2000);
		
		ss.takeScreenShot(driver, "searchRecord");
		Thread.sleep(2000);
		
		dmp.refreshBtn().click();
		Thread.sleep(2000);
		
		
	}
	
}
