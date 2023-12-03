package TestNG;

import org.testng.annotations.Test;

import GenericUtilities.BaseClass;

public class DataProviderInDifferentClass extends BaseClass {
	@Test(dataProviderClass = DataProviderSameClass.class, dataProvider = "test")
	public void demo(String state, String capital) {
		System.out.print(state+"  "+capital);
		System.out.println();
	}
}
