package day_40;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AssignmentToReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\newFile.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Data");
		
		int rowNo = sheet.getLastRowNum();
		
		int cellNo= sheet.getRow(1).getLastCellNum();
		
		System.out.println("Number of Row: " +rowNo);
		
		System.out.println("Number of Cell: " +cellNo);
		
		for(int r = 0; r<=rowNo; r++) {
			
			XSSFRow currentrow = sheet.getRow(r);
			
			for(int c =0 ; c<cellNo; c++) {
				
				XSSFCell cell = currentrow.getCell(c);
				
				System.out.print(cell.toString() + "\t");
			}
			//System.out.println();
			
			
		}
	}

}
