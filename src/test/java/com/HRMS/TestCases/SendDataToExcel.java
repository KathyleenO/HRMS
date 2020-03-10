package com.HRMS.TestCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class SendDataToExcel {

	@Test
	public void writeToExcel() throws IOException {

		String filePath = "/users/kathyochoa/eclipse-workspace/HRMS/src/test/resources/testData/OrageHRMData.xlsx";

		FileInputStream fis = new FileInputStream(filePath);

		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheet("EmployeeDetails");

		// SENDING DATA TO EXCELL WORKBOOK SHEET1
		// CREATING A COLUM AND SEND INFO
		sheet.getRow(0).createCell(4).setCellValue("Result");
		sheet.getRow(1).createCell(4).setCellValue("Pass");
		sheet.getRow(1).getCell(4).setCellValue("FAILES");

		// CREATING A new ROW
		sheet.createRow(11).createCell(0).setCellValue("ERICK");

		// Pushing to Excel
		FileOutputStream fos = new FileOutputStream(filePath);
		workbook.write(fos);

		// CLOSING ALL FILES
		fos.close();
		workbook.close();
		fis.close();

	}
}
