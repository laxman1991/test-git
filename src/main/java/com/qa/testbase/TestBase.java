package com.qa.testbase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public WebDriver driver;
	public Properties prop;
	public FileInputStream input=null;
	public WebDriver initBrowser(String browserName)
	{
        if(browserName.equals("Chrome"))
        {
        	System.setProperty("webdriver.chrome.driver","D://JarfilesandLibraryanddrivers//chromedriver_win32//"
                    + "chromedriver//chromedriver.exe");
        	if(prop.getProperty("headless").equalsIgnoreCase("yes"))
                  {
	                   //headless code here.
                  }
             driver=new ChromeDriver();
        }
        return driver;
	}
	public Properties initProperties() throws IOException
	{
		  prop=new Properties();
		  input= new FileInputStream("/KeywordDrivenFramework/src/main/java/com/properties/prop.properties");
		  prop.load(input);
		  return prop;
	}
}
