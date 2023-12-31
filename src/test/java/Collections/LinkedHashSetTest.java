package Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class LinkedHashSetTest {
	@Test
	public void linkedHashSet() {
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("Ashish");
		lhs.add("Hemanth");
		lhs.add("Abhijit");
		lhs.add(null);
		lhs.add("Ashish");
		lhs.add(10);
		
		Iterator i=lhs.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println();
		for(Object l:lhs) {
			System.out.println(l);
		}
	}
}
