package com.orangehrm.utilities;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcel {
 
	static Workbook wbook;
	static Sheet oSheet;
	
	public static void setupExcel(String path,String sheet) throws IOException {	
		File Fobj = new File(path);
		FileInputStream FInput = new FileInputStream(Fobj);
		String[] pathExtension = path.split("\\.");
		if (pathExtension[3].equals("xlsx")) {
			wbook = new XSSFWorkbook(FInput);
		} else if (pathExtension[3].equals("xls")) {
			wbook = new HSSFWorkbook(FInput);
		}
		oSheet = wbook.getSheet(sheet);
	}

	public static String readData(int rowval,int colval) {
		Row row=oSheet.getRow(rowval);		
	     String cellvalue=row.getCell(colval).getStringCellValue();
	     return cellvalue;
					
	}

}
