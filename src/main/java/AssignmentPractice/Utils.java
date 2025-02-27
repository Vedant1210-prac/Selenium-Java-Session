package AssignmentPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Utils {
	
	static FileInputStream fi;
	static FileOutputStream fo;
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	static XSSFRow row;
	static XSSFCell cell;
	public static CellStyle style;
	private static int cellnum;

	public static int getRownum(String xlfile, String sheetname) throws IOException {
		
		fi = new FileInputStream(xlfile);
		wb= new XSSFWorkbook(fi);
		sheet=wb.getSheet(sheetname);
		int rowNum = sheet.getLastRowNum();
		wb.close();
		fi.close();
		return rowNum;
		
		
	}
	
	public static int getCellNum(String xlfile, String sheetName, int rownum) throws IOException {
		
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		sheet = wb.getSheet(sheetName);
		row = sheet.getRow(rownum);
		int cellNum = row.getLastCellNum();
		
		wb.close();
		fi.close();
		return cellNum;
		
		
	}
	
	public static String getCellData(String xlfile, String sheetName, int rowNum, int cellNum) throws IOException {
		
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		sheet = wb.getSheet(sheetName);
		row = sheet.getRow(rowNum);
		cell = row.getCell(cellNum);
		
		String Data;
		Data = cell.toString();
		
		wb.close();
		fi.close();
		return Data;
		
		
		
	}
	
	public static void setCellData(String xlfile, String sheetName, int rownum, int cellNum, String Data) throws IOException {
		
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		sheet = wb.getSheet(sheetName);
		row= sheet.getRow(rownum);
		
		cell = row.createCell(cellNum);
		
		cell.setCellValue(Data);
		
		fo = new FileOutputStream(xlfile);
		wb.write(fo);
		
		wb.close();
		
		fo.close();
		
		 
		
		
		
	}
	
	public static void fillGreenColor(String xlfile, String sheetName, int rownum) throws IOException {
		
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		sheet = wb.getSheet(sheetName);
		row = sheet.getRow(rownum);
		cell = row.getCell(cellnum);
		

		style = wb.createCellStyle();
		
		style.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		
		cell.setCellStyle(style);
		
		fo = new FileOutputStream(xlfile);
		
		wb.write(fo);
		
		wb.close();
		
		fo.close();
		
		
		
	}
	
public static void fillRedColor(String xlfile, String sheetName, int rownum) throws IOException {
		
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		sheet = wb.getSheet(sheetName);
		row = sheet.getRow(rownum);
		cell = row.getCell(cellnum);
		

		style = wb.createCellStyle();
		
		style.setFillBackgroundColor(IndexedColors.RED.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		
		cell.setCellStyle(style);
		
		fo = new FileOutputStream(xlfile);
		
		wb.write(fo);
		
		wb.close();
		
		fo.close();
		
		
		
	}
}
