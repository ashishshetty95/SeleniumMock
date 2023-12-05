package TestNG;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtilities.BaseClass;

public class DependsOnMethods extends BaseClass {
	@Test(retryAnalyzer = GenericUtilities.RetryAnalyserImplementation.class)
	public void testA() {
		System.out.println("testing A");
		Assert.fail();
	}
	@Test(dependsOnMethods = "testC")
	public void testB() {
		System.out.println("testing B");
	}
	@Test(dependsOnMethods = "testA")
	public void testC() {
		System.out.println("testing C");
	}
}
