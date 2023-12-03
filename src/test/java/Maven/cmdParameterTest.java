package Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class cmdParameterTest {
	@Test(groups="smoke")
	public void test() {
		String brow=System.getProperty("browser");
		
		if (brow.equalsIgnoreCase("chrome")) {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in");
			System.out.println(driver.getTitle());
			driver.quit();
		}
	}
	@Test(groups="smoke")
	public void demo() {
		String brow=System.getProperty("browser");
		
		if (brow.equalsIgnoreCase("edge")) {
			WebDriver driver=new EdgeDriver();
			driver.get("https://www.amazon.in");
			System.out.println(driver.getTitle());
			driver.quit();
		}
	}
}
