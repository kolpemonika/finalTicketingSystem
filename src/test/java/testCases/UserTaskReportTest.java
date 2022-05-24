package testCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;

import generic.baseClass;
import junit.framework.Assert;
import pages.UserTaskReportPage;
import pages.departmentMasterPage;
import pages.homePage;
import pages.loginPage;

public class UserTaskReportTest extends baseClass{

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
	public void TC_100(){
		
		homePage hp = new homePage(driver);
		
		System.out.println("report menu is present: " +hp.reportMenu().isDisplayed());
		
	}
	
	@Test(priority = 20)
	public void TC_101() throws IOException, InterruptedException{
		
		homePage hp = new homePage(driver);
		
		hp.reportMenu().click();
		Thread.sleep(2000);
		
		ss.takeScreenShot(driver, "reportDropdown");
		
	}
	
	@Test(priority = 30)
	public void TC_102() throws InterruptedException{
		
		homePage hp = new homePage(driver);
		
		System.out.println("User task report menu is present: " +hp.userTaskReportMenu().isDisplayed());
		Thread.sleep(2000);
		
	}
	
	@Test(priority = 40)
	public void TC_103() throws InterruptedException{
		
		homePage hp = new homePage(driver);
		
		System.out.println("current url is : " +driver.getCurrentUrl());

		hp.userTaskReportMenu().click();
		Thread.sleep(2000);
		
		System.out.println("Expected url is: " +driver.getCurrentUrl());
		
	}
//	
//	@Test(priority = 50)
//	public void TC_104() throws InterruptedException{
//		
//		UserTaskReportPage utrp = new UserTaskReportPage(driver);
//		
//		System.out.println("From date field is present: " +utrp.fromDate().isDisplayed());
//		Thread.sleep(2000);
//		
//	}
//	
////	@Test(priority = 60)
////	public void TC_105() throws InterruptedException, IOException{
////		
////		UserTaskReportPage utrp = new UserTaskReportPage(driver);
////		
////		utrp.fromDate().click();
////		Thread.sleep(2000);
////		
////		ss.takeScreenShot(driver, "fromDateCalender");
////		
////	}
//	
//	@Test(priority = 70)
//	public void TC_106() throws InterruptedException{
//		
//		UserTaskReportPage utrp = new UserTaskReportPage(driver);
//		
//		System.out.println("to date field is present: " +utrp.toDate().isDisplayed());
//		Thread.sleep(2000);
//		
//	}
//	
////	@Test(priority = 80)
////	public void TC_107() throws InterruptedException, IOException{
////		
////		UserTaskReportPage utrp = new UserTaskReportPage(driver);
////		
////		utrp.toDate().click();
////		Thread.sleep(2000);
////		
////		ss.takeScreenShot(driver, "toDateCalender");
////		
////	}
//	
////	@Test(priority = 90)
////	public void TC_108() throws InterruptedException, IOException{
////		
////		UserTaskReportPage utrp = new UserTaskReportPage(driver);
////		JavascriptExecutor js = (JavascriptExecutor)driver;
////		
////		js.executeScript("arguments[0].click();", utrp.selectUser());
////		//utrp.selectUser().click();
////		Thread.sleep(2000);	
////		
////	}
//	
//	@Test(priority = 100)
//	public void TC_109() throws InterruptedException, IOException{
//		
//		UserTaskReportPage utrp = new UserTaskReportPage(driver);
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		
//		utrp.selectUser().sendKeys("Monika Kolpe");
//		utrp.selectUser().sendKeys(Keys.ENTER);
//		Thread.sleep(2000);
//		
//		js.executeScript("arguments[0].click();", utrp.selectUser());
//		Thread.sleep(2000);
//		
//		utrp.fromDate().sendKeys("29/04/2022");
//		Thread.sleep(2000);
//		
//		utrp.toDate().sendKeys("27/04/2022");
//		Thread.sleep(2000);
//		
//		utrp.searchBtn().click();
//		Thread.sleep(2000);
//		
//	}
//	
//	@Test(priority = 110)
//	public void TC_111() throws InterruptedException, IOException{
//		
//		UserTaskReportPage utrp = new UserTaskReportPage(driver);
//		
//		utrp.refreshBtn().click();
//		Thread.sleep(2000);
//		
//		utrp.fromDate().sendKeys("29/04/2022");
//		Thread.sleep(2000);
//		
//		utrp.searchBtn().click();
//		Thread.sleep(2000);
//		
//		ss.takeScreenShot(driver, "reportFromDate");
//	}
//	
//	@Test(priority = 120)
//	public void TC_112() throws InterruptedException, IOException{
//		
//		UserTaskReportPage utrp = new UserTaskReportPage(driver);
//		
//		utrp.refreshBtn().click();
//		Thread.sleep(2000);
//		
//		utrp.selectUser().sendKeys("Monika Kolpe");
//		utrp.selectUser().sendKeys(Keys.ENTER);
//		Thread.sleep(2000);
//		
//		utrp.taskName().sendKeys("test");
//		Thread.sleep(2000);
//		
////		utrp.fromDate().sendKeys("29/04/2022");
////		Thread.sleep(2000);
//		
//		utrp.toDate().sendKeys("2/05/2022");
//		Thread.sleep(2000);
//		
//		utrp.searchBtn().click();
//		Thread.sleep(2000);
//		
//		ss.takeScreenShot(driver, "reportFromDate");
//		Thread.sleep(3000);
//		
//		utrp.refreshBtn().click();
//		Thread.sleep(2000);
//		
//		utrp.selectUser().sendKeys("Monika Kolpe");
//		utrp.selectUser().sendKeys(Keys.ENTER);
//		Thread.sleep(2000);
//		
//		utrp.taskName().sendKeys("test");
//		Thread.sleep(2000);
//		
//		utrp.fromDate().sendKeys("29/04/2022");
//		Thread.sleep(2000);
//		
////		utrp.toDate().sendKeys("2/05/2022");
////		Thread.sleep(2000);
//		
//		utrp.searchBtn().click();
//		Thread.sleep(2000);
//		
//		ss.takeScreenShot(driver, "reportToDate");
//		
//	}
//	
//	@Test(priority = 130)
//	public void TC_113() throws InterruptedException, IOException{
//		
//		UserTaskReportPage utrp = new UserTaskReportPage(driver);
//		
//		utrp.refreshBtn().click();
//		Thread.sleep(2000);
//		
//		utrp.selectUser().sendKeys("Monika Kolpe");
//		utrp.selectUser().sendKeys(Keys.ENTER);
//		Thread.sleep(2000);
//		
//		utrp.taskName().sendKeys("test");
//		Thread.sleep(2000);
//		
//		utrp.searchBtn().click();
//		Thread.sleep(2000);
//		
//		ss.takeScreenShot(driver, "errorMessage");
//	}
//	
//	@Test(priority = 140)
//	public void TC_114() throws InterruptedException, IOException{
//		
//		UserTaskReportPage utrp = new UserTaskReportPage(driver);
//		
//		utrp.refreshBtn().click();
//		Thread.sleep(2000);
//		
//		System.out.println("Sr column is present: " +utrp.srColumn().isDisplayed());
//
//		System.out.println("Ticket ID column is present: " +utrp.ticketIDColumn().isDisplayed());
//	
//		System.out.println("Task Name column is present: " +utrp.taskStatusColumn().isDisplayed());
//	
//		System.out.println("User Name column is present: " +utrp.userNameColumn().isDisplayed());
//		
//		System.out.println("Task status column is present: " +utrp.taskName().isDisplayed());
//	
//		System.out.println("Total Worked column is present: " +utrp.totalWorkedColumn().isDisplayed());
//	
//		System.out.println("Updated At column is present: " +utrp.updatedAtColumn().isDisplayed());
//		
//	
//	}
//	
//	@Test(priority = 150)
//	public void TC_115(){
//		
//		UserTaskReportPage utrp = new UserTaskReportPage(driver);
//		
//		
//	}
//	
//	@Test(priority = 160)
//	public void TC_122(){
//		
//		UserTaskReportPage utrp = new UserTaskReportPage(driver);
//		
//		System.out.println("user name filter is present: " +utrp.selectUser().isDisplayed());
//		
//	}
//	
//	@Test(priority = 170)
//	public void TC_123(){
//		
//		UserTaskReportPage utrp = new UserTaskReportPage(driver);
//		
//		System.out.println("user name filter is present: " +utrp.taskName().isDisplayed());
//		
//	}
//	
//	@Test(priority = 180)
//	public void TC_124(){
//		
//		UserTaskReportPage utrp = new UserTaskReportPage(driver);
//		
//		System.out.println("Search button is present: " +utrp.searchBtn().isDisplayed());
//		
//	}
//	
//	@Test(priority = 190)
//	public void TC_125_TC_131() throws InterruptedException{
//		
//		UserTaskReportPage utrp = new UserTaskReportPage(driver);
//		
//		utrp.fromDate().sendKeys("25/04/2022");
//		Thread.sleep(2000);
//		
//		utrp.toDate().sendKeys("30/04/2022");
//		Thread.sleep(2000);
//		
//		utrp.searchBtn().click();
//	}
//	
//	@Test(priority = 200)
//	public void TC_126_TC_127() throws InterruptedException{
//		
//		UserTaskReportPage utrp = new UserTaskReportPage(driver);
//		
//		System.out.println("Refresh button is present: " +utrp.refreshBtn().isDisplayed());
//
//		utrp.refreshBtn().click();
//		Thread.sleep(2000);
//	}
//	
//	@Test(priority = 210)
//	public void TC_128(){
//		
//		UserTaskReportPage utrp = new UserTaskReportPage(driver);
//		
//		System.out.println("Export button is present: " +utrp.exportBtn().isDisplayed());
//		
//	}
//	
//	@Test(priority = 220)
//	public void TC_129() throws IOException, InterruptedException{
//		
//		UserTaskReportPage utrp = new UserTaskReportPage(driver);
//		
//		utrp.exportBtn().click();
//		Thread.sleep(2000);
//		
//		ss.takeScreenShot(driver, "downloadReport");
//	}
	
	@Test(priority = 230)
	public void TC_130() throws IOException, InterruptedException{
		
		UserTaskReportPage utrp = new UserTaskReportPage(driver);
		
		//FileInputStream fs = new FileInputStream("/home/bharat/Desktop/Eclipse Setup-Jan 2021/Snehal_Workspace/MavenProject/User_Task_Report.xlsx");
		
		File file =    new File("/home/bharat/Desktop/Eclipse Setup-Jan 2021/Snehal_Workspace/MavenProject/User_Task_Report.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(inputStream);
		
		XSSFSheet sheet=wb.getSheet("data");
		
		XSSFRow row0=sheet.getRow(0);
		XSSFCell cell=row0.getCell(0);
		
		String firstColumn= cell.getStringCellValue();
		 
		System.out.println("First column value is: " +firstColumn);
		 
		XSSFRow row1=sheet.getRow(0);
		XSSFCell cell1=row0.getCell(1);
			
		String secondColumn= cell1.getStringCellValue();
			 
	    System.out.println("Second column value is: " +secondColumn);
	    
//	    XSSFRow row2=sheet.getRow(0);
		XSSFCell cell2=row0.getCell(2);
			
		String thirdColumn= cell2.getStringCellValue();
			 
	    System.out.println("Third column value is: " +thirdColumn);
	    
//	    XSSFRow row3=sheet.getRow(0);
		XSSFCell cell3=row0.getCell(3);
			
		String fourthColumn= cell3.getStringCellValue();
			 
	    System.out.println("Fourth column value is: " +fourthColumn);
	    
//	    XSSFRow row4=sheet.getRow(0);
		XSSFCell cell4=row0.getCell(4);
			
		String fifthColumn= cell4.getStringCellValue();
			 
	    System.out.println("Fifth column value is: " +fifthColumn);
	    
//	    XSSFRow row5=sheet.getRow(0);
		XSSFCell cell5=row0.getCell(5);
			
		String sixthColumn= cell5.getStringCellValue();
			 
	    System.out.println("Sixth column value is: " +sixthColumn);
	    
//	    XSSFRow row6=sheet.getRow(0);
		XSSFCell cell6=row0.getCell(6);
			
		String seventhColumn= cell6.getStringCellValue();
			 
	    System.out.println("Seventh column value is: " +seventhColumn);
	    
	    
	    Assert.assertEquals(firstColumn, utrp.srColumn().getText());
	    Assert.assertEquals(secondColumn, utrp.ticketIDColumn().getText());
	    Assert.assertEquals(thirdColumn, utrp.taskNameColumn().getText());
	    Assert.assertEquals(fourthColumn, utrp.userNameColumn().getText());
	    Assert.assertEquals(fifthColumn, utrp.taskStatusColumn().getText());
	    Assert.assertEquals(sixthColumn, utrp.totalWorkedColumn().getText());
	    Assert.assertEquals(seventhColumn, utrp.updatedAtColumn().getText());
	    
	   
	}
	
}
