package Skillrary.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig()
	{
		File src=new File("./Configuration/config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		}catch(Exception e) {
			System.out.println("Exception is "+ e.getMessage());
		}
	}
	
	public String getApplicationurl1()
	{
		String URL1=pro.getProperty("url");
		return URL1;
	}
	public String getusername()
	{
		String usern=pro.getProperty("username");
		return usern;
	}
	public String getpassword()
	{
		String userp=pro.getProperty("password");
		return userp;
	}
	public String getchromebrowser()
	{
		String chrome=pro.getProperty("chromepath");
		return chrome;
	}
	public String getinterexplore()
	{
		String ied=pro.getProperty("iedriver");
		return ied;
	}
	public String getgecko()
	{
		String gecko=pro.getProperty(" geckodriver");
		return gecko;
	}

	

}
