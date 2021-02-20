package com.qa.testcases;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.testbase.TestBase1;

public class LoginPageTest extends TestBase1{

	public LoginPage loginpage;
	public HomePage homepage;
	public LoginPageTest() throws Exception {
		super();
	}
	@BeforeTest
	public void setup() throws Exception
	{
		initialisation();
		loginpage=new LoginPage();
	}	
	@Test(priority=3)
	public void islogoDisplay()
	{
		loginpage.isDisplayedLogo();
	}
	@Test(priority=2)
	public void verifyTitle()
	{
		String title=loginpage.verifyLoginpageTitle();
		System.out.println("title=="+title);
		Assert.assertEquals(title,"OrangeHRM","mismatch title");
	}
	@Test(priority=1)
	public void loginTest()
	{
		try {
			homepage=loginpage.userLogin(prop.getProperty("username"),prop.getProperty("password"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.getMessage());
		}
	}
	/*@AfterTest
	public void tearDown2()
	{
		driver.close();
	}*/
}