package com.Practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelRecap {

	@Test
	public void read() throws IOException {
		String path = "/Users/kathyochoa/eclipse-workspace/HRMS/src/test/resources/testData/PracticeExcel.xlsx";
		FileInputStream fis = new FileInputStream(path);
		Workbook wbook = new XSSFWorkbook(fis);
		Sheet sheet = wbook.getSheet("Login");

		String value = sheet.getRow(1).getCell(0).toString();
		System.out.println(value);

		// printing how many rows
		int rownumber = sheet.getPhysicalNumberOfRows();
		System.out.println(rownumber);
		// how many Collums
		int columsNumbers = sheet.getRow(0).getLastCellNum();
		System.out.println(columsNumbers);

		wbook.close();
		fis.close();

		// How to read data from excel and store it inside 2d array
		// creating object to store data from 3 rows(eliminate header, dont need)
		Object[][] data = new Object[rownumber - 1][columsNumbers];
//		data[0][0] = "Hello";
//		data[0][1] = "Hello1";
//
//		data[1][0] = "Bye";
//		data[1][1] = "Bye1";

		// Looping from row 2 of excel
		for (int i = 1; i < rownumber; i++) {
			for (int y = 0; y < columsNumbers; y++) {
				// retrive value from excel by specified row and colum
				String allvalues = sheet.getRow(i).getCell(y).toString();
				System.out.println(allvalues);
				//Storing retived data into 2d object array
				data[i-1][y] = value;

			}
		}
		wbook.close();
		fis.close();
System.out.println("Values from 2d Array");
		for (Object[] rowArray : data) {
			for (Object d : rowArray) {
				System.out.println(d);

			}
		}
	}
}
