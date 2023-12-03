package TestNG;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class RetryTest {
	
	@Test(retryAnalyzer = GenericUtilities.RetryAnalyserImplementation.class)
	public void test() {
		System.out.println("Hi");
		Assert.assertEquals("A", "B	");
	}
}
