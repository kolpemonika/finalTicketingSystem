package generic;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;

import generic.functions;
import generic.functions.propertyFile;
import generic.functions.screenShot;
import generic.functions.webDriverUtilities;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class baseClass extends functions  {

		public String timestamp = new SimpleDateFormat("dd-MMM-yyyy_HH-mm-ss").format(new java.util.Date());
		protected String currentDir = System.getProperty("user.dir");

		functions c = new functions();

		public functions.propertyFile p = c.new propertyFile();
		public functions.webDriverUtilities utilities = c.new webDriverUtilities();
		public functions.screenShot ss = c.new screenShot();
		//public functions.AutoConstant autoConstant = c.new AutoConstant();

		public static WebDriver driver;

		
		@BeforeTest
		@org.testng.annotations.Parameters("browser")
		public void launchBrowser(@Optional("chrome") String browser) throws Exception
		{		

			if(browser.equalsIgnoreCase("firefox")){
				//	System.setProperty("webdriver.gecko.driver", ".\\geckodriver.exe");
				WebDriverManager.firefoxdriver().setup();

				driver = new FirefoxDriver();
			}

			//Check if parameter passed as 'chrome'
			else if(browser.equalsIgnoreCase("chrome")){
				//set path to chromedriver.exe
				//System.setProperty("webdriver.chrome.driver",".\\chromedriver.exe");

				WebDriverManager.chromedriver().setup();

				//create chrome instance
				driver = new ChromeDriver();
			}

			//Check if parameter passed as 'Edge'
			else if(browser.equalsIgnoreCase("Edge")){
				//set path to Edge.exe
				WebDriverManager.edgedriver().setup();

				//	System.setProperty("webdriver.edge.driver",".\\MicrosoftWebDriver.exe");
				//create Edge instance
				driver = new EdgeDriver();
			}

			else{

				//If no browser passed throw exception
				throw new Exception("Browser is not correct");
				//WebDriverManager.chromedriver().setup();
			}

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebDriverManager.chromedriver().setup();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); 
					
			
			}

		@AfterTest
		public void closeBrowser() throws IOException, InterruptedException
		{

		//	driver.close();

		}



}
