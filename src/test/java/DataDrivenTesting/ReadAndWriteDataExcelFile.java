package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadAndWriteDataExcelFile {
	@Test
	public void test() throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\testscriptdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		sh.createRow(0).createCell(0).setCellValue("State");
		sh.getRow(0).createCell(1).setCellValue("Capital");
		sh.createRow(1).createCell(0).setCellValue("Karnataka");
		sh.getRow(1).createCell(1).setCellValue("Bengaluru");
		sh.createRow(2).createCell(0).setCellValue("Kerala");
		sh.getRow(2).createCell(1).setCellValue("Trivandrum");
		sh.createRow(3).createCell(0).setCellValue("TamilNadu");
		sh.getRow(3).createCell(1).setCellValue("Chennai");
		FileOutputStream fos=new FileOutputStream(".\\\\src\\\\test\\\\resources\\\\testscriptdata.xlsx");
		wb.write(fos);
		//Single data
		String data1=sh.getRow(0).getCell(0).getStringCellValue();
		String data2=sh.getRow(0).getCell(1).getStringCellValue();
		System.out.println(data1+"  "+data2);
		//Multiple data
		int rowCount=sh.getLastRowNum();
		int cellCount=sh.getRow(0).getLastCellNum();
		for(int i=0;i<=rowCount;i++) {
			for(int j=0;j<cellCount;j++) {
				String data=sh.getRow(i).getCell(j).getStringCellValue();
				System.out.print(data+"  ");
			}
			System.out.println();
		}
	}

}
