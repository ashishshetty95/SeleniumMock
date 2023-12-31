package Collections;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class ArrayListTest {
	@Test
	public void arrayList() {
		ArrayList al=new ArrayList();
		al.add("String");
		al.add(10);
		al.add(55.55);
		al.add(null);
		al.add(false);
		al.add(55.55);
		al.add(null);
		al.add(false);
		
		for( Object list:al) {
			System.out.println(list);
		}
	}
}
