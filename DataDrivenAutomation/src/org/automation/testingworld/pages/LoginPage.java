package org.automation.testingworld.pages;

import java.io.IOException;

import org.automation.testingworld.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	//make a constractor in order to get the Webdriver to launch the browsers 
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		
		//storing the local driver into global driver
		
		this.driver=driver;
		
	}
	public void enterUsername( String uname) throws IOException, InterruptedException {
		Thread.sleep(2000);
		
		driver.findElement(By.id(Utility.fetchLocatorValue("login_username_id"))).sendKeys(uname);
		
		
		
	}
	
	public void enterPassword(String pass) throws IOException {
		driver.findElement(By.id(Utility.fetchLocatorValue("login_password_id"))).sendKeys(pass);
		
	}
	public void enterFirstName(String firstName) throws IOException {
		driver.findElement(By.name(Utility.fetchLocatorValue("login_firstname_name"))).sendKeys(firstName);
		
	}
	public void enterLastName(String lastName) throws IOException {
		driver.findElement(By.name(Utility.fetchLocatorValue("login_lastname_name "))).sendKeys(lastName);
		
	}
	public void enterMobileNumber(String mobileNumber) throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocatorValue("login_mobilenumber_xpath"))).sendKeys(mobileNumber);
		
	}
	public void clickSignin() throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocatorValue("login_signin_xpath"))).click();
		
	}
	
	
}
