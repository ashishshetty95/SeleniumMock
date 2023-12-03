package GenericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtils {
	public int excelRowCount(String SheetName) throws Throwable {
		FileInputStream fis=new FileInputStream(iPathConstants.EXCELPATH);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(SheetName);
		int rowCount = sh.getLastRowNum();
		return rowCount;
	}
	public int excelcellCount(String SheetName) throws Throwable {
		FileInputStream fis=new FileInputStream(iPathConstants.EXCELPATH);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(SheetName);
		int cellCount = sh.getRow(0).getLastCellNum();
		return cellCount;
	}
	public String readSingleData(String SheetName, int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(iPathConstants.EXCELPATH);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(SheetName);
		String data=sh.getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
	public Object[][] readMultipleData(String SheetName) throws Throwable {
		ExcelUtils eutil=new ExcelUtils();
		FileInputStream fis=new FileInputStream(iPathConstants.EXCELPATH);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(SheetName);
		int rowCount=eutil.excelRowCount(SheetName);
		int cellCount=eutil.excelcellCount(SheetName);
		Object[][] obj=new Object[rowCount+1][cellCount];
		for(int i=0;i<=rowCount;i++) {
			for(int j=0;j<cellCount;j++) {
				obj[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return obj;
	}
}
