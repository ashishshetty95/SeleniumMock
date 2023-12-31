package Collections;

import java.util.Iterator;
import java.util.TreeSet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TreeSetTest {
	@Test
	public void treeSet() {
		TreeSet ts = new TreeSet();
		ts.add(67614);
		ts.add(-5946);
		ts.add(10);
		ts.add(10*'a');
		ts.add(97000000/'a');
		
		for(Object t:ts) {
			System.out.println(t);
		}
	}
}
