package com.Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class TwoDArrayExcel {

	
	
	
	
	@Test
	public void ArrayExcel() throws IOException {
		
		String xlPath="/users/kathyochoa/eclipse-workspace/HRMS/src/test/resources/testData/OrageHRMData.xlsx";
		FileInputStream fis=new FileInputStream(xlPath);
		
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=workbook.getSheet("EmployeeDetails");
		
		int rownumber=sheet.getPhysicalNumberOfRows();
		System.out.println(rownumber);
		int columsNumbers=sheet.getRow(0).getLastCellNum();
		System.out.println(columsNumbers);
		
		Object[][] data=new Object[rownumber][columsNumbers];
		
		for(int i=0; i<rownumber; i++) {
			for(int y=0; y<columsNumbers; y++) {
			//	String value= sheet.getCellData();
			//data[rownumber][columsNumbers]=value;
			}
		}
		System.out.println(data);
	
	}
}
