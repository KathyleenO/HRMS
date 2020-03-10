package com.Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcellDemo {

	@Test
	public void readExcel() throws IOException {
		
		String xlPath="/users/kathyochoa/eclipse-workspace/HRMS/src/test/resources/testData/OrageHRMData.xlsx";
		FileInputStream fis=new FileInputStream(xlPath);
		
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=workbook.getSheet("EmployeeDetails");
		
		
		//Accessing row 4 and collum 3 value
		String value=sheet.getRow(4).getCell(3).toString();
		System.out.println(value);
		
		//printing how many rows
		int rownumber=sheet.getPhysicalNumberOfRows();
		//how many Collums
		
		System.out.println(rownumber);
		int columsNumbers=sheet.getRow(0).getLastCellNum();
		
		System.out.println(columsNumbers);
		
		
		System.out.println("Retrive All data");
		//Retrive all value s
		
		for(int i=0; i<rownumber; i++ ) {
			for(int y=0; y<columsNumbers; y++) {
			String cellValue=sheet.getRow(i).getCell(y).toString();
			System.out.println(cellValue + "");
			}
			System.out.println();
		}
		workbook.close();
		fis.close();
		
	}
	
	
}
