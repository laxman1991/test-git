package com.qa.util;

import com.qa.testbase.TestBase1;

public class TestUtil extends TestBase1{

	public static long PAGE_LOAD_TIMEOUT=5;
	public static long IMPLICIT_WAIT=10;
	public TestUtil() throws Exception {
		super();
	}
	public static void switchToFrame()
	{
	    driver.switchTo().frame("");	
	}
}
