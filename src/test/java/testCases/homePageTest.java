package testCases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import generic.baseClass;
import pages.homePage;
import pages.loginPage;
import pages.roleMasterPage;

public class homePageTest extends baseClass{

	@Test
	public void setUp() throws FileNotFoundException, IOException, InterruptedException{
		
		homePage hp = new homePage(driver);
		loginPage lp = new loginPage(driver);
		 
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
		
//		hp.masters().click();
//		Thread.sleep(2000);
		
	}
	
	@Test(priority = 1)
	public void displayNotification(){
		
		homePage hp = new homePage(driver);
		
		System.out.println("notification bell is present: " +hp.notificationBell().isDisplayed());
	}
	
	@Test(priority = 2)
	public void openNotification() throws InterruptedException, IOException{
		 
		homePage hp = new homePage(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", hp.notificationBell());
		Thread.sleep(2000);
		
		ss.takeScreenShot(driver, "notificationPopUp");
		
		hp.viewAllNotification().click();
		Thread.sleep(2000);
		
	}
	
	@Test(priority = 3)
	public void closeNotification() throws InterruptedException{
		
		homePage hp = new homePage(driver);
		
		hp.notificationBell().click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 4)
	public void profilePic(){
		
		homePage hp = new homePage(driver);
		
		hp.profilePic().click();
		
	}
}
