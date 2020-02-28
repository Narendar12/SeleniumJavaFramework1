package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutils {
	static String projectpath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet; 
	
	public  Excelutils(String excelpath, String sheetName)
	{
		try
		{
			//projectpath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(excelpath);
			sheet = workbook.getSheet(sheetName);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args)
	{
		getRowCount();
		getColCount();
		getCellStringData(0,0);
		getCellNumericData(1,1);
	}
	
	public static int getRowCount()
	{
		int rowCount =0;
		try {
			
			rowCount = sheet.getPhysicalNumberOfRows();
			//System.out.println("No. of rows count:" + rowCount);
		} catch (Exception e) { 
			e.printStackTrace();  
		}
		return rowCount;
	}
	
	
	public static int getColCount()
	{
		int colCount =0;
		try {
			
			colCount = sheet.getRow(0).getPhysicalNumberOfCells();
			//System.out.println("No. of colums count:" + colCount);
		} catch (Exception e) { 
			e.printStackTrace();  
		}
		return colCount;
	}
	
	public static String getCellStringData(int rowNum, int colNum)
	{
		String cellVal  = null;
		try {			
			cellVal = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			//System.out.println(cellVal);
		} catch (Exception e) { 
			e.printStackTrace();  
		}
		return cellVal;
	}
	
	public static double getCellNumericData(int rowNum, int colNum)
	{
		double numcellVal = 0;
		try {			
			numcellVal = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			//System.out.println(numcellVal);
		} catch (Exception e) { 
			e.printStackTrace();  
		}
		return numcellVal;
	}

}
