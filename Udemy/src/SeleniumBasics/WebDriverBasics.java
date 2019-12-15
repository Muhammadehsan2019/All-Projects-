package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

		//static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//open chrome
		
		System.setProperty("webdriver.chrome.driver","E:\\1.PeopleinTech\\1.Selenuim\\Selenium Eclips Prj Files\\G _C_Reddy_Tuturial_Practice\\Drivers\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://www.google.com");
		
		
		System.out.println(driver.getTitle());//it will validate if your page title is correct
		
		
		String d=driver.getCurrentUrl();//validates you are landed on the correct url
		
		
		System.out.println(d);
		
		//String source = driver.getPageSource();// it will get us the page source 
		
		//System.out.println(source);//
		
		driver.get("http://www.yahoo.com");
		
		//navigate back 
		driver.navigate().back();
		
		//navigate forward
		driver.navigate().forward();
		
		//close the browser
		driver.close();//closes the current browser
		
		driver.quit();//closes all the browsers opened by selenium
		
	}

}
