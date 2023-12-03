package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenericUtilities.BaseClass;
import GenericUtilities.ExcelUtils;

public class DataProviderExcel extends BaseClass {
	@DataProvider
	public Object[][] dataProviderExcel() throws Throwable {
		ExcelUtils eutil=new ExcelUtils();
		Object[][] obj=eutil.readMultipleData("Sheet1");
		return obj;
	}
	
	@Test(dataProvider = "dataProviderExcel")
	public void test(String state, String capital) {
		System.out.print(state+"  "+capital);
		System.out.println();
	}
}
