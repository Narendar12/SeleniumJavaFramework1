package utils;

public class ExcelDataProvider {
	
	public static void main(String[] args)
	{
		String excelpath = "F:\\eclipse-workspace\\POMTest\\EXCEL\\testdata.xlsx";
		testData(excelpath, "Sheet1");
	}

	public static void testData(String excelpath, String sheetName)
	{
		Excelutils excel = new Excelutils(excelpath, sheetName);
		
		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();
		
		for(int i =1; i < rowCount; i++) {
			for(int j =0; j< colCount; j++)
			{
				String cellData = excel.getCellStringData(i,j);
				System.out.print(cellData+ "|");
			}
		System.out.println("this is test");
		}
		
		

	}

}
