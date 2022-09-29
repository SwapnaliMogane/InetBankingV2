package testCases;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass
{
	@Test
	public void loginTest() throws IOException{
		
		
		logger.info("URL is opened");
		LoginPage lp=new LoginPage(driver);
		
		logger.info("entered username");
		lp.setUsername(username);
		
		logger.info("entered password");
		lp.setPassword(password);
		
		lp.clickSubmit();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("login test passed");
		}
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("login test failed");
		}
		
		
		
	}

}
