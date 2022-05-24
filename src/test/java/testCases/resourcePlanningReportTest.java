package testCases;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;

import generic.baseClass;
import pages.departmentMasterPage;
import pages.homePage;
import pages.loginPage;
import pages.resourcePlanningReportPage;

public class resourcePlanningReportTest extends baseClass{

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
	public void TC_02() throws InterruptedException{
		
		homePage hp = new homePage(driver);
		
		System.out.println("Report menu is present: " +hp.reportMenu().isDisplayed());
		Thread.sleep(2000);
	
	}

	@Test(priority = 20)
	public void TC_03() throws InterruptedException{
		
		homePage hp = new homePage(driver);
		
		hp.reportMenu().click();
		Thread.sleep(3000);
		
		System.out.println("Resource Planning Report menu is present: " +hp.resourcePlanningReport().isDisplayed());
		Thread.sleep(2000);
	
	}
	
	@Test(priority = 30)
	public void TC_04() throws InterruptedException{
		
		homePage hp = new homePage(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		String currentURL = driver.getCurrentUrl();
		System.out.println("Current URL is: " +driver.getCurrentUrl());
		
		js.executeScript("arguments[0].click();", hp.resourcePlanningReport());
		Thread.sleep(2000);
		
		String expectedURL = driver.getCurrentUrl();
		System.out.println("Redirected URL is: " +driver.getCurrentUrl());
	}
	
	@Test(priority = 40)
	public void TC_05(){
		
		resourcePlanningReportPage rp = new resourcePlanningReportPage(driver);
		
		//System.out.println("select user field is present: " +rp.selectUser().isDisplayed());
		
	}
	
	@Test(priority = 50)
	public void TC_06(){
		
		resourcePlanningReportPage rp = new resourcePlanningReportPage(driver);
		
		System.out.println("From Date field is present: " +rp.fromDate().isDisplayed());
		
	}
	
	@Test(priority = 60)
	public void TC_07(){
		
		resourcePlanningReportPage rp = new resourcePlanningReportPage(driver);
		
		System.out.println("To Date field is present: " +rp.toDate().isDisplayed());
		
	}
	
	@Test(priority = 70)
	public void TC_08() throws InterruptedException, IOException{
		
		resourcePlanningReportPage rp = new resourcePlanningReportPage(driver);
		
		rp.searchBtn().click();
		Thread.sleep(2000);
		
		ss.takeScreenShot(driver, "validations");
	}
	
	@Test(priority = 80)
	public void TC_09() throws InterruptedException, IOException{
		
		resourcePlanningReportPage rp = new resourcePlanningReportPage(driver);
		
//		rp.selectUser().click();
//		Thread.sleep(2000);
		
//		List<WebElement> opt = rp.selectUser();
//	      int s = opt.size();
//	      // Iterating through the list selecting the desired option
//	      for( int j = 0; j< opt.size();j++){
//	         // if the option is By Subject click that option
//	         if( opt.get(j).getText().equals("Monika Kolpe")){
//	            opt.get(j).click();
//	            break;
//	         }
//	      }
		
	    Thread.sleep(2000);
		
		rp.fromDate().click();
		Thread.sleep(2000);
		
		rp.fromDate().sendKeys("18/04/2022");
		Thread.sleep(2000);
		
		rp.toDate().click();
		Thread.sleep(2000);
		
		rp.toDate().sendKeys("25/04/2022");
		Thread.sleep(2000);
		
		rp.searchBtn().click();
		Thread.sleep(2000);
		
		ss.takeScreenShot(driver, "validations");
	}
	
	@Test(priority = 90)
	public void TC_11(){
		
		resourcePlanningReportPage rp = new resourcePlanningReportPage(driver);
		
		System.out.println("Search button is present: " +rp.searchBtn().isDisplayed());
		
	}
	
	@Test(priority = 100)
	public void TC_12() throws InterruptedException{
		
		resourcePlanningReportPage rp = new resourcePlanningReportPage(driver);
		
		rp.fromDate().click();
		Thread.sleep(2000);
		
		rp.fromDate().sendKeys("18/04/2022");
		Thread.sleep(2000);
		
		rp.toDate().click();
		Thread.sleep(2000);
		
		rp.toDate().sendKeys("25/04/2022");
		Thread.sleep(2000);
		
		rp.searchBtn().click();
		Thread.sleep(2000);
		
		
	}
	
	@Test(priority = 110)
	public void TC_13(){
		
		resourcePlanningReportPage rp = new resourcePlanningReportPage(driver);
		
		System.out.println("Reload button is present :" +rp.reloadBtn().isDisplayed());
		
	}
	
	@Test(priority = 120)
	public void TC_14() throws InterruptedException{
		
		resourcePlanningReportPage rp = new resourcePlanningReportPage(driver);
		
		rp.reloadBtn().click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 130)
	public void TC_15() throws IOException, InterruptedException{
		
		resourcePlanningReportPage rp = new resourcePlanningReportPage(driver);
		
		rp.dropdownArrowBtn().click();
		Thread.sleep(2000);
		
		ss.takeScreenShot(driver, "dropdownSelectUser");
	}
	
	@Test(priority = 140)
	public void TC_16() throws InterruptedException, IOException{
		
		resourcePlanningReportPage rp = new resourcePlanningReportPage(driver);
		
		rp.fromDate().click();
		Thread.sleep(2000);
		
		rp.fromDate().sendKeys("18/04/2022");
		Thread.sleep(2000);
		
		rp.toDate().click();
		Thread.sleep(2000);
		
		rp.toDate().sendKeys("25/04/2022");
		Thread.sleep(2000);
		
		rp.searchBtn().click();
		Thread.sleep(2000);
		
		ss.takeScreenShot(driver, "fromDateToDate");
	
	}
	
	@Test(priority = 150)
	public void TC_18() throws InterruptedException{
		
		resourcePlanningReportPage rp = new resourcePlanningReportPage(driver);
		
		rp.fromDate().clear();
		Thread.sleep(2000);
		
		rp.toDate().clear();
		Thread.sleep(2000);
		
		rp.searchBtn().click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 160)
	public void TC_19() throws InterruptedException{
		
		resourcePlanningReportPage rp = new resourcePlanningReportPage(driver);

		System.out.println("Export button is present: " +rp.exportBtn().isDisplayed());
	}
	
	@Test(priority = 160)
	public void TC_20() throws InterruptedException{
		
		resourcePlanningReportPage rp = new resourcePlanningReportPage(driver);

		rp.exportBtn().click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 170)
	public void TC_21() throws InterruptedException, IOException{
		
		resourcePlanningReportPage rp = new resourcePlanningReportPage(driver);     
		
		rp.exportBtn().click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 170)
	public void TC_23() throws InterruptedException, IOException{
		
		resourcePlanningReportPage rp = new resourcePlanningReportPage(driver);

		rp.reloadBtn().click();
		Thread.sleep(2000);
		
		rp.fromDate().sendKeys("25/04/2022");
		Thread.sleep(2000);
		
		rp.toDate().sendKeys("22/04/2022");
		Thread.sleep(2000);
		
		rp.searchBtn().click();
		Thread.sleep(2000);
		
		
	}
}
