package SeleniumCode1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataDrivenTesting {
public WebDriver driver;

//Test Annotation 
@Test(dataProvider ="testdata")
public void login(String username, String password) {
	//open chrome driver
	System.setProperty("webdriver.chrome.driver","E:\\1.PeopleinTech\\1.Selenuim\\Selenium Eclips Prj Files\\G _C_Reddy_Tuturial_Practice\\Drivers\\chromedriver.exe" );
	driver = new ChromeDriver();
	
	//go to the url
	driver.get("http://www.gcrit.com/build3/admin/");
	
	//enter user name
	driver.findElement(By.name("username")).sendKeys(username);//reading data from test annotation username attribute
	
	//etner password
	driver.findElement(By.name("password")).sendKeys(password);
	
	//clcick on login 
	driver.findElement(By.id("tdb1")).click();
	
	//compare expected with actual 
	String ExpectedUrl ="http://www.gcrit.com/build3/admin/";
	
	String CapturedUrl = driver.getCurrentUrl();
	
	Assert.assertEquals(ExpectedUrl, CapturedUrl);
		//using String equalsTo comparison 
	
	if (ExpectedUrl.equals(CapturedUrl)) {
		System.out.println("equals comparison***: Comparison Successfull, they are the same");
		
	}else {
		System.out.println("equals comparison***: Comparison not  Successfull, they are not the same");
	}
	
	driver.close();






}
	
		// data provider annotation 
		
		@DataProvider(name="testdata")
		public Object [] [] readExcel()  throws BiffException, IOException {
			//public static void main(String[] args) throws BiffException, IOException {
			//import files-
			File xl =new File("E:/1.PeopleinTech/1.Selenuim/All_files/Working with excell/Data_Driven_Testing.xls");
		System.out.println("excel loated");
//		//get the  workbook 
	Workbook w = Workbook.getWorkbook(xl);
	System.out.println("workbook opened"+w);
//		//get the sheet ;
		Sheet s = w.getSheet("TestData");//getSheet(String);
//			
			//Sheet s = w.getSheet(0);//getSheet(int)	
//		//get rowsCount
	//	
		int rows = s.getRows();
		int columns = s.getColumns();
	//	
		System.out.println(rows);
		System.out.println(columns);
	//	
		
		//create a string array to capture the rows and colums data

		String inputData[] [] =new String [rows] [columns];
		
		for (int i=1; i<rows; i++) {
			for (int j=1; j<columns; j++) {
				
				Cell c = s.getCell(j,i);
				
				inputData [i][j]= c.getContents();
				System.out.println(inputData[i][j]);
				//now change the main method to Object []...
				System.out.println(inputData[i][j]);
				
				
				
			}	
				
			}
		//return inputData;	
		return inputData;
				
				
				
			}
		}
		//return inputData;
		
		
//	}


