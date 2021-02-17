package com.qa.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.pages.DirectoryPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.testbase.TestBase1;

public class DirectoryPageTest extends TestBase1{

	LoginPage loginpage;
	HomePage homepage;
	DirectoryPage directoryPage;
	public DirectoryPageTest() throws Exception {
		super();
	}

	@BeforeClass
	public void setup() throws Exception
	{
		initialisation();
		loginpage=new LoginPage();
		homepage=loginpage.userLogin(prop.getProperty("username"), prop.getProperty("password"));
		directoryPage=new DirectoryPage();
	}
	@Test(priority=1)
	public void selectDirectory()
	{
		directoryPage.gotodirectory();	
	}
}
