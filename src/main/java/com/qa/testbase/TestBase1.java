package com.qa.testbase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import com.qa.util.TestUtil;
public class TestBase1 {

	public static Properties prop;
	public static WebDriver driver;
	FileInputStream file;
	public TestBase1() throws Exception {
        prop=new Properties();
        file=new FileInputStream("D://Laxman_selenium_10122020//HybridFrameworkWithPOMandDataDriven//src//main//"
        		+ "java//com//qa//config//config.properties");
        prop.load(file);
	}
	public static void initialisation()
	{
		String browserName=prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome"))
		{
           System.setProperty("webdriver.chrome.driver","D://JarfilesandLibraryanddrivers//chromedriver_win32//"
                    + "chromedriver//chromedriver.exe");
           driver=new ChromeDriver();	
		}
		else if(browserName.equalsIgnoreCase("ff"))
		{
           System.setProperty("webdriver.firefox.driver","");
           driver=new FirefoxDriver();	
		}
		else if(browserName.equalsIgnoreCase("safari"))
		{
           System.setProperty("webdriver.chrome.driver","");
           driver=new SafariDriver();	
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		//driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
	}
}
	