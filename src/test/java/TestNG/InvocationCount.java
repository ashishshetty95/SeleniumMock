package TestNG;

import org.testng.annotations.Test;

import GenericUtilities.BaseClass;

public class InvocationCount extends BaseClass {
	@Test(invocationCount = 3, groups = "Smoke")
	public void testA() {
		System.out.println("testing A");
	}
}
