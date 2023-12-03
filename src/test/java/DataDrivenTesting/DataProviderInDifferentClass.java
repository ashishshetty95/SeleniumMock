package DataDrivenTesting;

import org.testng.annotations.Test;

public class DataProviderInDifferentClass {
	@Test(dataProviderClass = TestNG.DataProviderSameClass.class, dataProvider = "test")
	public void demo(String state, String capital) {
		System.out.print(state+"  "+capital);
		System.out.println();
	}
}
