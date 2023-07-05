package UtilsLayer;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelReader {
	public static XSSFWorkbook worbook;
	public ExcelReader(String path) throws Exception
	{
		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		worbook = new XSSFWorkbook(fis);
	}

	public static String getDataFromExcel(int sheetIndex, int row, int cell)
	{
		try {
			return worbook.getSheetAt(sheetIndex).getRow(row).getCell(cell).getStringCellValue();
		} catch (Exception e) {
			return worbook.getSheetAt(sheetIndex).getRow(row).getCell(cell).getRawValue();
		}
		
	}
	public static int getRowCount(int sheetindex)
	{
		return worbook.getSheetAt(sheetindex).getLastRowNum();
	}
	public static int getCellCount(int sheetindex)
	{
		return worbook.getSheetAt(sheetindex).getRow(0).getLastCellNum();
	}
}
