package org.automation.testingworld.datagenerators;

import java.io.FileInputStream;
import java.lang.reflect.Method;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataGenerator {
	@DataProvider(name="Excel")
	public static Object[][] testDataGenerator(Method met) throws Exception
	{	
		if(met.getName().equalsIgnoreCase("tc_001_login_Functionality")) 
		{
		//create two dimention array
	/*Object [][] data = {{"Uname1", "Pass1"},{"Uname2", "Pass2"},{"Uname3", "Pass3"}};
	
		return data;
	*/
				//Getting data from Excel using apachi POI
		FileInputStream file = new FileInputStream("./TestData/Facebook_Data.xlsx");
		//get open the workbook, using wkbk obj
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		//open the sheet, using sheet obj
		XSSFSheet loginSheet = workbook.getSheet("Login");
		//get the rows, how many rows are in the excel sheet
		int numberOfData = loginSheet.getPhysicalNumberOfRows();		
		//we need to enter all the data from sheet into the array Object
		Object[][] testData = new Object[numberOfData][2];//2 is the number of columns
		//run a loop 
		for (int i=0; i<numberOfData; i++)
		{
			XSSFRow row = loginSheet.getRow(i);
			XSSFCell username = row.getCell(0);
			XSSFCell password = row.getCell(1);
			testData[i][0] = username.getStringCellValue();
			testData[i][1] = password.getStringCellValue();
		}
		
		
		return testData;
		}
		else if(met.getName().equalsIgnoreCase("tc_002_register_new_user"))
		{
			
			
			//create two dimention array
		/*Object [][] data = {{"Uname1", "Pass1"},{"Uname2", "Pass2"},{"Uname3", "Pass3"}};
		
			return data;
		*/
					//Getting data from Excel using apachi POI
			FileInputStream file = new FileInputStream("./TestData/Facebook_Data.xlsx");
			//get open the workbook, using wkbk obj
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			//open the sheet, using sheet obj
			XSSFSheet loginSheet = workbook.getSheet("Register");
			//get the rows, how many rows are in the excel sheet
			int numberOfData = loginSheet.getPhysicalNumberOfRows();		
			//we need to enter all the data from sheet into the array Object
			Object[][] testData = new Object[numberOfData][3];//2 is the number of columns
			//run a loop 
			for (int i=0; i<numberOfData; i++)
			{
				XSSFRow row = loginSheet.getRow(i);
				XSSFCell firstname = row.getCell(0);
				XSSFCell lastname = row.getCell(1);
				XSSFCell phonenumber = row.getCell(2);
				testData[i][0] = firstname.getStringCellValue();
				testData[i][1] = lastname .getStringCellValue();
				testData[i][2] = phonenumber .getStringCellValue();
			}
			
			
			return testData;
			
		}
		else 
		{
			Object[][] testData = new Object[2][3];
				return testData;
		}
			
		
	}
//	
//	@DataProvider(name="Register")
//	public static Object[][] testDataGeneratorRegister() throws Exception
//	{	
//		//create two dimention array
//	/*Object [][] data = {{"Uname1", "Pass1"},{"Uname2", "Pass2"},{"Uname3", "Pass3"}};
//	
//		return data;
//	*/
//				//Getting data from Excel using apachi POI
//		FileInputStream file = new FileInputStream("./TestData/Facebook_Data.xlsx");
//		//get open the workbook, using wkbk obj
//		XSSFWorkbook workbook = new XSSFWorkbook(file);
//		//open the sheet, using sheet obj
//		XSSFSheet loginSheet = workbook.getSheet("Register");
//		//get the rows, how many rows are in the excel sheet
//		int numberOfData = loginSheet.getPhysicalNumberOfRows();		
//		//we need to enter all the data from sheet into the array Object
//		Object[][] testData = new Object[numberOfData][3];//2 is the number of columns
//		//run a loop 
//		for (int i=0; i<numberOfData; i++)
//		{
//			XSSFRow row = loginSheet.getRow(i);
//			XSSFCell firstname = row.getCell(0);
//			XSSFCell lastname = row.getCell(1);
//			XSSFCell phonenumber = row.getCell(2);
//			testData[i][0] = firstname.getStringCellValue();
//			testData[i][1] = lastname .getStringCellValue();
//			testData[i][2] = phonenumber .getStringCellValue();
//		}
//		
//		
//		return testData;
		//in the line above we are using one provider to get control of two testcases using if statemnts
	//}
	}

