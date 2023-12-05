package DataDrivenTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("Samsung phone"+Keys.ENTER);
		List<WebElement> phones = driver.findElements(By.xpath("//div[contains(text(),'SAMSUNG') and @class='_4rR01T']"));
		List<WebElement> prices = driver.findElements(By.xpath("//div[contains(text(),'SAMSUNG') and @class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
		int size=phones.size();
		for(int i=0;i<size;i++) {
			String price = prices.get(i).getText();
			String p = price.replace('₹', '0');
			String p1 = p.replace(',', 'a');
			String[] sp = p1.split("a");
			String s="";
			if(sp.length==3) {
				s=sp[0]+sp[1]+sp[2];
			}
			else if (sp.length==2) {
				s=sp[0]+sp[1];
			}
			
			Integer in=new Integer(s);
			if (in<=20000) {
				String phone = phones.get(i).getText();
				System.out.println(phone+" "+in);
			}
		}
	}

}
