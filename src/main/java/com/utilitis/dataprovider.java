package com.utilitis;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataprovider {
	
	public void writedata(String d,int a,int b,String c) throws IOException {
		String path = "C:\\Users\\Jadha\\eclipse-workspace\\IT_test\\TestData\\New Microsoft Excel Worksheet.xlsx";
		FileInputStream fl = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fl);
		wb.getSheet(d).createRow(a).createCell(b).setCellValue(c);
		FileOutputStream fo = new FileOutputStream(path);
		wb.write(fo);
		wb.close();
		fo.close();
		fl.close();
		
		
		
	}
}
