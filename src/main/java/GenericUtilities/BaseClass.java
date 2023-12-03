package GenericUtilities;

import java.io.IOException;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass {
	WebDriver driver;
	static WebDriver sdriver;
	@BeforeSuite(alwaysRun = true)
	public void config_BS() throws SQLException {
		System.out.println("Code for connecting to DB");
	}
	@BeforeTest(alwaysRun = true)
	public void config_BT() {
		
	}
	//@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void config_BC() throws IOException {
		FileUtils futil=new FileUtils();
		String browser=futil.readDataFromPropertyFile("browser");
		System.out.println("Code for opening browser");
		if (browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			System.out.println("Chrome opened");
		}
		else if (browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
			System.out.println("Edge opened");
		}
		else {
			System.out.println("Invalid browser");
		}
		sdriver=driver;
		
	}
	@BeforeMethod(alwaysRun = true)
	public void config_BM() {
		System.out.println("Code for login");
	}
	@AfterMethod(alwaysRun = true)
	public void config_AM() {
		System.out.println("Code for logout");
	}
	@AfterClass(alwaysRun = true)
	public void config_AC() {
		System.out.println("Code for closing browser");
		driver.quit();
	}
	@AfterTest(alwaysRun = true)
	public void config_AT() {
		
	}
	@AfterSuite(alwaysRun = true)
	public void config_AS() throws SQLException {
		System.out.println("Code for disconnecting from DB");
	}
}
