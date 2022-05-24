package testCases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import generic.baseClass;
import pages.countryMasterPage;
import pages.homePage;
import pages.loginPage;

public class countryMasterTest extends baseClass{

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
		
		hp.masters().click();
		Thread.sleep(2000);
		
		hp.countryMaster().click();
		Thread.sleep(2000);
		
	}
	
	@Test(priority = 1)
	public void displayElements() throws InterruptedException{
		
		countryMasterPage cmp = new countryMasterPage(driver);
	
		String actualHeading = cmp.heading().getText();
		String expectedHeading = "Country Master";
		
		System.out.println("heading of the page is: " +actualHeading);
		
		if(actualHeading == expectedHeading){
			System.out.println("heading is correct");
		}else{
			System.out.println("heading is not correct");
		}
		Thread.sleep(2000);
		
		System.out.println("Add button is present: " +cmp.addBtn().isDisplayed());
	}
	
	
	
	
}
