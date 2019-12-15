package SeleniumBasics;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"E:\\1.PeopleinTech\\1.Selenuim\\Selenium Eclips Prj Files\\G _C_Reddy_Tuturial_Practice\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://book.spicejet.com");
		
		Thread.sleep(20000);

		// working with dynamic dropdowns //clcik on Departure city
		Select SelectVal = new Select(driver.findElement(
				By.xpath("//select[@id='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1']")));

		SelectVal.selectByValue("MAA");
		
		//check if the return date is enabled or disabled
		System.out.println(driver.findElement(By.xpath("//span[@id='view_fulldate_id_2']")).getAttribute("style"));
		
		Thread.sleep(5000);
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='InputSearchView_SeniorCitizen']")).isSelected());
		
		//capture the Seniour Citizen checkbox
		//String capCheckbox = driver.findElement(By.cssSelector("input[id*='InputSearchView_SeniorCitizen']")).getText();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.cssSelector("input[id*='InputSearchView_SeniorCitizen']")).getAttribute("value"));
		//System.out.println(capCheckbox);
		
		//verify the captured with expected 
		
		// check if the box is selected
		//System.out.println(driver.findElement(By.cssSelector("input[id*='InputSearchView_SeniorCitizen']")).isSelected());
		Thread.sleep(5000);
		// select the check box
		driver.findElement(By.cssSelector("input[id*='InputSearchView_SeniorCitizen']")).click();
		//System.out.println(driver.findElement(By.cssSelector("input[id*='InputSearchView_SeniorCitizen']")).isSelected());

		// use the assert
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='InputSearchView_SeniorCitizen']")).isSelected());
		// select all checkboxes by one click

		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

		// driver.findElement(By.id("//a[contains(text(),'Chennai (MAA)')]")).click();

		// driver.findElement(By.id("//a[contains(text(),'Chennai (MAA)')]")).click();

		// ************************************************************
		/*
		 * driver.get("https://www.calculator.net/scientific-calculator.html");
		 * 
		 * Thread.sleep(5000); //click on 5 for 5 times
		 * 
		 * int i=1; while (i<=5) {
		 * driver.findElement(By.xpath("//span[contains(text(),'5')]")).click(); i++; }
		 * 
		 * //click on + button driver.findElement(By.xpath(
		 * "//div[@id='contentout']//div[3]//div[1]//span[4]")).click();
		 * 
		 * 
		 * Thread.sleep(5000);
		 * 
		 * for (int j =0; j<=6;j++) {
		 * 
		 * 
		 * //click on 8 for 6 times
		 * driver.findElement(By.xpath("//span[contains(text(),'8')]")).click();
		 * 
		 * } Thread.sleep(5000);
		 * 
		 * //click on = button
		 * driver.findElement(By.xpath("//span[contains(text(),'=')]")).click();
		 * Thread.sleep(5000);
		 * 
		 * 
		 * //get the result 
		 * String capval = driver.findElement(By.xpath("//div[@id='sciOutPut']")).getText();
		 * System.out.println("The sum is: "+ capval);
		 */

	}

}
