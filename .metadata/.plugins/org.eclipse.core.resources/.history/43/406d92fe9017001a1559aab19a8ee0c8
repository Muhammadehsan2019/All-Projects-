package org.automation.testingworld.base;

import java.io.IOException;

import org.automation.testingworld.utility.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


//Creating Base Class
public class DriverInstance {
	public WebDriver driver;
	
	
	
	@BeforeMethod
	public void initiateDriverInstance() throws IOException {
		
		//reading the data from the Utility calss 
		//if the browser in the Utility Class and fetchPro...Method equals to chrome then launch the chrome browser 
		
		//toString: means that we are converting the data from object to the string format 
		if(Utility.fetchPropertyValue("browserName").toString().equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}else if(Utility.fetchPropertyValue("browserName").toString().equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
			driver= new FirefoxDriver();
		}else if(Utility.fetchPropertyValue("browserName").toString().equalsIgnoreCase("ie")) {
			
			System.setProperty("webdriver.ie.driver","./Drivers/internetexplorerdriver.exe");
			driver= new InternetExplorerDriver();
		}else
		{
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
			driver =new ChromeDriver();
		}
		
		//open the url and have to convert it to string because the Utility Class and fetchPropertyValue method has it as an Object 
		driver.get(Utility.fetchPropertyValue("applicationURL").toString());
		
		
	}
	
	@AfterMethod
	public void closeDriverInstance() {
		
		driver.quit();
		
	}
	
	
	
	
	
	
	
	

}
