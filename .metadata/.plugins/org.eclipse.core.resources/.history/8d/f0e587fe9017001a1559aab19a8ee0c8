package org.automation.testingworld.testcases;


import java.io.IOException;


import org.automation.testingworld.base.DriverInstance;
import org.automation.testingworld.datagenerators.DataGenerator;
import org.automation.testingworld.pages.LoginPage;

import org.testng.annotations.Test;

public class TC_001_ValidateLoginFunctionality extends DriverInstance{

	
	
	
	
	@Test(dataProvider="Excel", dataProviderClass=DataGenerator.class)
	public void tc_001_login_Functionality(String uname, String pass) throws IOException, InterruptedException
	{
		
		LoginPage login = new LoginPage(driver);
		login.enterUsername(uname);
		login.enterPassword(pass);
		login.clickSignin();

		
	}
	
	
	
		
		

	}
	
	
	
	
	
	
	
	
	
	
	

