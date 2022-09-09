package Skillrary.testcases;

import org.testng.annotations.Test;

import Skillrary.pageobject.Loginpage;

public class TC_Login_01 extends preload {
	
	
	
	@Test
	public void login()
	{
		Loginpage li=new Loginpage(driver);
		
		logger.info("URL is opened");
		li.loginlink();
		li.username(username);
		logger.info("Enterd user name");
		li.password(password);
		logger.info("Enterd password");
		li.loginbutton();
		logger.info("Clicked on login button");
		
		
	}

}
