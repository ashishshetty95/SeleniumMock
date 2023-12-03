package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

import GenericUtilities.BaseClass;

public class Priority extends BaseClass {
	@Test(priority = 3, groups ="Smoke")
	public void testA() {
		System.out.println("testing A");
	}
	@Test(priority = 2, groups="Regression")
	public void testB() {
		System.out.println("testing B");
	}
	@Test(priority = 1, groups="Regression")
	public void testC() {
		System.out.println("testing C");
	}
}
