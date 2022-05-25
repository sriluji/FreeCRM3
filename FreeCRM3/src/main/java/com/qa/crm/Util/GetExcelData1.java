package com.qa.crm.Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetExcelData1 {

	
	public static Object[][] getTestData() throws IOException{
		FileInputStream file=new FileInputStream("C:\\Users\\hr\\Desktop\\Sreelatha\\Java\\ApachePOI\\src\\main\\java\\TestData\\TestData.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(file);
		XSSFSheet sheet=book.getSheet("ContactTestData");
		int rowcount=sheet.getLastRowNum();
		int colcount=sheet.getRow(0).getLastCellNum();
		Object[][] data=new Object[rowcount][colcount];
		for (int i=0;i<=rowcount;i++) {
			for(int j=0;j<colcount;j++)
				data[i][j]=sheet.getRow(i+1).getCell(j).toString();
		}
		return data;
	}
	
	
	

}
