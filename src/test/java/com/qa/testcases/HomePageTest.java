package com.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.testbase.TestBase1;
public class HomePageTest extends TestBase1{

	LoginPage loginpage;
	HomePage homepage;
	public HomePageTest() throws Exception {
		super();
	}
	@BeforeTest
	public void setUp() throws Exception
	{
		initialisation();
		loginpage=new LoginPage();
		homepage=loginpage.userLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	@Test(priority=1)
	public void selectAdmin()
	{
		homepage.selectAdminTab();
	}
	@Test(priority=2)
	public void userNameWelcomeText()
	{
		String welcomeText=homepage.getUserNameText();
		System.out.println(welcomeText);
	}
/*	@AfterTest
	public void teardown1()
	{
		driver.close();
	}
*/
}

