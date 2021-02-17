package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.TestBase1;

public class DirectoryPage extends TestBase1{

  @FindBy(xpath="//*[@id='content']/div[1]/a")
  WebElement hideTab;
  
  @FindBy(id="menu_directory_viewDirectory")
  WebElement directory;
	
	public DirectoryPage() throws Exception {
		PageFactory.initElements(driver, this);
	}
	public void gotodirectory()
	{
		directory.click();
	}
}
