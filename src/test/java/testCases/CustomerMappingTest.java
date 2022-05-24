package testCases;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic.baseClass;
import pages.customerMappingPage;
import pages.customerMasterPage;
import pages.departmentMasterPage;
import pages.homePage;
import pages.loginPage;

public class CustomerMappingTest extends baseClass{

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
	public void TC_262(){
		
		homePage hp = new homePage(driver);
		
		System.out.println("setting menu is present: " +hp.setting().isDisplayed());
	}
	
	@Test(priority = 20)
	public void TC_263() throws InterruptedException, IOException{
		
		homePage hp = new homePage(driver);
		
		hp.setting().click();
		Thread.sleep(2000);
		
		ss.takeScreenShot(driver, "settingDropdown");
	}
	
	@Test(priority = 30)
	public void TC_264(){
		
		homePage hp = new homePage(driver);
		
		System.out.println("customer mapping menu is present: " +hp.customerMapping().isDisplayed());
	}
	
	@Test(priority = 40)
	public void TC_265() throws InterruptedException{
		
		homePage hp = new homePage(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		System.out.println("Current url is: " +driver.getCurrentUrl());
		
		js.executeScript("arguments[0].click();", hp.customerMapping());
		//hp.customerMapping().click();
		Thread.sleep(2000);
		
		System.out.println("Expected url is: " +driver.getCurrentUrl());
		
	}
	
	@Test(priority = 50)
	public void TC_266(){
		
		customerMasterPage cmp = new customerMasterPage(driver);
		
		System.out.println("customer mapping menu is present: " +cmp.addBtn().isDisplayed());
	
	}
	
	@Test(priority = 60)
	public void TC_267() throws InterruptedException{
		
		customerMasterPage cmp = new customerMasterPage(driver);
		
		System.out.println("Current url is: " +driver.getCurrentUrl());
		
		cmp.addBtn().click();
		Thread.sleep(2000);
		
		System.out.println("Expected url is: " +driver.getCurrentUrl());
	
	}
	
	@Test(priority = 70)
	public void TC_268(){
		
		customerMappingPage cup = new customerMappingPage(driver);
		
		System.out.println("select project field is present: " +cup.selectProject().isDisplayed());
	
		System.out.println("select module field is present: " +cup.selectModule().isDisplayed());
		
		System.out.println("select sub-module field is present: " +cup.selectSubModule().isDisplayed());
		
		System.out.println("select query type field is present: " +cup.selectQueryType().isDisplayed());
		
		System.out.println("select form field is present: " +cup.selectForm().isDisplayed());
		
		System.out.println("select department field is present: " +cup.selectDepartment().isDisplayed());
		
		System.out.println("select template field is present: " +cup.selectTemplate().isDisplayed());
		
		System.out.println("select priority field is present: " +cup.selectPriority().isDisplayed());
	
		System.out.println("select approach field is present: " +cup.selectApproach().isDisplayed());
	
		System.out.println("User policy field is present: " +cup.userPolicy().isDisplayed());
		
		System.out.println("Add button is present: " +cup.settingAddBtn().isDisplayed());
		
		System.out.println("Cancel button is present: " +cup.cancelBtn().isDisplayed());
	
	}
	
	@Test(priority = 80)
	public void TC_269() throws InterruptedException{
		
		customerMappingPage cup = new customerMappingPage(driver);
		
		cup.selectProject().click();
		Thread.sleep(2000);
		
		System.out.println("*********** all projects ***********");
		
		Select s = new Select(cup.selectProject());
	      // getting the list of options in the dropdown with getOptions()
	      List <WebElement> op = s.getOptions();
	      int size = op.size();
	      for(int i =0; i<size ; i++){
	         String options = op.get(i).getText();
	         System.out.println(options);
	      }
	}
	
	@Test(priority = 90)
	public void TC_270() throws InterruptedException{
		
		customerMappingPage cup = new customerMappingPage(driver);
		
		cup.selectModule().click();
		Thread.sleep(2000);
		
		System.out.println("*********** all modules ***********");
		
		Select s = new Select(cup.selectModule());
	      // getting the list of options in the dropdown with getOptions()
	      List <WebElement> op = s.getOptions();
	      int size = op.size();
	      for(int i =0; i<size ; i++){
	         String options = op.get(i).getText();
	         System.out.println(options);
	      }
	}
	
	@Test(priority = 100)
	public void TC_271() throws InterruptedException{
		
		customerMappingPage cup = new customerMappingPage(driver);
		
		cup.selectSubModule().click();
		Thread.sleep(2000);
		
		System.out.println("*********** all sub-modules ***********");
		
		Select s = new Select(cup.selectSubModule());
	      // getting the list of options in the dropdown with getOptions()
	      List <WebElement> op = s.getOptions();
	      int size = op.size();
	      for(int i =0; i<size ; i++){
	         String options = op.get(i).getText();
	         System.out.println(options);
	      }
	}
	
	@Test(priority = 110)
	public void TC_272() throws InterruptedException{
		
		customerMappingPage cup = new customerMappingPage(driver);
		
		cup.selectQueryType().click();
		Thread.sleep(2000);
		
		System.out.println("*********** all query types ***********");
		
		Select s = new Select(cup.selectQueryType());
	      // getting the list of options in the dropdown with getOptions()
	      List <WebElement> op = s.getOptions();
	      int size = op.size();
	      for(int i =0; i<size ; i++){
	         String options = op.get(i).getText();
	         System.out.println(options);
	      }
	}
	
	@Test(priority = 120)
	public void TC_273() throws InterruptedException{
		
		customerMappingPage cup = new customerMappingPage(driver);
		
		cup.selectForm().click();
		Thread.sleep(2000);
		
		System.out.println("*********** all forms ***********");
		
		Select s = new Select(cup.selectForm());
	      // getting the list of options in the dropdown with getOptions()
	      List <WebElement> op = s.getOptions();
	      int size = op.size();
	      for(int i =0; i<size ; i++){
	         String options = op.get(i).getText();
	         System.out.println(options);
	      }
	}
	
	@Test(priority = 130)
	public void TC_274() throws InterruptedException{
		
		customerMappingPage cup = new customerMappingPage(driver);
		
		cup.selectDepartment().click();
		Thread.sleep(2000);
		
		System.out.println("*********** all departments ***********");
		
		Select s = new Select(cup.selectDepartment());
	      // getting the list of options in the dropdown with getOptions()
	      List <WebElement> op = s.getOptions();
	      int size = op.size();
	      for(int i =0; i<size ; i++){
	         String options = op.get(i).getText();
	         System.out.println(options);
	      }
	}
	
	@Test(priority = 140)
	public void TC_275() throws InterruptedException{
		
		customerMappingPage cup = new customerMappingPage(driver);
		
		cup.selectTemplate().click();
		Thread.sleep(2000);
		
		System.out.println("*********** all templates ***********");
		
		Select s = new Select(cup.selectTemplate());
	      // getting the list of options in the dropdown with getOptions()
	      List <WebElement> op = s.getOptions();
	      int size = op.size();
	      for(int i =0; i<size ; i++){
	         String options = op.get(i).getText();
	         System.out.println(options);
	      }
	}
	
	@Test(priority = 150)
	public void TC_276() throws InterruptedException{
		
		customerMappingPage cup = new customerMappingPage(driver);
		
		cup.selectPriority().click();
		Thread.sleep(2000);
		
		System.out.println("*********** all priority ***********");
		
		Select s = new Select(cup.selectPriority());
	      // getting the list of options in the dropdown with getOptions()
	      List <WebElement> op = s.getOptions();
	      int size = op.size();
	      for(int i =0; i<size ; i++){
	         String options = op.get(i).getText();
	         System.out.println(options);
	      }
	}
	
	@Test(priority = 160)
	public void TC_277(){
		
		customerMappingPage cup = new customerMappingPage(driver);
		
		utilities.toSelectFromDropDown(cup.selectApproach(), "Select Priority");
		
		String currentValue = cup.selectApproach().getText();
		
		String expectedValue = "Select Approach";
		
		Assert.assertEquals(currentValue, expectedValue);
		
	}
	
	@Test(priority = 170)
	public void TC_278() throws InterruptedException{
		
		customerMappingPage cup = new customerMappingPage(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0, 500)", "");
		
		js.executeScript("arguments[0].click();", cup.selectApproach());
		Thread.sleep(2000);
		
		System.out.println("*********** all approaches ***********");
		
		Select s = new Select(cup.selectApproach());
	      // getting the list of options in the dropdown with getOptions()
	      List <WebElement> op = s.getOptions();
	      int size = op.size();
	      for(int i =0; i<size ; i++){
	         String options = op.get(i).getText();
	         System.out.println(options);
	      }
	      
	    System.out.println("****************************");
	}
}
