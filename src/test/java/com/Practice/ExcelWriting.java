package com.Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelWriting {

	@Test
	public void sendInfo() throws IOException {

		String path = "/Users/kathyochoa/eclipse-workspace/HRMS/src/test/resources/testData/PracticeExcel.xlsx";
		FileInputStream fis = new FileInputStream(path);
		Workbook wbook = new XSSFWorkbook(fis);
		Sheet sheet = wbook.getSheet("Test");
		// if cell is not there---> grab the cell and update
		sheet.getRow(0).createCell(2).setCellValue("Language");
		// sheet.getRow(0).getCell(2).setCellValue("Instructor"); insert new info
		// if ROW IS NOT THERE CREATE ONE
		sheet.createRow(2).createCell(0).setCellValue("Syntax123");
		sheet.getRow(2).createCell(1).setCellValue("TestNG");
		FileOutputStream fos = new FileOutputStream(path);
		wbook.write(fos);

	}
}
