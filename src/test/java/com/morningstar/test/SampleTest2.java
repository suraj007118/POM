package com.morningstar.test;

import com.morningstar.pages.BookedIteneraryPage;
import com.morningstar.pages.LoginPage;
import com.morningstar.pages.SearchHotelsPage;
import com.morningstar.pages.TestBase;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class SampleTest2 extends TestBase {

	@Test(dataProvider="Loginpagedata")
	public void LoginApp(binclass b) throws IOException {
		
		setup();
		LoginPage lp = new LoginPage(driver);
		lp.setusername(b.getUsername());
	    lp.setpassword(b.getPassword());
		lp.clickloginbtn();
		SearchHotelsPage sHP = new SearchHotelsPage(driver);
		BookedIteneraryPage bIP = new BookedIteneraryPage(driver);
		sHP.BookedItinerarylink().click();
		bIP.desiredItenerarycheckbox().click();
		bIP.cancelItenerarybtn().click();
		driver.quit();
	}
	
	@DataProvider(name="Loginpagedata")
	public Object[][] getLoginPageData(){
		return new Object[][] {{new binclass("spkelkar","Clint123!")}};
}

	public class binclass{
		
		String username;
		String password;
		public binclass(String username, String password) {
			this.username = username;
			this.password = password;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
		
	}
	
}
