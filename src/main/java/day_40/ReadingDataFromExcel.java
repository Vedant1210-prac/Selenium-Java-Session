package day_40;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {

//hardcoded file path
		//FileInputStream file = new FileInputStream("C:\\Users\\VEBHURE\\eclipse-workspace\\SeleniumWedDriver\\testdata\\Book2.xlsx");
		
//dyanmical path
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\Book2.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");  //  workbook.getSheetAt(0)  by index but difficult to find when we have multiple sheet
		
		int totalRow =sheet.getLastRowNum();   // return number of rows
		
		int totalCell = sheet.getRow(1).getLastCellNum();
		
		System.out.println("number of rows: " +totalRow);
		System.out.println("number of cells: " +totalCell);
		
		
		for(int r=0 ; r<=totalRow; r++) {
			
			XSSFRow row = sheet.getRow(r);
			
			for(int c=0; c<totalCell; c++) {
				
				XSSFCell cell = row.getCell(c);
				
				System.out.print(cell.toString() + "\t");
			}
			System.out.println();
		}
		
		
		
	}

}
