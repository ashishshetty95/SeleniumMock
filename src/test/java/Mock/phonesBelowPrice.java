package Mock;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class phonesBelowPrice {
	@Test
	public void test() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("Samsung phones"+Keys.ENTER);
		List<WebElement> names = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1' and translate(substring-after(text(),'₹'),',','')<10000]/../../../../div[1]/div[@class='_4rR01T']"));
		List<WebElement> phones = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1' and translate(substring-after(text(),'₹'),',','')<10000]"));
		for(int i=0;i<phones.size();i++) {
			String name = names.get(i).getText();
			String price=phones.get(i).getText();
			System.out.println(name+"--->"+price);
		}
		driver.quit();
	}
}
