package utils;

public class ExcelUtilsDemo {

	public static void main(String[] args) {
		String projectpath = System.getProperty("user.dir");
		Excelutils excel = new Excelutils(projectpath + "/EXCEL/testdata.xlsx", "Sheet1");
				
		excel.getRowCount();
		excel.getColCount();
		excel.getCellStringData(0,0);
		excel.getCellNumericData(1,1);
	}

}
