package day_40;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataFromExcel {

	public static void main(String[] args) throws IOException {


		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\newFile.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("Data");
		
		XSSFRow row1 = sheet.createRow(0);
		
			row1.createCell(0).setCellValue("Welcome");
			row1.createCell(1).setCellValue("Selenium");
			row1.createCell(2).setCellValue("Java");
			
		XSSFRow row2 = sheet.createRow(1);
		
				row2.createCell(0).setCellValue("Welcom");
				row2.createCell(1).setCellValue("Selenium");
				row2.createCell(2).setCellValue("Python");
				
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("File is created");
		
				
		
		
		
		
		
	}

}
