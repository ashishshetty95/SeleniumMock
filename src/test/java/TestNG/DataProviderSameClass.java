package TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtilities.BaseClass;
public class DataProviderSameClass extends BaseClass {
	@DataProvider
	public Object[][] test() {
		Object[][] obj=new Object[3][2];
		obj[0][0]="State";
		obj[0][1]="Capital";
		
		obj[1][0]="Karnataka";
		obj[1][1]="Bangalore";
		
		obj[2][0]="Kerala";
		obj[2][1]="Trivandrum";
		
		return obj;
	}
	
	@Test(dataProvider = "test")
	public void dataProviderTest(String state, String capital) {
		System.out.print(state+"  "+capital);
		System.out.println();
		Assert.fail();
	}
}
