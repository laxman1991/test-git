package com.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.testbase.TestBase1;

public class LoginPage extends TestBase1{

	@FindBy(name="txtUsername")
	WebElement username;
	
	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(name="Submit")
	WebElement login;
	
	@FindBy(xpath="//*[@id='branding']/a[1]/img")
	WebElement logo;

	public LoginPage() throws Exception{
    PageFactory.initElements(driver, this);
	}
    public String verifyLoginpageTitle()
    {
    	return driver.getTitle();
    }
    public boolean isDisplayedLogo()
    {
    	return logo.isDisplayed(); 
    }
    public HomePage userLogin(String user,String pass) throws Exception
    {
    	username.sendKeys(user);
    	password.sendKeys(pass);
    	login.click();
    	return new HomePage();
    }
}
