package Skillrary.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	WebDriver driver;

	public Loginpage(WebDriver driver) {
	this.driver=driver;
	  PageFactory.initElements(driver, this);
	}

	@FindBy(linkText="LOGIN")
	WebElement loginlink;
	
	@FindBy(id="email")
	WebElement emailbox;
	
	@FindBy(id="password")
	WebElement passwordbox;
	
	@FindBy(id="last")
	WebElement loginbutton;
	
	public void loginlink()
	{
		loginlink.click();
		
	}
	public void username(String email)
	{
		emailbox.sendKeys(email);
		
	}
	public void password(String password)
	{
		passwordbox.sendKeys(password);
		
	}
	public void loginbutton()
	{
		loginbutton.click();
	}
	
	
	
}



