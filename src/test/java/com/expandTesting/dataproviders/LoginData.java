package com.expandTesting.dataproviders;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class LoginData {

	Workbook wb;
	File file;
	FileInputStream fis;

	@DataProvider
	public String[][] loginData() {

		String s[][];
		file = new File("./ExcelData/data1.xlsx");

		try {
			fis = new FileInputStream(file);
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Sheet sheet = wb.getSheetAt(0);

		int tRows = sheet.getLastRowNum();
		int tCols = sheet.getRow(0).getLastCellNum();

		s = new String[tRows][tCols];
		
		System.out.println("Rows --> "+tRows);
		System.out.println("Cols --> "+tCols);

		for (int i = 0; i <= tRows; i++) {
			Row row=sheet.getRow(i);
			for (int j = 0; j < tCols; j++) {
				Cell cell=row.getCell(j);
			//	System.out.print(" "+cell);
				s[i][j]=cell.toString();
				

			}
		}
		return s;
				
	}

}
