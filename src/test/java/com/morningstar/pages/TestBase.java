package com.morningstar.pages;

import com.morningstar.cons.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.Properties;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestBase {

	 public Properties prop=new Properties();
	public static WebDriver driver = null;

	public void setup() throws IOException {

		driver = new FirefoxDriver();

			/*else if (p.getProperty("browser").contains("chrome")) {
		 * //System.setProperty("webdriver.chrome.driver", value); driver=new
		 * ChromeDriver(); } else { //Internetexplorer }
		 */
		driver.get(Constants.BASE_URL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}
