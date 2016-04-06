package com.morningstar.test;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.morningstar.pages.LoginPage;
import com.morningstar.pages.TestBase;

public class SampleTest extends TestBase {

	@Test
	public void cancelitinerary() throws IOException {
		
		setup();		
		LoginPage lp = new LoginPage(driver);
		lp.setusername(prop.getProperty("username"));
		lp.setpassword(prop.getProperty("password"));
		lp.clickloginbtn();
		driver.quit();
		

	}
}
