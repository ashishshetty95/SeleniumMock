package Maven;

import org.testng.annotations.Test;

public class Regression {
	@Test(groups="regression")
	public void test() {
		System.out.println("Bye");
	}
	
	@Test(groups="regression")
	public void demo() {
		System.out.println("See you");
	}

}
