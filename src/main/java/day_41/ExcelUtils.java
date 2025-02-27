package day_41;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb; 
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static CellStyle style;
	
	
	public static int getRowNum(String xlfile, String sheetName, int rowIndex) throws IOException {
		
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		sheet = wb.getSheet(sheetName);
		int rowNum = sheet.getLastRowNum();
		wb.close();
		fi.close();
		return rowNum;
		
	}
	
	public static int getCellNum(String xlfile, String sheetName, int rownum) throws IOException {
		
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		sheet= wb.getSheet(sheetName);
		row = sheet.getRow(rownum);
		int cellNum = row.getLastCellNum();
		
		wb.close();
		fi.close();
		
		return cellNum;
		
		
	}
	
	public static String getCelldata(String xlfile, String sheetName, int rownum, int cellnum) throws IOException {
		
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		sheet = wb.getSheet(sheetName);
		row = sheet.getRow(rownum);
		cell = row.getCell(cellnum);
		
		String Data;
		try {
		//Approach 1 to read data from Excel
		Data = cell.toString();  
		
		//Approach 2
		
		DataFormatter formatter = new DataFormatter();
		Data = formatter.formatCellValue(cell);
		
		}catch(Exception e) {
			
			Data="";
		}
		
		wb.close();
		fi.close();
		return Data;
	}
	
	public static void SetCelldata(String xlfile, String sheetName, int rownum, int cellnum, String data) throws IOException   {
		
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		sheet = wb.getSheet(sheetName);
		row = sheet.getRow(rownum);
		
		cell = row.createCell(cellnum);
		cell.setCellValue(data);
		fo = new FileOutputStream(xlfile);
		wb.write(fo);
		
		wb.close();
		fo.close();
		
	}
	
	public static void fillGreencolour(String xlfile, String sheetName, int rownum, int cellnum) throws IOException {
		
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		sheet = wb.getSheet(sheetName);
		row = sheet.getRow(rownum);
		cell = row.getCell(cellnum);
		
		style = wb.createCellStyle();
		
		style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		
		cell.setCellStyle(style);
		fo= new FileOutputStream(xlfile);
		wb.write(fo);
		
		
		
	}
	
	public static void fillRedcolour(String xlfile, String sheetName, int rownum, int cellnum) throws IOException {
		
		fi= new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		sheet = wb.getSheet(sheetName);
		row = sheet.getRow(rownum);
		cell = row.getCell(cellnum);
		
		style = wb.createCellStyle();
		style.setFillBackgroundColor(IndexedColors.RED.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		
		cell.setCellStyle(style);
		
		fo= new FileOutputStream(xlfile);
		wb.write(fo);
		wb.close();
		fo.close();
		
		
	}
	

}
