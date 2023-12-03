package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertTest {
	String c;
	@Test
	public void demo() {
		int a=10;
		int b=20;
		SoftAssert s=new SoftAssert();
		System.out.println(a);
		System.out.println(b);
		s.assertNotSame(a, b);
		System.out.println("Hi");
		s.fail();
		System.out.println("Hello");
	}

}
