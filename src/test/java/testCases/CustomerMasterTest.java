package testCases;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import generic.baseClass;
import junit.framework.Assert;
import pages.customerMasterPage;
import pages.departmentMasterPage;
import pages.homePage;
import pages.loginPage;

public class CustomerMasterTest extends baseClass{

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
	public void TC_210() throws InterruptedException{
		
		homePage hp = new homePage(driver);
		
		hp.masters().click();
		Thread.sleep(2000);
		
		System.out.println("Customer master is present: " +hp.customerMaster().isDisplayed());
		
	}
	
	@Test(priority = 20)
	public void TC_211() throws InterruptedException{
		
		homePage hp = new homePage(driver);
		
		System.out.println("current url is: " +driver.getCurrentUrl());
		
		hp.customerMaster().click();
		Thread.sleep(2000);
		
		System.out.println("expected url is: " +driver.getCurrentUrl());
	}
	
	@Test(priority = 30)
	public void TC_212() throws InterruptedException{
		
		customerMasterPage cmp = new customerMasterPage(driver);
		
		System.out.println("Add button is present: " +cmp.addBtn().isDisplayed());
		
	}
	
	@Test(priority = 40)
	public void TC_213() throws InterruptedException{
		
		customerMasterPage cmp = new customerMasterPage(driver);
		
		System.out.println("current url is: " +driver.getCurrentUrl());
		
		cmp.addBtn().click();
		Thread.sleep(2000);
		
		System.out.println("expected url is: " +driver.getCurrentUrl());
	}
	
	@Test(priority = 50)
	public void TC_214() throws InterruptedException{
		
		customerMasterPage cmp = new customerMasterPage(driver);
		
		System.out.println("Customer Name field is present: " +cmp.customerName().isDisplayed());
		
		System.out.println("Customer Type field is present: " +cmp.customerType().isDisplayed());
		
		System.out.println("Email Address field is present: " +cmp.emailID().isDisplayed());
		
		System.out.println("Contact Number field is present: " +cmp.contactNumber().isDisplayed());
		
		System.out.println("Address field is present: " +cmp.address().isDisplayed());
		
		System.out.println("Pincode field is present: " +cmp.pincode().isDisplayed());
		
		System.out.println("Country field is present: " +cmp.selectCountry().isDisplayed());
		
		System.out.println("State field is present: " +cmp.selectState().isDisplayed());
		
		System.out.println("City field is present: " +cmp.selectCity().isDisplayed());
		
		System.out.println("Enter Remark field is present: " +cmp.enterRemark().isDisplayed());
		
		System.out.println("Active Status field is present: " +cmp.activeStatus().isDisplayed());
		
		System.out.println("Deactive status field is present: " +cmp.deactiveStatus().isDisplayed());
	}
	
//	@Test(priority = 60)
//	public void TC_215() throws InterruptedException{
//		
//		customerMasterPage cmp = new customerMasterPage(driver);
//		
//		cmp.customerName().sendKeys("test@123");
//		Thread.sleep(2000);
//		
//	}
//	
//	@Test(priority = 70)
//	public void TC_216() throws InterruptedException, IOException{
//		
//		customerMasterPage cmp = new customerMasterPage(driver);
//		
//		cmp.customerType().click();
//		Thread.sleep(2000);
//		
//		ss.takeScreenShot(driver, "customerTypeDropdown");
//		
//	}
//	
//	@Test(priority = 80)
//	public void TC_217() throws InterruptedException{
//		
//		customerMasterPage cmp = new customerMasterPage(driver);
//		
//		cmp.customerType().click();
//		Thread.sleep(2000);
//		
//		utilities.toSelectFromDropDown(cmp.customerType(), "Retailer");
//		Thread.sleep(2000);
//
//	}
//	
//	@Test(priority = 90)
//	public void TC_218() throws InterruptedException{
//		
//		customerMasterPage cmp = new customerMasterPage(driver);
//		
//		cmp.emailID().sendKeys("monika.kolpe@techneai.com");
//		Thread.sleep(2000);
//		
//	}
//	
//	@Test(priority = 100)
//	public void TC_219() throws InterruptedException{
//		
//		customerMasterPage cmp = new customerMasterPage(driver);
//		
//		cmp.contactNumber().sendKeys("1234563215");
//		Thread.sleep(2000); 
//	
//	}
//	
//	@Test(priority = 110)
//	public void TC_220() throws InterruptedException{
//		
//		customerMasterPage cmp = new customerMasterPage(driver);
//		
//		cmp.contactNumber().clear();
//		Thread.sleep(2000);
//		
//		cmp.contactNumber().sendKeys("asfscdfgfgfh");
//		Thread.sleep(2000);
//	    
//		System.out.println("contact number is: " +cmp.contactNumber().getText());
//	
//	}
//	
//	@Test(priority = 120)
//	public void TC_221() throws InterruptedException{
//		
//		customerMasterPage cmp = new customerMasterPage(driver);
//		
//		cmp.address().sendKeys("pune");
//		Thread.sleep(2000); 
//	
//	}
//	
//	@Test(priority = 130)
//	public void TC_222() throws InterruptedException{
//		
//		customerMasterPage cmp = new customerMasterPage(driver);
//		
//		cmp.pincode().sendKeys("123456");
//		Thread.sleep(2000); 
//	
//	}
//	
//	@Test(priority = 140)
//	public void TC_223() throws InterruptedException{
//		
//		customerMasterPage cmp = new customerMasterPage(driver);
//		
//		cmp.pincode().clear();
//		Thread.sleep(2000);
//		
//		cmp.pincode().sendKeys("dsfgvgvg");
//		Thread.sleep(2000); 
//	
//	}
//	
//	@Test(priority = 150)
//	public void TC_224() throws InterruptedException, IOException{
//		
//		customerMasterPage cmp = new customerMasterPage(driver);
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		
//		cmp.selectCountry().click();
//		Thread.sleep(3000);
//		
//		js.executeScript("window.scrollBy(0, 500)");
//		
//		ss.takeScreenShot(driver, "countryDropdown");
//	
//	}
//	
//	@Test(priority = 160)
//	public void TC_225() throws InterruptedException, IOException{
//		
//		customerMasterPage cmp = new customerMasterPage(driver);
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		
//		js.executeScript("arguments[0].click();", cmp.selectState());
//		//cmp.selectState().click();
//		Thread.sleep(2000);
//		
//		ss.takeScreenShot(driver, "stateDropdown");
//	
//	}
//	
//	@Test(priority = 170)
//	public void TC_226() throws InterruptedException, IOException{
//		
//		customerMasterPage cmp = new customerMasterPage(driver);
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		
//		js.executeScript("arguments[0].click();", cmp.selectCity());
//		Thread.sleep(2000);
//		
//		ss.takeScreenShot(driver, "cityDropdown");
//	
//	}
//	
//	@Test(priority = 180)
//	public void TC_227() throws InterruptedException, IOException{
//		
//		customerMasterPage cmp = new customerMasterPage(driver);
//		
//		System.out.println("Active status is present: " +cmp.activeStatus().isDisplayed());
//		Thread.sleep(2000);
//		
//		System.out.println("Deactive status is present: " +cmp.deactiveStatus().isDisplayed());
//		Thread.sleep(2000);
//		
//		ss.takeScreenShot(driver, "selectStatus");
//	
//	}
//	
//	@Test(priority = 190)
//	public void TC_228() throws InterruptedException, IOException{
//		
//		customerMasterPage cmp = new customerMasterPage(driver);
//		
//		System.out.println("Create button is present: " +cmp.createBtn().isDisplayed());
//		Thread.sleep(2000);
//	
//	}
//	
//	@Test(priority = 200)
//	public void TC_229() throws InterruptedException, IOException{
//		
//		customerMasterPage cmp = new customerMasterPage(driver);
//		
//		System.out.println("Cancel button is present: " +cmp.cancelBtn().isDisplayed());
//		Thread.sleep(2000);
//	
//	}
//	
//	@Test(priority = 210)
//	public void TC_230() throws InterruptedException, IOException{
//		
//		customerMasterPage cmp = new customerMasterPage(driver);
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		
//		System.out.println("current url is: " +driver.getCurrentUrl());
//		
//		js.executeScript("arguments[0].click();", cmp.cancelBtn());
//		//cmp.cancelBtn().click();
//		Thread.sleep(2000);
//		
//		System.out.println("expected url is: " +driver.getCurrentUrl());
//		
//		Thread.sleep(2000);
//	
//	}
//	
//	@Test(priority = 220)
//	public void TC_231() throws InterruptedException, IOException{
//		
//		customerMasterPage cmp = new customerMasterPage(driver);
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		
//		cmp.addBtn().click();
//		Thread.sleep(2000);
//		
//		cmp.customerName().sendKeys("test@123");
//		Thread.sleep(2000);
//		
//		cmp.customerType().click();
//		Thread.sleep(2000);
//		
//		utilities.toSelectFromDropDown(cmp.customerType(), "Retailer");
//		Thread.sleep(2000);
//		
//		cmp.emailID().sendKeys("monika.kolpe@techneai.com");
//		Thread.sleep(2000);
//		
//		cmp.contactNumber().sendKeys("1234563215");
//		Thread.sleep(2000);
//		
//		cmp.address().sendKeys("pune");
//		Thread.sleep(2000); 
//		
//		cmp.pincode().sendKeys("123456");
//		Thread.sleep(2000);
//		
//		utilities.toSelectFromDropDown(cmp.selectCountry(), "India");
//		Thread.sleep(2000);
//		
//		utilities.toSelectFromDropDown(cmp.selectState(), "Maharashtra");
//		Thread.sleep(2000);
//		
//		utilities.toSelectFromDropDown(cmp.selectCity(), "Punee");
//		Thread.sleep(2000);
//		
//		cmp.enterRemark().sendKeys("test");
//		Thread.sleep(2000);
//		
//		cmp.activeStatus().click();
//		Thread.sleep(2000);
//		
//		js.executeScript("arguments[0].click();", cmp.createBtn());
//		//cmp.createBtn().click();
//		Thread.sleep(2000);
//	
//	}
//	
//	@Test(priority = 230)
//	public void TC_232() throws InterruptedException, IOException{
//		
//		customerMasterPage cmp = new customerMasterPage(driver);
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		
//		cmp.addBtn().click();
//		Thread.sleep(2000);
//		
//		if(cmp.customerName() != null){
//			System.out.println("test case failed");
//		}else{
//			System.out.println("test case passed");
//		}
		
//		cmp.customerType().click();
//		Thread.sleep(2000);
//		
//		utilities.toSelectFromDropDown(cmp.customerType(), "Retailer");
//		Thread.sleep(2000);
//		
//		cmp.emailID().sendKeys("monika.kolpe@techneai.com");
//		Thread.sleep(2000);
//		
//		cmp.contactNumber().sendKeys("1234563215");
//		Thread.sleep(2000);
//		
//		cmp.address().sendKeys("pune");
//		Thread.sleep(2000); 
//		
//		cmp.pincode().sendKeys("123456");
//		Thread.sleep(2000);
//		
//		utilities.toSelectFromDropDown(cmp.selectCountry(), "India");
//		Thread.sleep(2000);
//		
//		utilities.toSelectFromDropDown(cmp.selectState(), "Maharashtra");
//		Thread.sleep(2000);
//		
//		utilities.toSelectFromDropDown(cmp.selectCity(), "Punee");
//		Thread.sleep(2000);
//		
//		cmp.enterRemark().sendKeys("test");
//		Thread.sleep(2000);
//		
//		cmp.activeStatus().click();
//		Thread.sleep(2000);
//		
//		js.executeScript("arguments[0].click();", cmp.createBtn());
//		//cmp.createBtn().click();
//		Thread.sleep(2000);
//		
//		ss.takeScreenShot(driver, "customerNameValid");
//	
//	}
//	
//	@Test(priority = 240)
//	public void TC_233_TC_245() throws InterruptedException, IOException{
//		
//		customerMasterPage cmp = new customerMasterPage(driver);
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		
//		js.executeScript("arguments[0].click();", cmp.cancelBtn());
//		
//		cmp.addBtn().click();
//		Thread.sleep(2000);
//		
//		cmp.customerName().sendKeys("test@123");
//		Thread.sleep(2000);
//		
////		cmp.customerType().click();
////		Thread.sleep(2000);
////		
////		utilities.toSelectFromDropDown(cmp.customerType(), "Retailer");
////		Thread.sleep(2000);
////		
//
//		if(cmp.customerType() != null){
//			System.out.println("test case failed");
//		}else{
//			System.out.println("test case passed");
//		}
//		
//		cmp.emailID().sendKeys("monika.kolpe@techneai.com");
//		Thread.sleep(2000);
//		
//		cmp.contactNumber().sendKeys("1234563215");
//		Thread.sleep(2000);
//		
//		cmp.address().sendKeys("pune");
//		Thread.sleep(2000); 
//		
//		cmp.pincode().sendKeys("123456");
//		Thread.sleep(2000);
//		
//		utilities.toSelectFromDropDown(cmp.selectCountry(), "India");
//		Thread.sleep(2000);
//		
//		utilities.toSelectFromDropDown(cmp.selectState(), "Maharashtra");
//		Thread.sleep(2000);
//		
//		utilities.toSelectFromDropDown(cmp.selectCity(), "Punee");
//		Thread.sleep(2000);
//		
//		cmp.enterRemark().sendKeys("test");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//select[@name=’selType
//		cmp.activeStatus().click();
//		Thread.sleep(2000);
//		
//		js.executeScript("arguments[0].click();", cmp.createBtn());
//		//cmp.createBtn().click();
//		Thread.sleep(2000);
//		
//		ss.takeScreenShot(driver, "customerTypeValid");
//	
//	}
	
//	@Test(priority = 250)
//	public void TC_234_TC_246() throws InterruptedException, IOException{
//		
//		customerMasterPage cmp = new customerMasterPage(driver);
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		
//		js.executeScript("arguments[0].click();", cmp.cancelBtn());
//		
//		cmp.addBtn().click();
//		Thread.sleep(2000);
//		
//		cmp.customerName().sendKeys("test@123");
//		Thread.sleep(2000);
//		
//		cmp.customerType().click();
//		Thread.sleep(2000);
//		
//		utilities.toSelectFromDropDown(cmp.customerType(), "Retailer");
//		Thread.sleep(2000);
//		
////		cmp.emailID().sendKeys("monika.kolpe@techneai.com");
////		Thread.sleep(2000);
//		
//		if(cmp.emailID() != null){
//			System.out.println("TC_234 test case failed");
//		}else{
//			System.out.println("test case passed");
//		}
//		
//		cmp.contactNumber().sendKeys("1234563215");
//		Thread.sleep(2000);
//		
//		cmp.address().sendKeys("pune");
//		Thread.sleep(2000); 
//		driver.findElement(By.xpath("//select[@name=’selType
//		cmp.pincode().sendKeys("123456");
//		Thread.sleep(2000);
//		
//		utilities.toSelectFromDropDown(cmp.selectCountry(), "India");
//		Thread.sleep(2000);
//		
//		utilities.toSelectFromDropDown(cmp.selectState(), "Maharashtra");
//		Thread.sleep(2000);
//		
//		utilities.toSelectFromDropDown(cmp.selectCity(), "Punee");
//		Thread.sleep(2000);
//		
//		cmp.enterRemark().sendKeys("test");
//		Thread.sleep(2000);
//		
//		cmp.activeStatus().click();
//		Thread.sleep(2000);
//		
//		js.executeScript("arguments[0].click();", cmp.createBtn());
//		//cmp.createBtn().click();
//		Thread.sleep(2000);
//		
//	
//	}
	
//	@Test(priority = 260)
//	public void TC_235_TC_247() throws InterruptedException, IOException{
//		
//		customerMasterPage cmp = new customerMasterPage(driver);
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		
//		js.executeScript("arguments[0].click();", cmp.cancelBtn());
//		
//		cmp.addBtn().click();
//		Thread.sleep(2000);
//		
//		cmp.customerName().sendKeys("test@123");
//		Thread.sleep(2000);
//		
//		cmp.customerType().click();
//		Thread.sleep(2000);
//		
//		utilities.toSelectFromDropDown(cmp.customerType(), "Retailer");
//		Thread.sleep(2000);
//		
//		cmp.emailID().sendKeys("monika.kolpe@techneai.com");
//		Thread.sleep(2000);
//		
////		cmp.contactNumber().sendKeys("1234563215");
////		Thread.sleep(2000);
//		
//		if(cmp.contactNumber() != null){
//			System.out.println("TC_235 test case failed");
//		}else{
//			System.out.println("test case passed");
//		}
//		
//		cmp.address().sendKeys("pune");
//		Thread.sleep(2000); 
//		
//		cmp.pincode().sendKeys("123456");
//		Thread.sleep(2000);
//		
//		utilities.toSelectFromDropDown(cmp.selectCountry(), "India");
//		Thread.sleep(2000);
//		
//		utilities.toSelectFromDropDown(cmp.selectState(), "Maharashtra");
//		Thread.sleep(2000);
//		
//		utilities.toSelectFromDropDown(cmp.selectCity(), "Punee");
//		Thread.sleep(2000);
//		
//		cmp.enterRemark().sendKeys("test");
//		Thread.sleep(2000);
//		
//		cmp.activeStatus().click();
//		Thread.sleep(2000);
//		
//		js.executeScript("arguments[0].click();", cmp.createBtn());
//		//cmp.createBtn().click();
//		Thread.sleep(2000);
//		
//	
//	}
	
//	@Test(priority = 270)
//	public void TC_236_TC_248() throws InterruptedException, IOException{
//		
//		customerMasterPage cmp = new customerMasterPage(driver);
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		
//		js.executeScript("arguments[0].click();", cmp.cancelBtn());
//		
//		cmp.addBtn().click();
//		Thread.sleep(2000);
//		
//		cmp.customerName().sendKeys("test@123");
//		Thread.sleep(2000);
//		
//		cmp.customerType().click();
//		Thread.sleep(2000);
//		
//		utilities.toSelectFromDropDown(cmp.customerType(), "Retailer");
//		Thread.sleep(2000);
//		
//		cmp.emailID().sendKeys("monika.kolpe@techneai.com");
//		Thread.sleep(2000);
//		
//		cmp.contactNumber().sendKeys("1234563215");
//		Thread.sleep(2000);
//		
////		cmp.address().sendKeys("pune");
////		Thread.sleep(2000); 
//		
//
//		if(cmp.address() != null){
//			System.out.println("TC_236 test case failed");
//		}else{
//			System.out.println("test case passed");
//		}
//		
//		cmp.pincode().sendKeys("123456");
//		Thread.sleep(2000);
//		
//		utilities.toSelectFromDropDown(cmp.selectCountry(), "India");
//		Thread.sleep(2000);
//		
//		utilities.toSelectFromDropDown(cmp.selectState(), "Maharashtra");
//		Thread.sleep(2000);
//		
//		utilities.toSelectFromDropDown(cmp.selectCity(), "Punee");
//		Thread.sleep(2000);
//		
//		cmp.enterRemark().sendKeys("test");
//		Thread.sleep(2000);
//		
//		cmp.activeStatus().click();
//		Thread.sleep(2000);
//		
//		js.executeScript("arguments[0].click();", cmp.createBtn());
//		//cmp.createBtn().click();
//		Thread.sleep(2000);
//		
//	
//	}
	
//	@Test(priority = 280)
//	public void TC_237_TC249() throws InterruptedException, IOException{
//		
//		customerMasterPage cmp = new customerMasterPage(driver);
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		
//		js.executeScript("arguments[0].click();", cmp.cancelBtn());
//		
//		cmp.addBtn().click();
//		Thread.sleep(2000);
//		
//		cmp.customerName().sendKeys("test@123");
//		Thread.sleep(2000);
//		
//		cmp.customerType().click();
//		Thread.sleep(2000);
//		
//		utilities.toSelectFromDropDown(cmp.customerType(), "Retailer");
//		Thread.sleep(2000);
//		
//		cmp.emailID().sendKeys("monika.kolpe@techneai.com");
//		Thread.sleep(2000);
//		
//		cmp.contactNumber().sendKeys("1234563215");
//		Thread.sleep(2000);
//		
//		cmp.address().sendKeys("pune");
//		Thread.sleep(2000); 
//		
////		cmp.pincode().sendKeys("123456");
////		Thread.sleep(2000);
//		
//		if(cmp.pincode() != null){
//			System.out.println("TC_237 test case failed");
//		}else{
//			System.out.println("test case passed");
//		}
//		
//		utilities.toSelectFromDropDown(cmp.selectCountry(), "India");
//		Thread.sleep(2000);
//		
//		utilities.toSelectFromDropDown(cmp.selectState(), "Maharashtra");
//		Thread.sleep(2000);
//		
//		utilities.toSelectFromDropDown(cmp.selectCity(), "Punee");
//		Thread.sleep(2000);
//		
//		cmp.enterRemark().sendKeys("test");
//		Thread.sleep(2000);
//		
//		cmp.activeStatus().click();
//		Thread.sleep(2000);
//		
//		js.executeScript("arguments[0].click();", cmp.createBtn());
//		//cmp.createBtn().click();
//		Thread.sleep(2000);
//		
//	
//	}
	
//	@Test(priority = 290)
//	public void TC_238() throws InterruptedException, IOException{
//		
//		customerMasterPage cmp = new customerMasterPage(driver);
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		
//		js.executeScript("arguments[0].click();", cmp.cancelBtn());
//		
//		cmp.addBtn().click();
//		Thread.sleep(2000);
//		
//		cmp.customerName().sendKeys("test@123");
//		Thread.sleep(2000);
//		
//		cmp.customerType().click();
//		Thread.sleep(2000);
//		
//		utilities.toSelectFromDropDown(cmp.customerType(), "Retailer");
//		Thread.sleep(2000);
//		
//		cmp.emailID().sendKeys("monika.kolpe@techneai.com");
//		Thread.sleep(2000);
//		
//		cmp.contactNumber().sendKeys("1234563215");
//		Thread.sleep(2000);
//		
//		cmp.address().sendKeys("pune");
//		Thread.sleep(2000); 
//		
//		cmp.pincode().sendKeys("123456");
//		Thread.sleep(2000);
//		
////		utilities.toSelectFromDropDown(cmp.selectCountry(), "India");
////		Thread.sleep(2000);
//		
//		if(cmp.selectCountry().getText() == "India"){
//			System.out.println("TC_238 test case passed");
//		}else{
//			System.out.println("test case failed");
//		}
//		
//		utilities.toSelectFromDropDown(cmp.selectState(), "Maharashtra");
//		Thread.sleep(2000);
//		
//		utilities.toSelectFromDropDown(cmp.selectCity(), "Punee");
//		Thread.sleep(2000);
//		
//		cmp.enterRemark().sendKeys("test");
//		Thread.sleep(2000);
//		
//		cmp.activeStatus().click();
//		Thread.sleep(2000);
//		
//		js.executeScript("arguments[0].click();", cmp.createBtn());
//		//cmp.createBtn().click();
//		Thread.sleep(2000);
//		
//	
//	}
	
//	@Test(priority = 300)
//	public void TC_239() throws InterruptedException, IOException{
//		
//		customerMasterPage cmp = new customerMasterPage(driver);
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		
//		js.executeScript("arguments[0].click();", cmp.cancelBtn());
//		
//		cmp.addBtn().click();
//		Thread.sleep(2000);
//		
//		cmp.customerName().sendKeys("test@123");
//		Thread.sleep(2000);
//		
//		cmp.customerType().click();
//		Thread.sleep(2000);
//		
//		utilities.toSelectFromDropDown(cmp.customerType(), "Retailer");
//		Thread.sleep(2000);
//		
//		cmp.emailID().sendKeys("monika.kolpe@techneai.com");
//		Thread.sleep(2000);
//		
//		cmp.contactNumber().sendKeys("1234563215");
//		Thread.sleep(2000);
//		
//		cmp.address().sendKeys("pune");
//		Thread.sleep(2000); 
//		
//		cmp.pincode().sendKeys("123456");
//		Thread.sleep(2000);
//		
//		utilities.toSelectFromDropDown(cmp.selectCountry(), "India");
//		Thread.sleep(2000);
//		
////		utilities.toSelectFromDropDown(cmp.selectState(), "Maharashtra");
////		Thread.sleep(2000);
//		
//		if(cmp.selectState().getText() == "Maharashtra"){
//			System.out.println("TC_239 test case passed");
//		}else{
//			System.out.println("test case failed");
//		}
//		
//		utilities.toSelectFromDropDown(cmp.selectCity(), "Punee");
//		Thread.sleep(2000);
//		
//		cmp.enterRemark().sendKeys("test");
//		Thread.sleep(2000);
//		
//		cmp.activeStatus().click();
//		Thread.sleep(2000);
//		
//		js.executeScript("arguments[0].click();", cmp.createBtn());
//		//cmp.createBtn().click();
//		Thread.sleep(2000);
//		
//	
//	}
	
//	@Test(priority = 310)
//	public void TC_240() throws InterruptedException, IOException{
//		
//		customerMasterPage cmp = new customerMasterPage(driver);
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		
//		js.executeScript("arguments[0].click();", cmp.cancelBtn());
//		
//		cmp.addBtn().click();
//		Thread.sleep(2000);
//		
//		cmp.customerName().sendKeys("test@123");
//		Thread.sleep(2000);
//		
//		cmp.customerType().click();
//		Thread.sleep(2000);
//		
//		utilities.toSelectFromDropDown(cmp.customerType(), "Retailer");
//		Thread.sleep(2000);
//		
//		cmp.emailID().sendKeys("monika.kolpe@techneai.com");
//		Thread.sleep(2000);
//		
//		cmp.contactNumber().sendKeys("1234563215");
//		Thread.sleep(2000);
//		
//		cmp.address().sendKeys("pune");
//		Thread.sleep(2000); 
//		
//		cmp.pincode().sendKeys("123456");
//		Thread.sleep(2000);
//		
//		utilities.toSelectFromDropDown(cmp.selectCountry(), "India");
//		Thread.sleep(2000);
//		
//		utilities.toSelectFromDropDown(cmp.selectState(), "Maharashtra");
//		Thread.sleep(2000);
//		
//		utilities.toSelectFromDropDown(cmp.selectCity(), "Punee");
//		Thread.sleep(2000);
//		
//		if(cmp.selectCity().getText() == "Punee"){
//			System.out.println("TC_240 test case passed");
//		}else{
//			System.out.println("test case failed");
//		}
//		
//		cmp.enterRemark().sendKeys("test");
//		Thread.sleep(2000);
//		
//		cmp.activeStatus().click();
//		Thread.sleep(2000);
//		
//		js.executeScript("arguments[0].click();", cmp.createBtn());
//		//cmp.createBtn().click();
//		Thread.sleep(2000);
//		
//	
//	}
	
//	@Test(priority = 320)
//	public void TC_241() throws InterruptedException, IOException{
//		
//		customerMasterPage cmp = new customerMasterPage(driver);
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		Actions action = new Actions(driver);
//		
//		js.executeScript("arguments[0].click();", cmp.cancelBtn());
//		
//		cmp.editBtn().click();
//		Thread.sleep(2000);
//		
//		//action.doubleClick(cmp.deactiveStatus()).perform();
//		js.executeScript("arguments[0].click();", cmp.deactiveStatus());
//		//cmp.deactiveStatus().click();
//		Thread.sleep(2000);
//		
////		action.moveToElement(cmp.deactiveStatus()).clickAndHold();
////		Thread.sleep(2000);
//		
//		js.executeScript("arguments[0].click();", cmp.updateBtn());
//		//cmp.updateBtn().click();
//		Thread.sleep(2000);
//		
//		ss.takeScreenShot(driver, "deactiveStatus");	
//	
//	}
	
	@Test(priority = 330)
	public void TC_242() throws InterruptedException{
		
		customerMasterPage cmp = new customerMasterPage(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", cmp.cancelBtn());
		//cmp.cancelBtn().click();
		Thread.sleep(2000);
		
		System.out.println("edit button is present: " +cmp.editBtn().isDisplayed());
		
	}
	
	@Test(priority = 340)
	public void TC_243() throws InterruptedException{
		
		customerMasterPage cmp = new customerMasterPage(driver);
		
		System.out.println("current url is :" +driver.getCurrentUrl());
		
		cmp.editBtn().click();
		Thread.sleep(2000);
		
		System.out.println("expected url is :" +driver.getCurrentUrl());
	}
	
	@Test(priority = 350)
	public void TC_244() throws InterruptedException, IOException{
		
		customerMasterPage cmp = new customerMasterPage(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		cmp.customerName().clear();
		Thread.sleep(2000);
		
		cmp.customerName().sendKeys("customer 1");
		Thread.sleep(2000);
		
		js.executeScript("arguments[0].click();", cmp.updateBtn());
		Thread.sleep(2000);
		
		ss.takeScreenShot(driver, "updateRecord");
		
	}
	
	@Test(priority = 360)
	public void TC_250() throws InterruptedException{
		
		customerMasterPage cmp = new customerMasterPage(driver);
		
		cmp.editBtn().click();
		Thread.sleep(2000);
		
		System.out.println("update is working: " +cmp.updateBtn().isEnabled());
		
	}
	
	@Test(priority = 370)
	public void TC_251() throws InterruptedException, IOException{
		
		customerMasterPage cmp = new customerMasterPage(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", cmp.cancelBtn());
		//cmp.cancelBtn().click();
		Thread.sleep(2000);
		
		cmp.searchBar().sendKeys("monika");
		Thread.sleep(2000);
		
		cmp.searchBtn().click();
		Thread.sleep(2000);
		
		ss.takeScreenShot(driver, "search");
		
	}
	
	@Test(priority = 380)
	public void TC_252() throws InterruptedException{
		
		customerMasterPage cmp = new customerMasterPage(driver);
		
		cmp.refreshBtn().click();
		Thread.sleep(2000);
		
	}
	
	@Test(priority = 390)
	public void TC_253() throws InterruptedException{
		
		customerMasterPage cmp = new customerMasterPage(driver);
		
		cmp.srSort().click();
		Thread.sleep(2000);
		
	}
	
	@Test(priority = 400)
	public void TC_254() throws InterruptedException{
		
		customerMasterPage cmp = new customerMasterPage(driver);
		
		cmp.nameSort().click();
		Thread.sleep(2000);
		
	}
	
	@Test(priority = 410)
	public void TC_255() throws InterruptedException{
		
		customerMasterPage cmp = new customerMasterPage(driver);
		
		cmp.typeSort().click();
		Thread.sleep(2000);
		
	}
	
	@Test(priority = 420)
	public void TC_256() throws InterruptedException{
		
		customerMasterPage cmp = new customerMasterPage(driver);
		
		cmp.remarkSort().click();
		Thread.sleep(2000);
		
	}
	
	@Test(priority = 430)
	public void TC_257() throws InterruptedException{
		
		customerMasterPage cmp = new customerMasterPage(driver);
		
		cmp.updatedBySort().click();
		Thread.sleep(2000);
		
	}
	
	@Test(priority = 440)
	public void TC_258() throws InterruptedException{
		
		customerMasterPage cmp = new customerMasterPage(driver);
		
		cmp.updatedAtSort().click();
		Thread.sleep(2000);
		
	}
	
	@Test(priority = 450)
	public void TC_259() throws InterruptedException{
		
		homePage hp = new homePage(driver);
		customerMasterPage cmp = new customerMasterPage(driver);
		
		hp.masters().click();
		Thread.sleep(2000);
		
		hp.userMaster().click();
		Thread.sleep(2000);
		
		cmp.addBtn().click();
		Thread.sleep(2000);
		
		//System.out.println("select customer field is present: " +hp.);
		cmp.accountFor().click();
		Thread.sleep(2000);
		
		utilities.toSelectFromDropDown(cmp.accountFor(), "CUSTOMER");
		Thread.sleep(2000);
		
		System.out.println("Select Customer field is present : " +cmp.selectCustomer().isDisplayed());
		
	}
	
	@Test(priority = 460)
	public void TC_260() throws InterruptedException, IOException{
		
		customerMasterPage cmp = new customerMasterPage(driver);
		
		cmp.selectCustomer().click();
		Thread.sleep(2000);
		
		ss.takeScreenShot(driver, "selectCustomerDropdown");
		
	}
	
	@Test(priority = 470)
	public void TC_261() throws InterruptedException, IOException{
		
		customerMasterPage cmp = new customerMasterPage(driver);
		
		Select s = new Select(cmp.selectCustomer());
	      // getting the list of options in the dropdown with getOptions()
	      List <WebElement> op = s.getOptions();
	      int size = op.size();
	      for(int i =0; i<size ; i++){
	         String options = op.get(i).getText();
	         System.out.println(options);
	      }
		
	}
	
	
	
}