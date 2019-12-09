package TestNGPractice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;

public class TestNGClass1 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		//open chrome driver
		System.setProperty("webdriver.chrome.driver","E:\\1.PeopleinTech\\1.Selenuim\\New Eclips Files\\Selenium_AtoZ\\Drivers\\chromedriver.exe" );
		driver = new ChromeDriver();
		
		
	Thread.sleep(5000);
	
	driver.get("https://www.facebook.com");
	
	String capUrl = driver.getCurrentUrl();
	driver.getTitle();
	

	//Assert.assertEquals(capUrl, "https://www.facebook.com");
	
	
	
	
	}

}
