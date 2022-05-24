package testCases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generic.baseClass;
import junit.framework.Assert;
import pages.departmentMasterPage;
import pages.homePage;
import pages.loginPage;
import pages.templateMasterPage;

public class templateMasterTest extends baseClass{

	@Test
	public void TC_01() throws FileNotFoundException, IOException, InterruptedException{
		
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
	public void TC_02(){
		
		
		homePage hp = new homePage(driver);
		
		System.out.println("Masters menu is present: " +hp.masters().isDisplayed());
		
	}
	
	@Test(priority = 20)
	public void TC_03() throws InterruptedException, IOException{
		
		homePage hp = new homePage(driver);
		
		hp.masters().click();
		Thread.sleep(2000);
		
		ss.takeScreenShot(driver, "mastersDropdown");
	}
	
	@Test(priority = 30)
	public void TC_04(){
		
		homePage hp = new homePage(driver);
		
		System.out.println("Masters menu is present: " +hp.templateMaster().isDisplayed());
		
	}
	
	@Test(priority = 40)
	public void TC_05() throws InterruptedException{
		
		homePage hp = new homePage(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		System.out.println("Current url is: " +driver.getCurrentUrl());
		Thread.sleep(2000);
		
		js.executeScript("arguments[0].click();", hp.templateMaster());
		Thread.sleep(2000);
		
		System.out.println("Redirected url is: " +driver.getCurrentUrl());
		Thread.sleep(2000);
	}
	
	@Test(priority = 50)
	public void TC_06(){
		
		templateMasterPage tp = new templateMasterPage(driver);
		
		System.out.println("Add button is present: " +tp.addBtn().isDisplayed());
	}
	
	@Test(priority = 60)
	public void TC_07() throws InterruptedException{
		
		templateMasterPage tp = new templateMasterPage(driver);
		
		System.out.println("Current url is: " +driver.getCurrentUrl());
		
		tp.addBtn().click();
		Thread.sleep(2000);
		
		System.out.println("Redirected url is: " +driver.getCurrentUrl());
	}
	
	@Test(priority = 70)
	public void TC_08(){
		
		templateMasterPage tp = new templateMasterPage(driver);
		
		System.out.println("Template Name Field is present: " +tp.templateName().isDisplayed());
	}
	
	@Test(priority = 80)
	public void TC_09() throws InterruptedException{
		
		templateMasterPage tp = new templateMasterPage(driver);
		
		tp.templateName().sendKeys("Testing Template @123");
		Thread.sleep(2000);
	}
	
	@Test(priority = 90)
	public void TC_10(){
		
		templateMasterPage tp = new templateMasterPage(driver);
		
		System.out.println("Calculate from field is present: " +tp.calculateFrom().isDisplayed());
	}
	
	@Test(priority = 100)
	public void TC_11() throws InterruptedException{
		
		templateMasterPage tp = new templateMasterPage(driver);
		
		tp.calculateFrom().click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 110)
	public void TC_12() throws InterruptedException{
		
		templateMasterPage tp = new templateMasterPage(driver);
		
		utilities.toSelectFromDropDown(tp.calculateFrom(), "From Start");
		Thread.sleep(2000);

	}
	
	@Test(priority = 120)
	public void TC_13(){
		
		templateMasterPage tp = new templateMasterPage(driver);
		
		System.out.println("Basket Name column is present: " +tp.basketNameColumn().isDisplayed());
	}
	
	@Test(priority = 130)
	public void TC_14(){
		
		templateMasterPage tp = new templateMasterPage(driver);
		
		System.out.println("Assign To column is present: " +tp.assignToColumn().isDisplayed());
	}
	
	@Test(priority = 140)
	public void TC_15(){
		
		templateMasterPage tp = new templateMasterPage(driver);
		
		System.out.println("Action column is present: " +tp.actionColumn().isDisplayed());
	}
	
	@Test(priority = 150)
	public void TC_16(){
		
		templateMasterPage tp = new templateMasterPage(driver);
		
		System.out.println("Create Task button is present: " +tp.createTaskBtn().isDisplayed());
	}
	
	@Test(priority = 160)
	public void TC_17() throws InterruptedException, IOException{
		
		templateMasterPage tp = new templateMasterPage(driver);
		
		tp.createTaskBtn().click();
		Thread.sleep(2000);
		
		ss.takeScreenShot(driver, "taskPopUp");
	}
	
	@Test(priority = 170)
	public void TC_18() throws InterruptedException{
		
		templateMasterPage tp = new templateMasterPage(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		System.out.println("Task Name field is present: " +tp.titleField().isDisplayed());
		
		js.executeScript("window.scrollBy(0, 500)");
		Thread.sleep(2000);
	}
	
	@Test(priority = 180)
	public void TC_19() throws InterruptedException, IOException{
		
		templateMasterPage tp = new templateMasterPage(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
//		tp.titleField().sendKeys("test");
//		Thread.sleep(2000);
		
		js.executeScript("arguments[0].click()", tp.addTaskBtn());
		Thread.sleep(2000);
		
		ss.takeScreenShot(driver, "titleMandatory");
	}
	
	@Test(priority = 190)
	public void TC_20(){
		
		templateMasterPage tp = new templateMasterPage(driver);
		
		System.out.println("No Of Days Field is present: " +tp.noOfDays().isDisplayed());
	}
	
	@Test(priority = 200)
	public void TC_21() throws InterruptedException, IOException{
		
		templateMasterPage tp = new templateMasterPage(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		tp.titleField().sendKeys("test");
		Thread.sleep(2000);
		
		tp.noOfDays().click();
		Thread.sleep(2000);
		
		js.executeScript("arguments[0].click()", tp.addTaskBtn());
		Thread.sleep(2000);
		
		ss.takeScreenShot(driver, "noOfDaysMandatory");
		Thread.sleep(2000);
	}
	
	@Test(priority = 210)
	public void TC_22() throws InterruptedException{
		
		templateMasterPage tp = new templateMasterPage(driver);
		
		String currentLabel = tp.labelNoOfDays().getText();
		System.out.println("Current label is: " +currentLabel);
		Thread.sleep(2000);
		
		String expectedLabel = "Days Required";
		System.out.println("Expected label is: " +expectedLabel);
		
		Assert.assertEquals(currentLabel, expectedLabel);
	}
	
	@Test(priority = 220)
	public void TC_23(){
		
		templateMasterPage tp = new templateMasterPage(driver);
		
		System.out.println("No Of Days Field is present: " +tp.startTask().isDisplayed());
	}
	
	@Test(priority = 230)
	public void TC_24() throws IOException, InterruptedException{
		
		templateMasterPage tp = new templateMasterPage(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
//		tp.titleField().sendKeys("test");
//		Thread.sleep(2000);
		
		tp.noOfDays().sendKeys("5");
		Thread.sleep(2000);
		
		tp.startTask().click();
		Thread.sleep(2000);
		
		js.executeScript("arguments[0].click();", tp.addTaskBtn());
		Thread.sleep(2000);
		
		ss.takeScreenShot(driver, "startTaskMandatory");
		
	}
	
	@Test(priority = 240)
	public void TC_25() throws IOException, InterruptedException{
		
		templateMasterPage tp = new templateMasterPage(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
//		tp.titleField().sendKeys("test");
//		Thread.sleep(2000);
//		
//		tp.noOfDays().sendKeys("5");
//		Thread.sleep(2000);
		
		tp.startTask().sendKeys("2");
		Thread.sleep(2000);
		
		js.executeScript("arguments[0].click()", tp.addTaskBtn());
		Thread.sleep(2000);
		
		ss.takeScreenShot(driver, "taskAdded");
		
	}
	
	@Test(priority = 250)
	public void TC_26() throws InterruptedException, IOException{
		
		templateMasterPage tp = new templateMasterPage(driver);
		
		tp.addBasketBtn().click();
		Thread.sleep(2000);
		
		ss.takeScreenShot(driver, "basketRow");
		
	}
	
	@Test(priority = 260)
	public void TC_27() throws InterruptedException, IOException{
		
		templateMasterPage tp = new templateMasterPage(driver);
		
		tp.basketName().sendKeys("basket one");
		Thread.sleep(2000);
		
		utilities.toSelectFromDropDown(tp.basketOwnerOne(), "Monika Dilip Kolpe");
		Thread.sleep(2000);
		
		tp.addBasketBtn().click();
		Thread.sleep(2000);
		
		tp.basketTwo().sendKeys("basket one");
		Thread.sleep(2000);
		
		utilities.toSelectFromDropDown(tp.basketOwnerTwo(), "Monika Dilip Kolpe");
		Thread.sleep(2000);
		
		if(tp.basketName() == tp.basketTwo()){
			System.out.println("TC_27 test case passed");
		}else{
			System.out.println("TC_27 test case failed");
		}
		
		
	}
	
	@Test(priority = 270)
	public void TC_28() throws InterruptedException, IOException{
		
		templateMasterPage tp = new templateMasterPage(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		tp.titleField().sendKeys("test");
		Thread.sleep(2000);
		
		tp.noOfDays().sendKeys("5");
		Thread.sleep(2000);
		
		tp.startTask().sendKeys("2");
		Thread.sleep(2000);
		
		js.executeScript("arguments[0].click()", tp.addTaskBtn());
		Thread.sleep(2000);
		
		tp.submit().click();
		Thread.sleep(2000);
		
	}
	
//	@Test(priority = 280)
//	public void TC_29() throws InterruptedException, IOException{
//		
//		templateMasterPage tp = new templateMasterPage(driver);
//		
//		ss.takeScreenShot(driver, "addTemplate");
//		
//	}
	
}
