package Maven;

import org.testng.annotations.Test;

public class Smoke {
	@Test(groups="smoke")
	public void test() {
		System.out.println("Hi");
	}
	
	@Test(groups="smoke")
	public void demo() {
		System.out.println("Hello");
	}

}
