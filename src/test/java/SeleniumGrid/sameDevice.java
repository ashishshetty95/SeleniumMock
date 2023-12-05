package SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class sameDevice {
	@Test
	public void test() throws MalformedURLException {
		 URL url=new URL("http://192.168.246.93:4444/wd/hub");
		 DesiredCapabilities dcap=new DesiredCapabilities();
		 dcap.setBrowserName("chrome");
		 dcap.setPlatform(Platform.WINDOWS);
		 RemoteWebDriver driver=new RemoteWebDriver(url, dcap);
		 driver.get("https://www.amazon.in");
	}
}
