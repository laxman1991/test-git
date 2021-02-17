package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.testbase.TestBase1;

public class HomePage extends TestBase1
{
	public Select select;
	@FindBy(id="welcome")
	WebElement welcomeUserName;
	
	@FindBy(id="menu_admin_viewAdminModule")
	WebElement selectadmin;
	
	public HomePage() throws Exception {
		PageFactory.initElements(driver,this);
	}
	public String getUserNameText()
	{
		return welcomeUserName.getText();
	}
	public void selectAdminTab()
	{
		selectadmin.click();
	}
}
