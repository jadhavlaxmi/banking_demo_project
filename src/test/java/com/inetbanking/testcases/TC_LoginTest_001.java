package com.inetbanking.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.model.ScreenCapture;
import com.inetbanking.pageobjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass{
	
	@Test
	public void loginTest() throws IOException {
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserName(username);
		logger.info("username entered"+username);
		lp.setPassword(password);
		logger.info("password entered"+password);
		lp.clickSubmit();
		logger.info("clicked on submit");
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")){
			Assert.assertTrue(true);
			logger.info("login test passed");
		}else {
			captureScreen(driver, "loginTest");
			Assert.assertTrue(false);
		}
		
	}

}
