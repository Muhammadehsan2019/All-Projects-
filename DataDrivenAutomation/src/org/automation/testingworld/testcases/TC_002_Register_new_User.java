package org.automation.testingworld.testcases;

import java.io.IOException;

import org.automation.testingworld.base.DriverInstance;
import org.automation.testingworld.datagenerators.DataGenerator;
import org.automation.testingworld.pages.LoginPage;
import org.testng.annotations.Test;

public class TC_002_Register_new_User extends DriverInstance {
	
	
	@Test(dataProvider = "Excel",dataProviderClass=DataGenerator.class)
	
	//passing three arguments 
	public void tc_002_register_new_user(String fname, String lname, String pnumber) throws IOException, InterruptedException
	{
		//creating the loginPage obj
		LoginPage login = new LoginPage(driver);
		Thread.sleep(2000);
		login.enterFirstName(fname);
		Thread.sleep(2000);
		login.enterLastName(lname);
		Thread.sleep(2000);
		login.enterMobileNumber(pnumber);
		
		
	}

}
