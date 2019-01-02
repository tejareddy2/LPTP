package parameterization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcel {

	public static void main(String args[]) throws IOException {

		Workbook wbook = null;
		Sheet sheet = null;

		String path = "..\\orangehrm\\resources\\OrangeHRM_TestData1.xlsx";
		File file = new File(path);
	
		FileInputStream fis = new FileInputStream(file);

		String[] extensions = path.split("\\.");

		if (extensions[1].equals("xlsx")) {
			wbook = new XSSFWorkbook(fis);
		} else if (extensions[1].equals("xls")) {
			wbook = new HSSFWorkbook(fis);

		} else {
			System.out.println("Invalid excel format");
		}
		
		sheet = wbook.getSheet("testdata");

		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			int colsize = sheet.getRow(i).getLastCellNum();

			for (int j = 0; j < colsize; j++) {
				System.out.print("  " + sheet.getRow(i).getCell(j).getStringCellValue());
			}
			System.out.println();

		}

	}
}
