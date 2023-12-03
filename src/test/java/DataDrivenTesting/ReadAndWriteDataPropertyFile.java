package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadAndWriteDataPropertyFile {
	@Test
	public void propertyFileTest() throws IOException {
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\commondata.property");
		Properties p=new Properties();
		p.load(fis);
		p.setProperty("url", "https://practicetestautomation.com/practice-test-login/");
		p.setProperty("username", "student");
		p.setProperty("password", "Password123");
		p.setProperty("browser", "chrome");
		FileOutputStream fos=new FileOutputStream(".\\src\\test\\resources\\commondata.property");
		p.store(fos, "test");
		String url=p.getProperty("url");
		String username=p.getProperty("username");
		String password=p.getProperty("password");
		String browser=p.getProperty("browser");
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
		System.out.println(browser);
	}
}
