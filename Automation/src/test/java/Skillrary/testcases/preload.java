package Skillrary.testcases;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import Skillrary.utilities.ReadConfig;




public class preload {
	ReadConfig readconfig=new ReadConfig();
	
	
	public String URL=readconfig.getApplicationurl1();
	public String username=readconfig.getusername();
	public String password=readconfig.getpassword();
	public WebDriver driver;
	
	public static  Logger logger;
	
	@Parameters("browser")
	@BeforeClass
	public void driverload(String br)
	{ 
		 logger = Logger.getLogger("Automation");
		 PropertyConfigurator.configure("Log4j2.properties");
		 
		
		 if(br.equals("chrome"))
		 {
			 System.setProperty("webdriver.chrome.driver",readconfig.getchromebrowser());
			 driver = new ChromeDriver();
			 
		 }else if(br.equals("firefox"))
		 {
			 System.setProperty("webdriver.chrome.driver",readconfig.getgecko());
			 driver = new FirefoxDriver();
			 
		 }else if(br.equals("ie"))
		 {
			 System.setProperty("webdriver.chrome.driver",readconfig.getinterexplore());
			 driver = new InternetExplorerDriver();
			 
		 } 
		 driver.get(URL);
		
	}
	
	@AfterClass
	public void closebrowser()
	{
		driver.quit();
	}

}
