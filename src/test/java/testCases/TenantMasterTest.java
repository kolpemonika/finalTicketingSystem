package testCases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import generic.baseClass;
import junit.framework.Assert;
import pages.TenantMasterPage;
import pages.departmentMasterPage;
import pages.homePage;
import pages.loginPage;

public class TenantMasterTest extends baseClass{

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
	public void TC_76() throws InterruptedException{
		
		homePage hp = new homePage(driver);
		
		hp.masters().click();
		Thread.sleep(2000);
		
		System.out.println("Current url is: " +driver.getCurrentUrl());
		
		hp.tenantMaster().click();
		Thread.sleep(2000);
		
		System.out.println("Expected url is: " +driver.getCurrentUrl());
		
	}
	
	@Test(priority = 20)
	public void TC_77() throws InterruptedException{
		
		TenantMasterPage tp = new TenantMasterPage(driver);
		
		System.out.println("Add button is present: " +tp.addBtn().isDisplayed());
		
	}
	
	@Test(priority = 30)
	public void TC_78() throws InterruptedException{
		
		TenantMasterPage tp = new TenantMasterPage(driver);

		System.out.println("Current url is: " +driver.getCurrentUrl());
		
		tp.addBtn().click();
		Thread.sleep(2000);
		
		System.out.println("Expected url is: " +driver.getCurrentUrl());
			
	}
	
	@Test(priority = 40)
	public void TC_79() throws InterruptedException{
		
		TenantMasterPage tp = new TenantMasterPage(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		tp.companyName().sendKeys("company test");
		Thread.sleep(2000);
		
		tp.companyType().click();
		
		utilities.toSelectFromDropDown(tp.companyType(), "Private Limited Company");
		Thread.sleep(2000);
		
		tp.emailID().sendKeys("monika.kolpe@techneai.com");
		Thread.sleep(2000);
		
		tp.contactNo().sendKeys("8010159730");
		Thread.sleep(2000);
		
		tp.address().sendKeys("pune");
		Thread.sleep(2000);
		
		tp.pincode().sendKeys("411020");
		Thread.sleep(2000);
		
		tp.selectCountry().click();
		utilities.toSelectFromDropDown(tp.selectCountry(), "India");
		Thread.sleep(2000);
		
		js.executeScript("arguments[0].click();", tp.selectState());
		Thread.sleep(2000);
		
		utilities.toSelectFromDropDown(tp.selectState(), "Maharashtra");
		Thread.sleep(2000);
		
		js.executeScript("arguments[0].click();", tp.selectCity());
		Thread.sleep(2000);
		utilities.toSelectFromDropDown(tp.selectCity(), "Kolhapurr");
		Thread.sleep(2000);
		
		tp.isActive().click();
		Thread.sleep(2000);
		
		tp.updateBtn().click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 50)
	public void TC_80() throws InterruptedException{
		
		TenantMasterPage tp = new TenantMasterPage(driver);
		
		tp.addBtn().click();
		Thread.sleep(2000);

		System.out.println("Company name field is present: " +tp.companyName().isDisplayed());
		
		System.out.println("Company type field is present: " +tp.companyType().isDisplayed());
		
		System.out.println("Email address field is present: " +tp.emailID().isDisplayed());
		
		System.out.println("Contact Number field is present: " +tp.contactNo().isDisplayed());
		
		System.out.println("Address field is present: " +tp.address().isDisplayed());
		
		System.out.println("Pincode field is present: " +tp.pincode().isDisplayed());
		
		System.out.println("Country Field is present: " +tp.selectCountry().isDisplayed());
		
		System.out.println("State Field is present: " +tp.selectState().isDisplayed());
		
		System.out.println("City Field is present: " +tp.selectCity().isDisplayed());
		
		System.out.println("remark Field is present: " +tp.remark().isDisplayed());
		
		System.out.println("Is Active is present: " +tp.isActive().isDisplayed());
		
		System.out.println("Is Deactive Field is present: " +tp.isDeactive().isDisplayed());
		
	}
	
	@Test(priority = 60)
	public void TC_81(){
		
		TenantMasterPage tp = new TenantMasterPage(driver);
		
		System.out.println("Add tenant button is working: " +tp.addTenantBtn().isEnabled());
	}
	
	@Test(priority = 70)
	public void TC_82(){
		
		TenantMasterPage tp = new TenantMasterPage(driver);
		
		System.out.println("Cancel button is working: " +tp.cancelBtn().isEnabled());
	}
	
	@Test(priority = 80)
	public void TC_83() throws InterruptedException, IOException{
		
		TenantMasterPage tp = new TenantMasterPage(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		driver.navigate().refresh();
		
		//tp.companyName().sendKeys("company test");
		Thread.sleep(2000);
		
		tp.companyType().click();
		
		utilities.toSelectFromDropDown(tp.companyType(), "Private Limited Company");
		Thread.sleep(2000);
		
		tp.emailID().sendKeys("monika.kolpe@techneai.com");
		Thread.sleep(2000);
		
//		tp.contactNo().sendKeys("8010159730");
//		Thread.sleep(2000);
		
		tp.address().sendKeys("pune");
		Thread.sleep(2000);
		
//		tp.pincode().sendKeys("411020");
//		Thread.sleep(2000);
		
		js.executeScript("arguments[0].click();", tp.selectCountry());
		//tp.selectCountry().click();
		utilities.toSelectFromDropDown(tp.selectCountry(), "India");
		Thread.sleep(2000);
		
		js.executeScript("arguments[0].click();", tp.selectState());
		utilities.toSelectFromDropDown(tp.selectState(), "Maharashtra");
		Thread.sleep(2000);
		
		js.executeScript("arguments[0].click();", tp.selectCity());
		utilities.toSelectFromDropDown(tp.selectCity(), "Kolhapurr");
		Thread.sleep(2000);
		
		tp.isActive().click();
		Thread.sleep(2000);
		
		tp.updateBtn().click();
		Thread.sleep(2000);
		
		ss.takeScreenShot(driver, "mandatoryFields");
	}
	
	@Test(priority = 90)
	public void TC_84() throws InterruptedException, IOException{
		
		TenantMasterPage tp = new TenantMasterPage(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
//		tp.cancelBtn().click();
//		
//		tp.editBtn().click();
		
		//tp.companyName().clear();
		tp.companyName().sendKeys("company test");
		Thread.sleep(2000);
		
		tp.companyType().click();
		
		utilities.toSelectFromDropDown(tp.companyType(), "Private Limited Company");
		Thread.sleep(2000);
		
		tp.emailID().clear();
		tp.emailID().sendKeys("monika.kolpe@techneai.com");
		Thread.sleep(2000);
		
		tp.contactNo().sendKeys("8554860919");
		Thread.sleep(2000);
		
		tp.address().clear();
		tp.address().sendKeys("pune");
		Thread.sleep(2000);
		
		tp.pincode().sendKeys("411020");
		Thread.sleep(2000);
		
		js.executeScript("arguments[0].click();", tp.selectCountry());
		//tp.selectCountry().click();
		utilities.toSelectFromDropDown(tp.selectCountry(), "India");
		Thread.sleep(2000);
		
		js.executeScript("arguments[0].click();", tp.selectState());
		utilities.toSelectFromDropDown(tp.selectState(), "Maharashtra");
		Thread.sleep(2000);
		
		js.executeScript("arguments[0].click();", tp.selectCity());
		utilities.toSelectFromDropDown(tp.selectCity(), "Kolhapurr");
		Thread.sleep(2000);
		
//		tp.isActive().click();
//		Thread.sleep(2000);
		
		js.executeScript("arguments[0].click();", tp.updateBtn());
		Thread.sleep(2000);
		
		ss.takeScreenShot(driver, "updatedMessage");
		
		
	}
	
	@Test(priority = 100)
	public void TC_85() throws InterruptedException{
		
		TenantMasterPage tp = new TenantMasterPage(driver);
		
//		tp.cancelBtn().click();
//		Thread.sleep(2000);
		
		tp.refreshBtn().click();
		Thread.sleep(2000);
		
		System.out.println("Action column is present: " +tp.actionColumn().isDisplayed());
		
		System.out.println("Edit button is present in action column: " +tp.editBtn().isEnabled());
	}
	
	@Test(priority = 110)
	public void TC_86() throws InterruptedException{
		
		TenantMasterPage tp = new TenantMasterPage(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		tp.addBtn().click();
		Thread.sleep(2000);
		
		tp.companyName().sendKeys("techneai");
		Thread.sleep(2000);
		
		tp.emailID().sendKeys("monika");
		Thread.sleep(2000);
		
//		if(tp.emailID() == ){
//			
//		}
		
		js.executeScript("arguments[0].click();", tp.addTenantBtn());
//		tp.addTenantBtn().click();
		Thread.sleep(2000);
		
		js.executeScript("arguments[0].click();", tp.cancelBtn());
		//tp.cancelBtn().click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 120)
	public void TC_87() throws InterruptedException{
		
		TenantMasterPage tp = new TenantMasterPage(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		tp.editBtn().click();
		Thread.sleep(2000);
		
		tp.companyName().clear();
		tp.companyName().sendKeys("cspl ");
		Thread.sleep(2000);
		
//		tp.emailID().sendKeys("monika.kolpe@techneai.com");
//		Thread.sleep(2000);
		
		js.executeScript("arguments[0].click();", tp.addTenantBtn());
//		tp.addTenantBtn().click();
		Thread.sleep(2000);
		
//		tp.contactNo().sendKeys("8010159730");
//		Thread.sleep(2000);
		
//		js.executeScript("arguments[0].click();", tp.addTenantBtn());
//		Thread.sleep(2000);
		
		
	}
	
	@Test(priority = 130)
	public void TC_88() throws InterruptedException{
		
		TenantMasterPage tp = new TenantMasterPage(driver);
		
		tp.search().sendKeys("techneai");
		Thread.sleep(2000);
		
		tp.searchBtn().click();
		Thread.sleep(2000);
		
		String searchText = "techneai";
		String searchedText = tp.search().getText();
		
		Assert.assertEquals(searchedText, searchText);
		
	}
	
	@Test(priority = 140)
	public void TC_90() throws InterruptedException{
		
		TenantMasterPage tp = new TenantMasterPage(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		tp.addBtn().click();
		Thread.sleep(2000);
		
		tp.pincode().sendKeys("acscsdvds");
		Thread.sleep(3000);
		
		js.executeScript("arguments[0].click();", tp.addTenantBtn());
		Thread.sleep(2000);
		
	}
	
	@Test(priority = 150)
	public void TC_91() throws InterruptedException{
		
		TenantMasterPage tp = new TenantMasterPage(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		System.out.println("enter remark field is present: " +tp.enterRemark().isDisplayed());
		
		js.executeScript("arguments[0].click();", tp.cancelBtn());
		
		Thread.sleep(2000);
	}
	
	@Test(priority = 160)
	public void TC_92() throws InterruptedException{
		
		TenantMasterPage tp = new TenantMasterPage(driver);
		
		System.out.println("refresh field is present: " +tp.refreshBtn().isDisplayed());
		
		tp.refreshBtn().click();
		Thread.sleep(2000);
	}
		
	@Test(priority = 170)
	public void TC_93() throws InterruptedException{
		
		TenantMasterPage tp = new TenantMasterPage(driver);
		
		System.out.println("sr column is present: " +tp.srColumn().isDisplayed());
		
		System.out.println("name column is present: " +tp.nameColumn().isDisplayed());
		
		System.out.println("type column is present: " +tp.typeColumn().isDisplayed());
		
		System.out.println("remark column is present: " +tp.remarkColumn().isDisplayed());
		
		System.out.println("updated by column is present: " +tp.updatedByColumn().isDisplayed());
		
		System.out.println("updated at column is present: " +tp.updatedAtColumn().isDisplayed());
		
		System.out.println("action column is present: " +tp.actionColumn().isDisplayed());
	}
	
	@Test(priority = 180)
	public void TC_94() throws InterruptedException{
		
		TenantMasterPage tp = new TenantMasterPage(driver);
		
		tp.srSort().click();
		Thread.sleep(2000);
		
		tp.refreshBtn().click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 190)
	public void TC_95() throws InterruptedException{
		
		TenantMasterPage tp = new TenantMasterPage(driver);
		
		tp.nameSort().click();
		Thread.sleep(2000);
		
		tp.refreshBtn().click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 200)
	public void TC_96() throws InterruptedException{
		
		TenantMasterPage tp = new TenantMasterPage(driver);
		
		tp.typeSort().click();
		Thread.sleep(2000);
		
		tp.refreshBtn().click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 210)
	public void TC_97() throws InterruptedException{
		
		TenantMasterPage tp = new TenantMasterPage(driver);
		
		tp.remarkSort().click();
		Thread.sleep(2000);
		
		tp.refreshBtn().click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 220)
	public void TC_98() throws InterruptedException{
		
		TenantMasterPage tp = new TenantMasterPage(driver);
		
		tp.updatedBySort().click();
		Thread.sleep(2000);
		
		tp.refreshBtn().click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 230)
	public void TC_99() throws InterruptedException{
		
		TenantMasterPage tp = new TenantMasterPage(driver);
		
		tp.updatedAtSort().click();
		Thread.sleep(2000);
		
//		tp.refreshBtn().click();
//		Thread.sleep(2000);
	}
}
